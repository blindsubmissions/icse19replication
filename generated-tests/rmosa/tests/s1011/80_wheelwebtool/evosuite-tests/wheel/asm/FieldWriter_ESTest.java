/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:14:22 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.Edge;
import wheel.asm.FieldWriter;
import wheel.asm.Frame;
import wheel.asm.Label;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 330;
      ClassWriter classWriter0 = new ClassWriter(330);
      classWriter0.newDouble((-2492.6735));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 330, "nXK3mrOr)", "YAc^IFI(", (String) null, "nXK3mrOr)");
      // Undeclared exception!
      try { 
        fieldWriter0.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(525);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1480, "eZQmMsLdK3^:[k", "[]", "[]", (Object) null);
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 640;
      ClassWriter classWriter0 = new ClassWriter(640);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3033), "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "LocalVariableTypeTable", "LocalVariableTypeTable", "LocalVariableTypeTable", ">ma-O6Hr%=d}_=");
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute(">ma-O6Hr%=d}_=");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte)9;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte) (-45);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-16);
      byteArray0[6] = (byte)8;
      byteArray0[7] = (byte) (-13);
      byteArray0[8] = (byte)0;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-16), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(330);
      classWriter0.newDouble((-2492.6735));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 330, "nXK3mrOr)", "YAc^IFI(", (String) null, "nXK3mrOr)");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      fieldWriter0.put(byteVector0);
      ByteVector byteVector1 = byteVector0.putLong(330);
      fieldWriter0.put(byteVector1);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(640);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3033), "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$");
      Attribute attribute0 = new Attribute("#|K}GMjsfbI$ZfUp");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
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
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(330);
      classWriter0.newDouble((-2492.6735));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 330, "nXK3mrOr)", "@[T|wZq.e(", (String) null, "nXK3mrOr)");
      fieldWriter0.visitAnnotation("@[T|wZq.e(", true);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(640);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 566, "7ft", "", "?437X&<@+`p4VNXmi$", (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 820, "", "org.apache.commons.io.filefilter.WildcardFilter", "ConstantValue", "LocalVariableTypeTable");
      ByteVector byteVector0 = new ByteVector(4749);
      fieldWriter0.put(byteVector0);
      assertFalse(fieldWriter0.equals((Object)fieldWriter1));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(640);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3021), "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "LocalVariableTypeTable", "LocalVariableTypeTable", "LocalVariableTypeTable", ">ma-O6Hr%=d}_=");
      ByteVector byteVector0 = new ByteVector(4632);
      fieldWriter0.put(byteVector0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)60;
      byteArray0[1] = (byte)90;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)3;
      // Undeclared exception!
      try { 
        byteVector0.putByteArray(byteArray0, 194, (-2615));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 587, "6~j$w?*W^67", "6~j$w?*W^67", "6~j$w?*W^67", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 10, "Q?MYb<^2", "Q?MYb<^2", "Q?MYb<^2", "Q?MYb<^2");
      fieldWriter0.getSize();
      classWriter0.toByteArray();
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("The size must be non-negative");
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(640);
      classWriter0.newField("", "", "");
      classWriter0.version = 640;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3033), "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putUTF8("LocalVariableTypeTable");
      ByteVector byteVector1 = byteVector0.putShort(6);
      ByteVector byteVector2 = byteVector1.putInt(640);
      fieldWriter0.put(byteVector2);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "LocalVariableTypeTable", "LocalVariableTypeTable", "LocalVariableTypeTable", ">ma-O6Hr%=d}_=");
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute(">ma-O6Hr%=d}_=");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte)9;
      byteArray0[2] = (byte)32;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, 2, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(640);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3033), "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "LocalVariableTypeTable", "LocalVariableTypeTable", "!", "!");
      fieldWriter1.visitAnnotation("org.apache.commons.io.filefilter.TrueFileFilter", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter1.getSize();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-8);
      classWriter0.newConstItem("LocalVariableTypeTable");
      byteArray0[1] = (byte) (-69);
      byteArray0[2] = (byte)4;
      byteArray0[3] = (byte)71;
      // Undeclared exception!
      byteVector0.putByteArray(byteArray0, 3312, Integer.MAX_VALUE);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(640);
      classWriter0.newField("", "", "");
      classWriter0.visitInnerClass("", "", "", 54);
      classWriter0.version = 11;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 11, "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$", "?437X&<@+`p4VNXmi$");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("?437X&<@+`p4VNXmi$", false);
      classWriter0.newDouble(1.0);
      fieldWriter0.put(byteVector0);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 10, "", "q#i&^8?!", "{", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }
}
