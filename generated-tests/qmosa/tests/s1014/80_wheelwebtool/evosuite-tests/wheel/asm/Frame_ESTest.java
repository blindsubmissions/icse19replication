/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:45:54 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.ClassWriter;
import wheel.asm.Frame;
import wheel.asm.Item;
import wheel.asm.Label;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Frame_ESTest extends Frame_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Frame frame0 = new Frame();
      int int0 = 345;
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = new Item(0);
      // Undeclared exception!
      try { 
        frame0.execute(345, 345, classWriter0, item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-2010));
      Type[] typeArray0 = new Type[2];
      Type type0 = Type.DOUBLE_TYPE;
      typeArray0[0] = type0;
      Type type1 = Type.INT_TYPE;
      typeArray0[1] = type1;
      // Undeclared exception!
      try { 
        frame0.initInputFrame(classWriter0, 2, typeArray0, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Item", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-2010));
      Type type0 = Type.DOUBLE_TYPE;
      Item item0 = classWriter0.key3;
      // Undeclared exception!
      try { 
        frame0.execute(6, 5, classWriter0, item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6559757323365467
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = null;
      Class<Object> class0 = Object.class;
      Type.getType(class0);
      Item item0 = new Item(0);
      // Undeclared exception!
      try { 
        frame0.execute(10, (-1459), (ClassWriter) null, item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9002560512685369
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(285212683);
      Item item0 = classWriter0.newInteger(191);
      Frame frame0 = new Frame();
      // Undeclared exception!
      try { 
        frame0.execute(4, 2940, classWriter0, item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.45710229325542967
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = new Item(0);
      Type type0 = Type.getType("Rw^o;/H");
      Type type1 = Type.DOUBLE_TYPE;
      Type type2 = Type.getObjectType(":)a KT3");
      Type type3 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type2;
      // Undeclared exception!
      try { 
        frame0.initInputFrame(classWriter0, (-1412), typeArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("wheel.asm.Frame", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.9556998911125343
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-2010));
      Type type0 = Type.DOUBLE_TYPE;
      Item item0 = classWriter0.key3;
      // Undeclared exception!
      try { 
        frame0.execute(3, 6, classWriter0, item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5783252866601272
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-2010));
      Type type0 = Type.DOUBLE_TYPE;
      Item item0 = classWriter0.key3;
      int int0 = 13;
      // Undeclared exception!
      try { 
        frame0.execute(13, 13, classWriter0, item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }
}