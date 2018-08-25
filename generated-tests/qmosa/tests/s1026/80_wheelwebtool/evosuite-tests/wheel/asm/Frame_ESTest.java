/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 18:12:16 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
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
      int[] intArray0 = new int[0];
      frame0.inputLocals = intArray0;
      int[] intArray1 = new int[0];
      frame0.inputStack = intArray1;
      ClassWriter classWriter0 = new ClassWriter(182);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "?;++f?";
      stringArray0[1] = "?;++f?";
      stringArray0[2] = "";
      stringArray0[3] = "?;++f?";
      stringArray0[4] = "";
      stringArray0[5] = "";
      classWriter0.visit(182, 0, "?;++f?", "", "", stringArray0);
      classWriter0.visitSource("'yp", (String) null);
      frame0.execute(0, 182, classWriter0, (Item) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-948));
      Frame frame1 = new Frame();
      Item item0 = classWriter0.key;
      // Undeclared exception!
      try { 
        frame1.execute((-948), 196, classWriter0, item0);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-819));
      Type[] typeArray0 = new Type[5];
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      typeArray0[0] = type0;
      Type type1 = Type.FLOAT_TYPE;
      typeArray0[1] = type1;
      Type type2 = Type.getType(class0);
      typeArray0[2] = type2;
      Type type3 = Type.DOUBLE_TYPE;
      type1.getClassName();
      typeArray0[3] = type3;
      Type type4 = Type.DOUBLE_TYPE;
      typeArray0[4] = type4;
      // Undeclared exception!
      try { 
        frame0.initInputFrame(classWriter0, 285212675, typeArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Item", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-2104));
      Type[] typeArray0 = new Type[4];
      Type type0 = Type.FLOAT_TYPE;
      typeArray0[0] = type0;
      Type type1 = Type.BYTE_TYPE;
      Type.getObjectType("U@H?bO");
      Type type2 = Type.SHORT_TYPE;
      // Undeclared exception!
      try { 
        frame0.initInputFrame(classWriter0, 175, typeArray0, 4);
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
  /*Coverage entropy=0.12318419123658271
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-948));
      Frame frame1 = new Frame();
      Item item0 = classWriter0.key;
      // Undeclared exception!
      try { 
        frame1.execute((-948), (-948), classWriter0, item0);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-2104));
      Type type0 = Type.FLOAT_TYPE;
      Type.getObjectType("5vSg");
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      frame0.initInputFrame(classWriter0, (-2081), typeArray0, 1);
      assertEquals(0, typeArray0.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-2104));
      Type[] typeArray0 = new Type[4];
      Type type0 = Type.FLOAT_TYPE;
      typeArray0[0] = type0;
      Type type1 = Type.BYTE_TYPE;
      classWriter0.visit(10, (-226), "", "", "U@H?bO", (String[]) null);
      classWriter0.visitSource("Su?", (String) null);
      // Undeclared exception!
      try { 
        frame0.execute(4, (-2211), classWriter0, (Item) null);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Frame frame0 = new Frame();
      int[] intArray0 = new int[0];
      frame0.inputLocals = intArray0;
      int[] intArray1 = new int[0];
      frame0.inputStack = intArray1;
      ClassWriter classWriter0 = new ClassWriter(182);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "?;++f?";
      stringArray0[1] = "?;++f?";
      stringArray0[2] = "";
      stringArray0[3] = "?;++f?";
      stringArray0[4] = "";
      stringArray0[5] = "";
      classWriter0.visit(182, 0, "?;++f?", "", "", stringArray0);
      classWriter0.visitSource("'yp", (String) null);
      Frame frame1 = new Frame();
      // Undeclared exception!
      try { 
        frame0.merge(classWriter0, frame1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }
}
