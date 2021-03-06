/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:36:10 GMT 2018
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
import freemind.controller.NodeMouseMotionListener;
import freemind.main.FreeMindApplet;
import freemind.main.FreeMindMain;
import freemind.modes.MindMapNode;
import freemind.modes.Mode;
import freemind.modes.attributes.Attribute;
import freemind.modes.browsemode.BrowseController;
import freemind.modes.filemode.FileController;
import freemind.modes.filemode.FileMapModel;
import freemind.modes.filemode.FileNodeModel;
import freemind.modes.mindmapmode.MindMapController;
import freemind.modes.schememode.SchemeMode;
import freemind.view.mindmapview.attributeview.AttributePopupMenu;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.MultipleGradientPaint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ByteLookupTable;
import java.awt.image.IndexColorModel;
import java.awt.image.LookupOp;
import java.awt.image.RescaleOp;
import java.awt.image.renderable.ParameterBlock;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.AttributedCharacterIterator;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Properties;
import java.util.Vector;
import javax.help.BackAction;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuKeyEvent;
import javax.swing.plaf.basic.BasicRootPaneUI;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;
import javax.swing.text.LabelView;
import javax.swing.text.StyleContext;
import org.apache.batik.bridge.SVGTextElementBridge;
import org.apache.batik.css.parser.Parser;
import org.apache.batik.dom.events.DOMMutationEvent;
import org.apache.batik.ext.awt.g2d.GraphicContext;
import org.apache.batik.gvt.CanvasGraphicsNode;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.crimson.tree.XmlDocument;
import org.apache.fop.svg.PDFDocumentGraphics2D;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.junit.runner.RunWith;
import org.openstreetmap.gui.jmapviewer.Tile;
import plugins.map.MapDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = true;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.doLayout();
      jDayChooser_DecoratorButton0.isFocusable();
      Color color0 = jDayChooser0.weekdayForeground;
      jDayChooser0.setSundayForeground(color0);
      HsqlProperties hsqlProperties0 = new HsqlProperties((Properties) null);
      jdbcConnection jdbcConnection0 = null;
      try {
        jdbcConnection0 = new jdbcConnection(hsqlProperties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.persist.HsqlProperties", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.drawWeeks();
      jDayChooser0.removeAll();
      jDayChooser0.setFocus();
      jDayChooser0.getLocale();
      jDayChooser0.setAlwaysFireDayProperty(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = null;
      try {
        pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D((PDFDocumentGraphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.batik.ext.awt.g2d.AbstractGraphics2D", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isWeekOfYearVisible();
      String string0 = "Windows";
      // Undeclared exception!
      HsqlProperties.delimitedArgPairsToProps("Windows", "", "", "day");
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "q^(x.Qtz:s\"";
      stringArray0[2] = "";
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
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMaxSelectableDate();
      // Undeclared exception!
      try { 
        MockFile.createTempFile((String) null, "day");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getBaseline(2129920, 14);
      jDayChooser0.getName();
      Date date0 = jDayChooser0.defaultMinSelectableDate;
      jDayChooser0.minSelectableDate = date0;
      jDayChooser0.getDaysInMonth();
      jDayChooser0.getDayPanel();
      jDayChooser0.isWeekOfYearVisible();
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.drawWeeks();
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.isDecorationBackgroundVisible();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.setMonth(0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isDecorationBordersVisible();
      File file0 = MockFile.createTempFile("attributes_import_tooltip", "fmY9Wyq^,Q:jQ6$A|=");
      MockFile mockFile0 = new MockFile(file0, "fmY9Wyq^,Q:jQ6$A|=");
      // Undeclared exception!
      try { 
        MockFile.createTempFile("", "J]\",g1F26", (File) mockFile0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      HierarchyListener hierarchyListener0 = mock(HierarchyListener.class, new ViolatedAssumptionAnswer());
      HierarchyListener hierarchyListener1 = mock(HierarchyListener.class, new ViolatedAssumptionAnswer());
      HierarchyListener hierarchyListener2 = AWTEventMulticaster.remove(hierarchyListener0, hierarchyListener1);
      HierarchyListener hierarchyListener3 = AWTEventMulticaster.add(hierarchyListener2, hierarchyListener2);
      jDayChooser0.addHierarchyListener(hierarchyListener3);
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.getMinSelectableDate();
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl(false, true);
      SVGGraphics2D sVGGraphics2D0 = null;
      try {
        sVGGraphics2D0 = new SVGGraphics2D(deferredDocumentImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xerces.dom.DeferredDocumentImpl", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.initDecorations();
      jDayChooser0.setVerifyInputWhenFocusTarget(true);
      jDayChooser0.keyReleased((KeyEvent) null);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      MultipleGradientPaint.CycleMethod multipleGradientPaint_CycleMethod0 = MultipleGradientPaint.CycleMethod.REFLECT;
      BackAction backAction0 = new BackAction(multipleGradientPaint_CycleMethod0);
      jDayChooser_DecoratorButton0.addMouseListener(backAction0);
      Color color0 = jDayChooser0.getSundayForeground();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals((-6029312), color0.getRGB());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser_DecoratorButton0, 0, "");
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyStroke keyStroke0 = null;
      jDayChooser0.getConditionForKeyStroke((KeyStroke) null);
      jDayChooser0.getLocale();
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.setDecorationBackgroundVisible(false);
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
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getDay();
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jMonthChooser0.getTopLevelAncestor();
      jMonthChooser0.getMaximumSize();
      // Undeclared exception!
      try { 
        jMonthChooser0.getFocusTraversalKeys((-1691));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid focus traversal key identifier
         //
         verifyException("java.awt.Container", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.637304661672375
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setFont((Font) null);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("]K");
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Date date1 = jDayChooser0.setMaxSelectableDate(date0);
      Date date2 = jDayChooser0.setMinSelectableDate(date1);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertSame(date2, date0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.getMinSelectableDate();
      Color color0 = Color.darkGray;
      jDayChooser0.setDecorationBackgroundColor(color0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 0, 2112L, 0, 0, 'W', 0);
      jDayChooser0.keyTyped(keyEvent0);
      jDayChooser0.getMaxSelectableDate();
      jDayChooser0.setMaxSelectableDate(date0);
      ParameterBlock parameterBlock0 = new ParameterBlock();
      Vector<Object> vector0 = parameterBlock0.getParameters();
      ParameterBlock parameterBlock1 = new ParameterBlock(vector0, vector0);
      parameterBlock1.set((-1830.75F), 0);
      Vector<Object> vector1 = parameterBlock1.getSources();
      JTree jTree0 = new JTree(vector1);
      jTree0.getRowBounds(608);
      jDayChooser0.scrollRectToVisible((Rectangle) null);
      jDayChooser0.getDaysInMonth();
      jDayChooser0.setWeekdayForeground(color0);
      jDayChooser0.drawDays();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      BrowseController browseController0 = null;
      try {
        browseController0 = new BrowseController((Mode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.ControllerAdapter", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.6618403890648796
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setFocusCycleRoot(false);
      jDayChooser0.getVerifyInputWhenFocusTarget();
      jDayChooser0.getBaselineResizeBehavior();
      int int0 = 1799;
      jDayChooser0.setMaxDayCharacters(1799);
      jDayChooser0.setDayBordersVisible(false);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      SystemColor systemColor0 = SystemColor.text;
      // Undeclared exception!
      try { 
        systemColor0.getColorComponents((ColorSpace) null, (float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.Color", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setAlignmentY(1928.8369F);
      jDayChooser0.getWidth();
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.setYearChooser(jYearChooser0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.7244909964991293
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(4);
      jDayChooser0.setDayBordersVisible(false);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      SystemColor systemColor0 = SystemColor.text;
      float[] floatArray0 = null;
      try { 
        ICC_Profile.getInstance("day");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot open file day
         //
         verifyException("java.awt.color.ICC_Profile", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.630470240160676
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Cursor cursor0 = jDayChooser0.getCursor();
      jDayChooser0.setCursor(cursor0);
      jDayChooser0.setYear(0);
      Locale locale0 = Locale.ROOT;
      JComponent.setDefaultLocale(locale0);
      jDayChooser0.setDay(70);
      assertEquals(29, jDayChooser0.getDay());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.getMinSelectableDate();
      Color color0 = Color.darkGray;
      jDayChooser0.setDecorationBackgroundColor(color0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 0, 2112L, 0, 0, 'W', 0);
      jDayChooser0.keyTyped(keyEvent0);
      Date date1 = jDayChooser0.getMaxSelectableDate();
      assertNotSame(date1, date0);
      
      ParameterBlock parameterBlock0 = new ParameterBlock();
      Vector<Object> vector0 = parameterBlock0.getParameters();
      ParameterBlock parameterBlock1 = new ParameterBlock((Vector<Object>) null, vector0);
      parameterBlock1.set((-1830.75F), 0);
      parameterBlock1.getSources();
      JTree jTree0 = new JTree((Vector<?>) null);
      jTree0.getRowBounds(0);
      jDayChooser0.scrollRectToVisible((Rectangle) null);
      jDayChooser0.getDaysInMonth();
      jDayChooser0.setWeekdayForeground(color0);
      jDayChooser0.drawDays();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.isDayBordersVisible();
      jDayChooser0.setMonth(0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getBaseline(2129920, 14);
      jDayChooser0.getName();
      Date date0 = jDayChooser0.defaultMinSelectableDate;
      jDayChooser0.minSelectableDate = date0;
      jDayChooser0.getDaysInMonth();
      jDayChooser0.getDayPanel();
      boolean boolean0 = jDayChooser0.isWeekOfYearVisible();
      assertTrue(boolean0);
      
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.drawWeeks();
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.setAlwaysFireDayProperty(true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2129920, (-1), 8);
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.weekOfYearVisible = false;
      ContainerListener containerListener0 = mock(ContainerListener.class, new ViolatedAssumptionAnswer());
      AWTEventMulticaster.remove(containerListener0, containerListener0);
      AWTEventMulticaster.add((ContainerListener) null, (ContainerListener) null);
      jDayChooser0.removeContainerListener((ContainerListener) null);
      jDayChooser0.setYear(0);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(0, int0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.7184804374555256
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "VBB?.|jH@3posPg~");
      JDayChooser jDayChooser0 = new JDayChooser();
      SystemColor systemColor0 = SystemColor.controlShadow;
      jDayChooser0.setForeground(systemColor0);
      jDayChooser0.setYear(0);
      jDayChooser0.setMaxDayCharacters(0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-2641), false, jDayChooser0);
      FocusEvent focusEvent1 = new FocusEvent(jDayChooser0, (-2641), false);
      focusEvent1.paramString();
      jDayChooser0.focusGained(focusEvent1);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.80289844853145
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFocus();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(32.917785318, (-1163.0904833979), 32.917785318, 0.0);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      jDayChooser0.repaint(rectangle0);
      jDayChooser0.setEnabled(true);
      jDayChooser0.setMaxSelectableDate((Date) null);
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
      Element element0 = defaultStyledDocument0.getCharacterElement(1);
      LabelView labelView0 = new LabelView(element0);
      Color color0 = labelView0.getForeground();
      jDayChooser0.setDecorationBackgroundColor(color0);
      Color color1 = jDayChooser0.getDecorationBackgroundColor();
      assertEquals(0, color1.getBlue());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.770581544706131
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getMinSelectableDate();
      Color color0 = Color.darkGray;
      jDayChooser0.setDecorationBackgroundColor(color0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 0, 2112L, 0, 0, 'W', 0);
      jDayChooser0.keyTyped(keyEvent0);
      jDayChooser0.setFocus();
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      Locale locale0 = jMonthChooser0.getLocale();
      jDayChooser0.setLocale(locale0);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      AWTEventMulticaster.add((HierarchyListener) null, (HierarchyListener) null);
      AWTEventMulticaster.remove((HierarchyListener) null, (HierarchyListener) null);
      AWTEventMulticaster.remove((HierarchyListener) null, (HierarchyListener) null);
      jDayChooser0.setFocusable(false);
      AWTEventMulticaster.add((HierarchyListener) null, (HierarchyListener) null);
      jDayChooser0.setFocus();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay((-527));
      jDayChooser0.updateUI();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-527), false, jDayChooser0);
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.drawDays();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.770581544706131
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.getMinSelectableDate();
      Color color0 = Color.darkGray;
      jDayChooser0.setDecorationBackgroundColor(color0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.setMinSelectableDate(date0);
      jDayChooser0.setSelectableDateRange(date0, date0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.92887993459394
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.getMinSelectableDate();
      Color color0 = Color.darkGray;
      jDayChooser0.setDecorationBackgroundColor(color0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 0, 2112L, 0, 0, 'W', 0);
      jDayChooser0.keyTyped(keyEvent0);
      Date date1 = jDayChooser0.getMaxSelectableDate();
      Date date2 = jDayChooser0.setMaxSelectableDate(date0);
      assertNotSame(date2, date1);
      
      ParameterBlock parameterBlock0 = new ParameterBlock();
      Vector<Object> vector0 = parameterBlock0.getParameters();
      ParameterBlock parameterBlock1 = new ParameterBlock(vector0, vector0);
      parameterBlock1.set((-1830.75F), 0);
      JTree jTree0 = new JTree(vector0);
      jTree0.getRowBounds(608);
      jDayChooser0.scrollRectToVisible((Rectangle) null);
      jDayChooser0.getDaysInMonth();
      jDayChooser0.setYear(28);
      jDayChooser0.setMaxDayCharacters((-521));
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.6304702401606765
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setFont((Font) null);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("]K");
      jDayChooser0.setFocus();
      jDayChooser0.setDay(8211);
      jDayChooser0.setMonth(2);
      // Undeclared exception!
      try { 
        Time.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.sql.Time", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      MockDate mockDate0 = new MockDate(4, 239, 239, 800, 732);
      jDayChooser0.setMinSelectableDate(mockDate0);
      int int0 = 9999;
      MenuElement[] menuElementArray0 = new MenuElement[1];
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.getPressedIcon();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem((Icon) null);
      menuElementArray0[0] = (MenuElement) jRadioButtonMenuItem0;
      MenuSelectionManager menuSelectionManager0 = MenuSelectionManager.defaultManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, (-2242), (-2652L), 9999, 47, ')', menuElementArray0, menuSelectionManager0);
      jDayChooser0.keyPressed(menuKeyEvent0);
      jDayChooser0.setFocus();
      jDayChooser0.setEnabled(true);
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      jDayChooser0.drawDays();
      jDayChooser0.setFocus();
      jDayChooser0.setDayBordersVisible(true);
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance((double) (-2242), 0.0);
      GraphicContext graphicContext0 = new GraphicContext(affineTransform0);
      RenderingHints renderingHints0 = graphicContext0.getRenderingHints();
      RescaleOp rescaleOp0 = null;
      try {
        rescaleOp0 = new RescaleOp((float[]) null, (float[]) null, renderingHints0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.image.RescaleOp", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.606610584382382
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.initDecorations();
      BasicRootPaneUI basicRootPaneUI0 = new BasicRootPaneUI();
      jDayChooser0.addPropertyChangeListener((PropertyChangeListener) basicRootPaneUI0);
      jDayChooser0.setVerifyInputWhenFocusTarget(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      System.setCurrentTimeMillis((-1396L));
      jDayChooser0.setWeekOfYearVisible(true);
      assertEquals(14, jDayChooser0.getDay());
  }
}
