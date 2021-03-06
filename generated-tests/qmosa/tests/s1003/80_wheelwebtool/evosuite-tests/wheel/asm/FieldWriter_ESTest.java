/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:22:59 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;
import wheel.asm.Item;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2008, "Ar9I6l69<F+ls", "", "Ar9I6l69<F+ls", "");
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(2008);
      fieldWriter0.put(byteVector1);
      fieldWriter0.put(byteVector0);
      Object object0 = new Object();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 2008, "RuntimeInvisibleAnnotations", "7-hH=mk*V0O{7&4'", "", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@f4f6948
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9556998911125343
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "Ar9I6l69<F+ls", "", "Ar9I6l69<F+ls", "");
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(2);
      fieldWriter0.put(byteVector1);
      Object object0 = new Object();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 1, "RuntimeInvisibleAnnotations", "7-hH=mk*V0O{7&4'", "", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@74e9dee
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.9368883075390159
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-394), "RIJ.(?QW7eLP}'", "", (String) null, "RIJ.(?QW7eLP}'");
      FieldWriter fieldWriter1 = classWriter0.lastField;
      fieldWriter0.next = fieldWriter1;
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(1);
      fieldWriter0.put(byteVector1);
      String string0 = "7-hH=mk*V0O{7&4'";
      Object object0 = new Object();
      int int0 = (-792);
      String string1 = " \"()v&/Bi";
      String string2 = "$)b>AM~,'*<";
      MockFile mockFile0 = new MockFile("", "");
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1864038255597458
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 239, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
      fieldWriter0.getSize();
      ByteVector byteVector1 = classWriter0.pool;
      fieldWriter0.put(byteVector1);
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitAnnotation("RuntimeVisibleAnnotations", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 239, "RuntimeVisibleAnotaions", "RuntimeVisibleAnotaions", "RuntimeVisibleAnotaions", "RuntimeVisibleAnotaions");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 2;
      byteVector0.putInt(2);
      fieldWriter0.visitAnnotation("", true);
      byteVector0.length = 4096;
      fieldWriter0.getSize();
      classWriter0.newMethodItem("The wildcard array must not be null", "RuntimeVisibleAnotaions", "*e\"kD1X8", true);
      Object object0 = new Object();
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 24117248, "}Y(v7w|\"zklCF)!`~B", "wheel.asm.FieldWriter", "*e\"kD1X8", "The wildcard array must not be null");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.2275294114572126
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      ClassWriter classWriter1 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter1, 225, "6/", "6/", (String) null, (Object) null);
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.put12((-1618), (-1560));
      FieldWriter fieldWriter1 = classWriter1.firstField;
      fieldWriter1.visitAnnotation("", false);
      fieldWriter1.put(byteVector0);
      Object object0 = new Object();
      FieldWriter fieldWriter2 = new FieldWriter(classWriter1, 2, "RuntimeInvisibleAnnotations", "6/", "RuntimeInvisibleAnnotations", "6/");
      fieldWriter0.visitEnd();
      assertSame(fieldWriter0, fieldWriter1);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.8587409130062869
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      String string0 = "Ar9I6l69<F+ls";
      classWriter0.newMethod("Ar9I6l69<F+ls", "Ar9I6l69<F+ls", "Ar9I6l69<F+ls", true);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "Ar9I6l69<F+ls", "Ar9I6l69<F+ls", "Ar9I6l69<F+ls", "Ar9I6l69<F+ls");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      Attribute attribute0 = new Attribute("gcYJ-[~U{}PxU");
      fieldWriter0.visitAttribute(attribute0);
      classWriter0.newMethod("Q&9h!", "Ar9I6l69<F+ls", "", true);
      String string1 = "";
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "", "Ar9I6l69<F+ls", "The list of prefixes must not be null", "");
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
  //Test case number: 7
  /*Coverage entropy=1.1209503926735835
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "Ar9I6l69<F+ls", "", "Ar9I6l69<F+ls", "");
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("EaC'+?*oD\"", true);
      byteVector0.put11((-1), 2121);
      byteVector0.putUTF8("");
      ByteVector byteVector1 = byteVector0.putInt(2);
      fieldWriter0.put(byteVector1);
      String string0 = "RuntimeInvisibleAnnotations";
      String string1 = "";
      String string2 = "";
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      String string0 = "";
      classWriter0.newMethod(":,02U]", "", "", true);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "9yi:<]+hv3", "", "9yi:<]+hv3", "");
      ByteVector byteVector0 = new ByteVector(2);
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector1 = byteVector0.putInt(1);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.9743147528693494
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      classWriter0.version = (-1);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      classWriter0.newMethod(":,23]", "2U", "2U", true);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "Ar9I6l69<F+ls", "2U", "Ar9I6l69<F+ls", "2U");
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putByte(8);
      classWriter0.lastField = fieldWriter0;
      byteVector1.putLong(0L);
      ByteVector byteVector2 = byteVector1.put12(8, (-3239));
      ByteVector byteVector3 = byteVector2.putShort(1083);
      ByteVector byteVector4 = byteVector3.putUTF8(")Aso>l~Hs@/@6");
      ByteVector byteVector5 = byteVector4.put11(1083, 131072);
      byteVector5.putInt(30);
      ByteVector byteVector6 = byteVector4.putShort(2);
      fieldWriter0.put(byteVector6);
      byteVector2.length = 131072;
      Object object0 = new Object();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 8, "2U", "RuntimeInvisibleAnnotations", "2U", byteVector5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ByteVector@11
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }
}
