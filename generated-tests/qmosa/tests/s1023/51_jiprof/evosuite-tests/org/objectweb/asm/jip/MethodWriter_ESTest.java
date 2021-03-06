/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:36:34 GMT 2018
 */

package org.objectweb.asm.jip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-51);
      byteArray0[0] = (byte) (-51);
      byteArray0[1] = (byte)0;
      int int0 = 0;
      MethodWriter.readShort(byteArray0, 0);
      ClassWriter classWriter0 = new ClassWriter(212);
      String[] stringArray0 = new String[5];
      stringArray0[0] = null;
      stringArray0[1] = null;
      stringArray0[2] = "";
      stringArray0[3] = "gD<K{N1z";
      stringArray0[4] = "";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (byte)0, (String) null, "", (String) null, stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        MethodWriter.writeShort(byteArray0, (-398), (-398));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -398
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
      int int0 = 0;
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "java/lang/dyn/Dynamic";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 0, "e rC*B", "java/lang/dyn/Dynamic", "-:m|mS", stringArray0, true, true);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)12;
      byteArray0[1] = (byte)11;
      byteArray0[2] = (byte)67;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)83;
      byteArray0[5] = (byte) (-95);
      byteArray0[6] = (byte)0;
      // Undeclared exception!
      try { 
        MethodWriter.readUnsignedShort(byteArray0, (byte)83);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 83
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "<r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "", "r]3]k? J", "r]3]k? J", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(188, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)40;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)74;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-120);
      byte byte0 = (byte)0;
      byteArray0[7] = (byte)0;
      int int0 = 0;
      MethodWriter.readInt(byteArray0, 0);
      MethodWriter.readInt(byteArray0, (byte)0);
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
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(76);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "`w@Mp+_*";
      stringArray0[2] = "e rC*B";
      stringArray0[3] = "`w@Mp+_*";
      stringArray0[4] = "";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 247, "", "`w@Mp+_*", "", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-3507);
      intArray0[1] = Integer.MAX_VALUE;
      intArray0[2] = (-1750);
      intArray0[3] = 1052;
      intArray0[4] = (-1750);
      intArray0[5] = 0;
      intArray0[6] = (-267);
      intArray0[7] = (-788);
      MethodWriter.getNewOffset(intArray0, intArray0, 0, (-572));
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "K2q}.";
      stringArray0[1] = "";
      stringArray0[2] = "K2q}.";
      stringArray0[3] = "K2q}.";
      stringArray0[4] = "";
      stringArray0[5] = "K2q}.";
      stringArray0[6] = "K2q}.";
      boolean boolean0 = true;
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-167), "K2q}.", "K2q}.", "", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.47413931305783735
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "L93e#o9zjyc~mK";
      stringArray0[1] = "L93e#o9zjyc~mK";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "L93e#o9zjyc~mK", "L93e#o9zjyc~mK", "L93e#o9zjyc~mK", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(0, "", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-3507);
      intArray0[1] = Integer.MAX_VALUE;
      intArray0[2] = (-1750);
      intArray0[3] = 1052;
      intArray0[4] = (-1750);
      intArray0[5] = 0;
      intArray0[6] = (-267);
      intArray0[7] = (-788);
      int int0 = 0;
      MethodWriter.getNewOffset(intArray0, intArray0, 0, (-572));
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.version = (-267);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1052, "^uW6zgq", "RuntimeVisibleParameterAnnotations", (String) null, stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-3507);
      intArray0[1] = Integer.MAX_VALUE;
      intArray0[2] = (-1750);
      intArray0[3] = 1049;
      intArray0[4] = (-1750);
      intArray0[5] = 0;
      intArray0[6] = (-267);
      intArray0[7] = (-788);
      MethodWriter.getNewOffset(intArray0, intArray0, 0, (-572));
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "K2q}.";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "K2q}.";
      stringArray0[4] = "";
      stringArray0[5] = "K2q}.";
      stringArray0[6] = "K2q}.";
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {(-3507), Integer.MAX_VALUE, (-1750), 1049, (-1750), 0, (-267), (-788)}, intArray0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "r]3]k? J";
      stringArray0[1] = "<r";
      stringArray0[2] = "r]3]k? J";
      stringArray0[3] = "r]3]k? J";
      stringArray0[4] = "<r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 196, "<r", "<r", "<r", stringArray0, false, false);
      methodWriter0.classReaderOffset = 9;
      methodWriter0.visitFrame(3033, 3176, stringArray0, (-2), stringArray0);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(188, "", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "r]3]k? J";
      stringArray0[1] = "<r";
      stringArray0[2] = "r]3]k? J";
      stringArray0[3] = "r]3]k? J";
      stringArray0[4] = "<r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 196, "<r", "<r", "<r", stringArray0, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 169, "r]3]k? J", (String) null, "3b", stringArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 2192;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "_M6dU .%*BQ<$pM");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "_M6dU .%*BQ<$pM");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "<r");
      ClassWriter classWriter0 = new ClassWriter(2192);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3033, "<r", "<r", ".JAR", stringArray0, false, false);
      methodWriter0.visitCode();
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassWriter classWriter1 = new ClassWriter((-3889));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "<r";
      stringArray0[1] = "5*Pq(o+7c1~|Mfw3";
      stringArray0[2] = "<r";
      stringArray0[3] = "5*Pq(o+7c1~|Mfw3";
      MethodWriter methodWriter0 = new MethodWriter(classWriter1, 2, "StackMapTable", "5*Pq(o+7c1~|Mfw3", "r]3]k? J", stringArray0, false, false);
      methodWriter0.visitIincInsn(64, 4);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put11(1, 18);
      ByteVector byteVector2 = byteVector1.putInt(21);
      assertSame(byteVector0, byteVector2);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.8369882167858358
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "L93e#o9zjyc~mK";
      stringArray0[1] = "L93e#o9zjyc~mK";
      stringArray0[2] = "L93e#o9zjyc~mK";
      stringArray0[3] = "L93e#o9zjyc~mK";
      stringArray0[4] = "L93e#o9zjyc~mK";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 64, "L93e#o9zjyc~mK", "L93e#o9zjyc~mK", "L93e#o9zjyc~mK", stringArray0, false, false);
      methodWriter0.getSize();
      methodWriter0.visitAnnotation("L93e#o9zjyc~mK", false);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(4705, "L93e#o9zjyc~mK", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9164648855394713
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 2192;
      intArray0[1] = 2192;
      intArray0[2] = 1282;
      intArray0[3] = 64;
      ClassWriter classWriter0 = new ClassWriter(2192);
      String string0 = "RuntimeVisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "RuntimeVisibleParameterAnnotations", "9;Md~=d@v2`", "<r", (String[]) null, false, false);
      methodWriter0.visitIincInsn((-1645), 1207);
      // Undeclared exception!
      try { 
        methodWriter0.visitLdcInsn(classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.objectweb.asm.jip.ClassWriter@5
         //
         verifyException("org.objectweb.asm.jip.ClassWriter", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[8];
      ClassWriter classWriter0 = new ClassWriter((-267));
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(8, intArray0.length);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8082699580001821
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "e rC*B");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "l)K %&Q\u0001z";
      stringArray0[1] = "org.objectweb.asm.jip.ClassAdapter";
      stringArray0[2] = "java/lang/dyn/Dynamic";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 126, "org.objectweb.asm.jip.ByteVector", "l)K %&Q\u0001z", "e rC*B", stringArray0, false, true);
      methodWriter0.visitTypeInsn(1646, "org.objectweb.asm.jip.ByteVector");
      // Undeclared exception!
      try { 
        methodWriter0.visitLabel((Label) null);
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
  /*Coverage entropy=1.3795824068593738
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      ClassWriter classWriter1 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "$ ,mk", "?dK", "'m]AP(1*,0.R%r!j", (String[]) null, false, false);
      methodWriter0.visitLdcInsn("'m]AP(1*,0.R%r!j");
      Label label0 = new Label();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "$ ,mk", "RuntimeVisibleParameterAnnotations", "RuntimeVisibleParameterAnnotations", (String[]) null, false, false);
      methodWriter1.getSize();
      MethodWriter methodWriter2 = classWriter0.lastMethod;
      methodWriter2.visitAnnotation("$ ,mk", false);
      // Undeclared exception!
      try { 
        methodWriter1.visitParameterAnnotation(2, "WJRtlU_D$IGvnO6", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 34
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9957374991778267
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "r]3]k? J";
      stringArray0[1] = "<r";
      stringArray0[2] = "r]3]k? J";
      stringArray0[3] = "r]3]k? J";
      stringArray0[4] = "<r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 196, "<r", "<r", "<r", stringArray0, false, false);
      int int0 = 188;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "RuntimeVisibleParameterAnnotations");
      Object[] objectArray0 = new Object[5];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) "r]3]k? J";
      objectArray0[2] = (Object) "<r";
      Object object1 = new Object();
      objectArray0[3] = object1;
      objectArray0[4] = (Object) classWriter0;
      methodWriter0.visitFrame(188, 0, (Object[]) null, 2, objectArray0);
      methodWriter0.classReaderOffset = 9;
      String string0 = "";
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(3033, 3176, stringArray0, (-2), stringArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.8082699580001821
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "l)K %&Q\u0001z";
      stringArray0[1] = "org.objectweb.asm.jip.ClassAdapter";
      stringArray0[2] = "java/lang/dyn/Dynamic";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 126, "org.objectweb.asm.jip.ByteVector", "l)K %&Q\u0001z", "e rC*B", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitLineNumber(4818, (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.8979457248567797
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-3507);
      ClassWriter classWriter0 = new ClassWriter(649);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 649, "<init>", "COv9!RoQIrY@", "28", (String[]) null, false, false);
      methodWriter0.visitAnnotation("WJRtlU_D$IGvnO6", true);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      // Undeclared exception!
      try { 
        methodWriter1.visitParameterAnnotation(64, "L", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Y8dQ.x63%{^Zo";
      stringArray0[1] = "Y8dQ.x63%{^Zo";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Y8dQ.x63%{^Zo", "Y8dQ.x63%{^Zo", "Y8dQ.x63%{^Zo", stringArray0, false, false);
      methodWriter0.visitTypeInsn(0, "Y8dQ.x63%{^Zo");
      // Undeclared exception!
      try { 
        methodWriter0.visitLabel((Label) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 2192;
      intArray0[1] = 24117248;
      intArray0[2] = 1282;
      ClassWriter classWriter0 = new ClassWriter(24117248);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "RuntimeVisibleParameterAnnotations", "9;Md~=d@v2`", "<r", (String[]) null, false, false);
      methodWriter0.visitAnnotationDefault();
      methodWriter0.visitIincInsn(16777221, 64);
      ByteVector byteVector0 = new ByteVector();
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2253));
      String[] stringArray0 = new String[8];
      stringArray0[0] = "L2g93e#o9zjyc~mK";
      stringArray0[1] = "<8nt>";
      stringArray0[2] = "L2g93e#o9zjyc~mK";
      stringArray0[3] = "<8nt>";
      stringArray0[4] = "AnnotationDefault";
      stringArray0[5] = "<8nt>";
      stringArray0[6] = "orgeobjectweb.am.jip.Type";
      stringArray0[7] = "L2g93e#o9zjyc~mK";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-572), "<8nt>", "<8nt>", "orgeobjectweb.am.jip.Type", stringArray0, false, false);
      methodWriter0.visitMaxs(1536, (-2253));
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-572), "\"#MXgQ%Vs[\"vuJ-U/(", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3878000314952637
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      ClassWriter classWriter1 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter1, 1, "'m]XPw1*,0.R%r!j", "$ ,mk", "?dK", (String[]) null, false, false);
      MethodWriter methodWriter1 = classWriter1.firstMethod;
      Integer integer0 = new Integer((-3475));
      Integer.compare((-1149338201), 182);
      methodWriter1.visitLdcInsn(integer0);
      Label label0 = new Label();
      methodWriter0.visitVarInsn(2, 2);
      Label[] labelArray0 = new Label[2];
      labelArray0[1] = label0;
      int[] intArray0 = new int[8];
      intArray0[0] = 403;
      intArray0[1] = 64;
      intArray0[2] = 1727;
      intArray0[3] = (-3475);
      intArray0[5] = 1727;
      methodWriter0.visitJumpInsn(2, label0);
      methodWriter1.visitVarInsn((-3475), (-3475));
      methodWriter0.visitMultiANewArrayInsn("'m]XPw1*,0.R%r!j", 247);
      assertSame(methodWriter0, methodWriter1);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.1615913343294533
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "r]3]k? J";
      stringArray0[1] = "<r";
      stringArray0[2] = "r]3]k? J";
      stringArray0[3] = "r]3]k? J";
      stringArray0[4] = "<r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 196, "<r", "<r", "<r", stringArray0, false, false);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "RuntimeVisibleParameterAnnotations");
      Object object0 = new Object();
      Object object1 = new Object();
      Frame frame0 = new Frame();
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(2, label0);
      methodWriter0.visitVarInsn(1, 7);
      methodWriter0.visitEnd();
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.3460233340185128
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      ClassWriter classWriter1 = new ClassWriter(2);
      boolean boolean0 = false;
      MethodWriter methodWriter0 = new MethodWriter(classWriter1, 1, "'m]XPw1*,0.R%r!j", "$ ,mk", "?dK", (String[]) null, false, false);
      MethodWriter methodWriter1 = classWriter1.firstMethod;
      Integer integer0 = new Integer((-3475));
      Integer.compare((-1149338212), 182);
      methodWriter1.visitLdcInsn(integer0);
      Label label0 = new Label();
      methodWriter0.visitVarInsn(2, 2);
      Label[] labelArray0 = new Label[2];
      Object object0 = new Object();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) methodWriter1;
      objectArray0[1] = (Object) "'m]XPw1*,0.R%r!j";
      objectArray0[2] = (Object) classWriter0;
      objectArray0[3] = (Object) integer0;
      methodWriter0.visitFrame(2, (-1949), objectArray0, (-1473748160), labelArray0);
      // Undeclared exception!
      try { 
        methodWriter1.visitFrame((-1913920455), 1727, objectArray0, 1, (Object[]) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0337005498525014
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "r]3]k? J";
      stringArray0[1] = "<r";
      stringArray0[2] = "r]3]k? J";
      stringArray0[3] = "r]3]k? J";
      stringArray0[4] = "<r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 196, "<r", "<r", "<r", stringArray0, false, false);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "RuntimeVisibleParameterAnnotations");
      Object object0 = new Object();
      Object object1 = new Object();
      Frame frame0 = new Frame();
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(2, label0);
      methodWriter0.visitVarInsn(1, 7);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.8369882167858358
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = 0;
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = " Zq9";
      stringArray0[1] = " Zq9";
      stringArray0[2] = "r]3]k? J";
      stringArray0[3] = "<init>";
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)86;
      byteArray0[2] = (byte)85;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)64;
      byteArray0[5] = (byte)4;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      stringArray0[4] = "org.objectweb.asm.jip.Type";
      stringArray0[5] = "fU~s";
      byte[] byteArray1 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray1);
      stringArray0[6] = "r]3]k? J";
      boolean boolean0 = false;
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "AnnotationDefault", " Zq9", " Zq9", stringArray0, false, false);
      methodWriter0.visitIincInsn(2, 0);
      Frame frame0 = new Frame();
      Label label0 = frame0.owner;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) null;
      objectArray0[1] = (Object) " Zq9";
      objectArray0[2] = (Object) "AnnotationDefault";
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 2099, objectArray0, (-2068404827), stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.162225544921092
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2253));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "<8nt>";
      stringArray0[1] = "java/lang/Class";
      stringArray0[2] = "L2g93e#o9zjyc~mK";
      stringArray0[3] = "java/lang/Class";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1667), "java/lang/Class", "8+J'8*eAvc:Y/Md", "L2g93e#o9zjyc~mK", stringArray0, false, false);
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      Integer integer0 = new Integer(86);
      Integer.compare((-564), 1);
      methodWriter1.visitLdcInsn("java/lang/Class");
      Label label0 = new Label();
      methodWriter1.visitVarInsn(166, 7);
      // Undeclared exception!
      try { 
        methodWriter1.visitJumpInsn((-564), (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.7214636866925116
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "r]3]k? J";
      stringArray0[1] = "<r";
      stringArray0[2] = "r]3]k? J";
      stringArray0[3] = "r]3]k? J";
      stringArray0[4] = "<r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 196, "<r", "<r", "<r", stringArray0, false, false);
      Object[] objectArray0 = new Object[5];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) "r]3]k? J";
      objectArray0[2] = (Object) "<r";
      Object object1 = new Object();
      objectArray0[3] = object1;
      objectArray0[4] = (Object) classWriter0;
      methodWriter0.visitFrame(188, 0, (Object[]) null, 2, objectArray0);
      methodWriter0.classReaderOffset = 9;
      Label label0 = new Label();
      Label label1 = label0.getFirst();
      methodWriter0.visitLabel(label1);
      assertSame(label0, label1);
  }
}
