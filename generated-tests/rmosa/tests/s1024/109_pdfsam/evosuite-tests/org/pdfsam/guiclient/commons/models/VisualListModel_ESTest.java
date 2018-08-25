/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:41:22 GMT 2018
 */

package org.pdfsam.guiclient.commons.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTEventMulticaster;
import java.awt.AWTKeyStroke;
import java.awt.Dialog;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.color.ICC_Profile;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.IndexColorModel;
import java.awt.image.Kernel;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.event.ListDataListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.pdfsam.guiclient.commons.models.VisualListModel;
import org.pdfsam.guiclient.dto.Rotation;
import org.pdfsam.guiclient.dto.VisualPageListItem;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VisualListModel_ESTest extends VisualListModel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      DefaultComboBoxModel<Integer> defaultComboBoxModel0 = new DefaultComboBoxModel<Integer>();
      VisualPageListItem visualPageListItem0 = null;
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      int[] intArray1 = new int[2];
      intArray1[0] = 172;
      intArray1[1] = 119;
      visualListModel0.undeleteElements(intArray1);
      // Undeclared exception!
      try { 
        visualListModel0.undeleteElements(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      DefaultComboBoxModel<Integer> defaultComboBoxModel0 = new DefaultComboBoxModel<Integer>();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int int0 = 0;
      int int1 = 1;
      // Undeclared exception!
      try { 
        visualListModel0.subList(0, 1, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      DefaultComboBoxModel<Integer> defaultComboBoxModel0 = new DefaultComboBoxModel<Integer>();
      JComboBox<Integer> jComboBox0 = new JComboBox<Integer>(defaultComboBoxModel0);
      Class<AWTEventMulticaster> class0 = AWTEventMulticaster.class;
      defaultComboBoxModel0.getListDataListeners();
      jComboBox0.getListeners(class0);
      visualListModel0.removeListDataListener(jComboBox0);
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      visualListModel0.subList(0, 0, true);
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementsChanged();
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)8;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      assertEquals(1, intArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Object object0 = visualListModel0.getElementAt(91);
      assertNull(object0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addAllElements((Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = visualListModel0.getElements();
      assertEquals(0, visualPageListItemArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.removeElementAt((-2384), true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2384
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      visualListModel0.removeElements(331, 0, true);
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      visualListModel0.removeElements(0, 0, false);
      assertEquals(3, visualListModel0.getSize());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements(2313, 2313, true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      EvoSuiteFile evoSuiteFile0 = null;
      // Undeclared exception!
      try { 
        visualListModel0.appendAllElements(vector0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector$Itr", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      DefaultComboBoxModel<Integer> defaultComboBoxModel0 = new DefaultComboBoxModel<Integer>();
      VisualPageListItem visualPageListItem0 = null;
      visualListModel0.getValidElements();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      // Undeclared exception!
      try { 
        visualListModel0.getValidElements();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      DefaultComboBoxModel<Integer> defaultComboBoxModel0 = new DefaultComboBoxModel<Integer>();
      VisualPageListItem visualPageListItem0 = null;
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        visualListModel0.rotateClockwiseElements(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      FileSystemHandling.shouldAllThrowIOExceptions();
      int[] intArray0 = new int[1];
      visualListModel0.rotateClockwiseElements(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList((-3723), (-3723), true);
      assertNull(collection0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.setData((Vector<VisualPageListItem>) stack0);
      assertTrue(stack0.isEmpty());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      DefaultComboBoxModel<Integer> defaultComboBoxModel0 = new DefaultComboBoxModel<Integer>();
      VisualPageListItem visualPageListItem0 = null;
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int int0 = 0;
      vector0.removeAllElements();
      int int1 = 1;
      visualListModel0.subList(0, 1, true);
      VisualPageListItem visualPageListItem1 = null;
      try {
        visualPageListItem1 = new VisualPageListItem();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(1, 1);
      assertNull(collection0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndex((-1786));
      visualListModel0.moveDownIndex(0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem visualPageListItem0 = null;
      int[] intArray0 = new int[7];
      intArray0[0] = 131;
      intArray0[1] = (-3016);
      intArray0[2] = 2721;
      intArray0[3] = (-739);
      intArray0[4] = (-1065);
      intArray0[5] = (-1270);
      intArray0[6] = 885;
      visualListModel0.removeElements(intArray0, true);
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int[] intArray1 = new int[1];
      // Undeclared exception!
      try { 
        visualListModel0.removeElements(intArray1, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int int0 = visualListModel0.getSize();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.prependAllElements((Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addAllElements(857, (Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0, false);
      assertNotNull(collection0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "x9J");
      int[] intArray0 = new int[1];
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(1, intArray0.length);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElementAt((VisualPageListItem) null, 0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int int0 = 7;
      visualListModel0.moveUpIndex(7);
      int int1 = (-2035);
      BufferedImage bufferedImage0 = null;
      try {
        bufferedImage0 = new BufferedImage(7, (-2035), 7);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.image.DataBufferByte", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementChanged((VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int int0 = 0;
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      visualListModel0.reverseElements(intArray0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance((double) 0, (double) 0, 1398.75291, (double) 0);
      AffineTransformOp affineTransformOp0 = null;
      try {
        affineTransformOp0 = new AffineTransformOp(affineTransform0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown interpolation type: 0
         //
         verifyException("java.awt.image.AffineTransformOp", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      TreeSet<VisualPageListItem> treeSet0 = new TreeSet<VisualPageListItem>();
      visualListModel0.addAllElements((-1), (Collection<VisualPageListItem>) treeSet0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      TreeSet<VisualPageListItem> treeSet0 = new TreeSet<VisualPageListItem>();
      visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) treeSet0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      TreeSet<VisualPageListItem> treeSet0 = new TreeSet<VisualPageListItem>();
      visualListModel0.addAllElements(136, (Collection<VisualPageListItem>) treeSet0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.addAllElements((Collection<VisualPageListItem>) stack0);
      int int0 = (-303);
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem((-303), "Fq2Y3WGqy", "Fq2Y3WGqy");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      assertEquals(1, visualListModel0.getSize());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.updateElementAt(0, (VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex((-965));
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements((-6223), (-6223), true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.getElementAt((-2770));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.rotateClockwiseElements(intArray0);
      assertEquals(0, intArray0.length);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.removeElementAt(926, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 926
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      visualListModel0.prependAllElements(vector0);
      assertEquals(10, vector0.capacity());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.removeElements(intArray0, true);
      assertArrayEquals(new int[] {}, intArray0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.reverseElements(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.undeleteElements(intArray0);
      assertEquals(0, intArray0.length);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[0];
      visualListModel0.setData(visualPageListItemArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.moveUpIndexes(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[1];
      visualListModel0.setData(visualPageListItemArray0);
      assertEquals(1, visualListModel0.getSize());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(0, intArray0.length);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      VisualPageListItem[] visualPageListItemArray0 = visualListModel0.getElements();
      assertNull(visualPageListItemArray0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)114;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-109);
      visualListModel0.clearData();
      byteArray0[3] = (byte)102;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      int[] intArray0 = new int[1];
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      stack0.addElement((VisualPageListItem) null);
      visualListModel0.addListDataListener((ListDataListener) null);
      VisualListModel visualListModel1 = new VisualListModel();
      visualListModel1.setData((Vector<VisualPageListItem>) stack0);
      assertEquals(1, visualListModel1.getSize());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      DefaultComboBoxModel<Integer> defaultComboBoxModel0 = new DefaultComboBoxModel<Integer>();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      visualListModel0.reverseElements(intArray0);
      intArray0[0] = (-740);
      try { 
        visualListModel0.rotateAnticlockwiseElements(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      DefaultComboBoxModel<Integer> defaultComboBoxModel0 = new DefaultComboBoxModel<Integer>();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      visualListModel0.removeElements(intArray0, true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      DefaultComboBoxModel<Integer> defaultComboBoxModel0 = new DefaultComboBoxModel<Integer>();
      VisualPageListItem visualPageListItem0 = null;
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      FileSystemHandling.shouldAllThrowIOExceptions();
      List<VisualPageListItem> list0 = new ArrayList<VisualPageListItem>();
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      intArray0[0] = 1005;
      vector0.add((VisualPageListItem) null);
      try { 
        visualListModel0.moveUpIndexes(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 1004
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      DefaultComboBoxModel<Integer> defaultComboBoxModel0 = new DefaultComboBoxModel<Integer>();
      VisualPageListItem visualPageListItem0 = null;
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int int0 = 0;
      int int1 = 1;
      // Undeclared exception!
      try { 
        visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) vector0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector$Itr", e);
      }
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      visualListModel0.removeElements(0, 0, true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      intArray0[0] = 1688;
      visualListModel0.moveDownIndexes(intArray0);
      Random.setNextRandom(1688);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      visualListModel0.prependAllElements(stack0);
      stack0.addElement((VisualPageListItem) null);
      VisualListModel visualListModel1 = new VisualListModel();
      visualListModel1.setData((Vector<VisualPageListItem>) stack0);
      visualListModel1.moveUpIndex(1);
      Random.setNextRandom(1);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)114;
      visualListModel0.moveDownIndex((byte)0);
      int[] intArray0 = new int[1];
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(1, intArray0.length);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      visualListModel0.prependAllElements(stack0);
      int[] intArray0 = new int[1];
      visualListModel0.prependAllElements(stack0);
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      List<VisualPageListItem> list0 = visualListModel0.getValidElements();
      assertNull(list0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      VisualPageListItem visualPageListItem0 = null;
      stack0.add((VisualPageListItem) null);
      visualListModel0.prependAllElements(stack0);
      stack0.addElement((VisualPageListItem) null);
      visualListModel0.prependAllElements(stack0);
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      visualListModel0.moveUpIndexes(intArray0);
      VisualPageListItem visualPageListItem1 = null;
      try {
        visualPageListItem1 = new VisualPageListItem(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      // Undeclared exception!
      try { 
        visualListModel0.removeElements(0, 1, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      visualListModel0.getSize();
      ICC_Profile[] iCC_ProfileArray0 = new ICC_Profile[4];
      // Undeclared exception!
      try { 
        ICC_Profile.getInstance(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown color space
         //
         verifyException("java.awt.color.ICC_Profile", e);
      }
  }
}