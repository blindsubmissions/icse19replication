/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:07:37 GMT 2018
 */

package org.objectweb.asm.jip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.objectweb.asm.jip.Attribute;
import org.objectweb.asm.jip.ClassReader;
import org.objectweb.asm.jip.ClassWriter;
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
      ClassWriter classWriter0 = new ClassWriter((-3580));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-889275714), "", "", "", stringArray0, true, true);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-67);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-87);
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      // Undeclared exception!
      try { 
        MethodWriter.readInt(byteArray0, (byte)4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1764));
      classWriter0.visitInnerClass("", "?~bm`|4VD=VgH*EKr@G", "3EU", (-1764));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[4] = "org.objectweb.asm.jip.Type";
      stringArray0[5] = "";
      stringArray0[6] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[7] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[8] = "5\"ZR,'0H=JtK2I4I";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "", "5\"ZR,'0H=JtK2I4I", stringArray0, false, false);
      methodWriter0.visitAnnotation("", true);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        methodWriter0.visitLdcInsn(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@25ef6688
         //
         verifyException("org.objectweb.asm.jip.ClassWriter", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)3;
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)104;
      byteArray0[4] = (byte)70;
      byteArray0[5] = (byte) (-128);
      byteArray0[6] = (byte) (-29);
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte) (-29);
      MethodWriter.writeShort(byteArray0, 0, 667);
      int[] intArray0 = new int[0];
      MethodWriter.getNewOffset(intArray0, intArray0, 0, (byte) (-29));
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = 0;
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 83;
      intArray0[4] = 0;
      intArray0[5] = (-3208);
      MethodWriter.getNewOffset(intArray0, intArray0, (-2876), (-2876));
      ClassWriter classWriter0 = new ClassWriter(191);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      classWriter0.newField("Wm2q.m}YeMB[1q.u[", "", "");
      stringArray0[3] = "";
      classWriter0.newInteger((-1913));
      stringArray0[4] = "";
      stringArray0[5] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-422), "8N", "<init>", "LocalVariableTable", stringArray0, false, false);
      methodWriter0.visitLdcInsn("<init>");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 0, "", "", "", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 83;
      intArray0[4] = 0;
      intArray0[5] = (-3208);
      MethodWriter.getNewOffset(intArray0, intArray0, (-2876), (-2876));
      ClassWriter classWriter0 = new ClassWriter(191);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      classWriter0.visitField(2230, ">P0>>d", "Code", "", "");
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", stringArray0, false, false);
      classWriter0.newDouble(1627.2875225194);
      methodWriter0.visitInsn((-2876));
      methodWriter0.visitMaxs(4531, 0);
      MethodWriter.getNewOffset(intArray0, intArray0, 0, 0);
      methodWriter0.visitCode();
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4150670314069402
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3580));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "org.objectweb.asm.jip.Type";
      stringArray0[1] = "org.objectweb.asm.jip.Type";
      stringArray0[2] = "org.objectweb.asm.jip.Type";
      stringArray0[3] = "org.objectweb.asm.jip.ClassAdapter";
      stringArray0[4] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[5] = "java/lang/Object";
      stringArray0[6] = "5\"ZR,'0H=JtK2I4I";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1818), "org.objectweb.asm.jip.Type", "org.objectweb.asm.jip.ClassAdapter", "!^S.", stringArray0, false, false);
      methodWriter0.visitFieldInsn((-1818), "org.objectweb.asm.jip.Type", "0VfV'Q+#/(8nX", "org.objectweb.asm.jip.Edge");
      methodWriter0.visitAnnotation("5\"ZR,'0H=JtK2I4I", false);
      Object object0 = new Object();
      methodWriter0.exceptionCount = (-1838);
      methodWriter0.visitLdcInsn("org.objectweb.asm.jip.ClassAdapter");
      methodWriter0.visitFrame(905, (-3502), stringArray0, 905, stringArray0);
      Label label0 = new Label();
      Label label1 = label0.getFirst();
      methodWriter0.visitJumpInsn((-1100466058), label1);
      assertSame(label0, label1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.1275347898191255
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 83;
      intArray0[4] = 0;
      intArray0[5] = (-3208);
      MethodWriter.getNewOffset(intArray0, intArray0, (-2876), (-2876));
      ClassWriter classWriter0 = new ClassWriter(191);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", stringArray0, false, false);
      methodWriter0.visitIntInsn((-1264), 905);
      classWriter0.newDouble(1627.2875225194);
      methodWriter0.visitMaxs(4531, 0);
      MethodWriter.getNewOffset(intArray0, intArray0, 0, 0);
      methodWriter0.visitFrame(83, 16777216, stringArray0, 392, stringArray0);
      assertEquals(6, stringArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 83;
      intArray0[4] = 0;
      intArray0[5] = (-3208);
      MethodWriter.getNewOffset(intArray0, intArray0, (-2876), (-2876));
      ClassWriter classWriter0 = new ClassWriter(191);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[3] = "";
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-103);
      byteArray0[1] = (byte)16;
      byteArray0[2] = (byte) (-70);
      byteArray0[3] = (byte)51;
      byteArray0[4] = (byte) (-71);
      MethodWriter.readUnsignedShort(byteArray0, 0);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 0, "", "~FS", "", stringArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 83;
      intArray0[4] = 0;
      intArray0[5] = (-3208);
      MethodWriter.getNewOffset(intArray0, intArray0, (-2876), (-2876));
      ClassWriter classWriter0 = new ClassWriter(191);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", stringArray0, false, false);
      classWriter0.visit(83, 2306, "2sJ1Ff", "", "3#y0\"#z-e-[:*c%H>'K", stringArray0);
      classWriter0.newDouble(1627.2875225194);
      methodWriter0.visitMaxs(4531, 0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)25;
      // Undeclared exception!
      try { 
        MethodWriter.readShort(byteArray0, 1701);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1701
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3580));
      classWriter0.newLong(1L);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[1] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[2] = "RuntimeInvisibleAnnotations";
      stringArray0[3] = "Deprecated";
      stringArray0[4] = "5\"ZR,'0H=JtK2I4I";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "org.objectweb.asm.jip.Type", "org.objectweb.asm.jip.Type", "org.objectweb.asm.jip.Type", stringArray0, false, false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.objectweb.asm.jip.Type");
      MethodWriter methodWriter1 = methodWriter0.next;
      MethodWriter methodWriter2 = new MethodWriter(classWriter0, 554, "<g#ze4mxc %#[a", "eEJ7Ry-rsE", "org.objectweb.asm.jip.Frame", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(1, "%kl<ma%eV1([", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[3] = 83;
      intArray0[4] = 0;
      intArray0[5] = (-3208);
      MethodWriter.getNewOffset(intArray0, intArray0, (-2876), (-2876));
      ClassWriter classWriter0 = new ClassWriter(191);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", stringArray0, false, false);
      classWriter0.newDouble(1627.2875225194);
      methodWriter0.visitMaxs(4531, 0);
      MethodWriter.getNewOffset(intArray0, intArray0, 0, 0);
      methodWriter0.visitAnnotation("", false);
      methodWriter0.visitTypeInsn(7, "C~iF{>zd1a9NeFfSw)%");
      Label label0 = new Label();
      methodWriter0.visitLineNumber((-2990), label0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-856));
      classWriter0.newFloat(1.0F);
      String[] stringArray0 = null;
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "kob;MB", "kob;MB", "kob;MB", (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.297295830625819
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = (-3208);
      MethodWriter.getNewOffset(intArray0, intArray0, (-2876), (-2876));
      ClassWriter classWriter0 = new ClassWriter(191);
      classWriter0.newLong(0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", stringArray0, false, false);
      methodWriter0.visitIntInsn((-1264), 905);
      classWriter0.newDouble(1627.2875225194);
      methodWriter0.visitMaxs(4531, 0);
      MethodWriter.getNewOffset(intArray0, intArray0, 0, 0);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(0, 16777216, stringArray0, 392, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.082534885763483
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2691);
      String[] stringArray0 = new String[3];
      classWriter0.newFloat(2691);
      stringArray0[0] = "kob;MB";
      stringArray0[1] = "kob;MB";
      stringArray0[2] = "kob;MB";
      int[] intArray0 = new int[9];
      intArray0[0] = (-2876);
      intArray0[2] = 2691;
      intArray0[3] = 2691;
      intArray0[4] = (-3208);
      intArray0[5] = 2691;
      intArray0[6] = 2691;
      intArray0[7] = 1;
      intArray0[8] = 2691;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 2691, (-529));
      assertEquals((-16676), int0);
      
      ClassWriter classWriter1 = new ClassWriter((-4504));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-529), "kob;MB", "kob;MB", "0Uk[_$e(M", stringArray0, false, false);
      classWriter1.newDouble(1);
      methodWriter0.visitMethodInsn(2691, "org.objectweb.asm.jip.ClassWriter", "0Uk[_$e(M", "kob;MB");
      methodWriter0.visitMaxs(1408, 2691);
      int int1 = MethodWriter.getNewOffset(intArray0, intArray0, (-2876), 2);
      assertEquals(2879, int1);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 83;
      intArray0[4] = 0;
      intArray0[5] = (-3208);
      ClassWriter classWriter0 = new ClassWriter(191);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      classWriter0.newMethod("NH#H(!25Ii(vg2D=", "NH#H(!25Ii(vg2D=", "A|{AQItJR*f}hpU", true);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", stringArray0, false, false);
      classWriter0.newDouble(1627.2875225194);
      methodWriter0.visitMaxs(4531, 0);
      MethodWriter.getNewOffset(intArray0, intArray0, 0, 0);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("", "", "NH#H(!25Ii(vg2D=", label0, label0, (-3208));
      // Undeclared exception!
      try { 
        methodWriter0.visitJumpInsn(16777225, (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.893788232391138
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3580));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "org.objectweb.asm.jip.Type";
      stringArray0[1] = "org.objectweb.asm.jip.Type";
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      classWriter0.newUTF8("QKP$$c'#M");
      stringArray0[2] = "org.objectweb.asm.jip.Type";
      stringArray0[3] = "org.objectweb.asm.jip.ClassAdapter";
      stringArray0[4] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[5] = "java/lang/Object";
      stringArray0[6] = "5\"ZR,'0H=JtK2I4I";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1818), "org.objectweb.asm.jip.Type", "org.objectweb.asm.jip.ClassAdapter", "!^S.", stringArray0, false, false);
      methodWriter0.visitInsn(2);
      methodWriter0.visitFieldInsn((-1818), "org.objectweb.asm.jip.Type", "0VfV'Q+#/(8nX", "org.objectweb.asm.jip.Edge");
      methodWriter0.visitAnnotation("5\"ZR,'0H=JtK2I4I", false);
      Object object0 = new Object();
      methodWriter0.visitLdcInsn("org.objectweb.asm.jip.ClassAdapter");
      methodWriter0.visitMultiANewArrayInsn("java/lang/Object", (-3580));
      methodWriter0.visitFrame(905, (-3502), stringArray0, 905, stringArray0);
      methodWriter0.visitVarInsn((-1955751143), 2);
      // Undeclared exception!
      try { 
        methodWriter0.visitLdcInsn(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@761be07f
         //
         verifyException("org.objectweb.asm.jip.ClassWriter", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9911388966130941
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3580));
      classWriter0.newLong(1L);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[1] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[2] = "RuntimeInvisibleAnnotations";
      stringArray0[3] = "Deprecated";
      stringArray0[4] = "5\"ZR,'0H=JtK2I4I";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "org.objectweb.asm.jip.Type", "org.objectweb.asm.jip.Type", "org.objectweb.asm.jip.Type", stringArray0, false, false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.objectweb.asm.jip.Type");
      MethodWriter methodWriter1 = methodWriter0.next;
      int[] intArray0 = new int[3];
      intArray0[0] = 2;
      intArray0[1] = 2;
      intArray0[2] = 566;
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter methodWriter2 = methodWriter0.next;
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-529), "org.objectweb.asm.jip.Type", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8953326659680909
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2691);
      String[] stringArray0 = new String[3];
      classWriter0.newFloat(2691);
      stringArray0[0] = "Q*";
      stringArray0[1] = "Q*";
      stringArray0[2] = "Q*";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 67, "Q*", "Q*", "Q*", stringArray0, false, false);
      methodWriter0.visitIincInsn(612, 1);
      classWriter0.newLong(0L);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 4, "Q*", "", "Q*", stringArray0, false, false);
      methodWriter0.visitIntInsn(67, 1);
      classWriter0.newDouble(0.0);
      MethodWriter methodWriter2 = classWriter0.firstMethod;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Q*");
      MethodWriter methodWriter3 = methodWriter0.next;
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-10), "ZC`h-O^0.d", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3580));
      String string0 = "5\"ZR,'0H=JtK2I4I";
      classWriter0.newFloat((-3580));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[1] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[2] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[3] = "5\"ZR,'0H=JtK2I4I";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3580), "5\"ZR,'0H=JtK2I4I", "5\"ZR,'0H=JtK2I4I", "5\"ZR,'0H=JtK2I4I", stringArray0, false, false);
      int int0 = 612;
      methodWriter0.visitIincInsn((-3580), 894);
      classWriter0.newLong(1L);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 612, "5\"ZR,'0H=JtK2I4I", "5\"ZR,'0H=JtK2I4I", "5\"ZR,'0H=JtK2I4I", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6117969454556231
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3580));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "org.objectweb.asm.jip.Type";
      stringArray0[1] = "org.objectweb.asm.jip.Type";
      stringArray0[2] = "org.objectweb.asm.jip.Type";
      stringArray0[3] = "org.objectweb.asm.jip.ClassAdapter";
      stringArray0[4] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[5] = "java/lang/Object";
      stringArray0[6] = "5\"ZR,'0H=JtK2I4I";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1818), "org.objectweb.asm.jip.Type", "org.objectweb.asm.jip.ClassAdapter", "!^S.", stringArray0, false, false);
      methodWriter0.visitFieldInsn((-1818), "org.objectweb.asm.jip.Type", "org.objectweb.asm.jip.Type", "org.objectweb.asm.jip.Edge");
      methodWriter0.visitAnnotation("5\"ZR,'0H=JtK2I4I", false);
      classWriter0.visit((-2), (-1939319529), "float", "long", (String) null, stringArray0);
      Object object0 = new Object();
      methodWriter0.exceptionCount = (-1838);
      methodWriter0.visitLdcInsn("5\"ZR,'0H=JtK2I4I");
      methodWriter0.visitAnnotationDefault();
      methodWriter0.visitLdcInsn("org.objectweb.asm.jip.ClassAdapter");
      methodWriter0.visitFrame(905, (-3502), stringArray0, 905, stringArray0);
      Label label0 = new Label();
      methodWriter0.visitLineNumber(1, label0);
      methodWriter0.visitLabel(label0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.4836940556458569
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3580));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "org.objectweb.asm.jip.Type";
      stringArray0[1] = "org.objectweb.asm.jip.Type";
      stringArray0[2] = "org.objectweb.asm.jip.Type";
      stringArray0[3] = "org.objectweb.asm.jip.ClassAdapter";
      stringArray0[4] = "5\"ZR,'0H=JtK2I4I";
      stringArray0[5] = "java/lang/Object";
      stringArray0[6] = "5\"ZR,'0H=JtK2I4I";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1818), "org.objectweb.asm.jip.Type", "org.objectweb.asm.jip.ClassAdapter", "!^S.", stringArray0, false, false);
      methodWriter0.visitFieldInsn((-1818), "org.objectweb.asm.jip.Type", "0VfV'Q+#/(8nX", "org.objectweb.asm.jip.Edge");
      methodWriter0.getSize();
      methodWriter0.visitAnnotation("5\"ZR,'0H=JtK2I4I", false);
      classWriter0.visit((-2), (-1939319529), "float", "long", (String) null, stringArray0);
      Object object0 = new Object();
      methodWriter0.exceptionCount = (-1838);
      methodWriter0.visitLdcInsn("5\"ZR,'0H=JtK2I4I");
      methodWriter0.visitAnnotationDefault();
      methodWriter0.visitLdcInsn("org.objectweb.asm.jip.ClassAdapter");
      methodWriter0.visitFrame((-2876), (-1818), stringArray0, (-1818), stringArray0);
      assertEquals(7, stringArray0.length);
  }
}