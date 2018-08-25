/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 14:45:46 GMT 2018
 */

package org.pdfsam.guiclient.commons.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
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
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      visualListModel0.addAllElements(5, (Collection<VisualPageListItem>) vector0);
      assertEquals(0, vector0.size());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      visualListModel0.addAllElements((-22), (Collection<VisualPageListItem>) vector0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      int[] intArray0 = new int[1];
      intArray0[0] = 2081;
      visualListModel0.moveDownIndexes(intArray0);
      stack0.add((VisualPageListItem) null);
      stack0.clone();
      int[] intArray1 = new int[1];
      stack0.add((VisualPageListItem) null);
      visualListModel0.moveDownIndexes(intArray1);
      Random.setNextRandom(2081);
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.getValidElements();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      stack0.add((VisualPageListItem) null);
      int int0 = 0;
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
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.removeElements(165, 165, false);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.elementChanged((VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.appendAllElements(stack0);
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      stack0.add((VisualPageListItem) null);
      stack0.clone();
      int[] intArray0 = new int[1];
      stack0.add((VisualPageListItem) null);
      visualListModel0.moveDownIndexes(intArray0);
      System.setCurrentTimeMillis((-2516L));
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
        visualListModel0.removeElementAt(4592, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 4592
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
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      stack0.add((VisualPageListItem) null);
      visualListModel0.subList((-1), (-1), false);
      int[] intArray0 = new int[1];
      int int0 = 0;
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
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(0, intArray0.length);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = visualListModel0.getElements();
      assertEquals(0, visualPageListItemArray0.length);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndex((-530));
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.reverseElements(intArray0);
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem((-8));
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      visualListModel0.prependAllElements(vector0);
      assertEquals(10, vector0.capacity());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex(3953);
      visualListModel0.moveUpIndex(1);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1132);
      visualListModel0.moveUpIndexes(intArray0);
      int int0 = 1;
      int int1 = 0;
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      int[] intArray0 = new int[1];
      intArray0[0] = 2394;
      visualListModel0.rotateClockwiseElements(intArray0);
      stack0.add((VisualPageListItem) null);
      int[] intArray1 = new int[1];
      // Undeclared exception!
      try { 
        visualListModel0.rotateClockwiseElements(intArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.pdfsam.guiclient.commons.models.VisualListModel", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      int[] intArray0 = new int[8];
      intArray0[0] = (-441);
      intArray0[1] = 3226;
      intArray0[2] = 1703;
      intArray0[3] = 16;
      intArray0[4] = (-2013);
      intArray0[5] = (-1);
      intArray0[6] = 2723;
      intArray0[7] = 2001;
      visualListModel0.undeleteElements(intArray0);
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      VisualPageListItem visualPageListItem0 = null;
      stack0.add((VisualPageListItem) null);
      int[] intArray1 = new int[1];
      // Undeclared exception!
      try { 
        visualListModel0.undeleteElements(intArray1);
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      stack0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      stack0.add((VisualPageListItem) null);
      stack0.removeAll(visualListModel0.data);
      visualListModel0.removeElements(intArray0, false);
      visualListModel0.removeElements(intArray0, true);
      System.setCurrentTimeMillis((-1950L));
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.reverseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.removeElementAt(4592, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 4592
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.getListDataListeners();
      visualListModel0.subList(3502, 3502);
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0, true);
      assertNotNull(collection0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0, false);
      assertNotNull(collection0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addAllElements((Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      // Undeclared exception!
      try { 
        visualListModel0.getElementAt((-1499));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Object object0 = visualListModel0.getElementAt(608);
      assertNull(object0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveDownIndex(0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.moveUpIndex((-717));
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.removeElements(intArray0, true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      visualListModel0.setData((Vector<VisualPageListItem>) stack0);
      stack0.add((VisualPageListItem) null);
      stack0.clone();
      int[] intArray0 = new int[1];
      stack0.add((VisualPageListItem) null);
      visualListModel0.moveDownIndexes(intArray0);
      Random.setNextRandom(32);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.updateElementAt(65, (VisualPageListItem) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Vector<VisualPageListItem> vector0 = visualListModel0.data;
      visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) vector0);
      assertEquals("[]", vector0.toString());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addAllElements(133, (Collection<VisualPageListItem>) null);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      visualListModel0.prependAllElements(stack0);
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem((-1367));
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
      visualListModel0.removeElements((-3600), (-3600), false);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.rotateClockwiseElements(intArray0);
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
      visualListModel0.moveUpIndexes(intArray0);
      assertEquals(0, intArray0.length);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.undeleteElements(intArray0);
      assertEquals(0, intArray0.length);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      Predicate<Object> predicate0 = Predicate.isEqual((Object) visualListModel0.data);
      Predicate<Object> predicate1 = predicate0.negate();
      Predicate<Object> predicate2 = predicate1.and(predicate0);
      stack0.removeIf(predicate2);
      stack0.add((VisualPageListItem) null);
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
  //Test case number: 40
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[1];
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      int int0 = (-1);
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem((-1), "Could not find resource: [", "Could not find resource: [");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[0];
      visualListModel0.setData(visualPageListItemArray0);
      visualListModel0.getListDataListeners();
      Collection<VisualPageListItem> collection0 = visualListModel0.subList(0, 0, true);
      assertNotNull(collection0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.prependAllElements((Collection<VisualPageListItem>) null);
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
      stack0.add((VisualPageListItem) null);
      // Undeclared exception!
      try { 
        visualListModel0.addAllElements(0, (Collection<VisualPageListItem>) stack0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector$Itr", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      stack0.add((VisualPageListItem) null);
      stack0.clone();
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[7];
      visualPageListItemArray0[0] = null;
      visualPageListItemArray0[1] = null;
      visualPageListItemArray0[2] = null;
      visualPageListItemArray0[3] = null;
      visualPageListItemArray0[4] = null;
      visualPageListItemArray0[5] = null;
      visualPageListItemArray0[6] = null;
      visualListModel0.setData(visualPageListItemArray0);
      int[] intArray0 = new int[1];
      stack0.add((VisualPageListItem) null);
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(8, visualListModel0.getSize());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElementAt((VisualPageListItem) null, 114);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      int[] intArray0 = new int[0];
      visualListModel0.rotateAnticlockwiseElements(intArray0);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.setSize(2736);
      visualListModel0.setData((Vector<VisualPageListItem>) stack0);
      assertEquals(2736, visualListModel0.getSize());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      stack0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      stack0.add((VisualPageListItem) null);
      visualListModel0.moveDownIndex(0);
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
  //Test case number: 49
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) stack0);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) stack0);
      int[] intArray0 = new int[1];
      visualListModel0.moveUpIndexes(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      stack0.add((VisualPageListItem) null);
      stack0.clone();
      int[] intArray0 = new int[1];
      stack0.add((VisualPageListItem) null);
      visualListModel0.reverseElements(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      stack0.add((VisualPageListItem) null);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) stack0);
      visualListModel0.addAllElements((Collection<VisualPageListItem>) stack0);
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = 1;
      visualListModel0.moveUpIndexes(intArray0);
      VisualPageListItem visualPageListItem0 = null;
      try {
        visualPageListItem0 = new VisualPageListItem(1, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      stack0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      visualListModel0.removeElements(intArray0, true);
      assertEquals(0, visualListModel0.getSize());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) null;
      objectArray0[1] = (Object) null;
      stack0.toArray(objectArray0);
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      VisualListModel visualListModel0 = new VisualListModel();
      VisualListModel visualListModel1 = new VisualListModel();
      visualListModel1.moveDownIndex(1903);
      visualListModel1.addAllElements((Collection<VisualPageListItem>) stack0);
      visualListModel1.appendAllElements(stack0);
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = (-10);
      try { 
        visualListModel1.moveUpIndexes(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -10
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.addElement((VisualPageListItem) null);
      visualListModel0.moveUpIndex(1);
      Vector<VisualPageListItem> vector0 = new Vector<VisualPageListItem>();
      assertEquals(10, vector0.capacity());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      stack0.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      int[] intArray0 = new int[1];
      intArray0[0] = 90;
      visualListModel0.moveDownIndexes(intArray0);
      assertEquals(2, visualListModel0.getSize());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      VisualPageListItem[] visualPageListItemArray0 = visualListModel0.getElements();
      assertNull(visualPageListItemArray0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      List<VisualPageListItem> list0 = visualListModel0.getValidElements();
      assertNull(list0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.data = null;
      int int0 = visualListModel0.getSize();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      stack0.add((VisualPageListItem) null);
      visualListModel0.removeElements(0, 0, true);
      VisualListModel visualListModel1 = new VisualListModel();
      assertEquals(0, visualListModel1.getSize());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      VisualListModel visualListModel0 = new VisualListModel();
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      visualListModel0.data = (Vector<VisualPageListItem>) stack0;
      stack0.add((VisualPageListItem) null);
      visualListModel0.removeElements(0, 0, false);
      VisualListModel visualListModel1 = new VisualListModel();
      visualListModel1.removeElements(0, (-2037), true);
      assertEquals(0, visualListModel1.getSize());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      VisualPageListItem visualPageListItem0 = null;
      Stack<VisualPageListItem> stack0 = new Stack<VisualPageListItem>();
      Stack<VisualPageListItem> stack1 = new Stack<VisualPageListItem>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      stack0.clone();
      stack1.add((VisualPageListItem) null);
      stack0.add((VisualPageListItem) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      VisualListModel visualListModel0 = new VisualListModel();
      visualListModel0.addAllElements((Collection<VisualPageListItem>) stack0);
      stack1.add((VisualPageListItem) null);
      visualListModel0.getSize();
      visualListModel0.addAllElements((Collection<VisualPageListItem>) stack1);
      int int0 = 23;
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
}
