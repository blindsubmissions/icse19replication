/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 11:25:11 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;
import wheel.asm.Item;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      ClassWriter classWriter1 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "RuntimeVisibleAnnotations", "Q[P&}UJ%x", "Q[P&}UJ%x", (Object) null);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.putShort(1);
      ByteVector byteVector1 = byteVector0.putLong(0L);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 4096, "Q[P&}UJ%x", (String) null, "u(nar2<hfC^SEI", byteVector1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-906), "a*$", "a*$", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(20, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2676);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "wheel.asm.Type", "Ljava/lang/Synthetic;", "AB)[7Gd*", "Ljava/lang/Synthetic;");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3198));
      classWriter0.invalidFrames = true;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "`(j", "/4D)?qfzdc?", "/4D)?qfzdc?", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("=QWlyw%Ur^8=b[ iZ/2", true);
      String string0 = "v80hugYP";
      boolean boolean0 = false;
      Attribute attribute0 = new Attribute("`(j");
      fieldWriter0.getSize();
      byte[] byteArray0 = new byte[0];
      int int0 = (-635);
      // Undeclared exception!
      try { 
        attribute0.write(classWriter0, byteArray0, 3582, (-635), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3198));
      classWriter0.invalidFrames = true;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "", "", "", "");
      Attribute attribute0 = new Attribute("\"");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(49);
      byteVector0.putUTF8("");
      byteVector0.putShort(49);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, (-1270), "\"", "", "\"", attribute0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.Attribute@9
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3198));
      classWriter0.invalidFrames = true;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "", "", "", "");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 49, "", "", "", "");
      fieldWriter0.next = fieldWriter1;
      fieldWriter0.visitAnnotation("", false);
      Object object0 = new Object();
      FieldWriter fieldWriter2 = null;
      try {
        fieldWriter2 = new FieldWriter(classWriter0, 811, "", "0FR}RbRx!l/oJIQ )", "%hq&wa60lo-eKM", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@1ef7abbc
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2676);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1251), "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter", "Synthetic", "org.apache.commons.io.filefilter.FalseFileFilter");
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putShort(1);
      ByteVector byteVector2 = byteVector0.putUTF8("Synthetic");
      byteVector2.putLong(2);
      fieldWriter0.getSize();
      byteVector2.putInt(8);
      fieldWriter0.put(byteVector1);
      assertSame(byteVector1, byteVector0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2607);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "RuntimeVisibleAnnotations", "EYFm!I~_@S#.w", "9?#6ogF[s", "RuntimeVisibleAnnotations");
      ByteVector byteVector0 = new ByteVector(4096);
      ByteVector byteVector1 = byteVector0.put12(86, 76);
      ByteVector byteVector2 = byteVector1.put11(76, 86);
      ByteVector byteVector3 = byteVector2.putLong(76);
      fieldWriter0.put(byteVector3);
      assertSame(byteVector3, byteVector2);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.8264053222918117
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3198));
      classWriter0.invalidFrames = true;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.put12(1, 2995);
      ByteVector byteVector1 = byteVector0.putShort(49);
      ByteVector byteVector2 = byteVector1.putInt(1);
      byteVector1.putUTF8("a]SzU[kU#ArJ");
      byteVector2.putLong(1424L);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2676);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1251), "org.apache.commons.io.filefilter.FalseFilFilqer", "org.apache.commons.io.filefilter.FalseFilFilqer", "org.apache.commons.io.filefilter.FalseFilFilqer", "org.apache.commons.io.filefilter.FalseFilFilqer");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.putShort(1);
      ByteVector byteVector1 = byteVector0.putUTF8("org.apache.commons.io.filefilter.FalseFilFilqer");
      byteVector1.putLong(2);
      fieldWriter0.getSize();
      byteVector1.putInt(8);
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2676);
      Item[] itemArray0 = new Item[2];
      Item item0 = classWriter0.key2;
      itemArray0[0] = item0;
      Item item1 = classWriter0.key;
      itemArray0[1] = item1;
      classWriter0.typeTable = itemArray0;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1251), "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter");
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.FalseFileFilter", false);
      FieldWriter fieldWriter1 = fieldWriter0.next;
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2676);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1251), "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter", "Synthetic", "org.apache.commons.io.filefilter.FalseFileFilter");
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putShort(1);
      ByteVector byteVector2 = byteVector0.putUTF8("Synthetic");
      ByteVector byteVector3 = byteVector2.putLong(2);
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.FalseFileFilter", true);
      byteVector3.putInt(676);
      fieldWriter0.put(byteVector1);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2676);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 55, "Q[P&}UJ%x", "RuntimeVisibleAnnotations", (String) null, "RuntimeVisibleAnnotations");
      ByteVector byteVector0 = new ByteVector(65535);
      ByteVector byteVector1 = byteVector0.putShort(2);
      ByteVector byteVector2 = byteVector0.putLong(0L);
      ByteVector byteVector3 = byteVector2.putInt(172);
      fieldWriter0.put(byteVector3);
      fieldWriter0.getSize();
      byteVector0.putShort(131072);
      fieldWriter0.put(byteVector1);
      fieldWriter0.put(byteVector3);
      byteVector2.putInt(172);
      fieldWriter0.put(byteVector0);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.getSize();
      fieldWriter0.put(byteVector1);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3198));
      classWriter0.invalidFrames = true;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "", "", "", "");
      Attribute attribute0 = new Attribute("\"");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(49);
      byteVector0.putUTF8("");
      byteVector0.putShort(49);
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
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      ClassWriter classWriter1 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-628), "RuntimeVisibleAnnotations", "Q[P&}UJ%x", "Q[P&}UJ%x", (Object) null);
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.putShort(16777218);
      ByteVector byteVector2 = byteVector1.putLong(4096);
      byteVector2.putShort(1);
      ByteVector byteVector3 = byteVector0.putLong(893L);
      byteVector3.putByte((-65));
      ByteVector byteVector4 = byteVector1.putLong(893L);
      ByteVector byteVector5 = byteVector0.putInt(10);
      fieldWriter0.put(byteVector4);
      assertSame(byteVector4, byteVector5);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2676);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "L=[jcD+";
      stringArray0[1] = "R";
      stringArray0[2] = "R";
      stringArray0[3] = "L=[jcD+";
      stringArray0[4] = "L=[jcD+";
      stringArray0[5] = "R";
      stringArray0[6] = "L=[jcD+";
      stringArray0[7] = "L=[jcD+";
      classWriter0.visit((-1251), (-3329), "R", "R", "L=[jcD+", stringArray0);
      Item[] itemArray0 = new Item[2];
      Item item0 = classWriter0.key2;
      itemArray0[0] = item0;
      Item item1 = classWriter0.key;
      itemArray0[1] = item1;
      classWriter0.typeTable = itemArray0;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1251), "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter");
      FieldWriter fieldWriter1 = fieldWriter0.next;
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }
}
