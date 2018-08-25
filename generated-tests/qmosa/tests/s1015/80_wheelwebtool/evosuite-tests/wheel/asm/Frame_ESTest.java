/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:10:59 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Frame frame0 = new Frame();
      Frame frame1 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-733));
      Item item0 = classWriter0.newDouble((-393.944157));
      // Undeclared exception!
      try { 
        frame0.execute((-733), (-733), (ClassWriter) null, item0);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-2056));
      Type[] typeArray0 = new Type[4];
      Type type0 = Type.DOUBLE_TYPE;
      typeArray0[0] = type0;
      Class<String> class0 = String.class;
      Type type1 = Type.getType(class0);
      typeArray0[1] = type1;
      Type type2 = Type.FLOAT_TYPE;
      typeArray0[2] = type2;
      Type type3 = Type.VOID_TYPE;
      typeArray0[3] = type3;
      frame0.initInputFrame(classWriter0, 2394, typeArray0, 1928);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.06215038042171724
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter(1918);
      // Undeclared exception!
      try { 
        frame0.execute(1918, 201, classWriter0, (Item) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Frame frame0 = new Frame();
      Frame frame1 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-676));
      Item item0 = classWriter0.key;
      // Undeclared exception!
      try { 
        frame0.execute(2, 2, classWriter0, item0);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-2056));
      Type[] typeArray0 = new Type[4];
      Type type0 = Type.DOUBLE_TYPE;
      typeArray0[0] = type0;
      // Undeclared exception!
      try { 
        frame0.initInputFrame(classWriter0, 6, typeArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Item", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Frame frame0 = new Frame();
      ClassWriter classWriter0 = new ClassWriter(1486);
      Label label0 = new Label();
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      intArray0[1] = 2;
      ClassWriter classWriter1 = new ClassWriter(16777222);
      // Undeclared exception!
      try { 
        frame0.execute(1, 1, classWriter0, (Item) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.9002560512685369
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Frame frame0 = new Frame();
      Frame frame1 = new Frame();
      ClassWriter classWriter0 = new ClassWriter((-4239));
      Item item0 = classWriter0.newMethodItem("=kAJ()zrMle9|", "=kAJ()zrMle9|", "=kAJ()zrMle9|", true);
      // Undeclared exception!
      try { 
        frame1.execute(4, (-1319), (ClassWriter) null, item0);
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
  /*Coverage entropy=0.1478439782073591
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Frame frame0 = new Frame();
      Type type0 = Type.CHAR_TYPE;
      ClassWriter classWriter0 = new ClassWriter((-3076));
      // Undeclared exception!
      try { 
        frame0.execute(68, 8, classWriter0, (Item) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.21641408919322774
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Frame frame0 = new Frame();
      Frame frame1 = new Frame();
      ClassWriter classWriter0 = new ClassWriter(152);
      Item item0 = classWriter0.newDouble(152);
      Frame frame2 = new Frame();
      // Undeclared exception!
      try { 
        frame2.execute(41, 192, classWriter0, item0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Frame", e);
      }
  }
}