/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:18:45 GMT 2018
 */

package org.pdfsam.guiclient.commons.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import javax.swing.event.ListDataListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.pdfsam.guiclient.commons.models.VisualListModel;
import org.pdfsam.guiclient.dto.VisualPageListItem;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VisualListModel_ESTest extends VisualListModel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = visualListModel0.getElements();
      assertEquals(0, visualPageListItemArray0.length);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int int0 = visualListModel0.getSize();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements(0, 0, true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VisualPageListItem visualPageListItem0 = null;
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      intArray0[0] = 3655;
      try { 
        visualListModel0.rotateClockwiseElements(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 3655
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[7];
      visualListModel0.rotateClockwiseElements(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.removeElementAt(1856, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 1856
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndex(931);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementsChanged();
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 0;
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.subList(0, 0, true);
      String string0 = "1k[6,r:Br$gh5}yhw";
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem(0, "1k[6,r:Br$gh5}yhw", "org.pdfsam.guiclient.commons.models.VisualListModel");
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VisualPageListItem visualPageListItem0 = null;
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[6];
      intArray0[0] = 167;
      intArray0[1] = 405;
      intArray0[2] = 2048;
      intArray0[3] = (-2046);
      intArray0[4] = 1;
      intArray0[5] = 1024;
      visualListModel0.removeElements(intArray0, true);
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.parallelStream();
      vector0.add((VisualPageListItem) null);
      int int0 = 3655;
      int[] intArray1 = new int[1];
      intArray1[0] = 3655;
      try { 
        visualListModel0.removeElements(intArray1, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 3655
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex(0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.prependAllElements(stack0);
      assertTrue(stack0.isEmpty());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementChanged((VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0, false);
      assertNotNull(collection0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      visualListModel0.addAllElements((-1116), (Collection<VisualPageListItem>) vector0);
      assertEquals(10, vector0.capacity());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.moveUpIndexes(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements((-1142), (-1142), true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      int[] intArray0 = new int[3];
      intArray0[0] = (-2622);
      int int0 = 3157;
      intArray0[1] = 3157;
      intArray0[2] = 1;
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      vector0.add((VisualPageListItem) null);
      int[] intArray1 = new int[1];
      intArray1[0] = 3655;
      try { 
        visualListModel0.rotateAnticlockwiseElements(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 3655
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VisualPageListItem visualPageListItem0 = null;
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
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
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.undeleteElements(intArray0);
      assertEquals(1, intArray0.length);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.removeElementAt(1856, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 1856
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VisualPageListItem visualPageListItem0 = null;
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "\u00048F\b@9.WT");
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      vector0.stream();
      int int0 = 0;
      visualListModel0.subList((-747), 0);
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
  //Test case number: 22
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.reverseElements(intArray0);
      visualListModel0.reverseElements(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.setData((Vector<VisualPageListItem>) stack0);
      assertTrue(stack0.isEmpty());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.getElementAt(3616);
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem(3616, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      LinkedHashSet<VisualPageListItem> linkedHashSet0 = new LinkedHashSet<VisualPageListItem>();
      visualListModel0.appendAllElements(linkedHashSet0);
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      vector0.add((VisualPageListItem) null);
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VisualPageListItem visualPageListItem0 = null;
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      visualListModel0.getValidElements();
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
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndex((-339));
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.prependAllElements((Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex(720);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.removeElements(intArray0, true);
      assertArrayEquals(new int[] {}, intArray0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[0];
      visualListModel0.setData(visualPageListItemArray0);
      assertEquals(0, visualPageListItemArray0.length);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(294, 294, true);
      assertNull(collection0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[1];
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndexes(intArray0);
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem(1, "", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.getElementAt((-1120));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements(1973, (-1403), true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.undeleteElements(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.reverseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addAllElements((Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.updateElementAt((-5540), (VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      LinkedHashSet<VisualPageListItem> linkedHashSet0 = new LinkedHashSet<VisualPageListItem>();
      visualListModel0.addAllElements(253, (Collection<VisualPageListItem>) linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.rotateClockwiseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.parallelStream();
      stack0.add((VisualPageListItem) null);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.setData((Vector<VisualPageListItem>) stack0);
      assertEquals(1, visualListModel0.getSize());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addAllElements((-92), (Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElementAt((VisualPageListItem) null, 40000);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      visualListModel0.clearData();
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[1];
      visualListModel0.setData(visualPageListItemArray0);
      assertEquals(1, visualListModel0.getSize());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      vector0.add(0, (VisualPageListItem) null);
      visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) vector0);
      assertEquals(1, visualListModel0.getSize());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      VisualPageListItem visualPageListItem0 = null;
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "\u00048F\b@9.WT");
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      vector0.stream();
      int int0 = 0;
      visualListModel0.moveUpIndex(1);
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
  //Test case number: 52
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      intArray0[0] = 3655;
      try { 
        visualListModel0.moveUpIndexes(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 3654
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) vector0);
      int[] intArray0 = new int[1];
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) vector0);
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      intArray0[0] = 2;
      visualListModel0.moveUpIndexes(intArray0);
      assertArrayEquals(new int[] {2}, intArray0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      visualListModel0.reverseElements(intArray0);
      vector0.add((VisualPageListItem) null);
      visualListModel0.moveDownIndexes(intArray0);
      visualListModel0.moveDownIndexes(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      visualListModel0.removeElements(intArray0, true);
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      assertEquals(200, (int)integer0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem visualPageListItem0 = null;
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      vector0.add((VisualPageListItem) null);
      visualListModel0.prependAllElements(vector0);
      vector0.add((VisualPageListItem) null);
      // Undeclared exception!
      try { 
        vector0.setElementAt((VisualPageListItem) null, 416);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 416 >= 2
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "\u00048F\b@9.WT");
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      vector0.stream();
      visualListModel0.moveDownIndex(0);
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
  //Test case number: 59
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      intArray0[0] = 12;
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.9368883075390159
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      ArrayDeque<VisualPageListItem> arrayDeque0 = new ArrayDeque<VisualPageListItem>();
      vector0.addAll((Collection<? extends VisualPageListItem>) arrayDeque0);
      arrayDeque0.removeAll(vector0);
      Boolean boolean0 = new Boolean(false);
      vector0.add((VisualPageListItem) null);
      arrayDeque0.parallelStream();
      visualListModel0.addAllElements((Collection<VisualPageListItem>) vector0);
      visualListModel0.removeElements(0, 0, (boolean) boolean0);
      assertEquals(1, visualListModel0.getSize());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      ArrayDeque<VisualPageListItem> arrayDeque0 = new ArrayDeque<VisualPageListItem>();
      vector0.add((VisualPageListItem) null);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) vector0);
      visualListModel0.removeElements(0, 0, true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) vector0);
      int[] intArray0 = new int[1];
      intArray0[0] = 3;
      visualListModel0.addAllElements((Collection<VisualPageListItem>) vector0);
      // Undeclared exception!
      try { 
        visualListModel0.removeElements(0, 2, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      vector0.add((VisualPageListItem) null);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) vector0);
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[4];
      intArray0[0] = 2;
      intArray0[1] = 2;
      intArray0[1] = 2;
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(4, intArray0.length);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      int int0 = visualListModel0.getSize();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      List<VisualPageListItem> list0 = visualListModel0.getValidElements();
      assertNull(list0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      JComboBox<String> jComboBox0 = new JComboBox<String>();
      visualListModel0.data = null;
      visualListModel0.removeListDataListener((ListDataListener) null);
      VisualPageListItem[] visualPageListItemArray0 = visualListModel0.getElements();
      assertNull(visualPageListItemArray0);
  }
}
