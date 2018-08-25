/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:34:50 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.Edge;
import wheel.asm.Frame;
import wheel.asm.Item;
import wheel.asm.Label;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Frame_ESTest extends Frame_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Frame frame0 = new Frame();
      int[] intArray0 = new int[6];
      intArray0[0] = (-3498);
      intArray0[1] = (-3498);
      intArray0[2] = (-3498);
      intArray0[3] = (-3498);
      intArray0[4] = 4037;
      intArray0[5] = (-3498);
      frame0.inputStack = intArray0;
      ClassWriter classWriter0 = new ClassWriter((-3498));
      Type[] typeArray0 = new Type[3];
      Type type0 = Type.BYTE_TYPE;
      typeArray0[0] = type0;
      Type type1 = Type.INT_TYPE;
      typeArray0[1] = type1;
      Type type2 = Type.LONG_TYPE;
      typeArray0[2] = type2;
      // Undeclared exception!
      try { 
        frame0.initInputFrame(classWriter0, 1, typeArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Item", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter(0);
      Frame frame1 = new Frame();
      int int0 = 0;
      Item item0 = classWriter0.newLong(0L);
      // Undeclared exception!
      try { 
        frame0.execute(1, (-2576), classWriter0, item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Frame frame0 = new Frame();
      int int0 = (-2389);
      ClassWriter classWriter0 = null;
      ClassWriter classWriter1 = new ClassWriter(3008);
      String string0 = "i.-CyhSKerH";
      Item item0 = classWriter1.newClassItem("i.-CyhSKerH");
      // Undeclared exception!
      try { 
        frame0.execute((-2389), (-3747), (ClassWriter) null, item0);
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
  /*Coverage entropy=0.06215038042171724
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Frame frame0 = new Frame();
      int int0 = 16777217;
      ClassWriter classWriter0 = null;
      Item item0 = new Item(16777217);
      // Undeclared exception!
      try { 
        frame0.execute(16777217, 16777217, (ClassWriter) null, item0);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter(1064);
      Item item0 = classWriter0.key;
      frame0.execute(0, 0, classWriter0, item0);
      Label label0 = new Label();
      Frame frame1 = label0.frame;
      label0.toString();
      int int0 = 25165824;
      // Undeclared exception!
      try { 
        frame0.merge(classWriter0, (Frame) null, 25165824);
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
  /*Coverage entropy=0.0762589730398267
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter(0);
      Type[] typeArray0 = new Type[5];
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      typeArray0[0] = type0;
      Type type1 = type0.getElementType();
      typeArray0[1] = type1;
      classWriter0.newFieldItem("", "", "");
      Type type2 = Type.INT_TYPE;
      typeArray0[2] = type2;
      Type type3 = Type.SHORT_TYPE;
      typeArray0[3] = type3;
      Type type4 = Type.VOID_TYPE;
      Item item0 = classWriter0.key2;
      // Undeclared exception!
      try { 
        frame0.execute(156, (-2465), classWriter0, item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }
}