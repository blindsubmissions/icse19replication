/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:03:39 GMT 2018
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
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1556);
      classWriter0.newInteger(1556);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "!Wk\":Mn", "!Wk\":Mn", "!Wk\":Mn", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-974), "K>p4%nR3C<N", "!", "Eh'", "Eh'");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 49, "`s<+", "`s<+", "org.apache.commons.io.filefilter.FileFileFilter", "K>p4%nR3C<N");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0360334832009355
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-974), "K>p4%nR3C<N", "!", "Eh'", "Eh'");
      fieldWriter0.visitAnnotation("", true);
      Attribute attribute0 = new Attribute("!");
      byte[] byteArray0 = classWriter0.toByteArray();
      fieldWriter0.getSize();
      // Undeclared exception!
      try { 
        attribute0.write(classWriter0, byteArray0, 48, (-974), 54);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0360334832009355
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1304), "", "Ody", "", (Object) null);
      FieldWriter fieldWriter1 = classWriter0.lastField;
      fieldWriter1.visitAnnotation("", false);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute0 = new Attribute("");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(140, byteArray0.length);
      
      int int0 = fieldWriter1.getSize();
      assertEquals(40, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-991), "K>p4%nR3C<N", "!", "Eh'", "Eh'");
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("Eh'");
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      String string0 = "";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 292552704, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      FieldWriter fieldWriter1 = classWriter0.lastField;
      ByteVector byteVector1 = null;
      try {
        byteVector1 = new ByteVector((-465));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0360334832009355
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      classWriter0.version = (-1496);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1983), "", "", "Uw94", "Uw94");
      fieldWriter0.visitAnnotation("", true);
      Attribute attribute0 = new Attribute("");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        attribute0.write(classWriter0, byteArray0, (-3102), (-2), 16777227);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }
}
