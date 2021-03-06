/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:34:12 GMT 2018
 */

package org.pdfsam.guiclient.commons.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.RenderingHints;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.LookupOp;
import java.awt.image.ShortLookupTable;
import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.DropMode;
import javax.swing.JComboBox;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.pdfsam.guiclient.commons.models.VisualListModel;
import org.pdfsam.guiclient.dto.Rotation;
import org.pdfsam.guiclient.dto.VisualPageListItem;
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VisualListModel_ESTest extends VisualListModel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.subList(2, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex(2) > toIndex(0)
         //
         verifyException("java.util.SubList", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[5];
      intArray0[0] = (-1554);
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = (-1011);
      intArray0[4] = 334;
      visualListModel0.moveUpIndexes(intArray0);
      visualListModel0.elementsChanged();
      visualListModel0.clearData();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem(90, "@Q{*q)IGc3h");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements(0, 0, true);
      int int0 = 1701;
      short[] shortArray0 = new short[1];
      shortArray0[0] = (short)0;
      ShortLookupTable shortLookupTable0 = new ShortLookupTable(0, shortArray0);
      Hashtable<RenderingHints.Key, DropMode> hashtable0 = new Hashtable<RenderingHints.Key, DropMode>();
      RenderingHints renderingHints0 = new RenderingHints(hashtable0);
      LookupOp lookupOp0 = new LookupOp(shortLookupTable0, renderingHints0);
      int int1 = (-332);
      BufferedImage bufferedImage0 = null;
      try {
        bufferedImage0 = new BufferedImage(1706, 1701, (-332));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown image type -332
         //
         verifyException("java.awt.image.BufferedImage", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      TreeSet<VisualPageListItem> treeSet0 = new TreeSet<VisualPageListItem>();
      visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) treeSet0);
      visualListModel0.subList(0, 1, true);
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[1] = 0;
      intArray0[2] = 1;
      intArray0[3] = 1;
      intArray0[4] = 1;
      visualListModel0.removeElements(intArray0, false);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex(0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      LinkedList<VisualPageListItem> linkedList0 = new LinkedList<VisualPageListItem>();
      int[] intArray0 = new int[4];
      intArray0[0] = 3;
      intArray0[1] = 0;
      intArray0[2] = (-944);
      intArray0[3] = (-1300);
      visualListModel0.moveDownIndexes(intArray0);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) linkedList0);
      int[] intArray1 = new int[2];
      intArray1[0] = 400;
      visualListModel0.addAllElements((Collection<VisualPageListItem>) linkedList0);
      intArray1[1] = 1;
      visualListModel0.rotateAnticlockwiseElements(intArray1);
      visualListModel0.rotateClockwiseElements(intArray1);
      visualListModel0.appendAllElements(linkedList0);
      visualListModel0.reverseElements(intArray0);
      assertArrayEquals(new int[] {3, 0, (-944), (-1300)}, intArray0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      boolean boolean0 = false;
      visualListModel0.moveDownIndex(0);
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      visualListModel0.rotateClockwiseElements(intArray0);
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.appendAllElements(stack0);
      // Undeclared exception!
      try { 
        visualListModel0.removeElementAt(0, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementsChanged();
      int[] intArray0 = new int[2];
      LinkedList<VisualPageListItem> linkedList0 = new LinkedList<VisualPageListItem>();
      visualListModel0.addAllElements((Collection<VisualPageListItem>) linkedList0);
      intArray0[0] = 3334;
      intArray0[1] = 3334;
      visualListModel0.reverseElements(intArray0);
      boolean boolean0 = false;
      visualListModel0.elementsChanged();
      visualListModel0.removeElements(3334, 3334, false);
      visualListModel0.getElements();
      visualListModel0.moveDownIndexes(intArray0);
      // Undeclared exception!
      try { 
        visualListModel0.subList(0, (-1842));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex(0) > toIndex(-1842)
         //
         verifyException("java.util.SubList", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementsChanged();
      int[] intArray0 = new int[8];
      intArray0[0] = (-3257);
      visualListModel0.moveUpIndex(1);
      intArray0[1] = 2993;
      intArray0[2] = 4871;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 14;
      intArray0[6] = 256;
      intArray0[7] = 0;
      visualListModel0.undeleteElements(intArray0);
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
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      visualListModel0.addAllElements((-132), (Collection<VisualPageListItem>) null);
      intArray0[1] = (-903);
      intArray0[2] = 310;
      // Undeclared exception!
      try { 
        visualListModel0.removeElementAt(310, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 310
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.751666616931517
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.moveDownIndexes(intArray0);
      visualListModel0.moveUpIndexes(intArray0);
      visualListModel0.getElements();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      visualListModel0.setData(vector0);
      visualListModel0.removeElements(intArray0, false);
      visualListModel0.moveUpIndexes(intArray0);
      visualListModel0.getSize();
      visualListModel0.moveUpIndex((-4517));
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.stream();
      visualListModel0.appendAllElements(stack0);
      visualListModel0.undeleteElements(intArray0);
      visualListModel0.getElementAt(0);
      visualListModel0.getValidElements();
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      visualListModel0.removeElements(intArray0, true);
      VisualListModel visualListModel1 = new VisualListModel();
      visualListModel1.rotateClockwiseElements(intArray0);
      visualListModel0.rotateClockwiseElements(intArray0);
      visualListModel0.moveDownIndexes(intArray0);
      VisualListModel visualListModel2 = new VisualListModel();
      visualListModel2.getSize();
      visualListModel1.moveUpIndexes(intArray0);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) vector0);
      visualListModel0.getSize();
      visualListModel0.moveDownIndexes(intArray0);
      assertFalse(visualListModel0.equals((Object)visualListModel1));
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = new TreeSet<VisualPageListItem>();
      visualListModel0.getSize();
      LinkedList<VisualPageListItem> linkedList0 = new LinkedList<VisualPageListItem>();
      linkedList0.addAll(collection0);
      visualListModel0.prependAllElements(linkedList0);
      visualListModel0.getElements();
      visualListModel0.addAllElements(1242, collection0);
      short[] shortArray0 = new short[5];
      shortArray0[0] = (short)0;
      shortArray0[1] = (short)0;
      shortArray0[2] = (short) (-1);
      shortArray0[3] = (short)256;
      visualListModel0.elementsChanged();
      shortArray0[4] = (short)1538;
      ShortLookupTable shortLookupTable0 = new ShortLookupTable(1242, shortArray0);
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_TEXT_ANTIALIASING;
      RenderingHints renderingHints0 = new RenderingHints(sunHints_Key0, collection0);
      LookupOp lookupOp0 = new LookupOp(shortLookupTable0, renderingHints0);
      BufferedImage bufferedImage0 = null;
      try {
        bufferedImage0 = new BufferedImage((-115), (-1098), (-4998));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown image type -4998
         //
         verifyException("java.awt.image.BufferedImage", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      TreeSet<VisualPageListItem> treeSet0 = new TreeSet<VisualPageListItem>();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      treeSet0.addAll(vector0);
      visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) treeSet0);
      visualListModel0.subList(0, 1, true);
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[1] = 0;
      intArray0[2] = 1;
      intArray0[3] = 1;
      intArray0[4] = 1;
      visualListModel0.moveUpIndexes(intArray0);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[2];
      int int0 = 4;
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[0];
      visualListModel0.setData(visualPageListItemArray0);
      intArray0[0] = 4;
      visualListModel0.getElements();
      visualListModel0.getListDataListeners();
      int int1 = 2500;
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
  //Test case number: 14
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[3];
      visualListModel0.removeElements((-2841), 1, true);
      intArray0[0] = 5;
      intArray0[1] = 1661;
      intArray0[2] = 14;
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[0];
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.stream();
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addAllElements((-4517), (Collection<VisualPageListItem>) stack0);
      visualListModel0.rotateClockwiseElements(intArray0);
      VisualListModel visualListModel1 = new VisualListModel();
      visualListModel1.getSize();
      visualListModel0.moveUpIndexes(intArray0);
      visualListModel0.reverseElements(intArray0);
      assertEquals(0, intArray0.length);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.getValidElements();
      visualListModel0.prependAllElements((Collection<VisualPageListItem>) null);
      visualListModel0.getListDataListeners();
      // Undeclared exception!
      try { 
        visualListModel0.setData((VisualPageListItem[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[2];
      int int0 = 2787;
      visualListModel0.undeleteElements(intArray0);
      visualListModel0.removeElements(2787, (-1), true);
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
  //Test case number: 18
  /*Coverage entropy=1.4941751382893085
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      TreeSet<VisualPageListItem> treeSet0 = new TreeSet<VisualPageListItem>();
      VisualListModel visualListModel1 = new VisualListModel();
      PriorityQueue<VisualPageListItem> priorityQueue0 = new PriorityQueue<VisualPageListItem>();
      PriorityQueue<VisualPageListItem> priorityQueue1 = new PriorityQueue<VisualPageListItem>(priorityQueue0);
      visualListModel1.addAllElements(1538, (Collection<VisualPageListItem>) priorityQueue1);
      visualListModel1.subList(4, 6, false);
      int[] intArray0 = new int[5];
      intArray0[0] = 2431;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 1538;
      intArray0[4] = 0;
      visualListModel0.removeElements(intArray0, false);
      // Undeclared exception!
      try { 
        visualListModel0.getElementAt((-2223));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2223
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      TreeSet<VisualPageListItem> treeSet0 = new TreeSet<VisualPageListItem>();
      visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) treeSet0);
      visualListModel0.clearData();
      LinkedHashSet<VisualPageListItem> linkedHashSet0 = new LinkedHashSet<VisualPageListItem>();
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[1] = 0;
      intArray0[2] = 1;
      intArray0[3] = 1;
      intArray0[4] = 1;
      visualListModel0.clearData();
      visualListModel0.moveDownIndex(0);
      visualListModel0.updateElementAt((-475), (VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      vector0.add((VisualPageListItem) null);
      visualListModel0.setData(vector0);
      int[] intArray0 = new int[3];
      visualListModel0.removeElements(intArray0, true);
      intArray0[0] = 30000;
      intArray0[1] = 9;
      intArray0[2] = 1;
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      visualListModel0.moveDownIndexes(intArray0);
      visualListModel0.moveDownIndex((-685));
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      vector0.add((VisualPageListItem) null);
      visualListModel0.setData(vector0);
      int[] intArray0 = new int[3];
      visualListModel0.removeElements(intArray0, true);
      intArray0[0] = 30000;
      intArray0[1] = 9;
      intArray0[2] = 1;
      VisualListModel visualListModel1 = new VisualListModel();
      visualListModel1.setData((Vector<VisualPageListItem>) stack0);
      visualListModel1.addElementAt((VisualPageListItem) null, (-1));
      assertEquals(2, visualListModel1.getSize());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementChanged((VisualPageListItem) null);
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[4];
      visualPageListItemArray0[0] = null;
      visualPageListItemArray0[1] = null;
      visualPageListItemArray0[2] = null;
      visualPageListItemArray0[3] = null;
      JComboBox<VisualPageListItem> jComboBox0 = new JComboBox<VisualPageListItem>(visualPageListItemArray0);
      jComboBox0.setFocusTraversalPolicyProvider(true);
      visualListModel0.addListDataListener(jComboBox0);
      visualListModel0.setData(visualPageListItemArray0);
      int[] intArray0 = new int[3];
      intArray0[0] = 3403;
      intArray0[1] = 861;
      intArray0[2] = 35;
      try { 
        visualListModel0.rotateClockwiseElements(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 3403
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<VisualPageListItem> linkedList0 = new LinkedList<VisualPageListItem>();
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      visualListModel0.prependAllElements(linkedList0);
      visualListModel0.getListDataListeners();
      int int0 = visualListModel0.getSize();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      vector0.add((VisualPageListItem) null);
      visualListModel0.setData((Vector<VisualPageListItem>) stack0);
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      intArray0[1] = 270;
      intArray0[3] = 0;
      intArray0[4] = 256;
      intArray0[5] = 15;
      intArray0[7] = (-1209);
      visualListModel0.removeElements(intArray0, true);
      visualListModel0.setData(vector0);
      visualListModel0.addElementAt((VisualPageListItem) null, 270);
      assertEquals(3, visualListModel0.getSize());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.removeElements(3624, 4, false);
      stack0.add((VisualPageListItem) null);
      LinkedList<VisualPageListItem> linkedList0 = new LinkedList<VisualPageListItem>();
      linkedList0.add((VisualPageListItem) null);
      visualListModel0.prependAllElements(linkedList0);
      assertEquals(1, visualListModel0.getSize());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      vector0.add((VisualPageListItem) null);
      visualListModel0.setData(vector0);
      int[] intArray0 = new int[3];
      visualListModel0.removeElements(intArray0, true);
      intArray0[0] = 30000;
      intArray0[1] = 9;
      intArray0[2] = 1;
      visualListModel0.addAllElements((Collection<VisualPageListItem>) stack0);
      assertEquals(4, visualListModel0.getSize());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.945934775756114
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      boolean boolean0 = new Boolean(true);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      vector0.add((VisualPageListItem) null);
      visualListModel0.setData(vector0);
      int[] intArray0 = new int[3];
      visualListModel0.removeElements(intArray0, true);
      intArray0[0] = 30000;
      intArray0[1] = 9;
      intArray0[2] = 1;
      visualListModel0.moveDownIndexes(intArray0);
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      visualListModel0.rotateClockwiseElements(intArray0);
      visualListModel0.reverseElements(intArray0);
      visualListModel0.addAllElements(1, (Collection<VisualPageListItem>) stack0);
      assertEquals(3, visualListModel0.getSize());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      vector0.add((VisualPageListItem) null);
      visualListModel0.setData(vector0);
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.subList((-1794), 0, true);
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = 0;
      visualListModel0.moveDownIndexes(intArray0);
      // Undeclared exception!
      try { 
        visualListModel0.rotateAnticlockwiseElements(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[1];
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      stack0.add((VisualPageListItem) null);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.setData(vector0);
      int int0 = (-2099);
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
  //Test case number: 30
  /*Coverage entropy=1.8498981518685602
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[1];
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      stack0.add((VisualPageListItem) null);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.setData(vector0);
      int int0 = 0;
      visualListModel0.subList((-1794), 0, true);
      VisualListModel visualListModel1 = new VisualListModel();
      visualListModel1.addAllElements((Collection<VisualPageListItem>) stack0);
      int[] intArray1 = new int[3];
      visualListModel0.reverseElements(intArray0);
      intArray1[0] = 0;
      visualListModel0.moveDownIndexes(intArray0);
      // Undeclared exception!
      try { 
        visualListModel0.rotateAnticlockwiseElements(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.0837660374856477
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[1];
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      stack0.add((VisualPageListItem) null);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.setData(vector0);
      visualListModel0.subList((-1794), 0, true);
      VisualListModel visualListModel1 = new VisualListModel();
      visualListModel1.getValidElements();
      visualListModel1.addAllElements((Collection<VisualPageListItem>) stack0);
      int[] intArray1 = new int[3];
      intArray1[0] = 0;
      visualListModel0.moveDownIndexes(intArray0);
      visualListModel1.moveUpIndexes(intArray0);
      // Undeclared exception!
      try { 
        visualListModel0.rotateAnticlockwiseElements(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = new int[1];
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      VisualPageListItem visualPageListItem0 = null;
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      stack0.add((VisualPageListItem) null);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.setData(vector0);
      // Undeclared exception!
      try { 
        visualListModel0.removeElements(intArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[1];
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      stack0.add((VisualPageListItem) null);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.setData(vector0);
      int int0 = (-1794);
      int int1 = 0;
      int[] intArray1 = new int[7];
      intArray1[0] = (-1794);
      VisualListModel visualListModel1 = new VisualListModel();
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
  //Test case number: 34
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[1];
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      stack0.add((VisualPageListItem) null);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.setData(vector0);
      int[] intArray1 = new int[7];
      intArray1[0] = (-1794);
      intArray1[1] = 0;
      intArray1[2] = 3;
      visualListModel0.moveDownIndexes(intArray0);
      visualListModel0.reverseElements(intArray0);
      visualListModel0.undeleteElements(intArray1);
      visualListModel0.moveDownIndexes(intArray0);
      visualListModel0.moveDownIndex(0);
      visualListModel0.moveDownIndexes(intArray1);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.removeAllElements();
      stack0.add((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>(stack0);
      stack0.add((VisualPageListItem) null);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.getElements();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0, true);
      assertNotNull(collection0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      visualListModel0.getElements();
      int[] intArray0 = new int[0];
      visualListModel0.rotateClockwiseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }
}
