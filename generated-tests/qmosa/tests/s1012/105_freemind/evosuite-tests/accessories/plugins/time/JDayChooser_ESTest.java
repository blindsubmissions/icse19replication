/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:42:57 GMT 2018
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import freemind.controller.Controller;
import freemind.controller.NodeMotionListener;
import freemind.main.FreeMindApplet;
import freemind.modes.browsemode.BrowseController;
import freemind.modes.common.plugins.MapNodePositionHolderBase;
import freemind.modes.filemode.FileMode;
import freemind.modes.mindmapmode.MindMapController;
import freemind.modes.mindmapmode.actions.EdgeWidthAction;
import freemind.modes.schememode.SchemeMode;
import freemind.view.mindmapview.attributeview.AttributePopupMenu;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.image.CropImageFilter;
import java.awt.image.DirectColorModel;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.MemoryImageSource;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import javax.help.HelpSet;
import javax.help.JHelpContentViewer;
import javax.help.JHelpSearchNavigator;
import javax.help.plaf.basic.BasicContentViewerUI;
import javax.help.plaf.basic.BasicSearchNavigatorUI;
import javax.swing.Action;
import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.plaf.multi.MultiSliderUI;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StringContent;
import javax.swing.text.StyleContext;
import org.apache.batik.svggen.DefaultExtensionHandler;
import org.apache.batik.svggen.ImageHandler;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.fop.pdf.PDFInfo;
import org.apache.xalan.templates.ElemCopyOf;
import org.apache.xml.serializer.EmptySerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;
import plugins.collaboration.database.DatabaseConnectionHook;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.606610584382382
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = true;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = null;
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      int int0 = (-236);
      String string0 = "";
      double double0 = 0.0;
      SchemeMode schemeMode0 = new SchemeMode();
      schemeMode0.getController();
      DatabaseConnectionHook databaseConnectionHook0 = new DatabaseConnectionHook();
      databaseConnectionHook0.getMindMapController();
      EdgeWidthAction edgeWidthAction0 = null;
      try {
        edgeWidthAction0 = new EdgeWidthAction((MindMapController) null, (-236));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.mindmapmode.actions.NodeGeneralAction", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.606610584382382
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getFocusListeners();
      Color color0 = Color.CYAN;
      jDayChooser0.setDecorationBackgroundColor(color0);
      MultiSliderUI multiSliderUI0 = new MultiSliderUI();
      multiSliderUI0.getUIs();
      // Undeclared exception!
      try { 
        multiSliderUI0.getPreferredSize(jDayChooser0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.691693794629735
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getInheritsPopupMenu();
      jDayChooser0.isPaintingForPrint();
      jDayChooser0.getDecorationBackgroundColor();
      PDFInfo pDFInfo0 = new PDFInfo();
      pDFInfo0.getCreationDate();
      jDayChooser0.setMaxSelectableDate((Date) null);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getY();
      jDayChooser0.getDaysInMonth();
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.getDay();
      jDayChooser0.getLocale();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "day";
      stringArray0[1] = "day";
      stringArray0[2] = "day";
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
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      SystemColor systemColor0 = SystemColor.controlDkShadow;
      float[] floatArray0 = new float[5];
      floatArray0[0] = 0.0F;
      floatArray0[1] = 0.0F;
      floatArray0[2] = (-138.0F);
      floatArray0[3] = (-595.54297F);
      floatArray0[4] = (-1158.16F);
      systemColor0.getComponents(floatArray0);
      jDayChooser0.setSundayForeground(systemColor0);
      jDayChooser0.getSelectedDay();
      jDayChooser0.initDecorations();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 1679, 1679, 4, 1679, 'R');
      keyEvent0.setKeyCode(0);
      jDayChooser0.getInputVerifier();
      jDayChooser0.setInputVerifier((InputVerifier) null);
      keyEvent0.setKeyChar('7');
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setDecorationBackgroundVisible(false);
      jDayChooser0.addInputMethodListener((InputMethodListener) null);
      jDayChooser0.getMaxSelectableDate();
      jDayChooser0.getDayPanel();
      SystemColor systemColor0 = SystemColor.inactiveCaption;
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) 'R';
      floatArray0[1] = (float) '7';
      // Undeclared exception!
      try { 
        systemColor0.getRGBComponents(floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("java.awt.Color", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.ORANGE;
      jDayChooser0.setSundayForeground(color0);
      jDayChooser0.setFocus();
      jDayChooser0.addNotify();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 5461, false, jDayChooser0);
      jDayChooser0.focusGained(focusEvent0);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(0, int0);
      
      jDayChooser0.getMaxSelectableDate();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setFocus();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      
      jDayChooser0.updateUI();
      jDayChooser0.init();
      StyleContext styleContext0 = new StyleContext();
      StringContent stringContent0 = new StringContent(0);
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(stringContent0, styleContext0);
      JTextPane jTextPane0 = new JTextPane(defaultStyledDocument0);
      MutableAttributeSet mutableAttributeSet0 = jTextPane0.getInputAttributes();
      Color color0 = styleContext0.getBackground(mutableAttributeSet0);
      jDayChooser0.setWeekdayForeground(color0);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      ImageIcon imageIcon0 = MapNodePositionHolderBase.getMapLocationIcon();
      imageIcon0.getImage();
      imageIcon0.getIconHeight();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("day", imageIcon0, true);
      imageIcon0.getIconHeight();
      FocusEvent focusEvent0 = new FocusEvent(jRadioButtonMenuItem0, 0);
      focusEvent0.getOppositeComponent();
      jDayChooser0.focusLost(focusEvent0);
      SystemColor systemColor0 = SystemColor.textHighlightText;
      int int0 = 160;
      float[] floatArray0 = new float[4];
      floatArray0[0] = (float) 16;
      floatArray0[1] = (float) 160;
      floatArray0[2] = (float) 16;
      floatArray0[3] = (float) 16;
      Color.RGBtoHSB(160, 0, 9320, floatArray0);
      jDayChooser0.setSundayForeground(systemColor0);
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.init();
      jDayChooser0.setSelectableDateRange(date0, date0);
      jDayChooser0.getMinSelectableDate();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "day";
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
  //Test case number: 9
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isFocusOwner();
      jDayChooser0.drawWeeks();
      jDayChooser0.setDecorationBordersVisible(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-752), (-752), 1518, (-752), '8');
      jDayChooser0.keyTyped(keyEvent0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMonthChooser((JMonthChooser) null);
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
      int int0 = 3;
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 3, "", 3);
      actionEvent0.paramString();
      actionEvent0.setSource(jDayChooser0);
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
  //Test case number: 12
  /*Coverage entropy=2.555867851282148
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.isRequestFocusEnabled();
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.yearChooser = jYearChooser0;
      jDayChooser0.getInsets((Insets) null);
      jDayChooser0.setDay((-747));
      jDayChooser0.yearChooser.getAutoscrolls();
      FileMode fileMode0 = new FileMode();
      BrowseController browseController0 = null;
      try {
        browseController0 = new BrowseController(fileMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.ControllerAdapter", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.7438550678980893
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Time time0 = new Time(1807L);
      jDayChooser0.setMaxSelectableDate(time0);
      jDayChooser0.setAlwaysFireDayProperty(false);
      jDayChooser0.getDay();
      ElemCopyOf elemCopyOf0 = new ElemCopyOf();
      DefaultExtensionHandler defaultExtensionHandler0 = new DefaultExtensionHandler();
      boolean boolean0 = true;
      SVGGraphics2D sVGGraphics2D0 = null;
      try {
        sVGGraphics2D0 = new SVGGraphics2D(elemCopyOf0, (ImageHandler) null, defaultExtensionHandler0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // imageHandler should not be null
         //
         verifyException("org.apache.batik.svggen.SVGGeneratorContext", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.65970797168196
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Color color0 = Color.PINK;
      jDayChooser0.weekdayForeground = color0;
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.getWeekdayForeground();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.4339872044851467
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.ORANGE;
      jDayChooser0.setMonth(2);
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.setYearChooser(jYearChooser0);
      jYearChooser0.repaint((long) 2);
      jDayChooser0.setDecorationBordersVisible(false);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 669, 2, 2373, 11, 'L', 0);
      keyEvent0.getExtendedKeyCode();
      jDayChooser0.keyPressed(keyEvent0);
      Color color1 = jDayChooser0.getWeekdayForeground();
      assertEquals(90, color1.getGreen());
      
      jDayChooser0.getSundayForeground();
      jDayChooser0.setWeekOfYearVisible(true);
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.getLocale();
      jDayChooser0.getLocale();
      jDayChooser0.setYear((-301));
      Timestamp timestamp0 = new Timestamp((-1502));
      jDayChooser1.setSelectableDateRange(timestamp0, timestamp0);
      jDayChooser1.getDecorationBackgroundColor();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      jDayChooser_DecoratorButton0.addMouseListener(defaultCaret0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getFocusListeners();
      Color color0 = Color.CYAN;
      MultiSliderUI multiSliderUI0 = new MultiSliderUI();
      multiSliderUI0.getUIs();
      jDayChooser0.updateUI();
      jDayChooser0.drawDays();
      jDayChooser0.isDayBordersVisible();
      jDayChooser0.getDaysInMonth();
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.getMaxDayCharacters();
      JYearChooser jYearChooser0 = new JYearChooser();
      PopupMenu popupMenu0 = null;
      try {
        popupMenu0 = new PopupMenu("x-\"#bF$A,}");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.7857837033324397
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.getSelectedDay();
      jDayChooser0.getInputVerifier();
      jDayChooser0.setInputVerifier((InputVerifier) null);
      JHelpContentViewer jHelpContentViewer0 = new JHelpContentViewer();
      BasicContentViewerUI basicContentViewerUI0 = new BasicContentViewerUI(jHelpContentViewer0);
      jDayChooser0.removePropertyChangeListener("", (PropertyChangeListener) basicContentViewerUI0);
      jDayChooser0.setEnabled(true);
      jDayChooser0.setYear(11);
      jDayChooser0.getLocale();
      jDayChooser0.setWeekOfYearVisible(true);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getInputMethodListeners();
      jDayChooser0.isValidateRoot();
      jDayChooser0.setEnabled(false);
      jDayChooser0.setMaxDayCharacters(92);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      HelpSet helpSet0 = new HelpSet();
      URL uRL0 = MockURL.getHttpExample();
      JHelpSearchNavigator jHelpSearchNavigator0 = new JHelpSearchNavigator(helpSet0, "day", "day", uRL0);
      BasicSearchNavigatorUI basicSearchNavigatorUI0 = new BasicSearchNavigatorUI(jHelpSearchNavigator0);
      jDayChooser0.addComponentListener(basicSearchNavigatorUI0);
      jDayChooser_DecoratorButton0.setVerifyInputWhenFocusTarget(false);
      jDayChooser_DecoratorButton0.firePropertyChange("day", 1.0, (-766.9851768324241));
      jDayChooser0.addNotify();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser_DecoratorButton0, (-2348), false, jDayChooser0);
      jDayChooser0.focusGained(focusEvent0);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(0, int0);
      
      jDayChooser0.getMaxSelectableDate();
      jDayChooser0.isWeekOfYearVisible();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.566314107430989
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.blue;
      jDayChooser0.isRequestFocusEnabled();
      JYearChooser jYearChooser0 = new JYearChooser();
      JDayChooser jDayChooser1 = new JDayChooser();
      Insets insets0 = jDayChooser1.getInsets();
      jDayChooser0.getInsets(insets0);
      jDayChooser1.setDay(2691);
      jYearChooser0.getAutoscrolls();
      FileMode fileMode0 = new FileMode();
      BrowseController browseController0 = null;
      try {
        browseController0 = new BrowseController(fileMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.ControllerAdapter", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.8421151244608924
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      ImageIcon imageIcon0 = MapNodePositionHolderBase.getMapLocationIcon();
      imageIcon0.getImage();
      imageIcon0.getIconHeight();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("day", imageIcon0, true);
      imageIcon0.getIconHeight();
      FocusEvent focusEvent0 = new FocusEvent(jRadioButtonMenuItem0, 0);
      focusEvent0.getOppositeComponent();
      jDayChooser0.focusLost(focusEvent0);
      SystemColor systemColor0 = SystemColor.textHighlightText;
      float[] floatArray0 = new float[14];
      floatArray0[0] = (float) 16;
      floatArray0[1] = (float) 160;
      floatArray0[2] = (float) 16;
      floatArray0[3] = (float) 16;
      Color.RGBtoHSB(160, 0, 9320, floatArray0);
      jDayChooser0.setSundayForeground(systemColor0);
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.init();
      jDayChooser0.setSelectableDateRange(date0, date0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      Locale locale0 = jDayChooser0.getLocale();
      jDayChooser0.setLocale(locale0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }
}
