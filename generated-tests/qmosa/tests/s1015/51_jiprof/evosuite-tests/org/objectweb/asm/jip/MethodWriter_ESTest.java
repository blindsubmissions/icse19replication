/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:10:36 GMT 2018
 */

package org.objectweb.asm.jip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-11);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-92);
      byteArray0[3] = (byte) (-51);
      byteArray0[4] = (byte) (-33);
      byteArray0[5] = (byte) (-89);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-42);
      // Undeclared exception!
      try { 
        MethodWriter.readInt(byteArray0, (byte) (-11));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -11
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)127;
      byteArray0[1] = (byte) (-128);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)67;
      byteArray0[4] = (byte) (-128);
      int int0 = 704;
      // Undeclared exception!
      try { 
        MethodWriter.readShort(byteArray0, 704);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 704
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
      int int0 = 4278;
      // Undeclared exception!
      try { 
        MethodWriter.writeShort((byte[]) null, 1048575, 4278);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
      int[] intArray0 = new int[8];
      intArray0[0] = 1141048066;
      intArray0[1] = 0;
      intArray0[2] = (-2130);
      intArray0[3] = 167;
      intArray0[4] = (-2252);
      intArray0[5] = 25165824;
      intArray0[6] = 1637;
      intArray0[7] = 2816;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 0, 0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(678);
      String string0 = "Deprecated";
      String[] stringArray0 = new String[8];
      stringArray0[0] = "_tAu_w";
      stringArray0[1] = "Deprecated";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "Deprecated";
      stringArray0[5] = "";
      stringArray0[6] = "Deprecated";
      stringArray0[7] = "";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 0, "_tAu_w", "", "Deprecated", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 2812;
      int int0 = (-28);
      intArray0[1] = (-28);
      MethodWriter.getNewOffset(intArray0, intArray0, (-28), 2812);
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter((ClassReader) null, (-28));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.ClassWriter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "$2(K0 ~";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 54, "<init>", "org.objectweb.asm.jip.MethodWriter", "org.objectweb.asm.jip.MethodWriter", stringArray0, false, false);
      methodWriter0.visitMultiANewArrayInsn("org.objectweb.asm.jip.MethodWriter", 25165824);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-2196), "$2(K0 ~", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 34
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      int[] intArray0 = new int[6];
      intArray0[0] = 1637;
      intArray0[4] = 54;
      intArray0[2] = 2816;
      intArray0[3] = 54;
      intArray0[4] = 167;
      intArray0[5] = 1;
      // Undeclared exception!
      try { 
        MethodWriter.getNewOffset(intArray0, (int[]) null, 2301, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0437938808441543
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 230;
      intArray0[2] = 0;
      intArray0[6] = 230;
      intArray0[8] = 16711680;
      Edge edge0 = new Edge();
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-40);
      byteArray0[1] = (byte) (-43);
      ClassWriter classWriter0 = new ClassWriter((byte) (-118));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "*P%+mtou>[%";
      stringArray0[1] = "*P%+mtou>[%";
      stringArray0[2] = "IzVzTb07uPQj*lv:;_";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1720), "IzVzTb07uPQj*lv:;_", "*P%+mtou>[%", "*P%+mtou>[%", stringArray0, false, false);
      methodWriter0.visitFrame(230, 16711680, stringArray0, 395, stringArray0);
      byteArray0[2] = (byte) (-118);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)20;
      byteArray0[5] = (byte) (-81);
      // Undeclared exception!
      try { 
        MethodWriter.readUnsignedShort(byteArray0, 22);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 22
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "$2(K0 ~";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 54, "<init>", "org.objectweb.asm.jip.MethodWriter", "org.objectweb.asm.jip.MethodWriter", stringArray0, false, false);
      methodWriter0.visitMultiANewArrayInsn("org.objectweb.asm.jip.MethodWriter", 25165824);
      AnnotationVisitor annotationVisitor0 = methodWriter0.visitAnnotation("$2(K0 ~", false);
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      ClassWriter classWriter0 = new ClassWriter(248);
      classWriter0.index = 248;
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-43), "IzVzTb07uPQj*lv:;_", "RuntimeVisibleParameterAnnotations", "t4Dy{u~\"pO.", stringArray0, false, false);
      methodWriter0.visitAnnotation("9", false);
      methodWriter0.visitFrame((byte) (-118), (-232), stringArray0, 1, stringArray0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-1500), "IzVzTb07uPQj*lv:;_", "RuntimeVisibleParameterAnnotations", (String) null, stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 54;
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "RuntimeVisibleAnnotations";
      stringArray0[2] = "<init>";
      stringArray0[3] = "";
      stringArray0[4] = "RuntimeVisibleAnnotations";
      stringArray0[5] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1729663574), "<init>", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", stringArray0, false, false);
      classWriter0.lastMethod = methodWriter0;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 6, "<init>", "<init>", "RuntimeVisibleAnnotations", stringArray0, false, false);
      int int1 = (-1004);
      Attribute attribute0 = new Attribute("%Gui.;*FsWt;v");
      methodWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        methodWriter1.visitLineNumber(2, (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8647400965276372
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      ClassWriter classWriter1 = new ClassWriter(66);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "IzVzTb07uPQj*lv:;_";
      stringArray0[1] = "IzVzTb07uPQj*lv:;_";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "boolean";
      stringArray0[5] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter1, (byte) (-118), "IzVzTb07uPQj*lv:;_", "t4Dy{u~\"pO.", "IzVzTb07uPQj*lv:;_", stringArray0, false, false);
      methodWriter0.visitFrame(2, 2, stringArray0, 2, stringArray0);
      byte[] byteArray0 = null;
      // Undeclared exception!
      try { 
        MethodWriter.readUnsignedShort((byte[]) null, 248);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 230;
      intArray0[2] = 0;
      intArray0[6] = 230;
      intArray0[8] = 16711680;
      Edge edge0 = new Edge();
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "!{nydR)MF";
      stringArray0[1] = "!{nydR)MF";
      boolean boolean0 = false;
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "!{nydR)MF", "!{nydR)MF", "n$Ff-k", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitVarInsn((-2133), 18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.Frame", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[1];
      EvoSuiteFile evoSuiteFile0 = null;
      byte[] byteArray0 = null;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      intArray0[0] = 1048575;
      MethodWriter.getNewOffset(intArray0, intArray0, 1048575, 1048575);
      String string0 = "boolean";
      int int0 = 1141048066;
      ClassWriter classWriter0 = new ClassWriter(1141048066);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "<init>";
      stringArray0[1] = "IzVzTb07uPQj*lv:;_";
      stringArray0[2] = "t4Dy{u~\"pO.";
      stringArray0[3] = "-R}6'4<%";
      stringArray0[4] = "-R}6'4<%";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "<init>", "-R}6'4<%", "<init>", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "$2(K0 ~";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 54, "<init>", "org.objectweb.asm.jip.MethodWriter", "org.objectweb.asm.jip.MethodWriter", stringArray0, false, false);
      methodWriter0.visitMultiANewArrayInsn("org.objectweb.asm.jip.MethodWriter", 25165824);
      methodWriter0.visitMultiANewArrayInsn("$2(K0 ~", 25165824);
      methodWriter0.visitAnnotationDefault();
      methodWriter0.visitEnd();
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.7214636866925116
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "$2(K0 ~";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 20, "$2(K0 ~", "org.objectweb.asm.jip.Frame", "QR", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitIntInsn(1, 186);
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "<init>");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.2148896539491203
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(54);
      ClassWriter classWriter1 = new ClassWriter(1);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "^X*W(DGRM<{Rf:f;&";
      stringArray0[1] = "Csekm?V:";
      stringArray0[2] = "!{nydR)MF";
      stringArray0[3] = "";
      stringArray0[4] = "<init>";
      stringArray0[5] = "!{nydR)MF";
      stringArray0[6] = "!{nydR)MF";
      stringArray0[7] = "";
      stringArray0[8] = "&P)o?AAH!j";
      MethodWriter methodWriter0 = new MethodWriter(classWriter1, 2, "_", "Synthetic", "!{nydR)MF", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "xx");
      Integer integer0 = new Integer(3480);
      methodWriter0.visitLdcInsn(integer0);
      methodWriter0.visitVarInsn(2, 2);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6870920273799715
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1141048066;
      intArray0[1] = 0;
      intArray0[2] = (-2130);
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "JZL*eDQG";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 256, "*xy7-7O", "!{nydR)MF", "*xy7-7O", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitInsn((-2130));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2130
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.1432752061942137
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1141048066;
      intArray0[1] = 0;
      intArray0[2] = (-2130);
      ClassWriter classWriter0 = new ClassWriter(723);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1141048066, "!{nydR)MF", "!{nydR)MF", "!{nydR)MF", stringArray0, true, true);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitMultiANewArrayInsn(".7{N L", 2600);
      AnnotationVisitor annotationVisitor0 = methodWriter1.visitAnnotation(".7{N L", true);
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.8760057656431737
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1141048066;
      intArray0[1] = 0;
      intArray0[2] = (-2130);
      ClassWriter classWriter0 = new ClassWriter(723);
      String string0 = "!{nydR)MF";
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1141048066, "!{nydR)MF", "!{nydR)MF", "!{nydR)MF", stringArray0, true, true);
      String string1 = "-Q M-/MO+";
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(63, (-955));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[1];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      intArray0[0] = 1048575;
      MethodWriter.getNewOffset(intArray0, intArray0, 1048575, 1048575);
      ClassWriter classWriter0 = new ClassWriter(46);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      Label label0 = new Label();
      Label label1 = label0.next;
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      Label[] labelArray0 = new Label[9];
      labelArray0[0] = null;
      labelArray0[1] = null;
      labelArray0[2] = null;
      labelArray0[3] = null;
      labelArray0[4] = label0;
      labelArray0[5] = null;
      labelArray0[6] = null;
      labelArray0[7] = label0;
      labelArray0[8] = null;
      // Undeclared exception!
      try { 
        methodWriter1.visitTableSwitchInsn(12, 1048575, label0, labelArray0);
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
  /*Coverage entropy=0.8785250991271565
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 230;
      intArray0[2] = 0;
      intArray0[6] = 230;
      intArray0[8] = 16711680;
      Edge edge0 = new Edge();
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "!{nydR)MF";
      stringArray0[1] = "!{nydR)MF";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "!{nydR)MF", "!{nydR)MF", "n$Ff-k", stringArray0, false, true);
      ClassWriter classWriter1 = new ClassWriter(3729);
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, 230, "tu", "!{nydR)MF", (String) null, stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitInsn(3729);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.Frame", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.7549967581308246
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[1];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      intArray0[0] = 1048575;
      MethodWriter.getNewOffset(intArray0, intArray0, 1048575, 1048575);
      ClassWriter classWriter0 = new ClassWriter(46);
      ClassWriter classWriter1 = new ClassWriter(24);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[1] = "!{nydR)MF";
      stringArray0[2] = "!{nydR)MF";
      stringArray0[3] = "!{nydR)MF";
      stringArray0[4] = "JZL*eDQG";
      stringArray0[5] = "!{nydR)MF";
      stringArray0[6] = "*xy7-7O";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1048575, "JZL*eDQG", "!{nydR)MF", "JZL*eDQG", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitInsn(186);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.Frame", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[1];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      intArray0[0] = 1048575;
      MethodWriter.getNewOffset(intArray0, intArray0, 1048575, 1048575);
      ClassWriter classWriter0 = new ClassWriter(46);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      Label label0 = new Label();
      Label label1 = label0.next;
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      Label[] labelArray0 = new Label[9];
      labelArray0[0] = null;
      labelArray0[1] = null;
      labelArray0[2] = null;
      labelArray0[3] = null;
      labelArray0[4] = label0;
      labelArray0[5] = null;
      labelArray0[6] = null;
      methodWriter1.visitVarInsn(2, 46);
      assertSame(methodWriter1, methodWriter0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.244016695792894
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-924));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Code";
      stringArray0[1] = "org.objectweb.asm.jip.Frame";
      stringArray0[2] = "QR";
      stringArray0[3] = "QR";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 21, "org.objectweb.asm.jip.Frame", "org.objectweb.asm.jip.Frame", "Code", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("EG", "org.objectweb.asm.jip.Frame", (String) null, label0, label0, (-1378));
      methodWriter0.visitIntInsn(20, 21);
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "Code");
      methodWriter0.visitMaxs(183, 15);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[1];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      intArray0[0] = 1048575;
      MethodWriter.getNewOffset(intArray0, intArray0, 1048575, 1048575);
      ClassWriter classWriter0 = new ClassWriter(46);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      classWriter0.newNameType("RuntimeInvisibleParameterAnnotations", "uNR");
      methodWriter0.visitMultiANewArrayInsn("RuntimeInvisibleParameterAnnotations", 6);
      methodWriter0.visitLdcInsn("-Q M-/MO+");
      methodWriter0.visitTypeInsn(230, "RuntimeInvisibleParameterAnnotations");
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0239287996389363
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 1141048066;
      intArray0[0] = 1141048066;
      intArray0[1] = 0;
      intArray0[2] = (-2130);
      ClassWriter classWriter0 = new ClassWriter(723);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1141048066, "!{nydR)MF", "!{nydR)MF", "!{nydR)MF", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn((-2130), "d#", ".jar", "!");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.567200500456373
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int[] intArray0 = new int[1];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      intArray0[0] = 1048575;
      MethodWriter.getNewOffset(intArray0, intArray0, 1048575, 1048575);
      ClassWriter classWriter0 = new ClassWriter(46);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(230);
      ByteVector byteVector1 = byteVector0.putUTF8("2A))[|:Vq8T");
      ByteVector byteVector2 = byteVector1.putLong(0L);
      methodWriter0.put(byteVector2);
      classWriter0.newNameType("RuntimeInvisibleParameterAnnotations", "uNR");
      methodWriter0.visitMethodInsn(230, "::X !{@#Mj4mZl/r:", "d#", "dCr/wkz=KV");
      methodWriter0.visitLdcInsn("RuntimeInvisibleParameterAnnotations");
      methodWriter0.visitInsn(1);
      methodWriter0.visitVarInsn(3480, 3329);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.776045606633246
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[1];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      intArray0[0] = 1048575;
      MethodWriter.getNewOffset(intArray0, intArray0, 1048575, 1048575);
      ClassWriter classWriter0 = new ClassWriter(46);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      methodWriter0.visitIincInsn((-1792168492), 46);
      classWriter0.newNameType("uNR", "+q!blB3");
      methodWriter0.visitMethodInsn((-1840700267), "$2(K0 ~", "u7", "RuntimeInvisibleParameterAnnotations");
      methodWriter0.visitLdcInsn("$2(K0 ~");
      methodWriter0.visitInsn(46);
      methodWriter0.visitVarInsn((-1840700267), 2);
      methodWriter0.visitFieldInsn(3329, "$2(K0 ~", "RuntimeInvisibleParameterAnnotations", "Ljava/lang/Synthetic;");
      methodWriter0.visitFrame((-932), (-2088), stringArray0, (-1840700267), stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.6574837341617348
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[1];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      MethodWriter.getNewOffset(intArray0, intArray0, 1048575, 1048575);
      ClassWriter classWriter0 = new ClassWriter(46);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 24117248, "RuntimeInvisibleParameterAnnotations", "ZbgdV0\u0001Y", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      MethodWriter methodWriter1 = methodWriter0.next;
      classWriter0.firstMethod = null;
      MethodWriter methodWriter2 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "RuntimeInvisibleParameterAnnotations");
      classWriter0.newMethodItem("::X !{@#Mj4mZl/r:", "RuntimeInvisibleParameterAnnotations", "::X !{@#Mj4mZl/r:", false);
      methodWriter0.visitIincInsn(230, 2012);
      classWriter0.newNameType("RuntimeInvisibleParameterAnnotations", "uNR");
      methodWriter2.visitMethodInsn(230, "::X !{@#Mj4mZl/r:", "d#", "dCr/wkz=KV");
      methodWriter2.visitLdcInsn("RuntimeInvisibleParameterAnnotations");
      methodWriter2.visitInsn(1);
      methodWriter2.visitVarInsn(3480, 3329);
      assertFalse(methodWriter2.equals((Object)methodWriter0));
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3667110520552042
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1141048066;
      intArray0[1] = 0;
      intArray0[2] = (-2130);
      ClassWriter classWriter0 = new ClassWriter(723);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1141048066, "!{nydR)MF", "!{nydR)MF", "!{nydR)MF", stringArray0, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 723, "!{nydR)MF", "!{nydR)MF", "`", stringArray0, true, false);
      Label label0 = new Label();
      methodWriter1.visitTryCatchBlock(label0, label0, label0, "Signature");
      Integer integer0 = new Integer((-131));
      methodWriter0.visitLdcInsn("!{nydR)MF");
      methodWriter0.visitVarInsn(0, 3480);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.498839825664811
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1141048066;
      intArray0[1] = (-1);
      intArray0[2] = (-2130);
      ClassWriter classWriter0 = new ClassWriter(723);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "!{nydR)MF";
      stringArray0[1] = "!{nydR)MF";
      stringArray0[2] = "C4b_* s0%c/FD$e9";
      stringArray0[3] = "C4b_* s0%c/FD$e9";
      stringArray0[4] = "!{nydR)MF";
      stringArray0[5] = "!{nydR)MF";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "!{nydR)MF", "!{nydR)MF", "C4b_* s0%c/FD$e9", stringArray0, true, false);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) "C4b_* s0%c/FD$e9";
      methodWriter0.getSize();
      objectArray0[1] = (Object) methodWriter0;
      objectArray0[2] = (Object) (-1);
      objectArray0[3] = (Object) 1141048066;
      objectArray0[4] = (Object) "!{nydR)MF";
      methodWriter0.visitFrame(3215, 0, stringArray0, 1141048066, objectArray0);
      methodWriter0.visitMaxs((-2130), 1);
      methodWriter0.visitMultiANewArrayInsn("!{nydR)MF", (-1623227873));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        methodWriter0.visitLdcInsn(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@35bc94b3
         //
         verifyException("org.objectweb.asm.jip.ClassWriter", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.992281974852574
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 1141048066;
      intArray0[0] = 1141048066;
      intArray0[1] = 0;
      intArray0[2] = (-2130);
      int int1 = 723;
      ClassWriter classWriter0 = new ClassWriter(723);
      String string0 = "!{nydR)MF";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 32, "!{nydR)MF", "!{nydR)MF", "!{nydR)MF", (String[]) null, true, true);
      String string1 = "-Q M-/MO+";
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-2040631732), "-Q M-/MO+", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1141048066;
      intArray0[1] = 0;
      intArray0[2] = (-2130);
      ClassWriter classWriter0 = new ClassWriter(723);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1141048066, "!{nydR)MF", "!{nydR)MF", "!{nydR)MF", stringArray0, true, true);
      methodWriter0.visitMultiANewArrayInsn("-Q M-/MO+", 1);
      methodWriter0.visitLdcInsn("!{nydR)MF");
      methodWriter0.visitTypeInsn(3101, "!{nydR)MF");
      methodWriter0.visitIntInsn(7, 3101);
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      methodWriter0.visitLabel(label0);
      Label[] labelArray0 = new Label[1];
      Label label1 = new Label();
      labelArray0[0] = label1;
      methodWriter0.visitTableSwitchInsn(0, 196, label0, labelArray0);
      methodWriter0.visitIntInsn(1141048066, 149);
      methodWriter0.visitVarInsn(723, 0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.5193826646423012
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1141048066;
      intArray0[1] = 0;
      intArray0[2] = (-2130);
      ClassWriter classWriter0 = new ClassWriter(723);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1141048066, "!{nydR)MF", "!{nydR)MF", "!{nydR)MF", stringArray0, true, true);
      methodWriter0.visitMultiANewArrayInsn("-Q M-/MO+", 1);
      methodWriter0.visitLdcInsn("!{nydR)MF");
      methodWriter0.visitTypeInsn(3101, "!{nydR)MF");
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("org.objectweb.asm.jip.Handler", "org.objectweb.asm.jip.Attribute", "e_>e%v04%", label0, label0, 3);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.9371558530657009
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 230;
      intArray0[2] = 0;
      intArray0[6] = 230;
      intArray0[8] = 16711680;
      Edge edge0 = new Edge();
      ClassWriter classWriter0 = new ClassWriter(1917);
      String[] stringArray0 = new String[6];
      stringArray0[0] = ":A2nEi2U,CnM3";
      stringArray0[1] = "`s:br8S;1 m";
      stringArray0[2] = ":A2nEi2U,CnM3";
      stringArray0[3] = "`s:br8S;1 m";
      stringArray0[4] = ":A2nEi2U,CnM3";
      stringArray0[5] = "`s:br8S;1 m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 177, "`s:br8S;1 m", "`s:br8S;1 m", ":A2nEi2U,CnM3", stringArray0, false, false);
      methodWriter0.visitInsn(18);
      methodWriter0.visitCode();
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putByte((-1888));
      ByteVector byteVector2 = byteVector1.putUTF8("");
      methodWriter0.put(byteVector2);
      assertSame(byteVector0, byteVector2);
  }
}