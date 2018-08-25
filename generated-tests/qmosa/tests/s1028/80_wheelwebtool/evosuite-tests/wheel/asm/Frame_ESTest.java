/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 18:48:49 GMT 2018
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
import wheel.asm.MethodWriter;
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
      int int0 = 713;
      ClassWriter classWriter0 = new ClassWriter((-1));
      Item item0 = classWriter0.newDouble((-188.8121206483659));
      String string0 = "wheel.asm.Label";
      item0.strVal2 = "wheel.asm.Label";
      // Undeclared exception!
      try { 
        frame0.execute(4, 713, classWriter0, item0);
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
  /*Coverage entropy=1.303092403761719
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.key2;
      // Undeclared exception!
      try { 
        frame0.execute((-1676), 0, classWriter0, item0);
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
      ClassWriter classWriter0 = new ClassWriter((-543));
      Type[] typeArray0 = new Type[2];
      Type type0 = Type.SHORT_TYPE;
      typeArray0[0] = type0;
      Type type1 = Type.BYTE_TYPE;
      typeArray0[1] = type1;
      // Undeclared exception!
      try { 
        frame0.initInputFrame(classWriter0, 2, typeArray0, 2);
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
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newFloat((-961));
      // Undeclared exception!
      try { 
        frame0.execute(1, 16777226, classWriter0, item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }
}