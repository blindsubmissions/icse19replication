/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:43:54 GMT 2018
 */

package org.objectweb.asm.jip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
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
import org.objectweb.asm.jip.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(55);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "8,se'Vpan";
      stringArray0[1] = "kN,:\u0000)s\"eRJ-%( ";
      stringArray0[2] = "8,se'Vpan";
      stringArray0[3] = "\"Be_q.N?Z2{";
      stringArray0[4] = "\"Be_q.N?Z2{";
      stringArray0[5] = "\"Be_q.N?Z2{";
      stringArray0[6] = "\"Be_q.N?Z2{";
      stringArray0[7] = "8,se'Vpan";
      stringArray0[8] = "8,se'Vpan";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1278, "8,se'Vpan", "\"Be_q.N?Z2{", "\"Be_q.N?Z2{", stringArray0, false, true);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)24;
      byteArray0[2] = (byte) (-13);
      byteArray0[3] = (byte) (-79);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-110);
      byte byte0 = (byte)83;
      byteArray0[6] = (byte)83;
      byteArray0[7] = (byte) (-110);
      // Undeclared exception!
      try { 
        MethodWriter.readShort(byteArray0, 4272);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4272
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-32);
      byteArray0[1] = (byte) (-87);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-87);
      byteArray0[4] = (byte) (-128);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)85;
      byteArray0[7] = (byte) (-127);
      byteArray0[8] = (byte)0;
      int int0 = MethodWriter.readUnsignedShort(byteArray0, 0);
      assertEquals(57513, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "LocalVariableTable";
      stringArray0[1] = "Qu|~";
      stringArray0[2] = "LocalVariableTable";
      stringArray0[3] = "LocalVariableTable";
      stringArray0[4] = "t)x%cR}W";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 0, "LocalVariableTable", "LocalVariableTable", "LocalVariableTable", stringArray0, true, true);
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
      int[] intArray0 = new int[7];
      intArray0[0] = 0;
      intArray0[1] = 3219;
      intArray0[2] = 0;
      intArray0[3] = 1392510721;
      intArray0[4] = 21;
      intArray0[5] = 177;
      intArray0[6] = 2335;
      int[] intArray1 = new int[5];
      intArray1[0] = 3219;
      intArray1[1] = 3219;
      intArray1[2] = 2335;
      intArray1[3] = 3219;
      intArray1[4] = 21;
      // Undeclared exception!
      try { 
        MethodWriter.getNewOffset(intArray0, intArray1, 509, 2335);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
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
      ClassWriter classWriter0 = new ClassWriter(55);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "8,se'Vpan";
      stringArray0[1] = "kN,:\u0000)s\"eRJ-%( ";
      stringArray0[2] = "8,se'Vpan";
      stringArray0[3] = "\"Be_q.N?Z2{";
      stringArray0[4] = "\"Be_q.N?Z2{";
      stringArray0[5] = "\"Be_q.N?Z2{";
      stringArray0[6] = "\"Be_q.N?Z2{";
      int[] intArray0 = new int[6];
      intArray0[0] = 1;
      intArray0[1] = 16;
      intArray0[2] = 15;
      intArray0[3] = 16;
      intArray0[4] = 16;
      intArray0[5] = 1278;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 1278, (-1935905313));
      assertEquals((-1935907933), int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String string0 = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", (String[]) null, false, false);
      methodWriter0.exceptionCount = 49;
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      ByteVector byteVector0 = classWriter0.pool;
      // Undeclared exception!
      try { 
        methodWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(55);
      int int0 = 1278;
      String string0 = "StackMapTable";
      String[] stringArray0 = new String[6];
      stringArray0[0] = "RuntimeVisibleAnnotations";
      stringArray0[1] = "RuntimeVisibleAnnotations";
      stringArray0[2] = "]2";
      stringArray0[3] = "StackMapTable";
      stringArray0[4] = "d*&U$ca#`aB#.f";
      stringArray0[5] = "RuntimeVisibleAnnotations";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2416, "RuntimeVisibleAnnotations", "StackMapTable", "]2", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String string0 = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", (String[]) null, false, false);
      methodWriter0.visitTypeInsn(268435456, "O{5*%C(y1ce+jKoL}c");
      methodWriter0.exceptionCount = 49;
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      ByteVector byteVector0 = classWriter0.pool;
      // Undeclared exception!
      try { 
        methodWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1460067907067866
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-889));
      ClassWriter classWriter1 = new ClassWriter((-889));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "kN,:\u0000)s\"eRJ-%( ";
      stringArray0[1] = "org.objectweb.asm.jip.MethodWriter";
      stringArray0[2] = "\"Be_q.N?Z2{";
      stringArray0[3] = "\"Be_q.N?Z2{";
      stringArray0[4] = "\"Be_q.N?Z2{";
      stringArray0[5] = ",2' Iinj)@nrk>a:u";
      stringArray0[6] = "\"Be_q.N?Z2{";
      stringArray0[7] = "<init>";
      stringArray0[8] = "\"Be_q.N?Z2{";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1392510721, "org.objectweb.asm.jip.MethodWriter", "kN,:\u0000)s\"eRJ-%( ", "8,se'Vpan", stringArray0, true, false);
      MethodWriter methodWriter1 = methodWriter0.next;
      methodWriter0.getSize();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)75;
      byteArray0[1] = (byte) (-52);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)16;
      byteArray0[4] = (byte)118;
      byteArray0[5] = (byte) (-24);
      byteArray0[6] = (byte) (-1);
      byteArray0[7] = (byte)92;
      byteArray0[8] = (byte)52;
      // Undeclared exception!
      try { 
        MethodWriter.writeShort(byteArray0, (byte)92, 12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 92
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      int int0 = 4096;
      // Undeclared exception!
      try { 
        MethodWriter.readInt((byte[]) null, 4096);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "", "", "", (String[]) null, false, false);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 18, "SexD?|R2jY{p", "cS", "Ljava/lang/Synthetic;", stringArray0, false, false);
      MethodWriter methodWriter2 = methodWriter0.next;
      int int0 = methodWriter2.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6615632381579821
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newField("hyo,", "LocalVariableTypeTable", "");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "hyo,";
      stringArray0[3] = "";
      stringArray0[4] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "LocalVariableTypeTable", "<init>", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-124);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-95);
      byteArray0[3] = (byte) (-124);
      ByteVector byteVector1 = byteVector0.putByte(1);
      methodWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "", "", "", (String[]) null, false, false);
      classWriter0.index = 16777219;
      Label label0 = new Label();
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      intArray0[1] = 1;
      intArray0[4] = 2;
      intArray0[3] = (-1);
      intArray0[4] = 1;
      intArray0[5] = 1;
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter.getNewOffset(intArray0, intArray0, (-1), 1);
      // Undeclared exception!
      try { 
        methodWriter0.visitLocalVariable("", (String) null, "", label0, label0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "", "", "", (String[]) null, false, false);
      Label label0 = new Label();
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      methodWriter0.visitAnnotation("X.%keu((W0", true);
      intArray0[1] = 1;
      intArray0[4] = 2;
      intArray0[3] = (-1);
      intArray0[4] = 1;
      intArray0[5] = 1;
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putByte(12);
      methodWriter0.put(byteVector0);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-301), "ZV[mIN8k", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9562373310679899
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", (String[]) null, false, false);
      methodWriter0.visitTypeInsn(268435456, "O{5*%C(y1ce+jKoL}c");
      methodWriter0.exceptionCount = 49;
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 0, "", "O{5*%C(y1ce+jKoL}c", "O{5*%C(y1ce+jKoL}c", (String[]) null, false, false);
      MethodWriter methodWriter2 = methodWriter0.next;
      MethodWriter methodWriter3 = methodWriter2.next;
      methodWriter1.getSize();
      Label label0 = null;
      // Undeclared exception!
      try { 
        methodWriter0.visitLineNumber(1, (Label) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String string0 = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", (String[]) null, false, false);
      methodWriter0.exceptionCount = 49;
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[8];
      methodWriter0.visitFieldInsn((-2712), "", "", "");
      byteArray0[0] = (byte)66;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)54;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)54;
      byteArray0[5] = (byte)18;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)73;
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        methodWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.1189688668816267
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "", "", "", (String[]) null, false, false);
      classWriter0.index = 16777219;
      Label label0 = new Label();
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      intArray0[1] = 1;
      intArray0[4] = 2;
      intArray0[3] = (-1);
      intArray0[4] = 1;
      intArray0[5] = 1;
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-1), 1);
      assertEquals(5, int0);
      
      int int1 = methodWriter0.getSize();
      assertEquals(28, int1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), ")V", "", ")V", (String[]) null, false, false);
      classWriter0.newFieldItem("{;}G3d7py!#6C", "Bi|QvLsu", "");
      int int0 = MethodWriter.SAME_FRAME;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 33554432, "Bi|QvLsu", "Ljava/lang/Synthetic;", "ZV[mIN8k", (String[]) null, false, false);
      methodWriter0.visitCode();
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", (String[]) null, false, false);
      methodWriter0.visitMaxs(2, 1048575);
      methodWriter0.visitIincInsn((-1586), 267386880);
      Label label0 = new Label();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Object object0 = new Object();
      label0.info = object0;
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9911388966130941
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[2];
      Label label0 = new Label();
      Label label1 = label0.next;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter((-782));
      MethodWriter.getNewOffset(intArray0, intArray0, 2727, 410);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "SgI(]";
      stringArray0[1] = ",2' Iinj)@nrk>a:u";
      stringArray0[2] = "{U7D#_tFVC1hH_";
      stringArray0[3] = "{U7D#_tFVC1hH_";
      stringArray0[4] = "SgI(]";
      stringArray0[5] = "{U7D#_tFVC1hH_";
      stringArray0[6] = "SgI(]";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 410, "SgI(]", "{U7D#_tFVC1hH_", "{U7D#_tFVC1hH_", stringArray0, false, false);
      methodWriter0.visitIincInsn(410, (-2317));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "", "", "", (String[]) null, false, false);
      Label label0 = new Label();
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      methodWriter1.put(byteVector0);
      int[] intArray0 = new int[4];
      intArray0[1] = 2;
      Object object0 = new Object();
      Label[] labelArray0 = new Label[3];
      labelArray0[0] = label0;
      labelArray0[1] = label0;
      labelArray0[2] = label0;
      methodWriter1.visitLookupSwitchInsn(label0, intArray0, labelArray0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.1209503926735835
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(132);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2456, "qT0gM>y]CP", "LineNumberTable", "LocalVariableTable", (String[]) null, false, false);
      methodWriter0.visitTypeInsn((-1132), "");
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = classWriter0.pool;
      methodWriter0.put(byteVector1);
      int int0 = methodWriter0.getSize();
      assertEquals(37, int0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "Mz*Pvv_:+", "", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitVarInsn((-1), 1443168256);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      // Undeclared exception!
      try { 
        label0.getOffset();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Label offset position has not been resolved yet
         //
         verifyException("org.objectweb.asm.jip.Label", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = (-1);
      ClassWriter classWriter0 = new ClassWriter((-1));
      boolean boolean0 = false;
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "", "", "", (String[]) null, false, false);
      Label label0 = new Label();
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      String string0 = "X.%keu((W0";
      methodWriter0.visitAnnotation("RuntimeInvisibleParameterAnnotations", true);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putByte(18);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame((-1), (-1), (Object[]) null, (-3593), (Object[]) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.1421200429883351
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "", "", "", (String[]) null, false, false);
      Label label0 = new Label();
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      methodWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putByte((-1));
      ByteVector byteVector2 = byteVector1.putByteArray((byte[]) null, 57, 1);
      methodWriter0.put(byteVector2);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-1), "Synthetic", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3143738430069454
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "", "", "", (String[]) null, false, false);
      classWriter0.index = 16777219;
      Label label0 = new Label();
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      intArray0[1] = (-1);
      intArray0[3] = (-1);
      intArray0[4] = 1;
      intArray0[5] = 1;
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter.getNewOffset(intArray0, intArray0, (-1), (-1));
      methodWriter0.getSize();
      methodWriter0.visitLabel(label0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "", "", "", (String[]) null, false, false);
      Label label0 = new Label();
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      methodWriter1.put(byteVector0);
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      intArray0[3] = (-1);
      intArray0[4] = (-1);
      intArray0[5] = (-1);
      MethodWriter.getNewOffset(intArray0, intArray0, (-1), 2);
      methodWriter0.visitLocalVariable("|&!MC40Ve", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", label0, label0, (-1));
      assertSame(methodWriter0, methodWriter1);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.9110175397125628
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)79;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)126;
      byteArray0[3] = (byte)54;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitAnnotationDefault();
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 1;
      intArray0[4] = 2;
      intArray0[3] = 0;
      methodWriter0.visitVarInsn(1, 0);
      intArray0[4] = 1;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Object object0 = new Object();
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", (String[]) null, false, false);
      methodWriter0.visitTypeInsn(268435456, "O{5*%C(y1ce+jKoL}c");
      methodWriter0.exceptionCount = 49;
      methodWriter0.visitVarInsn(131072, 15);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Object object0 = new Object();
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("O{5*%C(y1ce+jKoL}c");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.2968916284109153
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "", "", (String[]) null, false, false);
      Label label0 = new Label();
      int[] intArray0 = new int[10];
      intArray0[0] = 0;
      intArray0[1] = 1;
      intArray0[4] = 2;
      intArray0[3] = 0;
      methodWriter0.visitVarInsn(1443168256, 0);
      intArray0[4] = 1;
      intArray0[5] = 1;
      methodWriter0.visitMaxs((-1115), (-35));
      methodWriter0.visitIincInsn(68, 0);
      Label label1 = new Label();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Object object0 = new Object();
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("6UX0r~ms=P W{");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }
}