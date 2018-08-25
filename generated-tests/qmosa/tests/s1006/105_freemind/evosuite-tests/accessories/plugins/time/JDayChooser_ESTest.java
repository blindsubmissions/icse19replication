/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:59:19 GMT 2018
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
import freemind.controller.MenuBar;
import freemind.main.FreeMind;
import freemind.main.FreeMindApplet;
import freemind.modes.Mode;
import freemind.modes.ModeController;
import freemind.modes.browsemode.BrowseController;
import freemind.modes.browsemode.BrowsePopupMenu;
import freemind.modes.mindmapmode.MindMapController;
import freemind.modes.mindmapmode.MindMapMapModel;
import freemind.view.mindmapview.MapView;
import java.awt.AWTEventMulticaster;
import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.MenuItem;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.font.FontRenderContext;
import java.io.File;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import javax.help.HelpSet;
import javax.help.JHelpIndexNavigator;
import javax.help.plaf.basic.BasicIndexNavigatorUI;
import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.AncestorListener;
import javax.swing.event.MenuKeyEvent;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.apache.batik.ext.awt.g2d.GraphicContext;
import org.apache.batik.svggen.DefaultExtensionHandler;
import org.apache.batik.svggen.ImageHandlerBase64Encoder;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.xalan.templates.ElemExsltFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MemoryTileCache;
import plugins.map.FreeMindMapController;
import plugins.map.MapDialog;
import plugins.map.MapNodePositionHolder;
import plugins.map.Registration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JYearChooser jYearChooser0 = new JYearChooser();
      jYearChooser0.list();
      jYearChooser0.getLocale();
      jDayChooser0.setYearChooser(jYearChooser0);
      int int0 = 1602;
      jDayChooser0.getUIClassID();
      // Undeclared exception!
      try { 
        jDayChooser0.setFocusTraversalKeys(1602, (Set<? extends AWTKeyStroke>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid focus traversal key identifier
         //
         verifyException("java.awt.Container", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getY();
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.setDecorationBordersVisible(true);
      int int0 = (-3089);
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, (-3089), ".nn#u#ma", 1869L, 1452);
      actionEvent0.setSource(".nn#u#ma");
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Object object0 = new Object();
      jDayChooser0.putClientProperty(object0, object0);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 463, false, jDayChooser0);
      focusEvent0.getOppositeComponent();
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.setEnabled(false);
      SystemColor systemColor0 = SystemColor.text;
      jDayChooser0.setWeekdayForeground(systemColor0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.drawWeeks();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.updateUI();
      jDayChooser_DecoratorButton0.removeActionListener(jDayChooser0);
      jDayChooser_DecoratorButton0.isFocusable();
      MockDate mockDate0 = new MockDate((-3455), (-3455), (-3455), (-3455), (-3455), 8);
      jDayChooser0.setMinSelectableDate(mockDate0);
      jDayChooser0.paintImmediately(8, (-3455), (-3455), 8);
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(58);
      jDayChooser0.getDecorationBackgroundColor();
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 0, 20L, 474, 0, 'p', 0);
      jDayChooser0.keyTyped(keyEvent0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getLocale();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMouseMotionListeners();
      jDayChooser0.initDecorations();
      AWTEventMulticaster.remove((HierarchyListener) null, (HierarchyListener) null);
      jDayChooser0.removeHierarchyListener((HierarchyListener) null);
      jDayChooser0.getDayPanel();
      jDayChooser0.focusLost((FocusEvent) null);
      jDayChooser0.focusLost((FocusEvent) null);
      Date date0 = jDayChooser0.getMinSelectableDate();
      Date date1 = jDayChooser0.getMaxSelectableDate();
      assertEquals(14, jDayChooser0.getDay());
      assertNotSame(date1, date0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isDayBordersVisible();
      JYearChooser jYearChooser0 = new JYearChooser();
      Object object0 = jDayChooser0.getTreeLock();
      int int0 = 210;
      ActionEvent actionEvent0 = new ActionEvent(object0, 210, "day", (-1761));
      actionEvent0.paramString();
      jYearChooser0.actionPerformed(actionEvent0);
      jDayChooser0.setYearChooser(jYearChooser0);
      Locale locale0 = Locale.CHINA;
      jDayChooser0.setLocale(locale0);
      Font.getFont("j0F", (Font) null);
      char[] charArray0 = new char[4];
      charArray0[0] = 'R';
      charArray0[1] = '\'';
      charArray0[2] = 'x';
      charArray0[3] = 'j';
      int int1 = 2420;
      ElemExsltFunction elemExsltFunction0 = new ElemExsltFunction();
      ImageHandlerBase64Encoder imageHandlerBase64Encoder0 = new ImageHandlerBase64Encoder();
      DefaultExtensionHandler defaultExtensionHandler0 = new DefaultExtensionHandler();
      SVGGraphics2D sVGGraphics2D0 = null;
      try {
        sVGGraphics2D0 = new SVGGraphics2D(elemExsltFunction0, imageHandlerBase64Encoder0, defaultExtensionHandler0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ElemTemplateElement error: Function not supported!
         //
         verifyException("org.apache.xalan.templates.ElemTemplateElement", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      jDayChooser0.setLocale(locale0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.setRequestFocusEnabled(true);
      jDayChooser_DecoratorButton0.getFocusListeners();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      jDayChooser0.getDecorationBackgroundColor();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser_DecoratorButton0, 2170, false, jDayChooser_DecoratorButton0);
      jDayChooser0.focusLost(focusEvent0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2170, 2170, 2170);
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2170,MONTH=2170,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=2170,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      
      MockDate mockDate0 = new MockDate(2170, (-1288), (-1288), (-1288), 3347, 160);
      jDayChooser0.setMaxSelectableDate(mockDate0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.8970286937008143
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMouseMotionListeners();
      jDayChooser0.getGraphics();
      jDayChooser0.focusGained((FocusEvent) null);
      Timestamp timestamp0 = new Timestamp((-1311L));
      jDayChooser0.defaultMinSelectableDate = (Date) timestamp0;
      jDayChooser0.setWeekOfYearVisible(true);
      Date date0 = jDayChooser0.getMinSelectableDate();
      jDayChooser0.setMinSelectableDate(date0);
      jDayChooser0.drawWeeks();
      jDayChooser0.getDayPanel();
      jDayChooser0.initDecorations();
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
  //Test case number: 10
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.transferFocusBackward();
      jDayChooser0.setDebugGraphicsOptions((-1103));
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.setYearChooser(jYearChooser0);
      jDayChooser0.getLocale();
      jDayChooser0.updateUI();
      KeyEvent keyEvent0 = new KeyEvent(jYearChooser0, (-1103), (-1103), (-224), 0, 'd');
      jDayChooser0.keyReleased(keyEvent0);
      jDayChooser0.getSelectedDay();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getAutoscrolls();
      jDayChooser0.isDecorationBackgroundVisible();
      boolean boolean0 = jDayChooser0.isDayBordersVisible();
      assertTrue(boolean0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.704870988155223
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.transferFocusBackward();
      jDayChooser0.setMaxDayCharacters(61);
      jDayChooser0.setFocus();
      MenuItem menuItem0 = null;
      try {
        menuItem0 = new MenuItem("day");
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
  /*Coverage entropy=2.716561166853466
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setYear((-1));
      jDayChooser0.getMouseListeners();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.getInputMethodListeners();
      jDayChooser_DecoratorButton0.updateUI();
      jDayChooser_DecoratorButton0.removeActionListener(jDayChooser0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton1 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton1.isFocusable();
      MockDate mockDate0 = new MockDate((-1223), (-1), (-1), 574, 574, (-1));
      jDayChooser0.setMinSelectableDate(mockDate0);
      jDayChooser0.paintImmediately(16, 12, (-3682), 2307);
      jDayChooser0.setDay((-4259));
      jDayChooser0.getDecorationBackgroundColor();
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.623226541126173
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = false;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setWeekOfYearVisible(false);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      HelpSet helpSet0 = new HelpSet(classLoader0);
      JHelpIndexNavigator jHelpIndexNavigator0 = null;
      try {
        jHelpIndexNavigator0 = new JHelpIndexNavigator(helpSet0, "bG", "day", (URL) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.help.JHelpNavigator", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.759895175471732
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      jDayChooser0.setLocale(locale0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.setRequestFocusEnabled(true);
      jDayChooser_DecoratorButton0.getFocusListeners();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      Color color0 = jDayChooser0.getDecorationBackgroundColor();
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) 2170;
      floatArray0[1] = (float) 2170;
      floatArray0[2] = (float) 2170;
      floatArray0[3] = (float) 2170;
      floatArray0[4] = (-1.0F);
      floatArray0[5] = (float) 2170;
      floatArray0[6] = 478.5121F;
      color0.getRGBComponents(floatArray0);
      AncestorListener ancestorListener0 = mock(AncestorListener.class, new ViolatedAssumptionAnswer());
      jDayChooser0.removeAncestorListener(ancestorListener0);
      jDayChooser0.setDecorationBackgroundColor(color0);
      // Undeclared exception!
      try { 
        jDayChooser0.addListeners((-3024));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.8012918076211983
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMouseMotionListeners();
      jDayChooser0.getGraphics();
      jDayChooser0.focusGained((FocusEvent) null);
      Timestamp timestamp0 = new Timestamp((-1311L));
      jDayChooser0.defaultMinSelectableDate = (Date) timestamp0;
      jDayChooser0.setWeekOfYearVisible(true);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jDayChooser0, 2153, 0L, (-1150), (-62), (-224), (-683), 51, 2458, true, 433, 2153, (-1150), (-1311L));
      mouseWheelEvent0.getModifiersEx();
      mouseWheelEvent0.getPreciseWheelRotation();
      MouseWheelEvent mouseWheelEvent1 = new MouseWheelEvent(jDayChooser0, 10, (-551L), 2153, (-485), (-485), 1311, 4091, (-2230), false, 12, 21, 51);
      mouseWheelEvent1.getModifiersEx();
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser1.getToolTipLocation(mouseWheelEvent0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.setSelectableDateRange(timestamp0, timestamp0);
      jDayChooser0.setEnabled(false);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.drawWeeks();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.updateUI();
      jDayChooser_DecoratorButton0.removeActionListener(jDayChooser0);
      jDayChooser_DecoratorButton0.isFocusable();
      MockDate mockDate0 = new MockDate((-3451), (-3451), (-3451), (-3451), (-3451), (-3451));
      jDayChooser0.setMinSelectableDate(mockDate0);
      jDayChooser0.paintImmediately((-3451), (-3451), (-3451), (-3451));
      jDayChooser0.setDay(58);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "day";
      stringArray0[1] = "day";
      stringArray0[2] = "day";
      stringArray0[3] = "day";
      stringArray0[4] = "day";
      stringArray0[5] = "day";
      stringArray0[6] = "freemind.controller.actions.generated.instance.JiBX_bindingSetAttributeValueElementaryAction_access";
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
  //Test case number: 18
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setYear((-1));
      jDayChooser0.getMouseListeners();
      jDayChooser0.firePropertyChange("Metal", 0.0F, (-503.22076F));
      jDayChooser0.paintImmediately((-3682), (-3682), (-3682), 1700);
      jDayChooser0.getMaxDayCharacters();
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.getMinSelectableDate();
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        locale0.getUnicodeLocaleType("day");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Ill-formed Unicode locale key: day
         //
         verifyException("java.util.Locale", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.794384563563956
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMouseMotionListeners();
      jDayChooser0.getGraphics();
      jDayChooser0.focusGained((FocusEvent) null);
      Timestamp timestamp0 = new Timestamp((-1311L));
      jDayChooser0.defaultMinSelectableDate = (Date) timestamp0;
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jDayChooser0, 2153, 0L, (-1150), (-62), (-224), (-683), 51, 2458, true, 433, 2153, (-1150), (-1311L));
      mouseWheelEvent0.getModifiersEx();
      mouseWheelEvent0.getPreciseWheelRotation();
      MouseWheelEvent mouseWheelEvent1 = new MouseWheelEvent(jDayChooser0, 10, (-551L), 2153, (-485), (-485), 1311, 4091, (-2230), false, 12, 21, 51);
      mouseWheelEvent1.getModifiersEx();
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser1.getToolTipLocation(mouseWheelEvent0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.setSelectableDateRange(timestamp0, timestamp0);
      jDayChooser0.setEnabled(false);
      jDayChooser0.setMonth((-2860));
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setYear((-1));
      jDayChooser0.getMouseListeners();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      MockDate mockDate0 = new MockDate((-1223), (-1), (-1), 574, 574, (-1));
      jDayChooser0.setMinSelectableDate(mockDate0);
      Color color0 = Color.PINK;
      jDayChooser0.setDecorationBackgroundColor(color0);
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
  //Test case number: 21
  /*Coverage entropy=2.7823559208895663
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMouseMotionListeners();
      jDayChooser0.getGraphics();
      jDayChooser0.focusGained((FocusEvent) null);
      Timestamp timestamp0 = new Timestamp((-1311L));
      jDayChooser0.transferFocusBackward();
      jDayChooser0.setMaxDayCharacters((-547));
      jDayChooser0.setFocus();
      MenuItem menuItem0 = null;
      try {
        menuItem0 = new MenuItem("_LxMoK[|");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}