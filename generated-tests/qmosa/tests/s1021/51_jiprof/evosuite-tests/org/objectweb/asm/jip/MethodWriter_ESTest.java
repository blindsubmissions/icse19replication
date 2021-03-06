/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:47:53 GMT 2018
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
import org.objectweb.asm.jip.ByteVector;
import org.objectweb.asm.jip.ClassReader;
import org.objectweb.asm.jip.ClassWriter;
import org.objectweb.asm.jip.Edge;
import org.objectweb.asm.jip.Frame;
import org.objectweb.asm.jip.Label;
import org.objectweb.asm.jip.MethodVisitor;
import org.objectweb.asm.jip.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "_?";
      stringArray0[1] = "_?";
      stringArray0[2] = "LineNumberTable";
      stringArray0[3] = "_?";
      stringArray0[4] = "";
      stringArray0[5] = "LineNumberTable";
      stringArray0[6] = "LineNumberTable";
      stringArray0[7] = "LineNumberTable";
      boolean boolean0 = true;
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 0, "LineNumberTable", "_?", "_?", stringArray0, true, true);
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
      byte[] byteArray0 = null;
      // Undeclared exception!
      try { 
        MethodWriter.readInt((byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      // Undeclared exception!
      try { 
        MethodWriter.writeShort(byteArray0, (byte)0, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)28;
      ClassWriter classWriter0 = new ClassWriter(64);
      int int0 = (-2222);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-2222), "Exceptions", "LocalVariableTypeTable", ";q\"T-%", (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 24117248;
      intArray0[1] = 1183;
      intArray0[2] = (-2518);
      intArray0[3] = 781;
      intArray0[4] = 2745;
      intArray0[5] = (-4017);
      intArray0[6] = 0;
      intArray0[7] = 0;
      MethodWriter.getNewOffset(intArray0, intArray0, 1471, 0);
      ClassWriter classWriter0 = new ClassWriter(24117248);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 781, "", "", "", stringArray0, false, false);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1403);
      String[] stringArray0 = new String[4];
      stringArray0[0] = " !m.R#";
      stringArray0[1] = " !m.R#";
      stringArray0[2] = " !m.R#";
      stringArray0[3] = " !m.R#";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 170, " !m.R#", " !m.R#", " !m.R#", stringArray0, false, false);
      int[] intArray0 = new int[3];
      intArray0[0] = 1403;
      intArray0[1] = (-4017);
      intArray0[2] = 0;
      MethodWriter.getNewOffset(intArray0, intArray0, 2, 0);
      ClassWriter classWriter1 = new ClassWriter(74);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "";
      stringArray1[1] = "";
      stringArray1[2] = "";
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 781, "", " !m.R#", "", stringArray1, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.thisName = "|5(?E.jf57q7vu";
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "|5(?E.jf57q7vu";
      stringArray0[2] = "uYcO;E(*Oo!D?H";
      stringArray0[3] = "";
      stringArray0[4] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[5] = "LocalVariableTypeTable";
      stringArray0[6] = "";
      stringArray0[7] = "";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod((-1452), "(Y$sCcr7<#s[y$-", "", "", stringArray0);
      methodVisitor0.visitLdcInsn("uYcO;E(*Oo!D?H");
      classWriter0.newUTF8("RuntimeInvisibleParameterAnnotations");
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      MethodWriter methodWriter1 = methodWriter0.next;
      methodWriter0.next = null;
      methodWriter0.visitIntInsn(0, (-4680));
      byte[] byteArray0 = new byte[2];
      String string0 = "69I\\uH";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, string0);
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-47);
      // Undeclared exception!
      try { 
        MethodWriter.readShort(byteArray0, (-1305));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1305
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1403);
      String[] stringArray0 = new String[4];
      stringArray0[0] = " !m.R#";
      stringArray0[1] = " !m.R#";
      stringArray0[2] = " !m.R#";
      stringArray0[3] = " !m.R#";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 170, " !m.R#", " !m.R#", " !m.R#", stringArray0, false, false);
      int[] intArray0 = new int[9];
      intArray0[0] = 1403;
      intArray0[1] = 1403;
      intArray0[2] = 2;
      methodWriter0.visitFrame((-1443978979), 1, stringArray0, 170, stringArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(170, "F#wd#Ahbu@exIy", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1403);
      String[] stringArray0 = new String[4];
      stringArray0[0] = " !m.R#";
      stringArray0[1] = " !m.R#";
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      stringArray0[2] = " !m.R#";
      stringArray0[3] = " !m.R#";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 170, " !m.R#", " !m.R#", " !m.R#", stringArray0, false, false);
      int[] intArray0 = new int[9];
      methodWriter0.visitMethodInsn(2, "", " !m.R#", " !m.R#");
      intArray0[0] = 1403;
      intArray0[1] = 1403;
      intArray0[2] = 2;
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(170, "F#wd#Ahbu@exIy", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0437938808441543
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1403);
      String[] stringArray0 = new String[4];
      stringArray0[0] = " !m.R#";
      stringArray0[1] = " !m.R#";
      classWriter0.newConst(" !m.R#");
      stringArray0[2] = " !m.R#";
      stringArray0[3] = " !m.R#";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 170, " !m.R#", " !m.R#", " !m.R#", stringArray0, false, false);
      int[] intArray0 = new int[9];
      intArray0[0] = 1403;
      methodWriter0.visitIntInsn(24117248, (-1797));
      intArray0[1] = 1403;
      intArray0[2] = 2;
      intArray0[3] = 1403;
      intArray0[4] = 0;
      intArray0[5] = 1;
      intArray0[6] = 2;
      intArray0[7] = 2;
      methodWriter0.visitAnnotation("Synthetic", false);
      methodWriter0.getSize();
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-532), (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.8486855577264172
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 1403;
      ClassWriter classWriter0 = new ClassWriter(1403);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 170, "init>", "init>", "init>", (String[]) null, false, false);
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      methodWriter1.visitFrame((-1443978979), 132, (Object[]) null, 1033, (Object[]) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        methodWriter1.visitParameterAnnotation(170, "xD2wC;a4IMo:x~+N1", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.8532361505557784
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1403);
      String[] stringArray0 = new String[4];
      stringArray0[0] = " !m.R#";
      stringArray0[1] = " !m.R#";
      stringArray0[2] = " !m.R#";
      stringArray0[3] = " !m.R#";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 170, " !m.R#", " !m.R#", " !m.R#", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-3344), stringArray0, 1403, stringArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(76, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3005920075345054
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "|5(?E.jf57q7vu";
      stringArray0[2] = "uYcO;E(*Oo!D?H";
      stringArray0[3] = "";
      stringArray0[4] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[5] = "LocalVariableTypeTable";
      stringArray0[6] = "";
      stringArray0[7] = "";
      MethodWriter methodWriter0 = (MethodWriter)classWriter0.visitMethod((-1452), "(Y$sCcr7<#s[y$-", "", "", stringArray0);
      classWriter0.newUTF8("RuntimeInvisibleParameterAnnotations");
      methodWriter0.visitAnnotation("RuntimeInvisibleParameterAnnotations", false);
      methodWriter0.getSize();
      String string0 = "8-&[OTs[P3";
      String string1 = "<init>";
      methodWriter0.visitLdcInsn("<init>");
      Frame frame0 = new Frame();
      int[] intArray0 = new int[5];
      intArray0[0] = (-1452);
      intArray0[1] = 64;
      intArray0[2] = 8;
      intArray0[3] = 64;
      intArray0[4] = 2;
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      // Undeclared exception!
      try { 
        MethodWriter.getNewOffset(intArray0, intArray0, (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1403);
      ClassWriter classWriter1 = new ClassWriter(170);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "LocalVariableTypeTable";
      stringArray0[1] = "IQ,`";
      stringArray0[2] = "IQ,`";
      stringArray0[3] = " !m.R#";
      stringArray0[4] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1091), "", "", "LocalVariableTypeTable", stringArray0, false, false);
      MethodWriter methodWriter1 = classWriter1.firstMethod;
      methodWriter0.visitMultiANewArrayInsn(" !m.R#", 1787);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = " !m.R#";
      stringArray0[1] = " !m.R#";
      stringArray0[2] = " !m.R#";
      stringArray0[3] = " !m.R#";
      int[] intArray0 = new int[9];
      MethodWriter.getNewOffset(intArray0, intArray0, 64, 16777219);
      ClassWriter classWriter0 = new ClassWriter((-2117));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-128), "", " !m.R#", "q1i0=;6FEIw|O;d", stringArray0, false, false);
      Label label0 = new Label();
      Label[] labelArray0 = new Label[2];
      labelArray0[0] = label0;
      labelArray0[1] = label0;
      methodWriter0.visitTableSwitchInsn(16777219, 2, label0, labelArray0);
      methodWriter0.visitFieldInsn(74, "\"f1<+o-Sc 0@", "q1i0=;6FEIw|O;d", "Ljava/lang/SynthetFc;");
      ByteVector byteVector0 = new ByteVector(64);
      methodWriter0.put(byteVector0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ClassWriter classWriter0 = new ClassWriter(219);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "IQ,`";
      stringArray0[1] = "IQ,`";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 219, "", "IQ,`", "IQ,`", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 219, "IQ,`", "", "IQ,`", stringArray0, false, false);
      int[] intArray0 = new int[3];
      intArray0[0] = 2;
      intArray0[1] = 2;
      methodWriter0.visitVarInsn(2, (-1469021715));
      intArray0[2] = 2;
      methodWriter1.exceptions = intArray0;
      methodWriter1.visitInsn(2790);
      methodWriter0.visitVarInsn(285212682, 2790);
      assertNotSame(methodWriter0, methodWriter1);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6615632381579821
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 285212675, "init>", "init>", "init>", (String[]) null, false, false);
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      int int0 = 132;
      int int1 = 1033;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) methodWriter1;
      objectArray0[1] = (Object) methodWriter0;
      objectArray0[2] = (Object) methodWriter0;
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 132, (Object[]) null, 1, objectArray0);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 285212675, "init>", "init>", "init>", (String[]) null, false, false);
      methodWriter0.visitIntInsn(1403, 1);
      classWriter0.addUninitializedType("init>", 252);
      methodWriter0.visitAnnotationDefault();
      classWriter0.newFieldItem("L", "", "java/lang/String");
      methodWriter0.visitAnnotation("init>", false);
      methodWriter0.getSize();
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-896), "", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1403);
      int[] intArray0 = new int[4];
      intArray0[0] = 1403;
      int int0 = (-2094);
      ClassWriter classWriter1 = new ClassWriter(2148);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "<init>";
      stringArray0[1] = "<init>";
      stringArray0[2] = "<init>";
      stringArray0[3] = "<init>";
      stringArray0[4] = "";
      stringArray0[5] = "3EjfnUVAfQDB1/&|,";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1403, "<init>", "3EjfnUVAfQDB1/&|,", "", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1403);
      String[] stringArray0 = new String[4];
      stringArray0[0] = " !m.R#";
      stringArray0[1] = " !m.R#";
      classWriter0.newConst(" !m.R#");
      stringArray0[2] = " !m.R#";
      stringArray0[3] = " !m.R#";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 170, " !m.R#", " !m.R#", " !m.R#", stringArray0, false, false);
      int[] intArray0 = new int[9];
      intArray0[0] = 1403;
      methodWriter0.visitIntInsn(24117248, (-1797));
      intArray0[1] = 1403;
      intArray0[2] = 2;
      classWriter0.addUninitializedType(" !m.R#", 937);
      intArray0[4] = 0;
      intArray0[5] = 1;
      methodWriter0.visitVarInsn(1563, 2);
      methodWriter0.visitInsn(0);
      methodWriter0.visitVarInsn(70, (-1566));
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9977832779091834
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ClassWriter classWriter0 = new ClassWriter(219);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "IQ,`";
      stringArray0[1] = "IQ,`";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 219, "", "IQ,`", "IQ,`", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 219, "IQ,`", "", "IQ,`", stringArray0, false, false);
      int[] intArray0 = new int[3];
      intArray0[0] = 2;
      intArray0[1] = 2;
      classWriter0.newFieldItem("LineNumberTable", "_Ny%^,V98|gCU{<o", "Deprecated");
      methodWriter0.visitAnnotation("InnerClasses", false);
      methodWriter1.getSize();
      // Undeclared exception!
      try { 
        methodWriter1.visitParameterAnnotation(2118, "Deprecated", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 285212675, "init>", "init>", "init>", (String[]) null, false, false);
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) methodWriter1;
      objectArray0[1] = (Object) methodWriter0;
      MethodWriter methodWriter2 = classWriter0.firstMethod;
      // Undeclared exception!
      try { 
        methodWriter2.visitFrame(0, 556, objectArray0, 556, (Object[]) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.objectweb.asm.jip.MethodWriter cannot be cast to org.objectweb.asm.jip.Label
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0386495367023671
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1403);
      String[] stringArray0 = new String[4];
      stringArray0[0] = " !m.R#";
      stringArray0[1] = " !m.R#";
      classWriter0.newConst(" !m.R#");
      stringArray0[2] = " !m.R#";
      stringArray0[3] = " !m.R#";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 170, " !m.R#", " !m.R#", " !m.R#", stringArray0, false, false);
      int[] intArray0 = new int[9];
      intArray0[0] = 1403;
      classWriter0.toByteArray();
      MethodWriter.getNewOffset(intArray0, intArray0, 1403, 2);
      ClassWriter classWriter1 = new ClassWriter(1403);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.5607104090414068
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "|5(?E.jf57q7vu";
      stringArray0[2] = "uYcO;E(*Oo!D?H";
      stringArray0[3] = "";
      stringArray0[4] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[5] = "LocalVariableTypeTable";
      stringArray0[6] = "";
      stringArray0[7] = "";
      MethodWriter methodWriter0 = (MethodWriter)classWriter0.visitMethod((-1452), "(Y$sCcr7<#s[y$-", "", "", stringArray0);
      classWriter0.newUTF8("RuntimeInvisibleParameterAnnotations");
      methodWriter0.visitAnnotation("RuntimeInvisibleParameterAnnotations", false);
      methodWriter0.getSize();
      methodWriter0.visitLdcInsn("<init>");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 24117248, "<init>", "Y\"ax6E0o", "<init>", stringArray0, false, false);
      MethodWriter methodWriter2 = methodWriter1.next;
      methodWriter1.visitInsn((-886));
      MethodWriter methodWriter3 = classWriter0.lastMethod;
      methodWriter1.visitVarInsn(24117248, 8);
      assertNotSame(methodWriter1, methodWriter0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 1403;
      ClassWriter classWriter0 = new ClassWriter(1403);
      String[] stringArray0 = null;
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 170, "init>", "init>", "init>", (String[]) null, false, false);
      int int1 = (-1443978979);
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      int int2 = 132;
      Label label0 = new Label();
      Label label1 = label0.successor;
      // Undeclared exception!
      try { 
        methodWriter1.visitLocalVariable("JSR/RET are not supported with computeFrames option", "LineNumberTable", "Uyb*Xuwgy", (Label) null, label0, (-1443978979));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.679204331602707
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1403);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 170, "init>", "init>", "init>", (String[]) null, false, false);
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      methodWriter1.visitFrame((-1443978979), 132, (Object[]) null, 1033, (Object[]) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Label label0 = new Label();
      Label[] labelArray0 = new Label[8];
      Label label1 = new Label();
      labelArray0[0] = label1;
      labelArray0[1] = label0;
      labelArray0[2] = label0;
      labelArray0[3] = label0;
      labelArray0[4] = label0;
      labelArray0[5] = label0;
      labelArray0[6] = label0;
      labelArray0[7] = label0;
      methodWriter0.visitTableSwitchInsn((-689), 170, label0, labelArray0);
      methodWriter0.visitFieldInsn((-1), "init>", "init>", "init>");
      ByteVector byteVector0 = new ByteVector(4096);
      methodWriter0.put(byteVector0);
      methodWriter1.visitLineNumber(4096, label0);
      assertNotSame(label0, label1);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = " !m.R#";
      stringArray0[1] = " !m.R#";
      stringArray0[2] = " !m.R#";
      stringArray0[3] = " !m.R#";
      int[] intArray0 = new int[9];
      MethodWriter.getNewOffset(intArray0, intArray0, 64, 16777219);
      ClassWriter classWriter0 = new ClassWriter((-2117));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-128), "", " !m.R#", "q1i0=;6FEIw|O;d", stringArray0, false, false);
      Label label0 = new Label();
      Object object0 = new Object();
      label0.info = object0;
      Label[] labelArray0 = new Label[2];
      labelArray0[0] = label0;
      labelArray0[1] = label0;
      classWriter0.visitOuterClass("", " !m.R#", "zkM*=sQ8");
      Edge edge0 = new Edge();
      Label label1 = edge0.successor;
      Label label2 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label2);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }
}
