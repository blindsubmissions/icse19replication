/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:59:04 GMT 2018
 */

package org.pdfsam.guiclient.commons.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JComboBox;
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.removeElements(intArray0, true);
      int int0 = (-3227);
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem((-3227));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
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
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.removeElementAt(791, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 791
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.rotateClockwiseElements(intArray0);
      assertEquals(1, intArray0.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[1];
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndexes(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndex((-614));
      assertEquals(0, visualListModel0.getSize());
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
      visualListModel0.removeElements((-1), (-1), true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.subList((-530), 1674);
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0, true);
      assertNotNull(collection0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      visualListModel0.addAllElements(39, (Collection<VisualPageListItem>) vector0);
      assertEquals(10, vector0.capacity());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "The Hiearchy.setDisableOverride method has been deprecated.");
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex(0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "b5>+");
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex(1);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.reverseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[4];
      Vector<String> vector0 = new Vector<String>();
      JComboBox<String> jComboBox0 = new JComboBox<String>(vector0);
      visualListModel0.addListDataListener(jComboBox0);
      visualListModel0.removeElements(0, (-1), true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements(1, 1, false);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      assertEquals(0, intArray0.length);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.setData((Vector<VisualPageListItem>) stack0);
      assertEquals(0, stack0.size());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.undeleteElements(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[9];
      Object object0 = visualListModel0.getElementAt(0);
      assertNull(object0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[1];
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndexes(intArray0);
      int int0 = (-1);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        visualListModel0.getListeners((Class) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
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
      visualListModel0.undeleteElements(intArray0);
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementsChanged();
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.getValidElements();
      int int0 = 8;
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem(8, "\u0004");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addAllElements(39, (Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = visualListModel0.getElements();
      assertEquals(0, visualPageListItemArray0.length);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.subList(312, 229, true);
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0, true);
      assertNotNull(collection0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int int0 = visualListModel0.getSize();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      PriorityQueue<VisualPageListItem> priorityQueue0 = new PriorityQueue<VisualPageListItem>();
      visualListModel0.appendAllElements(priorityQueue0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.removeElementAt((-3275), false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.rotateClockwiseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.getElementAt((-3498));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      JComboBox<Object> jComboBox0 = new JComboBox<Object>();
      LinkedHashSet<VisualPageListItem> linkedHashSet0 = new LinkedHashSet<VisualPageListItem>();
      visualListModel0.prependAllElements((Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.reverseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[0];
      visualListModel0.setData(visualPageListItemArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      PriorityQueue<VisualPageListItem> priorityQueue0 = new PriorityQueue<VisualPageListItem>();
      visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) priorityQueue0);
      assertEquals(0, priorityQueue0.size());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      visualListModel0.addAllElements((-2902), (Collection<VisualPageListItem>) vector0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      LinkedHashSet<VisualPageListItem> linkedHashSet0 = new LinkedHashSet<VisualPageListItem>();
      visualListModel0.prependAllElements(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.updateElementAt((-14), (VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
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
  //Test case number: 42
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElementAt((VisualPageListItem) null, 1151);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      visualListModel0.data = null;
      int int0 = visualListModel0.getSize();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[1];
      visualListModel0.setData(visualPageListItemArray0);
      assertEquals(1, visualListModel0.getSize());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementChanged((VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      LinkedHashSet<VisualPageListItem> linkedHashSet0 = new LinkedHashSet<VisualPageListItem>();
      linkedHashSet0.add((VisualPageListItem) null);
      visualListModel0.prependAllElements(linkedHashSet0);
      assertEquals(1, visualListModel0.getSize());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      visualListModel0.setData((Vector<VisualPageListItem>) stack0);
      assertEquals(1, visualListModel0.getSize());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      VisualPageListItem[] visualPageListItemArray0 = visualListModel0.getElements();
      assertNull(visualPageListItemArray0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.clearData();
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int int0 = 1;
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      FileSystemHandling.shouldAllThrowIOExceptions();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      // Undeclared exception!
      try { 
        visualListModel0.addAllElements(1, (Collection<VisualPageListItem>) vector0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector$Itr", e);
      }
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem visualPageListItem0 = null;
      visualListModel0.addElement((VisualPageListItem) null);
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      // Undeclared exception!
      try { 
        visualListModel0.addAllElements((Collection<VisualPageListItem>) vector0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector$Itr", e);
      }
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      visualListModel0.reverseElements(intArray0);
      assertEquals(1, intArray0.length);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      VisualPageListItem visualPageListItem0 = null;
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
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
  //Test case number: 54
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[1];
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      vector0.add((VisualPageListItem) null);
      visualListModel0.removeElements(intArray1, true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[1];
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
  //Test case number: 56
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      VisualPageListItem visualPageListItem0 = null;
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[1];
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
  //Test case number: 57
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
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
  //Test case number: 58
  /*Coverage entropy=1.073542846408523
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[5];
      intArray0[0] = (-458);
      intArray0[1] = 186;
      intArray0[2] = 3605;
      intArray0[3] = 1024;
      intArray0[4] = (-2450);
      visualListModel0.reverseElements(intArray0);
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.removeElements(0, 0, false);
      assertEquals(1, visualListModel0.getSize());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.removeElements(0, 0, true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.moveUpIndex(1);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[0];
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "*\"1hx(4");
      visualListModel0.removeElements(intArray0, false);
      int[] intArray1 = new int[1];
      visualListModel0.moveDownIndexes(intArray1);
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      intArray0[0] = 791;
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      visualListModel0.moveDownIndex(0);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 64
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      FileSystemHandling.shouldAllThrowIOExceptions();
      intArray0[0] = 1;
      visualListModel0.moveUpIndexes(intArray0);
      visualListModel0.removeElements(1, (-647), false);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 65
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int int0 = 1;
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      int int1 = 0;
      boolean boolean0 = true;
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
  //Test case number: 67
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      FileSystemHandling.shouldAllThrowIOExceptions();
      intArray0[0] = 1;
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
  //Test case number: 68
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte byte0 = (byte) (-45);
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      visualListModel0.getValidElements();
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem((byte) (-45), "<ETS&+2_H{", "<ETS&+2_H{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 69
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 0;
      visualListModel0.moveUpIndexes(intArray0);
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
}
