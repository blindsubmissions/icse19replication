/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:48:13 GMT 2018
 */

package org.objectweb.asm.jip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.asm.jip.AnnotationVisitor;
import org.objectweb.asm.jip.Attribute;
import org.objectweb.asm.jip.ClassReader;
import org.objectweb.asm.jip.ClassWriter;
import org.objectweb.asm.jip.Edge;
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-56);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)124;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      // Undeclared exception!
      try { 
        MethodWriter.writeShort(byteArray0, (byte)124, (byte)124);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 124
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
      byteArray0[0] = (byte) (-10);
      byteArray0[1] = (byte)18;
      byte byte0 = (byte) (-5);
      byteArray0[2] = (byte) (-5);
      byteArray0[3] = (byte)17;
      byte byte1 = (byte) (-98);
      byteArray0[4] = (byte) (-98);
      // Undeclared exception!
      try { 
        MethodWriter.readInt(byteArray0, 60);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 60
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte) (-76);
      byteArray0[2] = (byte) (-83);
      byteArray0[3] = (byte)9;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)32;
      byteArray0[6] = (byte) (-78);
      // Undeclared exception!
      try { 
        MethodWriter.readUnsignedShort(byteArray0, 1206);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1206
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
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "xN_;&";
      stringArray0[1] = "xN_;&";
      stringArray0[2] = "xN_;&";
      stringArray0[3] = "xN_;&";
      stringArray0[4] = "xN_;&";
      stringArray0[5] = "xN_;&";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 0, "xN_;&", "xN_;&", "xN_;&", stringArray0, false, true);
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
      int int0 = 0;
      ClassWriter classWriter0 = new ClassWriter(0);
      int int1 = (-4371);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "AE1F;^$uJ6Qffrhh";
      stringArray0[1] = "";
      stringArray0[2] = "Synthetic";
      stringArray0[3] = "";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-4371), "", "", "", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 4017;
      intArray0[1] = 0;
      int[] intArray1 = new int[5];
      intArray1[0] = 4017;
      intArray1[1] = 0;
      intArray1[2] = 4017;
      intArray1[3] = 4017;
      intArray1[4] = 4017;
      Label label0 = new Label();
      label0.frame = null;
      Edge edge0 = new Edge();
      label0.successors = edge0;
      MethodWriter.getNewOffset(intArray0, intArray1, label0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-121);
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte) (-100);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)73;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
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
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 0, "Exceptions", "xN_;&", "j:H5#hqP|", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Label label0 = new Label();
      Edge edge0 = new Edge();
      int[] intArray0 = new int[2];
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      Label label1 = new Label();
      int[] intArray1 = new int[6];
      intArray1[0] = 1513;
      intArray1[1] = (-646);
      intArray1[2] = (-803);
      intArray1[3] = 4043;
      intArray1[4] = 197;
      intArray1[5] = 185;
      MethodWriter.getNewOffset(intArray1, intArray1, label0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)82;
      byteArray0[1] = (byte)13;
      byteArray0[2] = (byte)42;
      byteArray0[3] = (byte)13;
      byteArray0[4] = (byte) (-73);
      byteArray0[5] = (byte) (-27);
      byteArray0[6] = (byte) (-29);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.objectweb.asm.jip.ClassReader", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      classWriter0.toByteArray();
      classWriter0.newNameTypeItem("", "}");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "+l*v9Z";
      stringArray0[1] = ";]e>Ua";
      stringArray0[2] = "K(z.(q#Vc\"8Ex}9!M";
      stringArray0[3] = "K(z.(q#Vc\"8Ex}9!M";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-449), "", "", "+l*v9Z", stringArray0, false, false);
      classWriter0.newFloat(1.0F);
      methodWriter0.visitFrame(809, (-320076059), stringArray0, (-449), stringArray0);
      methodWriter0.visitTypeInsn((-320076059), ";]e>Ua");
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.8628578006373905
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      classWriter0.newMethodItem(";]e>Ua", "%IYD{wKIt!~JBR-[{", ";]e>Ua", true);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "+l*v9Z";
      stringArray0[1] = ";]e>Ua";
      stringArray0[2] = "K(z.(q#Vc\"8Ex}9!M";
      stringArray0[3] = "K(z.(q#Vc\"8Ex}9!M";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-449), "", "", "+l*v9Z", stringArray0, false, false);
      methodWriter0.visitFrame(809, (-320076059), stringArray0, (-449), stringArray0);
      methodWriter0.visitCode();
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0182301539513936
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "+l*v9Z";
      stringArray0[1] = ";]e>Ua";
      stringArray0[2] = "K(z.(q#Vc\"8Ex}9!M";
      stringArray0[3] = "K(z.(q#Vc\"8Ex}9!M";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-449), "", "", "+l*v9Z", stringArray0, false, false);
      methodWriter0.visitFrame(809, (-320076059), stringArray0, (-449), stringArray0);
      methodWriter0.visitMaxs((-449), 1206);
      int[] intArray0 = new int[2];
      intArray0[0] = (-2033);
      intArray0[1] = 14;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-2033), 14);
      assertEquals(2061, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-59);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)107;
      byteArray0[3] = (byte)20;
      byteArray0[4] = (byte) (-92);
      byteArray0[5] = (byte)9;
      byteArray0[6] = (byte)14;
      // Undeclared exception!
      try { 
        MethodWriter.readShort(byteArray0, 2845);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2845
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      String[] stringArray0 = new String[4];
      classWriter0.toByteArray();
      stringArray0[0] = "+l*v9Z";
      stringArray0[1] = ";]eUa";
      stringArray0[2] = "+l*v9Z";
      stringArray0[3] = "K(z.(q#Vc\"8Ex}9!M";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 14, "LocalVariableTypeTable", "LocalVariableTypeTable", "+l*v9Z", stringArray0, false, false);
      methodWriter0.visitInsn(1);
      methodWriter0.visitFrame(809, (-320076059), stringArray0, 1, stringArray0);
      methodWriter0.visitFieldInsn(268435456, "", "K(z.(q#Vc\"8Ex}9!M", "E0E+");
      AnnotationVisitor annotationVisitor0 = methodWriter0.visitAnnotationDefault();
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6517565611726531
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-49));
      int int0 = 8;
      classWriter0.version = 224;
      classWriter0.toByteArray();
      classWriter0.newFieldItem("hcUN[D&", "hcUN[D&", "Kmt4TTB9");
      String[] stringArray0 = new String[3];
      String string0 = "LTHh9p";
      classWriter0.newField("4B>9<,hq~*pt:(Wp", "LTHh9p", "+l*v9Z");
      stringArray0[0] = "";
      stringArray0[1] = "";
      int[] intArray0 = new int[3];
      intArray0[0] = 224;
      intArray0[1] = 8;
      intArray0[2] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, 1602, (-1274));
      stringArray0[2] = "+l*v9Z";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 8, "+l*v9Z", "", "+l*v9Z", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-303));
      classWriter0.newNameTypeItem("Y", "Y");
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-303), "Deprecated", "Deprecated", "+l*v9Z", (String[]) null, false, false);
      classWriter0.newFloat(1);
      methodWriter0.visitFrame(8, 2, (Object[]) null, 2, (Object[]) null);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-303), "US(4D'd%?!?[%1Q", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = 0;
      classWriter0.toByteArray();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "j:H5#hqP|";
      stringArray0[1] = "j:H5#hqP|";
      stringArray0[2] = "+l*v9Z";
      stringArray0[3] = "u%dofs";
      stringArray0[4] = "<init>";
      stringArray0[5] = "<init>";
      stringArray0[6] = "+l*v9Z";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "<init>", "u%dofs", "+l*v9Z", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-68));
      classWriter0.newNameTypeItem(";]e>Ua", "K(z.(q#Vc\"8Ex}9!M");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "F;>mz ]P6ARK=";
      stringArray0[1] = "F;>mz ]P6ARK=";
      stringArray0[2] = "F;>mz ]P6ARK=";
      stringArray0[3] = "hcUN[D&";
      stringArray0[4] = "-cG-";
      stringArray0[5] = "-cG-";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-68), "tz{@-hL)=E", "F;>mz ]P6ARK=", "-cG-", stringArray0, false, false);
      methodWriter0.visitAnnotation("=vh$Jv#/A", false);
      classWriter0.newFloat((-1786.711F));
      Attribute attribute0 = new Attribute("JUBF*Pgy6.\"");
      methodWriter0.visitAttribute(attribute0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter((ClassWriter) null, (-320076059), (String) null, "hcUN[D&", "ConstantValue", stringArray0, true, false);
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
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1470);
      classWriter0.toByteArray();
      classWriter0.newNameTypeItem("", "}");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "+l*v9Z";
      stringArray0[1] = ";]e>Ua";
      stringArray0[2] = "K(z.(q#Vc\"8Ex}9!M";
      stringArray0[3] = "K(z.(q#Vc\"8Ex}9!M";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-449), "", "", "+l*v9Z", stringArray0, false, false);
      methodWriter0.getSize();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1372), "tqrq+-+!DQshQ#Len", "+l*v9Z", "RuntimeVisibleParameterAnnotations", stringArray0, false, false);
      methodWriter0.visitMethodInsn((-1372), "+l*v9Z", "", "K(z.(q#Vc\"8Ex}9!M");
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-303));
      classWriter0.newNameTypeItem("Y", "Y");
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-303), "Deprecated", "Deprecated", "+l*v9Z", (String[]) null, false, false);
      classWriter0.newFloat(1);
      methodWriter0.visitFrame(8, 2, (Object[]) null, 2, (Object[]) null);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 8, (Object[]) null, 131072, (Object[]) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0182301539513936
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newField("j:H5#hqP|", "<init>", "^QHfg(3Z>_}z");
      classWriter0.toByteArray();
      String[] stringArray0 = new String[2];
      stringArray0[0] = ">h[.[/ncw;HAr";
      stringArray0[1] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 6, ")AF52", ":p[{I,g5!gSRPh64", ">h[.[/ncw;HAr", stringArray0, false, false);
      methodWriter0.visitInsn((-2500));
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "j:H5#hqP|";
      objectArray0[1] = (Object) ">h[.[/ncw;HAr";
      classWriter0.addUninitializedType("<init>", 6);
      objectArray0[2] = (Object) ":p[{I,g5!gSRPh64";
      objectArray0[3] = (Object) "<init>";
      objectArray0[4] = (Object) "^QHfg(3Z>_}z";
      objectArray0[5] = (Object) ">h[.[/ncw;HAr";
      objectArray0[6] = (Object) classWriter0;
      objectArray0[7] = (Object) classWriter0;
      methodWriter0.visitFrame(6, (-889275714), objectArray0, (-607), stringArray0);
      Label label0 = new Label();
      // Undeclared exception!
      try { 
        methodWriter0.visitLocalVariable("^QHfg(3Z>_}z", (String) null, (String) null, label0, label0, 19);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9371558530657009
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newField("j:H5#hqP|", "<init>", "^QHfg(3Z>_}z");
      classWriter0.toByteArray();
      String[] stringArray0 = new String[2];
      stringArray0[0] = ">h[.[/ncw;HAr";
      stringArray0[1] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 6, ")AF52", ":p[{I,g5!gSRPh64", ">h[.[/ncw;HAr", stringArray0, false, false);
      methodWriter0.visitInsn((-2500));
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "j:H5#hqP|";
      objectArray0[1] = (Object) ">h[.[/ncw;HAr";
      classWriter0.addUninitializedType("<init>", 6);
      objectArray0[2] = (Object) ":p[{I,g5!gSRPh64";
      objectArray0[3] = (Object) "<init>";
      objectArray0[4] = (Object) "^QHfg(3Z>_}z";
      objectArray0[5] = (Object) ">h[.[/ncw;HAr";
      methodWriter0.visitFrame((-889275714), 0, objectArray0, 6, objectArray0);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation((-847), ">h[.[/ncw;HAr", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
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
      ClassWriter classWriter0 = new ClassWriter((-320));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "__0M,~mmYAP@TP", "5YXeC~rttMYGX0Rd>|", stringArray0, false, false);
      methodWriter0.visitFrame(267386880, 1, stringArray0, (-320), stringArray0);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("$XtkBW4P_E't6*VQJ", "__0M,~mmYAP@TP", "__0M,~mmYAP@TP", label0, label0, (-607));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.8369882167858358
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-320));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      String[] stringArray1 = new String[1];
      stringArray1[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-4484), "", "{;}o=nb_", "LocalVariableTable", stringArray1, false, false);
      methodWriter0.visitInsn((-4484));
      classWriter0.newFloat(3178.1018F);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "c1F6O";
      classWriter0.newFloat(0.0F);
      methodWriter0.visitInsn(1);
      int int0 = 16777228;
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 16777228, stringArray0, 255, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3066469989453458
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-320));
      String[] stringArray0 = new String[0];
      String[] stringArray1 = new String[6];
      stringArray1[0] = "";
      String[] stringArray2 = new String[1];
      stringArray2[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-4484), "", "{;}o=nb_", "LocalVariableTable", stringArray2, false, false);
      methodWriter0.visitInsn((-4484));
      classWriter0.newFloat(3178.1018F);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "c1F6O";
      objectArray0[1] = (Object) "LocalVariableTable";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "LocalVariableTable";
      methodWriter0.visitFrame(183, (-4484), objectArray0, 285212683, stringArray0);
      methodWriter0.visitIincInsn(32767, 4017);
      methodWriter0.visitFieldInsn(102, "", "?{", "c1F6O");
      methodWriter0.visitFrame(1602, (-2655), stringArray2, (-320), stringArray1);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1470);
      classWriter0.toByteArray();
      classWriter0.newNameTypeItem("", "}");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "+l*v9Z";
      stringArray0[1] = ";]e>Ua";
      stringArray0[2] = "K(z.(q#Vc\"8Ex}9!M";
      stringArray0[3] = "K(z.(q#Vc\"8Ex}9!M";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-449), "", "", "+l*v9Z", stringArray0, false, false);
      MethodWriter methodWriter1 = classWriter0.lastMethod;
      methodWriter1.visitFrame(6, 1470, stringArray0, 1470, stringArray0);
      methodWriter1.visitIincInsn(6, (-449));
      assertSame(methodWriter1, methodWriter0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.1274832349932322
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-320));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      String[] stringArray1 = new String[1];
      stringArray1[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-4484), "", "{;}o=nb_", "LocalVariableTable", stringArray1, false, false);
      methodWriter0.visitInsn((-4484));
      classWriter0.newFloat(3178.1018F);
      methodWriter0.getSize();
      classWriter0.newNameType(";]e>Ua", "");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 742, "tqrq+-+!DQshQ#Len", "Y", "{;}o=nb_", stringArray1, false, false);
      methodWriter1.visitMethodInsn(1, "c1F6O", "c1F6O", "Nm/>pf-r=R6?mv]");
      methodWriter0.visitFrame(83, 2, stringArray0, 760, stringArray0);
      assertEquals(6, stringArray0.length);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.8454652292345644
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-303));
      classWriter0.newNameTypeItem("Y", "Y");
      String string0 = "+l*v9Z";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-303), "Deprecated", "Deprecated", "+l*v9Z", (String[]) null, false, false);
      classWriter0.newFloat(1);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "Deprecated", "b}p^kgq=~{|y", ":(AY:y5BzTB", (String[]) null, false, false);
      methodWriter1.visitInsn(2);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "Deprecated";
      objectArray0[1] = (Object) "Y";
      methodWriter0.visitFrame(1, (-3), (Object[]) null, 10, objectArray0);
      MethodWriter methodWriter2 = null;
      try {
        methodWriter2 = new MethodWriter(classWriter0, (-1618000622), "uXD$w", " ~Jkf7k9Tebg!H", "b}p^kgq=~{|y", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.1269287948006759
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-303));
      classWriter0.newNameTypeItem("Y", "Y");
      classWriter0.visitInnerClass("+l*v9Z", "Y", "k{r?9v6yvyW", (-303));
      classWriter0.newFloat((-1871.5582F));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Deprecated", "+l*v9Z", "+l*v9Z", (String[]) null, false, false);
      methodWriter0.getSize();
      classWriter0.newFieldItem("k{r?9v6yvyW", "eys$,qGD", "er`)7!");
      classWriter0.newFloat(1.0F);
      methodWriter0.visitFrame(3383, 803, (Object[]) null, 809, (Object[]) null);
      methodWriter0.visitTypeInsn((-186), "Deprecated");
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-303));
      classWriter0.newNameTypeItem("Y", "Y");
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-335), "Deprecated", "long", "long", (String[]) null, false, false);
      methodWriter0.visitAnnotation("=vh$Jv#/A", true);
      classWriter0.newFloat(2765.5F);
      Attribute attribute0 = new Attribute("V6!v8{L\"EKcIDNBK");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter((ClassWriter) null, (-3), "ConstantVailue", "F", "Deprecated", (String[]) null, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.objectweb.asm.jip.MethodWriter", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.190076307208185
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = MethodWriter.SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED;
      classWriter0.toByteArray();
      String[] stringArray0 = new String[2];
      stringArray0[0] = ">h[.[/ncw;HAr";
      stringArray0[1] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 247, ")AF52", ":p[{I,g5!gSRPh64", ">h[.[/ncw;HAr", stringArray0, false, false);
      methodWriter0.visitInsn((-2500));
      Object[] objectArray0 = new Object[8];
      objectArray0[1] = (Object) ">h[.[/ncw;HAr";
      objectArray0[2] = (Object) "j:H5#hqP|";
      objectArray0[3] = (Object) "<init>";
      objectArray0[4] = (Object) "^QHfg(3Z>_}z";
      methodWriter0.visitFrame((-3689), 31, stringArray0, 2, stringArray0);
      methodWriter0.visitIincInsn(31, 32767);
      methodWriter0.visitFieldInsn((-2500), "f{Ws=Yd", "^QHfg(3Z>_}z", "^QHfg(3Z>_}z");
      methodWriter0.visitFrame(2393, 0, objectArray0, 131072, objectArray0);
      assertEquals(8, objectArray0.length);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0751393240053735
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-320));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 491, "Deprecated", "", "ENP2IMbTypW5FbJwBi", stringArray0, false, false);
      methodWriter0.visitFrame(8, 8, stringArray0, 285212676, stringArray0);
      methodWriter0.visitIntInsn((-320), 2);
      // Undeclared exception!
      try { 
        methodWriter0.visitParameterAnnotation(8, "Deprecated", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.objectweb.asm.jip.Type", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6901856760188042
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = (-303);
      ClassWriter classWriter0 = new ClassWriter((-303));
      classWriter0.newNameTypeItem("Y", "Y");
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-303), "Deprecated", "Deprecated", "+l*v9Z", (String[]) null, false, false);
      classWriter0.newFloat(1);
      methodWriter0.visitFrame(2, 2, (Object[]) null, 2, (Object[]) null);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "StackMap", (String) null, "StackMap", (String[]) null, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-320));
      String[] stringArray0 = new String[0];
      String[] stringArray1 = new String[6];
      stringArray1[0] = "";
      String[] stringArray2 = new String[1];
      classWriter0.newFloat(3178.1018F);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 211, "SourceFile", "Exceptions", "", stringArray0, false, false);
      classWriter0.newFloat(183);
      methodWriter0.visitIincInsn(1471, (-4484));
      methodWriter0.visitVarInsn(1910, 1);
      methodWriter0.visitIincInsn((-4484), (-320));
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newField("j:H5#hqP|", "<init>", "^QHfg(3Z>_}z");
      classWriter0.toByteArray();
      String[] stringArray0 = new String[2];
      stringArray0[0] = ">h[.[/ncw;HAr";
      stringArray0[1] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 6, ")AF52", ":p[{I,g5!gSRPh64", ">h[.[/ncw;HAr", stringArray0, false, false);
      methodWriter0.classReaderOffset = 65;
      methodWriter0.visitInsn((-2500));
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "j:H5#hqP|";
      objectArray0[1] = (Object) ">h[.[/ncw;HAr";
      classWriter0.addUninitializedType("<init>", 6);
      objectArray0[2] = (Object) ":p[{I,g5!gSRPh64";
      objectArray0[3] = (Object) "<init>";
      objectArray0[4] = (Object) "^QHfg(3Z>_}z";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "<init>", ">h[.[/ncw;HAr", ">h[.[/ncw;HAr", stringArray0, false, false);
      methodWriter1.visitLdcInsn("j:H5#hqP|");
      methodWriter1.visitEnd();
      methodWriter0.visitLdcInsn("<init>");
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.196612711221129
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-201));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "t: bfugX]'p\"5B7vCL";
      stringArray0[1] = "+l*v9Z";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 6, "+l*v9Z", "t: bfugX]'p\"5B7vCL", "+l*v9Z", stringArray0, false, false);
      methodWriter0.visitMultiANewArrayInsn("j", 16777228);
      Attribute attribute0 = new Attribute("RuntimeVisibleAnnotations");
      Attribute attribute1 = attribute0.next;
      methodWriter0.visitFrame(1739, (-201), stringArray0, 2, stringArray0);
      methodWriter0.visitIincInsn(2, 54);
      methodWriter0.visitFieldInsn(4017, "j", "hn", "hn");
      methodWriter0.visitFrame(102, 1739, stringArray0, (-128), stringArray0);
      assertEquals(2, stringArray0.length);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.274530395406362
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = 0;
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.toByteArray();
      String[] stringArray0 = new String[2];
      stringArray0[0] = ">h[.[/ncw;HAr";
      stringArray0[1] = "<init>";
      Object[] objectArray0 = new Object[8];
      objectArray0[1] = (Object) ">h[.[/ncw;HAr";
      objectArray0[3] = (Object) "<init>";
      classWriter0.newClassItem(">h[.[/ncw;HAr");
      objectArray0[4] = (Object) "^QHfg(3Z>_}z";
      objectArray0[5] = (Object) ">h[.[/ncw;HAr";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-2500), "$Z", ")AF52", "31j;8", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
