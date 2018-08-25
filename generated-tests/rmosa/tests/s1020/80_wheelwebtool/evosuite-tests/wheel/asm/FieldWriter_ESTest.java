/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 14:41:24 GMT 2018
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
  /*Coverage entropy=0.8264053222918117
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2864);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", ":AX", "", "RuntimeVisibleAnnotations");
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      Attribute attribute1 = new Attribute("@9_!9^hs/JK<%d2} O{");
      fieldWriter0.visitAttribute(attribute1);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitEnd();
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2864);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2864, "]<v3GKzA", "", "Pf`CJ:STtt", "System");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2864);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", ":AX", "", "RuntimeVisibleAnnotations");
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.put11(2864, 131072);
      fieldWriter0.put(byteVector0);
      ByteVector byteVector2 = byteVector0.put12(2, 131072);
      classWriter0.visitOuterClass("-foOiu{2\"cl=7+u7v@", "UNq?", "-_H");
      byteVector2.putUTF8("2u(XF3%w<;t;~=]r");
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.visitAnnotation("kGc<b@/92 YDX!T", false);
      byteVector0.putUTF8(":!@-a]1~jo/\u0003F#hX^u");
      fieldWriter1.put(byteVector1);
      assertSame(byteVector1, byteVector2);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2865);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 16777220, "Synthetic", "xT^", "ConstantValue", "xT^");
      fieldWriter0.visitAnnotation("SourceFile", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-486));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-486), "", "", "", "");
      fieldWriter0.visitAnnotation("", true);
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = classWriter0.pool;
      ByteVector byteVector2 = byteVector1.put11(48, 1);
      byteVector2.putUTF8("<init>");
      fieldWriter0.put(byteVector2);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 41, "=\tTo*kkwe1B", "N7&a", "N7&a", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2864);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", ":AX", "", "RuntimeVisibleAnnotations");
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      Attribute attribute1 = new Attribute("zi&_<");
      attribute0.next = attribute1;
      Attribute attribute2 = new Attribute("");
      fieldWriter0.visitAttribute(attribute2);
      ByteVector byteVector0 = classWriter0.pool;
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2745), "?(~=K", "rwe~0/", "in//5 `62f@Q2:K)", "in//5 `62f@Q2:K)");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 184, "", "", (String) null, "rwe~0/");
      FieldWriter fieldWriter2 = classWriter0.lastField;
      fieldWriter2.getSize();
      fieldWriter2.visitAnnotation("rwe~0/", false);
      fieldWriter2.getSize();
      fieldWriter1.getSize();
      Attribute attribute0 = new Attribute("rwe~0/");
      Attribute attribute1 = new Attribute("l`r>}>c 6ZmUN3{");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter1.visitEnd();
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-486));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-486), "", "", "", "");
      fieldWriter0.getSize();
      classWriter0.version = 1212;
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.put12(1, 27);
      ByteVector byteVector2 = byteVector1.put11(3901, 36);
      byteVector2.putUTF8("");
      fieldWriter0.put(byteVector2);
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector1);
      assertSame(byteVector1, byteVector0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-486));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-486), "", "", "", "");
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.getSize();
      ByteVector byteVector1 = new ByteVector(751);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-176), "", "(;`I^", (String) null, (Object) null);
      fieldWriter1.put(byteVector1);
      ByteVector byteVector2 = classWriter0.pool;
      FieldWriter fieldWriter2 = fieldWriter0.next;
      fieldWriter2.visitEnd();
      fieldWriter1.put(byteVector2);
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      classWriter0.newLong(36);
      ByteVector byteVector3 = classWriter0.pool;
      fieldWriter0.put(byteVector3);
      assertFalse(byteVector3.equals((Object)byteVector1));
  }
}
