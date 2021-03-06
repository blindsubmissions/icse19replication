/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:12:10 GMT 2018
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
import org.objectweb.asm.jip.AnnotationVisitor;
import org.objectweb.asm.jip.Attribute;
import org.objectweb.asm.jip.ByteVector;
import org.objectweb.asm.jip.ClassReader;
import org.objectweb.asm.jip.ClassWriter;
import org.objectweb.asm.jip.Edge;
import org.objectweb.asm.jip.FieldWriter;
import org.objectweb.asm.jip.Frame;
import org.objectweb.asm.jip.Item;
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
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-71);
      byteArray0[1] = (byte)38;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-28);
      MethodWriter.writeShort(byteArray0, 0, (byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-28)}, byteArray0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "LocalVariableTable";
      stringArray0[1] = "Synthetic";
      stringArray0[2] = "LocalVariableTable";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 4096, "LocalVariableTable", "Synthetic", "Synthetic", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "java/lang/Throwable";
      stringArray0[1] = "8Rdy:iEEmAQP";
      stringArray0[2] = "java/lang/Throwable";
      stringArray0[3] = "java/lang/Throwable";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "java/lang/Throwable", "", "java/lang/Throwable", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "org.objectweb.asm.jip.MethodWriter", "org.objectweb.asm.jip.MethodWriter", "", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        MethodWriter.readUnsignedShort((byte[]) null, (-3189));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 187;
      intArray0[3] = 1025;
      intArray0[4] = 0;
      intArray0[5] = 683;
      intArray0[6] = 2230;
      intArray0[7] = 0;
      int[] intArray1 = new int[2];
      intArray1[0] = 683;
      intArray1[1] = 0;
      // Undeclared exception!
      try { 
        MethodWriter.getNewOffset(intArray0, intArray1, 196, 2230);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      intArray0[1] = 0;
      intArray0[2] = 1;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 1;
      intArray0[6] = 2;
      intArray0[7] = 4096;
      intArray0[8] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, 2, 4096);
      ClassWriter classWriter1 = new ClassWriter(4096);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter1, 0, "", "RuntimeVisibleParameterAnnotations", "-", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-2450);
      intArray0[1] = (-2147483620);
      intArray0[2] = 0;
      intArray0[3] = (-2875);
      ClassWriter classWriter0 = new ClassWriter(7);
      MethodWriter methodWriter0 = classWriter0.lastMethod;
      Edge edge0 = new Edge();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-65);
      byteArray0[1] = (byte)54;
      // Undeclared exception!
      try { 
        MethodWriter.readShort(byteArray0, 17);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 17
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 0, (-1309));
      assertEquals((-1309), int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ".Yg\"");
      ClassWriter classWriter0 = new ClassWriter(4096);
      classWriter0.newFloat(4096);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "LocalVariableTable";
      stringArray0[1] = "Synthetic";
      stringArray0[2] = "LocalVariableTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-847), "Synthetic", "Synthetic", "LocalVariableTable", stringArray0, false, false);
      methodWriter0.signature = "LocalVariableTable";
      methodWriter0.visitFrame(60, 2759, stringArray0, 21, stringArray0);
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      // Undeclared exception!
      try { 
        methodWriter1.visitFrame(3057, 1, stringArray0, 60, stringArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Synthetic";
      stringArray0[1] = "StackMap";
      stringArray0[2] = "RuntimeVisibleAnnotations";
      Item[] itemArray0 = new Item[5];
      Item item0 = classWriter0.key3;
      itemArray0[0] = item0;
      Item item1 = classWriter0.newLong(1024);
      itemArray0[1] = item1;
      Item item2 = classWriter0.key2;
      itemArray0[2] = item2;
      Item item3 = classWriter0.newInteger((-1));
      itemArray0[3] = item3;
      Item item4 = classWriter0.newFieldItem("RuntimeVisibleAnnotations", "Synthetic", "StackMap");
      itemArray0[4] = item4;
      classWriter0.typeTable = itemArray0;
      stringArray0[3] = "";
      stringArray0[4] = "l!AsTRekd4/v,r!,-5";
      stringArray0[5] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1024, "StackMap", "<init>", "", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1115), "6", "><#@Y!^r2uMe", "Code", stringArray0, false, false);
      methodWriter1.visitVarInsn((-1115), (-847));
      AnnotationVisitor annotationVisitor0 = methodWriter0.visitAnnotationDefault();
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "LocalVariableTable";
      stringArray0[1] = "Synthetic";
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)100;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)114;
      byteArray0[3] = (byte)59;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-65);
      byteArray0[7] = (byte)71;
      byteArray0[8] = (byte) (-15);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      stringArray0[2] = "LocalVariableTable";
      String[] stringArray1 = new String[1];
      stringArray1[0] = "et!!%>-0`@o=";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "Synthetic", "et!!%>-0`@o=", "Synthetic", stringArray1, false, false);
      methodWriter0.visitInsn((-2442));
      AnnotationVisitor annotationVisitor0 = methodWriter0.visitAnnotation("5", false);
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.1966127112211293
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      classWriter0.newFloat(4096);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "LocalVariableTable";
      stringArray0[1] = "Synthetic";
      stringArray0[2] = "LocalVariableTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-847), "Synthetic", "Synthetic", "LocalVariableTable", stringArray0, false, false);
      FieldWriter fieldWriter0 = classWriter0.firstField;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      methodWriter0.visitFieldInsn(4096, "", "^%v9Q", "Synthetic");
      classWriter0.lastField = null;
      methodWriter0.visitVarInsn((-3606), 4096);
      methodWriter0.visitAnnotationDefault();
      methodWriter0.visitMultiANewArrayInsn("Synthetic", 770);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.8369882167858358
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-993));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "q{4B~OV%%";
      stringArray0[1] = "";
      stringArray0[2] = "9aQgqLdxkub{r";
      stringArray0[3] = "9aQgqLdxkub{r";
      stringArray0[4] = "q{4B~OV%%";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2135), "", "q{4B~OV%%", "9aQgqLdxkub{r", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      methodWriter0.visitIntInsn(4475, 2);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-3961), "I`2j9I", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.8082699580001821
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 54;
      ClassWriter classWriter0 = new ClassWriter(54);
      String string0 = "Synthetic";
      String[] stringArray0 = new String[6];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      stringArray0[2] = "StackMap";
      stringArray0[3] = "";
      stringArray0[4] = "_U";
      stringArray0[5] = "_U";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 256, "RuntimeVisibleAnnotations", "\"w?:<),B}m%", "", stringArray0, false, true);
      Object object0 = new Object();
      String string1 = "'8t|l>z";
      // Undeclared exception!
      try { 
        methodWriter0.visitJumpInsn((-566), (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.Frame", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      classWriter0.newFloat(4096);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "LocalVariableTable";
      stringArray0[1] = "ynthet(c";
      stringArray0[2] = "LocalVariableTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-847), "ynthet(c", "ynthet(c", "LocalVariableTable", stringArray0, false, false);
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      methodWriter1.visitInsn(2);
      AnnotationVisitor annotationVisitor0 = methodWriter1.visitAnnotation("*}o", true);
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      stringArray0[2] = "StackMap";
      stringArray0[3] = "";
      stringArray0[4] = "_U";
      stringArray0[5] = "_U";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 256, "RuntimeVisibleAnnotations", "\"w?:<),B}m%", "", stringArray0, false, true);
      Object object0 = new Object();
      Object object1 = new Object();
      classWriter0.visitField(54, "", "8'qaAvhg`T9FJcfm", "'8t|l>z", "_U");
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      methodWriter1.visitLdcInsn("Synthetic");
      methodWriter0.visitFrame(54, 8, stringArray0, 7, stringArray0);
      methodWriter0.visitTryCatchBlock((Label) null, (Label) null, (Label) null, "=5&&E");
      methodWriter0.visitEnd();
      methodWriter0.visitEnd();
      assertSame(methodWriter0, methodWriter1);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4098);
      Item item0 = new Item();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "LocalVariableTable";
      stringArray0[1] = "Synthetic";
      stringArray0[2] = "LocalVariableTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-847), "Synthetic", "Synthetic", "LocalVariableTable", stringArray0, false, false);
      FieldWriter fieldWriter0 = classWriter0.firstField;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      methodWriter0.visitFieldInsn(4098, "", "^%v9Q", "Synthetic");
      classWriter0.lastField = null;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-847), "Synthetic", "LocalVariableTable", "Synthetic", stringArray0, false, false);
      MethodWriter methodWriter2 = new MethodWriter(classWriter0, 285212674, "LocalVariableTable", "<init>", "Synthetic", stringArray0, false, false);
      methodWriter2.visitVarInsn(70, 1);
      AnnotationVisitor annotationVisitor0 = methodWriter0.visitAnnotationDefault();
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.132647528484726
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      stringArray0[2] = "StackMap";
      stringArray0[3] = "";
      stringArray0[4] = "_U";
      stringArray0[5] = "_U";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 256, "RuntimeVisibleAnnotations", "\"w?:<),B}m%", "", stringArray0, false, true);
      Object object0 = new Object();
      Object object1 = new Object();
      classWriter0.visitField(54, "", "8'qaAvhg`T9FJcfm", "'8t|l>z", "_U");
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      methodWriter1.visitLdcInsn("Synthetic");
      methodWriter0.visitFrame(54, 8, stringArray0, 7, stringArray0);
      Attribute attribute0 = new Attribute("E.");
      methodWriter1.visitAttribute(attribute0);
      assertSame(methodWriter1, methodWriter0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.4084193668011507
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      stringArray0[2] = "StackMap";
      stringArray0[3] = "";
      stringArray0[4] = "_U";
      stringArray0[5] = "_U";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 256, "RuntimeVisibleAnnotations", "\"w?:<),B}m%", "", stringArray0, false, true);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      Object object0 = new Object();
      Object object1 = new Object();
      classWriter0.visitField(54, "", "8'qaAvhg`T9FJcfm", "'8t|l>z", "_U");
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      methodWriter1.visitLdcInsn("Synthetic");
      methodWriter0.visitFrame(54, 8, stringArray0, 7, stringArray0);
      methodWriter1.visitAnnotationDefault();
      methodWriter0.visitMultiANewArrayInsn("UDo]<M", 66);
      assertSame(methodWriter0, methodWriter1);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Synthetic";
      stringArray0[1] = "StackMap";
      stringArray0[2] = "RuntimeVisibleAnnotations";
      Item[] itemArray0 = new Item[5];
      Item item0 = classWriter0.key3;
      itemArray0[0] = item0;
      Item item1 = classWriter0.newLong(1024);
      itemArray0[1] = item1;
      Item item2 = classWriter0.key2;
      itemArray0[2] = item2;
      Item item3 = classWriter0.newInteger((-1));
      itemArray0[3] = item3;
      Item item4 = classWriter0.newFieldItem("RuntimeVisibleAnnotations", "Synthetic", "StackMap");
      itemArray0[4] = item4;
      classWriter0.typeTable = itemArray0;
      stringArray0[3] = "";
      stringArray0[4] = "l!AsTRekd4/v,r!,-5";
      stringArray0[5] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1024, "StackMap", "<init>", "", stringArray0, false, false);
      methodWriter0.visitVarInsn(1024, 54);
      AnnotationVisitor annotationVisitor0 = methodWriter0.visitAnnotationDefault();
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9371558530657009
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[1] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[2] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[3] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[4] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[5] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[6] = "f*~1NH";
      stringArray0[7] = "org.objectweb.asm.jip.FieldWriter";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-5422), "org.objectweb.asm.jip.FieldWriter", "org.objectweb.asm.jip.FieldWriter", "org.objectweb.asm.jip.FieldWriter", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      methodWriter0.visitIntInsn(20, (byte) (-1));
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(166, "org.objectweb.asm.jip.FieldWriter", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 33
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.152564616149156
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[1] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[2] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[3] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[7] = "y:3(Q'y(dV6QlUR >k";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "y:3(Q'y(dV6QlUR >k", "y:3(Q'y(dV6QlUR >k", "RuntimeVisibleAnnotations", stringArray0, false, false);
      Label label0 = new Label();
      Label label1 = label0.next;
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, (-1309), 1909);
      methodWriter0.visitMethodInsn(0, "g$+qBbs}Z", "g$+qBbs}Z", "y:3(Q'y(dV6QlUR >k");
      Attribute attribute0 = new Attribute("AHj_?IW+XL 5@");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1801999388), "y:3(Q'y(dV6QlUR >k", "<init>", "", stringArray0, false, false);
      MethodWriter methodWriter2 = classWriter0.firstMethod;
      methodWriter2.visitInsn(2);
      methodWriter1.visitLineNumber((-225), label0);
      assertNotSame(methodWriter1, methodWriter0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[1] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[2] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[3] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[7] = "y:3(Q'y(dV6QlUR >k";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "y:3(Q'y(dV6QlUR >k", "y:3(Q'y(dV6QlUR >k", "RuntimeVisibleAnnotations", stringArray0, false, false);
      Label label0 = new Label();
      Label label1 = label0.next;
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, (-1309), 1909);
      methodWriter0.visitMethodInsn(0, "g$+qBbs}Z", "g$+qBbs}Z", "y:3(Q'y(dV6QlUR >k");
      Attribute attribute0 = new Attribute("AHj_?IW+XL 5@");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)54;
      Label label2 = label0.successor;
      methodWriter0.visitTryCatchBlock(label0, (Label) null, (Label) null, "y:3(Q'y(dV6QlUR >k");
      Label label3 = label0.next;
      methodWriter0.visitTryCatchBlock((Label) null, (Label) null, (Label) null, "y:3(Q'y(dV6QlUR >k");
      // Undeclared exception!
      try { 
        methodWriter0.visitLocalVariable("y:3(Q'y(dV6QlUR >k", "y:3(Q'y(dV6QlUR >k", "", (Label) null, (Label) null, 3220);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Item item0 = new Item();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "LocalVariableTable";
      stringArray0[1] = "Synthetic";
      stringArray0[2] = "LocalVariableTable";
      String string0 = "org.objectweb.asm.jip.MethodWriter";
      boolean boolean0 = true;
      Object object0 = new Object();
      Object object1 = new Object();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        MethodWriter.readInt(byteArray0, 619);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 619
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.160532129489085
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "StackMap";
      stringArray0[2] = "StackMap";
      stringArray0[3] = "";
      stringArray0[4] = "_U";
      stringArray0[5] = "_U";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 256, "RuntimeVisibleAnnotations", "\"w?:<),B}m%", "", stringArray0, false, true);
      Object object0 = new Object();
      Object object1 = new Object();
      classWriter0.visitField(54, "", "8'qaAvhg`T9FJcfm", "'8t|l>z", "_U");
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      methodWriter1.visitLdcInsn("Synthetic");
      Attribute attribute0 = new Attribute("?t'|% #@23");
      methodWriter0.visitInsn(8);
      assertSame(methodWriter0, methodWriter1);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.2336841378337722
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "f*~1NH";
      stringArray0[1] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[2] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[3] = "f*~1NH";
      stringArray0[4] = "*\"p";
      stringArray0[5] = "'/F,'?)q|";
      stringArray0[6] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[7] = "'/F,'?)q|";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4, "StackMap", "'/F,'?)q|", "StackMap", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      methodWriter0.visitIntInsn(7, (-1395));
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(2362, ";FFq!gCdp4sk", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9184277849930976
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(60);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "g$+qBbs}Z";
      stringArray0[1] = "g$+qBbs}Z";
      stringArray0[2] = "g$+qBbs}Z";
      stringArray0[3] = "g$+qBbs}Z";
      stringArray0[4] = "g$+qBbs}Z";
      stringArray0[5] = "g$+qBbs}Z";
      stringArray0[6] = "g$+qBbs}Z";
      stringArray0[7] = "g$+qBbs}Z";
      ClassWriter classWriter1 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "g$+qBbs}Z", "g$+qBbs}Z", "g$+qBbs}Z", (String[]) null, false, false);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "g$+qBbs}Z";
      Object[] objectArray1 = new Object[8];
      classWriter0.newMethodItem("LocalVariableTypeTable", "g$+qBbs}Z", "g$+qBbs}Z", true);
      objectArray1[0] = (Object) "g$+qBbs}Z";
      objectArray1[1] = (Object) "g$+qBbs}Z";
      objectArray1[2] = (Object) "g$+qBbs}Z";
      Object object0 = new Object();
      objectArray1[3] = object0;
      objectArray1[4] = (Object) "g$+qBbs}Z";
      objectArray1[5] = (Object) "g$+qBbs}Z";
      objectArray1[6] = (Object) "g$+qBbs}Z";
      objectArray1[7] = (Object) "g$+qBbs}Z";
      methodWriter0.visitFrame(1, (-2623), objectArray0, 1, objectArray1);
      Attribute attribute0 = new Attribute("g$+qBbs}Z");
      methodWriter0.visitAttribute(attribute0);
      assertTrue(attribute0.isUnknown());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[1] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[2] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[3] = "";
      stringArray0[4] = "_U";
      stringArray0[5] = "_U";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 256, "RuntimeVisibleAnnotations", "\"w?:<),B}m%", "", stringArray0, false, true);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      Object object0 = new Object();
      Object object1 = new Object();
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitVarInsn(2, 2);
      Label label0 = new Label();
      methodWriter1.visitTryCatchBlock(label0, label0, (Label) null, "\"afK]N[");
      assertSame(methodWriter1, methodWriter0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[1] = "RuntimeVisibleAnnotations";
      stringArray0[2] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[3] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "y:3(Q'y(dV6QlUR >k";
      stringArray0[7] = "y:3(Q'y(dV6QlUR >k";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "y:3(Q'y(dV6QlUR >k", "y:3(Q'y(dV6QlUR >k", "RuntimeVisibleAnnotations", stringArray0, false, false);
      Label label0 = new Label();
      Label label1 = label0.next;
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 2;
      methodWriter0.visitIincInsn(3879, 1024);
      FileSystemHandling.shouldAllThrowIOExceptions();
      intArray0[2] = 1;
      Label[] labelArray0 = new Label[3];
      labelArray0[0] = null;
      labelArray0[1] = label0;
      labelArray0[2] = label0;
      // Undeclared exception!
      try { 
        methodWriter0.visitLookupSwitchInsn(label0, intArray0, labelArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.598614848252147
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[1] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[2] = "org.objectweb.asm.jip.FieldWriter";
      stringArray0[3] = "";
      stringArray0[4] = "_U";
      stringArray0[5] = "_U";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 256, "RuntimeVisibleAnnotations", "\"w?:<),B}m%", "", stringArray0, true, true);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      Object object0 = new Object();
      Object object1 = new Object();
      classWriter0.visitField(54, "", "8'qaAvhg`T9FJcfm", "'8t|l>z", "_U");
      methodWriter0.visitLdcInsn("Synthetic");
      methodWriter0.visitFrame(54, 8, stringArray0, 7, stringArray0);
      methodWriter0.visitAnnotationDefault();
      methodWriter0.visitMultiANewArrayInsn("UDo]<M", 66);
      // Undeclared exception!
      try { 
        methodWriter0.visitIincInsn((-2448), 54);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2448
         //
         verifyException("org.objectweb.asm.jip.Frame", e);
      }
  }
}
