/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:52:57 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassReader;
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
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-421), "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      classWriter0.getCommonSuperClass("org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter");
      fieldWriter0.visitEnd();
      ByteVector byteVector0 = classWriter0.pool;
      Object object0 = new Object();
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-3050), "org.apache.commons.io.filefilter.HiddenFileFilter", "", "s=BX0iw/h{<pUT9", "org.apache.commons.io.filefilter.HiddenFileFilter");
      fieldWriter1.visitEnd();
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-421), "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putInt(2);
      byteVector0.putByte((-421));
      FileSystemHandling.shouldAllThrowIOExceptions();
      fieldWriter0.put(byteVector0);
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.HiddenFileFilter");
      fieldWriter0.visitAnnotation("", true);
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((PipedOutputStream) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3143738430069454
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = (-421);
      String string0 = "org.apache.commons.io.filefilter.HiddenFileFilter";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-421), "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", (Object) null);
      fieldWriter0.getSize();
      boolean boolean0 = true;
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.HiddenFileFilter", true);
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putByte((-421));
      fieldWriter0.put(byteVector0);
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.HiddenFileFilter");
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((PipedOutputStream) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9368883075390159
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777220);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 16777220, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      fieldWriter0.visitAnnotation("RuntimeInvisibleAnnotations", true);
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("RuntimeInvisibleAnnotations");
      Attribute attribute1 = attribute0.next;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1821));
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "d%yA.l=4\"?v0?", "9^gm5H#Fq", "j9uuzJDnGPr;-z", "wheel.asm.FieldWriter");
      Attribute attribute0 = new Attribute("j9uuzJDnGPr;-z");
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.put11(2366, 131072);
      ByteVector byteVector2 = byteVector1.putUTF8("j9uuzJDnGPr;-z");
      ByteVector byteVector3 = byteVector2.putShort(0);
      ByteVector byteVector4 = byteVector3.putByte((-396));
      fieldWriter0.put(byteVector4);
      Attribute attribute1 = new Attribute("Signature");
      fieldWriter0.visitAnnotation("", false);
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((PipedOutputStream) null, (-269));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.1699929969668565
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.index = (-1500);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-421), "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putInt(2);
      ByteVector byteVector1 = byteVector0.putByte((-421));
      fieldWriter0.put(byteVector0);
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.HiddenFileFilter");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.visitAttribute(attribute0);
      FieldWriter fieldWriter2 = classWriter0.lastField;
      fieldWriter0.visitEnd();
      // Undeclared exception!
      try { 
        fieldWriter1.put(byteVector1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1534547943999287
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2794));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2794), "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", (String) null, (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitEnd();
      Attribute attribute0 = new Attribute((String) null);
      FieldWriter fieldWriter1 = classWriter0.lastField;
      fieldWriter1.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.8979457248567797
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "X");
      ClassWriter classWriter0 = new ClassWriter(187);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 187, "_?R*vX", "wheel.asm.FieldWriter", "AnnotationDefault", "_?R*vX");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putUTF8("");
      ByteVector byteVector2 = byteVector0.putShort(187);
      classWriter0.newFloat(187);
      ByteVector byteVector3 = byteVector2.putByte(7);
      ByteVector byteVector4 = byteVector3.put12(187, 187);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      fieldWriter0.visitAnnotation("*^", false);
      fieldWriter0.put(byteVector4);
      assertSame(byteVector4, byteVector1);
  }
}
