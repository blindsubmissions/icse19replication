/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:52:59 GMT 2018
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
import wheel.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-569));
      classWriter0.newUTF8("09\"7w//Wil,H'+");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "Exceptions", "09\"7w//Wil,H'+", "Exceptions", (Object) null);
      fieldWriter0.visitAnnotation("Insensitive", false);
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-569));
      classWriter0.newUTF8("09\"7w//Wil,H'+");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-4), "09\"7w//Wil,H'+", "09\"7w//Wil,H'+", "09\"7w//Wil,H'+", "Exceptions");
      fieldWriter0.visitAnnotation("`VBB?.|jH@3posPg~5", true);
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-569));
      classWriter0.newUTF8("09\"7w//Wil,H'+");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Exceptions", "Exceptions", "org.apache.commons.io.filefilter.EmptyFileFilter", "org.apache.commons.io.filefilter.EmptyFileFilter");
      Attribute attribute0 = new Attribute("09\"7w//Wil,H'+");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putUTF8("09\"7w//Wil,H'+");
      ByteVector byteVector2 = byteVector1.putInt((-569));
      byteVector2.putUTF8("09\"7w//Wil,H'+");
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector2);
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
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-569));
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      classWriter0.newUTF8("09\"7w//Wil,H'+");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Exceptions", "Exceptions", "org.apache.commons.io.filefilter.EmptyFileFilter", "org.apache.commons.io.filefilter.EmptyFileFilter");
      Attribute attribute0 = new Attribute("09\"7w//Wil,H'+");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putUTF8("09\"7w//Wil,H'+");
      ByteVector byteVector2 = byteVector1.putInt((-569));
      byteVector2.putUTF8("09\"7w//Wil,H'+");
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
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newClass("~W");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1103), "Signature", "7\"", "rXkeBu(fOO\"gimchf)J", "7\"");
      fieldWriter0.visitAnnotation("7\"", false);
      Attribute attribute0 = new Attribute("~W");
      fieldWriter0.getSize();
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0633485086143735
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-553));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-553), "Exceptions", "09\"37w//Wil,H'+", "Exceptions", (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-553), "P7<[g'<+nG", "o+VW0Wpe.zb", "09\"37w//Wil,H'+", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putLong(1);
      fieldWriter0.getSize();
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      classWriter0.lastMethod = null;
      fieldWriter0.put(byteVector1);
      fieldWriter1.visitAnnotation("o+VW0Wpe.zb", true);
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter1.getSize();
      assertEquals(40, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0905994737794786
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-553));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-553), "Exceptions", "09\"37w//Wil,H'+", "Exceptions", (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-553), "P7<[g'<+nG", "o+VW0Wpe.zb", "09\"37w//Wil,H'+", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putLong(1);
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector1);
      fieldWriter1.getSize();
      fieldWriter1.visitAnnotation("o+VW0Wpe.zb", true);
      fieldWriter1.put(byteVector1);
      fieldWriter1.put(byteVector0);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-553));
      classWriter0.newUTF8("Exceptions");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-553), "Exceptions", "09\"37w//Wil,H'+", "Exceptions", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putLong((-553));
      ByteVector byteVector2 = byteVector1.putByte(1);
      ByteVector byteVector3 = byteVector1.putShort(1);
      FieldWriter fieldWriter1 = classWriter0.lastField;
      fieldWriter1.visitAnnotation("09\"37w//Wil,H'+", false);
      ByteVector byteVector4 = byteVector3.putLong((-854L));
      fieldWriter1.put(byteVector4);
      FieldWriter fieldWriter2 = classWriter0.firstField;
      ByteVector byteVector5 = new ByteVector(1);
      byteVector1.putInt(2);
      fieldWriter2.put(byteVector5);
      fieldWriter0.put(byteVector2);
      assertSame(fieldWriter0, fieldWriter2);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9097077103274986
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-553));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-553), "Exceptions", "09\"37w//Wil,H'+", "Exceptions", (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-553), "P7<[g'<+nG", "o+VW0Wpe.zb", "09\"37w//Wil,H'+", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putLong(1);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
      
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      classWriter0.lastMethod = null;
      fieldWriter0.put(byteVector1);
      fieldWriter1.getSize();
      FieldWriter fieldWriter2 = new FieldWriter(classWriter0, 1, "", "09\"37w//Wil,H'+", (String) null, "");
      fieldWriter2.put(byteVector1);
      int int1 = fieldWriter2.getSize();
      assertEquals(16, int1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0042424730540764
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      classWriter0.newUTF8("Exceptions");
      classWriter0.version = (-2973);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1458), "09\"7w//Wil,H'+", "9Z0vFP1e4", "nY-%", "=nOyx");
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }
}
