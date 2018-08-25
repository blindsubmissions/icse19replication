/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:21:28 GMT 2018
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(521);
      classWriter0.visitOuterClass("\nk&^vN", "", (String) null);
      Attribute attribute0 = new Attribute("15BlK(^El]J%hJTo");
      classWriter0.threshold = 518;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "\nk&^vN", "Deprecated", "\nk&^vN");
      Attribute attribute1 = new Attribute("-}^Tq{q 'E");
      fieldWriter0.visitAttribute(attribute1);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putInt(1);
      ByteVector byteVector2 = byteVector1.putShort(941);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)33;
      byteVector0.putUTF8("-}^Tq{q 'E");
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)25;
      byteArray0[3] = (byte) (-104);
      byteArray0[4] = (byte)84;
      byteArray0[5] = (byte)77;
      ByteVector byteVector3 = byteVector2.putByteArray(byteArray0, 1, 1);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(521);
      classWriter0.visitOuterClass("\nk&^vN", "", (String) null);
      classWriter0.newConst("RuntimeInvisibleAnnotations");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "RuntimeInvisibleAnnotations", "", "-}^Tq{q 'E", (Object) null);
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(521);
      classWriter0.visitOuterClass("\nk&^vN", "", (String) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      classWriter0.newDouble(521);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      classWriter0.newConst("RuntimeInvisibleAnnotations");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "RuntimeInvisibleAnnotations", "", "-}^Tq{q 'E", (Object) null);
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putByte(16);
      ByteVector byteVector2 = byteVector1.putInt(8);
      fieldWriter0.put(byteVector2);
      assertSame(byteVector1, byteVector2);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(521);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "J");
      classWriter0.visitOuterClass("\nk&^vN", "\nk&^vN", (String) null);
      Attribute attribute0 = new Attribute("15BlK(^El]J%hJTo");
      classWriter0.threshold = 518;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "\nk&^vN", "Deprecated", "\nk&^vN");
      Attribute attribute1 = new Attribute("-}^Tq{q 'E");
      fieldWriter0.visitAttribute(attribute1);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putInt(1);
      byteVector1.putShort(941);
      byte[] byteArray0 = new byte[6];
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
  //Test case number: 4
  /*Coverage entropy=1.1682824501765625
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassWriter classWriter1 = new ClassWriter(0);
      FieldWriter fieldWriter0 = classWriter1.firstField;
      classWriter0.firstField = null;
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "", "", "", "");
      classWriter0.firstField.visitAnnotation("", true);
      classWriter0.firstField.getSize();
      fieldWriter1.getSize();
      classWriter0.firstField.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(1);
      ByteVector byteVector2 = byteVector1.putByte(5);
      classWriter0.firstField.put(byteVector2);
      assertSame(byteVector1, byteVector2);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0114042647073518
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2532);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4198, "", "MsD", (String) null, (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(1);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      fieldWriter0.put(byteVector1);
      assertSame(byteVector0, byteVector1);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0751393240053733
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4198, "", "MsD", (String) null, (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.visitSource((String) null, "5qUum=zd'aLM");
      ByteVector byteVector1 = byteVector0.putInt(14);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      fieldWriter0.visitAnnotation("Deprecated", false);
      fieldWriter0.put(byteVector0);
      fieldWriter0.put(byteVector1);
      fieldWriter0.put(byteVector1);
      assertSame(byteVector1, byteVector0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2532);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4198, "", "MsD", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(14, int0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "MsD";
      classWriter0.visit(4198, 4099, "System", "", "wheel.asm.FieldWriter", stringArray0);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1283), "", "X_eBTv1o$", "X_eBTv1o$", "Synthetic");
      int int1 = fieldWriter0.getSize();
      assertEquals(8, int1);
  }
}