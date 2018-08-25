/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 18:36:32 GMT 2018
 */

package org.objectweb.asm.jip;

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
import org.objectweb.asm.jip.Attribute;
import org.objectweb.asm.jip.ByteVector;
import org.objectweb.asm.jip.ClassReader;
import org.objectweb.asm.jip.ClassWriter;
import org.objectweb.asm.jip.Edge;
import org.objectweb.asm.jip.Label;
import org.objectweb.asm.jip.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-268435456));
      String[] stringArray0 = new String[8];
      stringArray0[0] = "RuntimeVisibleAnnotations";
      stringArray0[1] = "RuntimeVisibleAnnotations";
      stringArray0[2] = "RuntimeVisibleAnnotations";
      stringArray0[3] = "RuntimeVisibleAnnotations";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-254), "", "RuntimeVisibleAnnotations", "", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)30;
      byteArray0[3] = (byte)0;
      byte byte0 = (byte) (-85);
      byteArray0[4] = (byte) (-85);
      byteArray0[5] = (byte)0;
      // Undeclared exception!
      try { 
        MethodWriter.readUnsignedShort(byteArray0, (byte) (-85));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -85
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Ljava/lang/Synthetic;";
      stringArray0[1] = "";
      stringArray0[2] = "Ljava/lang/Synthetic;";
      stringArray0[3] = "";
      stringArray0[4] = "Ljava/lang/Synthetic;";
      stringArray0[5] = "";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[0];
      MethodWriter.getNewOffset(intArray0, intArray0, 247, 247);
      // Undeclared exception!
      try { 
        MethodWriter.writeShort((byte[]) null, 0, 247);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.objectweb.asm.jip.ClassAdapter", "jv3>PFY)", "<init>", stringArray0, false, false);
      methodWriter0.visitMaxs(67, (-361));
      ByteVector byteVector0 = new ByteVector(19);
      ByteVector byteVector1 = byteVector0.putShort((-6739));
      methodWriter0.put(byteVector1);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitTypeInsn(67, "<init>");
      // Undeclared exception!
      try { 
        methodWriter0.visitMultiANewArrayInsn((String) null, 268435455);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-834);
      intArray0[1] = 3201;
      intArray0[2] = 132;
      intArray0[3] = (-2084);
      intArray0[4] = (-1644);
      MethodWriter.getNewOffset(intArray0, intArray0, 5, 248);
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "<init>";
      stringArray0[1] = "<init>";
      stringArray0[2] = "<init>";
      stringArray0[3] = "Unv7AK/=[QHb{$Q4Fe";
      stringArray0[4] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-834), "Unv7AK/=[QHb{$Q4Fe", "Unv7AK/=[QHb{$Q4Fe", "<init>", stringArray0, false, false);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitCode();
      assertSame(methodWriter1, methodWriter0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777220);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-834), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", (String) null, (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      classWriter0.newFloat(1439.7521F);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1578), "*a@!uFL", "", "org.objectweb.asm.jip.ClassAdapter", stringArray0, false, false);
      methodWriter0.visitFrame((-1578), 4591, stringArray0, 4591, stringArray0);
      methodWriter0.visitEnd();
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.8018185525433373
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1578), "*a@!uFL", "", "org.objectweb.asm.jip.ClassAdapter", stringArray0, false, false);
      methodWriter0.visitMethodInsn(168, "m@2E/'loQ", ".jar", "");
      methodWriter0.visitMaxs((-2737), 216);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)11;
      byteArray0[1] = (byte)69;
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte) (-18);
      byteArray0[4] = (byte) (-84);
      byte byte0 = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-38);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      // Undeclared exception!
      try { 
        MethodWriter.readInt((byte[]) null, 1005);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.objectweb.asm.jip.ClassAdapter", "jv3>PFY)", "<init>", stringArray0, false, false);
      methodWriter0.visitMaxs(67, (-361));
      ByteVector byteVector0 = new ByteVector(19);
      byteVector0.putShort((-6739));
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitTypeInsn(67, "<init>");
      methodWriter0.visitAnnotationDefault();
      // Undeclared exception!
      try { 
        methodWriter0.visitMultiANewArrayInsn((String) null, 268435455);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, " vonrmu7BxF$");
      String[] stringArray0 = new String[0];
      classWriter0.newFloat(1439.7521F);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1578), "*a@!uFL", "", "org.objectweb.asm.jip.ClassAdapter", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLineNumber((-1677), label0);
      methodWriter0.visitFrame((-1578), 4591, stringArray0, 4591, stringArray0);
      Label[] labelArray0 = new Label[9];
      labelArray0[0] = label0;
      labelArray0[1] = label0;
      labelArray0[2] = label0;
      labelArray0[3] = label0;
      labelArray0[4] = label0;
      labelArray0[5] = label0;
      labelArray0[6] = label0;
      labelArray0[7] = label0;
      labelArray0[8] = label0;
      methodWriter0.visitTableSwitchInsn(4096, (-1677), label0, labelArray0);
      methodWriter0.visitTypeInsn(1, "Ljava/lang/Synthetic;");
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.2342678660790767
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.objectweb.asm.jip.ClassAdapter", "jv3>PFY)", "<init>", stringArray0, false, false);
      methodWriter0.visitMaxs(67, (-361));
      ByteVector byteVector0 = new ByteVector(19);
      ByteVector byteVector1 = byteVector0.putShort((-6739));
      methodWriter0.put(byteVector1);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitTypeInsn(67, "<init>");
      methodWriter0.visitIntInsn(155, 55);
      assertSame(methodWriter0, methodWriter1);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-834);
      intArray0[1] = 3201;
      intArray0[2] = 132;
      intArray0[3] = (-2084);
      intArray0[4] = (-1644);
      MethodWriter.getNewOffset(intArray0, intArray0, 5, (-1644));
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "<init>";
      stringArray0[1] = "<init>";
      stringArray0[2] = "<init>";
      stringArray0[3] = "Unv7AK/=[QHb{$Q4Fe";
      stringArray0[4] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-834), "Unv7AK/=[QHb{$Q4Fe", "Unv7AK/=[QHb{$Q4Fe", "<init>", stringArray0, false, false);
      methodWriter0.classReaderLength = 1113;
      methodWriter0.visitAnnotation("Unv7AK/=[QHb{$Q4Fe", false);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitLdcInsn("<init>");
      methodWriter1.visitCode();
      // Undeclared exception!
      try { 
        methodWriter0.visitLineNumber((-743), (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.8855741515766717
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1578), "*a@!uFL", "", "org.objectweb.asm.jip.ClassAdapter", stringArray0, false, false);
      methodWriter0.visitMethodInsn(168, "m@2E/'loQ", ".jar", "");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-3197), ".jar", "org.objectweb.asm.jip.ClassAdapter", "m@2E/'loQ", stringArray0, false, false);
      MethodWriter methodWriter2 = classWriter0.firstMethod;
      methodWriter2.visitTypeInsn(168, "org.objectweb.asm.jip.Label");
      methodWriter1.visitMultiANewArrayInsn("org.objectweb.asm.jip.ClassAdapter", (-2013884533));
      methodWriter1.visitMethodInsn(1124075009, "org.objectweb.asm.jip.Label", "org.objectweb.asm.jip.Label", "LocalVariableTable");
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.8468143807325634
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "NY";
      stringArray0[1] = "NY";
      stringArray0[2] = "NY";
      stringArray0[3] = "_xpq|6:`e>";
      stringArray0[4] = "hB";
      stringArray0[5] = "NY";
      classWriter0.visitMethod(4096, "_xpq|6:`e>", "_xpq|6:`e>", "NY", stringArray0);
      String[] stringArray1 = new String[0];
      classWriter0.newFloat(4096);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "org.objectweb.asm.jip.ClassAdapter", "org.objectweb.asm.jip.Attribute", "LineNumberTable", stringArray1, false, false);
      methodWriter0.visitFrame((-795), 2, stringArray1, (-795), stringArray1);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(2, "E", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 31
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-834);
      intArray0[1] = 3201;
      intArray0[2] = 132;
      intArray0[3] = (-2084);
      intArray0[4] = (-1644);
      MethodWriter.getNewOffset(intArray0, intArray0, 5, (-1644));
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "<init>";
      stringArray0[1] = "<init>";
      stringArray0[2] = "<init>";
      stringArray0[3] = "Unv7AK/=[QHb{$Q4Fe";
      stringArray0[4] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-834), "Unv7AK/=[QHb{$Q4Fe", "Unv7AK/=[QHb{$Q4Fe", "<init>", stringArray0, false, false);
      methodWriter0.classReaderLength = 1113;
      methodWriter0.visitAnnotation("Unv7AK/=[QHb{$Q4Fe", false);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitVarInsn(1031, (-1903));
      methodWriter1.visitCode();
      // Undeclared exception!
      try { 
        methodWriter0.visitLineNumber((-743), (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5670812292933243
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.objectweb.asm.jip.ClassAdapter", "jv3>PFY)", "<init>", stringArray0, false, false);
      methodWriter0.visitMaxs(67, (-361));
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putShort((-6739));
      methodWriter0.put(byteVector1);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter0.visitFrame((-795), 1124075009, stringArray0, 2, stringArray0);
      int[] intArray0 = new int[6];
      intArray0[0] = (-795);
      intArray0[1] = (-361);
      intArray0[2] = 67;
      intArray0[3] = 4096;
      intArray0[4] = (-795);
      intArray0[5] = 1;
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      int int0 = methodWriter1.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.objectweb.asm.jip.ClassAdapter", "jv3>PFY)", "<init>", stringArray0, false, false);
      methodWriter0.visitMaxs(67, (-361));
      ByteVector byteVector0 = new ByteVector(19);
      ByteVector byteVector1 = byteVector0.putShort((-6739));
      methodWriter0.put(byteVector1);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitTypeInsn(67, "<init>");
      Label label0 = new Label();
      Label label1 = label0.successor;
      // Undeclared exception!
      try { 
        methodWriter1.visitLocalVariable("<init>", "jv3>PFY)", "<init>", (Label) null, label0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8982053397041498
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, " vonrmu7BxF$");
      String[] stringArray0 = new String[0];
      classWriter0.newFloat(1439.7521F);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "*a@!uFL", "", "org.objectweb.asm.jip.ClassAdapter", stringArray0, false, false);
      methodWriter0.visitFrame(2, 4591, stringArray0, 4591, stringArray0);
      Label[] labelArray0 = new Label[9];
      methodWriter0.visitTypeInsn(1, "Ljava/lang/Synthetic;");
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.1601862439785162
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "char");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "4x-fn\"d/mUGmQ0<Rk?";
      stringArray0[1] = "%";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "%", "4x-fn\"d/mUGmQ0<Rk?", "char", stringArray0, false, false);
      methodWriter0.visitMaxs(66, 2);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = classWriter0.pool;
      byteVector1.putShort((-207));
      methodWriter0.put(byteVector1);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      MethodWriter methodWriter2 = new MethodWriter(classWriter0, 67, "4x-fn\"d/mUGmQ0<Rk?", "%", "0'", stringArray0, false, false);
      methodWriter2.visitTypeInsn(4096, "*a@!uFL");
      methodWriter0.visitIntInsn(17, 2);
      assertFalse(methodWriter0.equals((Object)methodWriter2));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, " vonrmu7BxF$");
      String[] stringArray0 = new String[0];
      classWriter0.newFloat(1439.7521F);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1578), "*a@!uFL", "", "org.objectweb.asm.jip.ClassAdapter", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLineNumber((-1677), label0);
      methodWriter0.visitFrame((-1578), 4591, stringArray0, 4591, stringArray0);
      Label[] labelArray0 = new Label[9];
      labelArray0[0] = label0;
      labelArray0[1] = label0;
      methodWriter0.visitTypeInsn(125, "");
      Label label1 = new Label();
      Label label2 = label1.successor;
      methodWriter0.visitLocalVariable("Y4qUeB4h4=~euij", "org.objectweb.asm.jip.ClassAdapter", "", label1, label0, 2);
      ClassWriter classWriter1 = null;
      try {
        classWriter1 = new ClassWriter((ClassReader) null, (-1677));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.ClassWriter", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.992281974852574
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1578), "*a@!uL", "", "org.objectweb.asm.jip.ClassAdapter", stringArray0, false, false);
      classWriter0.version = 216;
      methodWriter0.visitMaxs((-2737), 216);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 2, stringArray0, 8, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, " vonrmu7BxF$");
      String[] stringArray0 = new String[0];
      classWriter0.newFloat(1439.7521F);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "*a@!uFL", "", "org.objectweb.asm.jip.ClassAdapter", stringArray0, false, false);
      methodWriter0.visitFrame(2, 4591, stringArray0, 4591, stringArray0);
      Label[] labelArray0 = new Label[9];
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(4096, 4591, labelArray0, 3021, stringArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-834);
      intArray0[1] = 3201;
      intArray0[2] = 132;
      intArray0[3] = (-2084);
      intArray0[4] = (-1644);
      MethodWriter.getNewOffset(intArray0, intArray0, 5, (-1644));
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "<init>";
      stringArray0[1] = "<init>";
      stringArray0[2] = "<init>";
      stringArray0[3] = "Unv7AK/=[QHb{$Q4Fe";
      stringArray0[4] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-834), "Unv7AK/=[QHb{$Q4Fe", "Unv7AK/=[QHb{$Q4Fe", "<init>", stringArray0, false, false);
      methodWriter0.classReaderLength = 1113;
      methodWriter0.visitAnnotation("Unv7AK/=[QHb{$Q4Fe", false);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitVarInsn(1031, (-1903));
      methodWriter1.visitCode();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-17);
      byteArray0[1] = (byte) (-36);
      byteArray0[2] = (byte) (-122);
      byteArray0[3] = (byte) (-127);
      byteArray0[4] = (byte)86;
      byteArray0[5] = (byte)112;
      byteArray0[6] = (byte) (-35);
      // Undeclared exception!
      try { 
        MethodWriter.readShort(byteArray0, 15);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.4978661367769952
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.objectweb.asm.jip.ClassAdapter");
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1578), "*a@!uFL", "", "org.objectweb.asm.jip.ClassAdapter", stringArray0, false, false);
      methodWriter0.visitMethodInsn(168, "m@2E/'loQ", ".jar", "");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-604), "m@2E/'loQ", "", "", stringArray0, false, false);
      methodWriter0.visitAnnotation("4x-fn\"d/mUGmQ0<Rk?", true);
      MethodWriter methodWriter2 = classWriter0.lastMethod;
      methodWriter0.visitVarInsn((-1578), (-1903));
      methodWriter1.visitCode();
      // Undeclared exception!
      try { 
        methodWriter0.visitLineNumber(243, (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0751393240053733
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      String[] stringArray0 = new String[0];
      classWriter0.newFloat(4096);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "org.objectweb.asm.jip.ClassAdapter", "org.objectweb.asm.jip.Attribute", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(167);
      ByteVector byteVector1 = byteVector0.put11(4096, 1);
      ByteVector byteVector2 = byteVector1.putByte(1);
      ByteVector byteVector3 = byteVector2.putShort(185);
      ByteVector byteVector4 = byteVector3.put12(2, 2);
      methodWriter0.put(byteVector4);
      methodWriter0.visitMultiANewArrayInsn("LineNumberTable", 16);
      methodWriter0.visitMethodInsn((-353), "LineNumberTable", "org.objectweb.asm.jip.Attribute", "o");
      methodWriter0.put(byteVector3);
      assertSame(byteVector1, byteVector3);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String string0 = "org.objectweb.asm.jip.ClassAdapter";
      String[] stringArray0 = new String[0];
      String string1 = "";
      ClassWriter classWriter1 = new ClassWriter(1);
      classWriter1.newFloat((-1.0F));
      String string2 = "org.yasl.jars.JarFileFilter";
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String string3 = "'l<A44{of";
      MethodWriter methodWriter0 = new MethodWriter(classWriter1, 12, "'l<A44{of", "", "", stringArray0, false, false);
      Label label0 = new Label();
      int int0 = 3056;
      methodWriter0.visitLineNumber(3056, label0);
      methodWriter0.visitInsn(3056);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "|TG>");
      // Undeclared exception!
      try { 
        methodWriter0.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6791932659915256
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      classWriter0.newFloat(4096);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "org.objectweb.asm.jip.ClassAdapter", "org.objectweb.asm.jip.Attribute", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(167);
      ByteVector byteVector1 = byteVector0.put11(4096, 1);
      ByteVector byteVector2 = byteVector1.putByte(1);
      byteVector2.putShort(185);
      Label label0 = new Label();
      int int0 = methodWriter0.getSize();
      assertEquals(22, int0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.4003214247031333
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.objectweb.asm.jip.ClassAdapter", "jv3>PFY)", "<init>", stringArray0, false, false);
      methodWriter0.visitMaxs(67, (-361));
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putShort((-6739));
      methodWriter0.put(byteVector1);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter0.visitFrame((-795), 1124075009, stringArray0, 2, stringArray0);
      int[] intArray0 = new int[6];
      intArray0[0] = (-795);
      intArray0[1] = (-361);
      intArray0[2] = 67;
      intArray0[3] = 4096;
      intArray0[4] = (-795);
      intArray0[5] = 1;
      Label label0 = new Label();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "<init>");
      Label[] labelArray0 = new Label[1];
      labelArray0[0] = label0;
      methodWriter0.visitLookupSwitchInsn(label0, intArray0, labelArray0);
      assertArrayEquals(new int[] {(-795), (-361), 67, 4096, (-795), 1}, intArray0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      classWriter0.newFloat(4096);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "org.objectweb.asm.jip.ClassAdapter", "org.objectweb.asm.jip.Attribute", "LineNumberTable", stringArray0, false, false);
      methodWriter0.visitMultiANewArrayInsn("LineNumberTable", 16);
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      methodWriter0.visitTryCatchBlock((Label) null, (Label) null, (Label) null, (String) null);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0335620542068176
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      int int0 = (-1578);
      classWriter0.newMethod("Q\"Ie&V&RtfC}", "Q\"Ie&V&RtfC}", "pP,tBJ{f8W", true);
      String[] stringArray0 = new String[0];
      classWriter0.newFloat(4096);
      classWriter0.newFloat(1439.7521F);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1578), "*a@!uFL", "", "org.objectweb.asm.jip.ClassAdapter", stringArray0, false, false);
      methodWriter0.visitFrame((-1578), 4591, stringArray0, 4591, stringArray0);
      methodWriter0.visitFieldInsn((-1578), "o/o)", "m", "m");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "pP,tBJ{f8W");
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-3433), "Q\"Ie&V&RtfC}", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.8855741515766717
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      String[] stringArray0 = new String[0];
      classWriter0.newFloat(4096);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "org.objectweb.asm.jip.ClassAdapter", "org.objectweb.asm.jip.Attribute", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(167);
      ByteVector byteVector1 = byteVector0.put11(4096, 1);
      byteVector1.putByte(1);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "", "3[Tr6]no]vj", "-n^(^y", stringArray0, false, false);
      methodWriter1.visitFrame(4591, 4096, stringArray0, 2, stringArray0);
      methodWriter1.visitIincInsn(168, 962);
      methodWriter1.visitFrame(3021, 4096, stringArray0, 962, stringArray0);
      // Undeclared exception!
      try { 
        methodWriter1.visitMultiANewArrayInsn((String) null, 1317);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.2493432310675612
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, " vonrmu7BxF$");
      String[] stringArray0 = new String[0];
      classWriter0.newFloat(1439.7521F);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1578), "*a@!uFL", "", "org.objectweb.asm.jip.ClassAdapter", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLineNumber((-1677), label0);
      ByteVector byteVector0 = new ByteVector(171);
      ByteVector byteVector1 = byteVector0.put11(8, 2);
      ByteVector byteVector2 = byteVector1.putByte(285212684);
      ByteVector byteVector3 = byteVector2.putShort((-4734));
      byteVector3.put12(2, (-1361));
      methodWriter0.put(byteVector2);
      methodWriter0.visitMultiANewArrayInsn("org.objectweb.asm.jip.ClassAdapter", (-89));
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn((-1361), (String) null, "<init>", "org.objectweb.asm.jip.ClassAdapter");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}