/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:42:32 GMT 2018
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import freemind.controller.actions.generated.instance.JiBX_bindingFactory;
import freemind.modes.MindIcon;
import freemind.modes.NodeDownAction;
import freemind.modes.browsemode.BrowseMode;
import freemind.modes.mindmapmode.MindMapController;
import freemind.modes.mindmapmode.MindMapToolBar;
import freemind.modes.mindmapmode.actions.EdgeStyleAction;
import freemind.view.mindmapview.MultipleImage;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.IndexColorModel;
import java.sql.Date;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.concurrent.Delayed;
import javax.swing.Action;
import javax.swing.DebugGraphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableModel;
import org.apache.batik.ext.awt.color.ICCColorSpaceExt;
import org.apache.batik.ext.awt.color.NamedProfileCache;
import org.apache.batik.ext.awt.g2d.GraphicContext;
import org.apache.batik.svggen.ImageHandlerJPEGEncoder;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.impl.UnmarshallingContext;
import org.junit.runner.RunWith;
import plugins.map.MapDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.requestFocus();
      int int0 = 0;
      jDayChooser0.setLocation(0, (-773));
      int int1 = 2;
      jDayChooser0.setMonth(2);
      jDayChooser0.getSelectedDay();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 2, false);
      focusEvent0.paramString();
      jDayChooser0.focusGained(focusEvent0);
      int int2 = 946;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 1487, 946);
      int int3 = 4269;
      BrowseMode browseMode0 = new BrowseMode();
      MindMapController mindMapController0 = null;
      try {
        mindMapController0 = new MindMapController(browseMode0);
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
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getFocusListeners();
      jDayChooser0.setWeekOfYearVisible(false);
      Color color0 = jDayChooser0.getDecorationBackgroundColor();
      float[] floatArray0 = new float[5];
      floatArray0[0] = (-1.0F);
      floatArray0[1] = 5961.292F;
      floatArray0[2] = 76.0F;
      floatArray0[3] = (-2165.3667F);
      Color.getColor("day", color0);
      floatArray0[4] = 0.0F;
      color0.getRGBComponents(floatArray0);
      // Undeclared exception!
      try { 
        jDayChooser0.putClientProperty((Object) null, color0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.JComponent", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = 8927;
      jDayChooser0.setMonth(8927);
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 8927, "&5[I1?i<G}TW*k");
      actionEvent0.setSource("day");
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
  //Test case number: 3
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JTree jTree0 = new JTree();
      int int0 = 0;
      Rectangle rectangle0 = jTree0.getRowBounds(0);
      jDayChooser0.computeVisibleRect(rectangle0);
      jDayChooser0.setSelectableDateRange((java.util.Date) null, (java.util.Date) null);
      jDayChooser0.setMinSelectableDate((java.util.Date) null);
      jDayChooser0.getWeekdayForeground();
      long long0 = 0L;
      BasicComboBoxUI basicComboBoxUI0 = new BasicComboBoxUI();
      // Undeclared exception!
      try { 
        basicComboBoxUI0.getMinimumSize(jTree0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getComponentListeners();
      jDayChooser0.getColorModel();
      jDayChooser0.getDayPanel();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.hasFocus();
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jDayChooser0, (Border) null, 125, (-4825), (-4825), 125);
      rectangle0.clone();
      rectangle0.add((double) (-4825), 0.0);
      jDayChooser0.getBounds(rectangle0);
      jDayChooser0.getLocale();
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
  //Test case number: 6
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.firePropertyChange("", (byte) (-65), (byte) (-1));
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      jDayChooser0.setMonthChooser(jMonthChooser0);
      FocusEvent focusEvent0 = new FocusEvent(jMonthChooser0, (byte) (-1));
      focusEvent0.paramString();
      jDayChooser0.focusGained(focusEvent0);
      jDayChooser0.getSelectedDay();
      jDayChooser0.getMinSelectableDate();
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setEnabled(false);
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone((byte) (-65), ":ExFy:7bz`XO/0jl", (byte) (-1), (byte) (-65), 0, (-1933), 1683, 0, 0, (-4180));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal start month -1
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDay();
      jDayChooser0.getLocale();
      jDayChooser0.addListeners(14);
      JButton[] jButtonArray0 = new JButton[5];
      MapDialog mapDialog0 = new MapDialog();
      mapDialog0.getMindMapController();
      String string0 = "accessories.plugins.time.JDayChooser$DecoratorButton";
      EdgeStyleAction edgeStyleAction0 = null;
      try {
        edgeStyleAction0 = new EdgeStyleAction((MindMapController) null, "accessories.plugins.time.JDayChooser$DecoratorButton");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.mindmapmode.actions.NodeGeneralAction", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Font font0 = Font.decode("}I{px\"");
      font0.deriveFont(2590.9387F);
      jDayChooser0.setFocusCycleRoot(false);
      jDayChooser0.setFont(font0);
      Color color0 = Color.YELLOW;
      jDayChooser0.setWeekdayForeground(color0);
      jDayChooser0.getSelectedDay();
      int int0 = 986;
      NamedProfileCache namedProfileCache0 = NamedProfileCache.getDefaultCache();
      // Undeclared exception!
      try { 
        namedProfileCache0.request("uqb1!?0.");
        fail("Expecting exception: ThreadDeath");
      
      } catch(ThreadDeath e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Thread", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.getGraphics();
      DebugGraphics debugGraphics0 = new DebugGraphics((Graphics) null);
      debugGraphics0.getDebugOptions();
      jDayChooser0.setFocusTraversalPolicyProvider(false);
      jDayChooser_DecoratorButton0.paint(debugGraphics0);
      jDayChooser0.isDecorationBackgroundVisible();
      jDayChooser0.isDecorationBackgroundVisible();
      // Undeclared exception!
      try { 
        jDayChooser0.addListeners(160);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 160
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser_DecoratorButton0.isFocusable();
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.637304661672375
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      java.util.Date date0 = jDayChooser0.maxSelectableDate;
      jDayChooser0.setMinSelectableDate(date0);
      String[] stringArray0 = new String[0];
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
  //Test case number: 12
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.setDay(47);
      jDayChooser0.getMaxSelectableDate();
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getSelectedDay();
      Color color0 = Color.CYAN;
      AWTEventMulticaster.add((InputMethodListener) null, (InputMethodListener) null);
      jDayChooser0.removeInputMethodListener((InputMethodListener) null);
      jDayChooser0.setForeground(color0);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.setAlwaysFireDayProperty(false);
      JLabel jLabel0 = new JLabel((Icon) null);
      jDayChooser0.setYear(2055);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 2055, (-1370L), 2055, 2055, 'R');
      jDayChooser0.keyTyped(keyEvent0);
      jDayChooser0.keyTyped(keyEvent0);
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.focusLost((FocusEvent) null);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.getDay();
      jDayChooser0.isDayBordersVisible();
      jDayChooser0.setDayBordersVisible(false);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getBackground();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.keyReleased((KeyEvent) null);
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.setYearChooser(jYearChooser0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getSelectedDay();
      Color color0 = Color.CYAN;
      color0.getColorSpace();
      AWTEventMulticaster.add((InputMethodListener) null, (InputMethodListener) null);
      jDayChooser0.removeInputMethodListener((InputMethodListener) null);
      jDayChooser0.setForeground(color0);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.setAlwaysFireDayProperty(false);
      jDayChooser0.setMaxDayCharacters(2055);
      Hashtable<Temporal, Delayed> hashtable0 = new Hashtable<Temporal, Delayed>();
      JTree jTree0 = new JTree(hashtable0);
      Dimension dimension0 = jTree0.getPreferredScrollableViewportSize();
      jTree0.setPreferredSize(dimension0);
      jDayChooser0.drawWeeks();
      Locale locale0 = Locale.ITALIAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      jDayChooser0.setEnabled(true);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.createImage((-1), (-1));
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser0.setWeekOfYearVisible(true);
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser1.getHierarchyListeners();
      jDayChooser0.addFocusListener(jDayChooser1);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.setSundayForeground((Color) null);
      jDayChooser1.updateUI();
      jDayChooser0.setDecorationBackgroundColor((Color) null);
      jDayChooser1.setDayBordersVisible(true);
  }
}