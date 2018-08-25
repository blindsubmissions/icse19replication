/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:32:20 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      classWriter0.visitField(1189, "RuntimeInvisibleAnnotations", "f\"`If02rO?,", (String) null, "RuntimeInvisibleAnnotations");
      classWriter0.newClassItem("");
      FieldWriter fieldWriter0 = classWriter0.firstField;
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("2a%1D8%u.b#l]x");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAnnotation("2a%1D8%u.b#l]x", true);
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
  //Test case number: 1
  /*Coverage entropy=0.9743147528693494
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(468);
      classWriter0.visitInnerClass("wheel.asm.Handler", "Fwc&qCT`y[.rJ", (String) null, 468);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 26, "", "", "%kROg+", "%kROg+");
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      String string0 = "RuntimeInvisibleAnnotations";
      String string1 = "f\"`If02rO?,";
      classWriter0.visitField(1189, "RuntimeInvisibleAnnotations", "f\"`If02rO?,", (String) null, "RuntimeInvisibleAnnotations");
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, (String) null, "", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      boolean boolean0 = true;
      String string0 = "AT=^jS}*a}";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1782), "", ":}%TPNaB", "AT=^jS}*a}", "Signature");
      fieldWriter0.visitAnnotation("+86XjDEm\"L*[f=Nx_8V", false);
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(1);
      byteVector0.putLong((-4758L));
      ByteVector byteVector2 = byteVector1.put12(1, 48);
      fieldWriter0.put(byteVector2);
      fieldWriter0.put(byteVector1);
      fieldWriter0.visitAnnotation("hv", false);
      byteVector2.put11(48, 64);
      fieldWriter0.getSize();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 1, "Signature", "", "Deprecated", byteVector2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ByteVector@1
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      classWriter0.newLong(2248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Deprecated", "Deprecated", "Deprecated", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.2130075659799042
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      String string0 = ":}%TPNaB";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2248, "Signature", "AT=^jS}*a}", "AT=^jS}*a}", "AT=^jS}*a}");
      fieldWriter0.visitAnnotation("e]];\"vQky", true);
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(2302);
      ByteVector byteVector2 = byteVector0.putLong(2014L);
      byteVector2.put12(6, 2);
      fieldWriter0.put(byteVector1);
      fieldWriter0.put(byteVector1);
      fieldWriter0.visitAnnotation("hv", true);
      byteVector0.put11(2302, 2);
      Object object0 = new Object();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 2, "hv", "hv", "AT=^jS}*a}", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@58a78f6e
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1782), "", "?", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(2);
      fieldWriter0.visitAnnotation("?", false);
      fieldWriter0.visitAnnotation("+{at1n", false);
      fieldWriter0.getSize();
      ByteVector byteVector2 = classWriter0.pool;
      ByteVector byteVector3 = byteVector2.putLong(1);
      ByteVector byteVector4 = byteVector2.put12(1, 470);
      ByteVector byteVector5 = byteVector4.putUTF8("+{at1n");
      fieldWriter0.put(byteVector5);
      byteVector0.putInt(2);
      ClassWriter classWriter1 = new ClassWriter(49);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter1, 1, "+{at1n", "org.apache.commons.io.IOCase", "]", (Object) null);
      fieldWriter1.put(byteVector3);
      fieldWriter0.put(byteVector5);
      fieldWriter0.put(byteVector1);
      assertSame(byteVector1, byteVector4);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.2153881010836147
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      String string0 = "?";
      String string1 = "Signature";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1782), "", "?", "", "");
      boolean boolean0 = false;
      fieldWriter0.visitAnnotation("Signature", false);
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putInt(2);
      Attribute attribute0 = new Attribute("Deprecated");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector1 = byteVector0.putLong(4294967295L);
      byteVector1.putShort(1);
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
  /*Coverage entropy=1.2148896539491205
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1782), "", "?", "", "");
      fieldWriter0.visitAnnotation("Signature", false);
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = new ByteVector();
      ByteVector byteVector2 = byteVector0.putLong(4294967295L);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "DnK?/1#0MQ%7F-kA";
      stringArray0[2] = " B`a$VGM<*XqP";
      stringArray0[3] = "DnK?/1#0MQ%7F-kA";
      stringArray0[4] = "?";
      classWriter0.visit((-2117), 4, "DnK?/1#0MQ%7F-kA", "?", "EG\"AC", stringArray0);
      ByteVector byteVector3 = byteVector2.putShort(1);
      fieldWriter0.put(byteVector3);
      fieldWriter0.put(byteVector3);
      fieldWriter0.visitAnnotation("%", false);
      fieldWriter0.getSize();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 4, "Signature", (String) null, "", classWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0905994737794786
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1782), "", "?", "", "");
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(2);
      ByteVector byteVector2 = byteVector1.putShort(1);
      fieldWriter0.put(byteVector2);
      fieldWriter0.put(byteVector2);
      fieldWriter0.visitAnnotation("%", false);
      fieldWriter0.getSize();
      ClassWriter classWriter1 = new ClassWriter(1);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter1, 2248, "Synthetic", "", (String) null, "Synthetic");
      ByteVector byteVector3 = byteVector2.put12(2, 2885);
      fieldWriter1.put(byteVector3);
      fieldWriter1.put(byteVector1);
      fieldWriter0.put(byteVector1);
      assertNotSame(fieldWriter0, fieldWriter1);
  }
}