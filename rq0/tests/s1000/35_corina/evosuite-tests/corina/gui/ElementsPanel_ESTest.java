/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:36:07 GMT 2018
 */

package corina.gui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import corina.editor.Editor;
import corina.gui.ElementsPanel;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ElementsPanel_ESTest extends ElementsPanel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      ElementsPanel elementsPanel0 = null;
      try {
        elementsPanel0 = new ElementsPanel(arrayList0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.08676875496392
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      linkedList0.add((Object) integer0);
      ElementsPanel elementsPanel0 = null;
      try {
        elementsPanel0 = new ElementsPanel(linkedList0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1192809219098505
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ElementsPanel elementsPanel0 = null;
      try {
        elementsPanel0 = new ElementsPanel((List) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ElementsPanel elementsPanel0 = null;
      try {
        elementsPanel0 = new ElementsPanel((Editor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("corina.gui.ElementsPanel", e);
      }
  }
}