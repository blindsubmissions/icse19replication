/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:03:26 GMT 2018
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
import org.objectweb.asm.jip.ByteVector;
import org.objectweb.asm.jip.ClassReader;
import org.objectweb.asm.jip.ClassWriter;
import org.objectweb.asm.jip.Edge;
import org.objectweb.asm.jip.FieldWriter;
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
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      // Undeclared exception!
      try { 
        MethodWriter.readInt(byteArray0, (-495));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -495
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-61);
      byteArray0[2] = (byte)68;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)49;
      byteArray0[5] = (byte) (-38);
      byteArray0[6] = (byte)55;
      // Undeclared exception!
      try { 
        MethodWriter.readUnsignedShort(byteArray0, (byte)68);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 68
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte) (-26);
      byteArray0[2] = (byte) (-38);
      MethodWriter.writeShort(byteArray0, 0, (byte) (-38));
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-38), (byte) (-38)}, byteArray0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)97;
      byte byte0 = (byte) (-89);
      byteArray0[1] = (byte) (-89);
      // Undeclared exception!
      try { 
        MethodWriter.readShort(byteArray0, (byte)97);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 97
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "", "", "", stringArray0, false, true);
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
      int int0 = 0;
      Object[] objectArray0 = new Object[2];
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "org.objectweb.asm.jip.MethodWriter", "org.objectweb.asm.jip.MethodWriter", "org.objectweb.asm.jip.MethodWriter", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 0;
      intArray0[1] = 1294;
      intArray0[2] = 285212676;
      int[] intArray1 = new int[8];
      intArray1[0] = 1294;
      intArray1[1] = 285212676;
      intArray1[2] = 285212676;
      intArray1[3] = 1294;
      int int0 = MethodWriter.getNewOffset(intArray1, intArray0, 285212676, 1975);
      assertEquals((-570424671), int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "^(";
      stringArray0[2] = "";
      stringArray0[3] = "double";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 54, "^(", "double", "", stringArray0, false, false);
      methodWriter0.visitMultiANewArrayInsn("^(", 59);
      // Undeclared exception!
      try { 
        methodWriter0.put((ByteVector) null);
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
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2247));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^(";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2247), "rY%0><", "^(", "rY%0><", stringArray0, false, false);
      MethodWriter methodWriter1 = methodWriter0.next;
      MethodWriter methodWriter2 = classWriter0.lastMethod;
      // Undeclared exception!
      try { 
        methodWriter2.visitParameterAnnotation(0, "int", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "^(";
      stringArray0[2] = "";
      stringArray0[3] = "double";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 54, "^(", "double", "", stringArray0, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "^(", "", "", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1935847436));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[1] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[2] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[3] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[4] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[5] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[6] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[7] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[8] = "U`F)khGLfb31-t\"m3qf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-5041), "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", stringArray0, false, false);
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      int[] intArray0 = new int[4];
      intArray0[0] = (-5041);
      intArray0[1] = (-1935847436);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitInsn((-3952));
      // Undeclared exception!
      try { 
        methodWriter1.visitParameterAnnotation((-1935847436), "H!WaH1P", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 4563;
      ClassWriter classWriter0 = new ClassWriter(4563);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1574), "ixFjVql", "StackMapTable", "ixFjVql", (String[]) null, false, false);
      MethodWriter methodWriter1 = methodWriter0.next;
      MethodWriter methodWriter2 = classWriter0.lastMethod;
      // Undeclared exception!
      try { 
        methodWriter2.visitParameterAnnotation(693, "int", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3));
      boolean boolean0 = false;
      String[] stringArray0 = new String[9];
      stringArray0[0] = "8zA94E*&Eq";
      stringArray0[1] = "8zA94E*&Eq";
      stringArray0[2] = "org.objectweb.asm.jip.Attribute";
      stringArray0[3] = "8zA94E*&Eq";
      stringArray0[4] = "org.objectweb.asm.jip.Attribute";
      stringArray0[5] = "8zA94E*&Eq";
      stringArray0[6] = "[S4Gv3}2";
      stringArray0[7] = "org.objectweb.asm.jip.Attribute";
      stringArray0[8] = "Dr-eRc7:.d.c,1g";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3), "8zA94E*&Eq", "8zA94E*&Eq", "org.objectweb.asm.jip.Attribute", stringArray0, false, false);
      methodWriter0.getSize();
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      // Undeclared exception!
      try { 
        methodWriter1.visitParameterAnnotation(2, "[rp5=+R)>o3}3(C9", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "^(";
      stringArray0[2] = "";
      stringArray0[3] = "double";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 54, "^(", "double", "", stringArray0, false, false);
      int int0 = 59;
      methodWriter0.visitMultiANewArrayInsn("^(", 59);
      String string0 = "value ";
      String string1 = "[rp5=+R)>o3}3(C9";
      Label label0 = new Label();
      Label label1 = label0.successor;
      // Undeclared exception!
      try { 
        methodWriter0.visitLineNumber((-128), (Label) null);
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
  /*Coverage entropy=1.0063856698202596
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2247));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^(";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2247), "rY%0><", "^(", "rY%0><", stringArray0, false, false);
      MethodWriter methodWriter1 = methodWriter0.next;
      int int0 = 0;
      MethodWriter methodWriter2 = classWriter0.lastMethod;
      methodWriter2.classReaderLength = (-1976);
      methodWriter2.visitAnnotation("rY%0><", true);
      methodWriter2.getSize();
      // Undeclared exception!
      try { 
        methodWriter2.visitParameterAnnotation(0, "int", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "8zA94E*&Eq";
      stringArray0[1] = "8zA94E*&Eq";
      stringArray0[2] = "org.objectweb.asm.jip.Attribute";
      stringArray0[3] = "8zA94E*&Eq";
      stringArray0[4] = "org.objectweb.asm.jip.Attribute";
      stringArray0[5] = "8zA94E*&Eq";
      stringArray0[6] = "[S4Gv3}2";
      stringArray0[7] = "org.objectweb.asm.jip.Attribute";
      stringArray0[8] = "Dr-eRc7:.d.c,1g";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3), "8zA94E*&Eq", "8zA94E*&Eq", "org.objectweb.asm.jip.Attribute", stringArray0, false, false);
      methodWriter0.getSize();
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      // Undeclared exception!
      try { 
        methodWriter0.visitLocalVariable("8zA94E*&Eq", "8zA94E*&Eq", "{u`Zj+)T+q9M", (Label) null, (Label) null, (-16777216));
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
  /*Coverage entropy=0.9779252266210214
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1935847436));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[1] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[2] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[3] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[4] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[5] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[6] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[7] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[8] = "U`F)khGLfb31-t\"m3qf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-5041), "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", stringArray0, false, true);
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      int[] intArray0 = new int[4];
      intArray0[0] = (-5041);
      intArray0[1] = (-1935847436);
      intArray0[2] = (-1935847436);
      intArray0[3] = (-5041);
      classWriter0.visit((-165), (-1935847436), "U`F)khGLfb31-t\"m3qf", "b<B7k+j", "U`F)khGLfb31-t\"m3qf", stringArray0);
      Label[] labelArray0 = new Label[5];
      labelArray0[0] = null;
      labelArray0[1] = null;
      labelArray0[2] = null;
      labelArray0[3] = null;
      methodWriter0.visitMultiANewArrayInsn("U`F)khGLfb31-t\"m3qf", (-565));
      labelArray0[4] = null;
      // Undeclared exception!
      try { 
        methodWriter0.visitLookupSwitchInsn((Label) null, intArray0, labelArray0);
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
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = 1;
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 436, "U8&5+Gx", "3`fH|mw)0%_j3Ek<-", "StackMapTable", (String[]) null, true, true);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "U8&5+Gx", "^(", "j K(?\"MFs#", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@70042c03
         //
         verifyException("org.objectweb.asm.jip.ClassWriter", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 4563;
      ClassWriter classWriter0 = new ClassWriter(4563);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "StackMapTable";
      stringArray0[1] = "^(";
      stringArray0[2] = "StackMapTable";
      stringArray0[3] = "byte";
      stringArray0[4] = "StackMapTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "StackMapTable", "StackMapTable", "StackMapTable", stringArray0, false, false);
      methodWriter0.visitMaxs(4563, 1428);
      int[] intArray1 = new int[0];
      MethodWriter.getNewOffset(intArray1, intArray1, 2, 504);
      methodWriter0.visitCode();
      byte[] byteArray0 = new byte[0];
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, 4563, (-1996007847));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4571
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4790);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "&w/";
      stringArray0[1] = "L";
      ClassWriter classWriter1 = new ClassWriter((-65));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "&w/", "&w/", "&w/", stringArray0, false, false);
      MethodWriter methodWriter1 = methodWriter0.next;
      methodWriter0.visitVarInsn(1, 207);
      methodWriter0.visitFieldInsn(24117248, "", "Ljava/lang/Synthetic;", "Exceptions");
      Frame frame0 = new Frame();
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.8532361505557784
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4790);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "&w/";
      stringArray0[1] = "L";
      ClassWriter classWriter1 = new ClassWriter((-65));
      MethodWriter methodWriter0 = new MethodWriter(classWriter1, 2, "L", "&w/", "NAhf", stringArray0, false, false);
      methodWriter0.getSize();
      int int0 = 21;
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(21, "&w/", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
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
      ClassWriter classWriter0 = new ClassWriter((-1935847436));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[1] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[2] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[3] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[4] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[5] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[6] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[7] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[8] = "U`F)khGLfb31-t\"m3qf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-5041), "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", stringArray0, true, true);
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      int[] intArray0 = new int[3];
      intArray0[0] = (-5041);
      intArray0[2] = (-1935847436);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      MethodWriter methodWriter2 = new MethodWriter(classWriter0, 262144, "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter2.visitLocalVariable("U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", (String) null, (Label) null, (Label) null, 262144);
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
  /*Coverage entropy=0.7214636866925116
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4790);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "&w/";
      stringArray0[1] = ";TZ]\"yP&$unV;{";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "&w/", "java/lang/String", "U", stringArray0, false, false);
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      methodWriter1.visitMaxs((-1336), 86);
      methodWriter1.visitIntInsn(166, 2);
      methodWriter0.visitMaxs(1, 16777217);
      assertSame(methodWriter0, methodWriter1);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1935847436));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[1] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[2] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[3] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[4] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[5] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[6] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[7] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[8] = "U`F)khGLfb31-t\"m3qf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-5041), "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", stringArray0, true, true);
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      int[] intArray0 = new int[3];
      intArray0[0] = (-5041);
      intArray0[2] = (-1935847436);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      MethodWriter methodWriter2 = new MethodWriter(classWriter0, 895, "M-g", "%(}wq*z]z`N%>{h", "U`F)khGLfb31-t\"m3qf", stringArray0, false, false);
      MethodWriter methodWriter3 = methodWriter0.next;
      methodWriter3.visitVarInsn(1, 517);
      methodWriter0.visitFieldInsn((-1623953025), "org.objectweb.asm.jip.AnnotationWriter", "%(}wq*z]z`N%>{h", "");
      Frame frame0 = new Frame();
      // Undeclared exception!
      try { 
        methodWriter3.visitParameterAnnotation(895, "+QIcCf>J?<)Dc~r>nX", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "8zA94E*&Eq";
      stringArray0[1] = "8zA94E*&Eq";
      stringArray0[2] = "org.objectweb.asm.jip.Attribute";
      stringArray0[3] = "8zA94E*&Eq";
      stringArray0[4] = "org.objectweb.asm.jip.Attribute";
      stringArray0[5] = "8zA94E*&Eq";
      stringArray0[6] = "[S4Gv3}2";
      stringArray0[7] = "org.objectweb.asm.jip.Attribute";
      stringArray0[8] = "Dr-eRc7:.d.c,1g";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3), "8zA94E*&Eq", "8zA94E*&Eq", "org.objectweb.asm.jip.Attribute", stringArray0, false, false);
      methodWriter0.getSize();
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitTypeInsn(170, "iUAuCTJgG{Dy7J)(");
      methodWriter0.visitMaxs(54, (-4378));
      methodWriter1.visitMultiANewArrayInsn("8zA94E*&Eq", 131072);
      methodWriter1.visitMethodInsn(1, "Dr-eRc7:.d.c,1g", "org.objectweb.asm.jip.MethodWriter", "AnnotationDefault");
      assertSame(methodWriter1, methodWriter0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0053874327555714
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = (-1935847436);
      ClassWriter classWriter0 = new ClassWriter((-1935847436));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[1] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[2] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[3] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[4] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[5] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[6] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[7] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[8] = "U`F)khGLfb31-t\"m3qf";
      boolean boolean0 = true;
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-5041), "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", stringArray0, true, true);
      Edge edge0 = new Edge();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "U`F)khGLfb31-t\"m3qf";
      objectArray0[1] = (Object) "U`F)khGLfb31-t\"m3qf";
      methodWriter0.visitFrame((-5041), 2, stringArray0, 1, objectArray0);
      Label label0 = edge0.successor;
      int[] intArray0 = new int[3];
      intArray0[0] = (-5041);
      intArray0[1] = (-1935847436);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      String string0 = "H!WaH1P";
      // Undeclared exception!
      try { 
        methodWriter1.visitInsn((-1935847436));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.Frame", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0729605446471466
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2247));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^(";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2247), "rY%0><", "^(", "rY%0><", stringArray0, false, false);
      classWriter0.invalidFrames = false;
      MethodWriter methodWriter1 = methodWriter0.next;
      classWriter0.toByteArray();
      MethodWriter methodWriter2 = classWriter0.lastMethod;
      // Undeclared exception!
      try { 
        methodWriter2.visitParameterAnnotation(0, "int", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.4554802295550977
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = (-1935847436);
      ClassWriter classWriter0 = new ClassWriter((-1935847436));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[1] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[2] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[3] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[4] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[5] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[6] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[7] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[8] = "U`F)khGLfb31-t\"m3qf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-5041), "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", stringArray0, false, true);
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      int[] intArray0 = new int[6];
      intArray0[0] = (-5041);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(5, "RuntimeInvisibleAnnotations", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1935847436));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[1] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[2] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[3] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[4] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[5] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[6] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[7] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[8] = "U`F)khGLfb31-t\"m3qf";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-5041), "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", stringArray0, false, true);
      Edge edge0 = new Edge();
      Label label0 = edge0.successor;
      int[] intArray0 = new int[4];
      intArray0[0] = (-5041);
      intArray0[1] = (-1935847436);
      intArray0[2] = (-1935847436);
      intArray0[3] = (-5041);
      classWriter0.visit((-165), (-1935847436), "U`F)khGLfb31-t\"m3qf", "b<B7k+j", "U`F)khGLfb31-t\"m3qf", stringArray0);
      Label[] labelArray0 = new Label[5];
      labelArray0[0] = null;
      methodWriter0.visitFieldInsn((-1935847436), "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf");
      // Undeclared exception!
      try { 
        methodWriter0.visitVarInsn((-268435456), (-5041));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.Frame", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0053874327555714
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = (-1935847436);
      ClassWriter classWriter0 = new ClassWriter((-1935847436));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[1] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[2] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[3] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[4] = "U`F)khGLfb31-t\"m3qf";
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      stringArray0[5] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[6] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[7] = "U`F)khGLfb31-t\"m3qf";
      stringArray0[8] = "U`F)khGLfb31-t\"m3qf";
      boolean boolean0 = true;
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-5041), "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", "U`F)khGLfb31-t\"m3qf", stringArray0, true, true);
      Edge edge0 = new Edge();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "U`F)khGLfb31-t\"m3qf";
      objectArray0[1] = (Object) "U`F)khGLfb31-t\"m3qf";
      methodWriter0.visitFrame((-5041), 2, stringArray0, 1, objectArray0);
      Label label0 = edge0.successor;
      int[] intArray0 = new int[3];
      intArray0[0] = (-5041);
      intArray0[1] = (-1935847436);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      // Undeclared exception!
      try { 
        methodWriter1.visitJumpInsn(1, (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }
}