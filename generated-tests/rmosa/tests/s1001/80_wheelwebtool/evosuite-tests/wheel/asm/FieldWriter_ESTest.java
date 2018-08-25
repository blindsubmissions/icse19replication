/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 05:15:28 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.Edge;
import wheel.asm.FieldWriter;
import wheel.asm.Label;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 3891;
      ClassWriter classWriter0 = new ClassWriter(3891);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3439), "_:z", "_:z", "_:z", "_:z");
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("_:z");
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      int int0 = (-421);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-421), "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", (Object) null);
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putInt(2);
      byteVector0.putByte((-421));
      Object object0 = new Object();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 0, "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", "Z*{t0Z", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@742ac77d
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      classWriter0.newFieldItem("", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2741), "RuntimeVisibleAnnotations", "", "RuntimeInvisibleAnnotations", "ETe#H<");
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put11(2, 1);
      Object object0 = new Object();
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "", "RuntimeVisibleAnnotations", "ax=46=l]{vvo", (Object) null);
      fieldWriter1.put(byteVector1);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      classWriter0.newFieldItem("", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2741), "RuntimeVisibleAnnotations", "", "RuntimeInvisibleAnnotations", "ETe#H<");
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put11(2, 1);
      fieldWriter0.put(byteVector1);
      fieldWriter0.put(byteVector1);
      assertSame(byteVector0, byteVector1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 5, "", "", "", (Object) null);
      fieldWriter0.getSize();
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      classWriter0.addUninitializedType(".l", (-1));
      ClassWriter classWriter1 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter1, (-532), "Invalid IOCase name: ", "Invalid IOCase name: ", (String) null, "Invalid IOCase name: ");
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
  //Test case number: 6
  /*Coverage entropy=1.0360334832009355
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      ClassWriter classWriter1 = new ClassWriter(1);
      classWriter1.newClassItem("org.apache.commons.io.filefilter.FalseFileFilter");
      classWriter1.newFieldItem("db BgYdi%&AP!", "org.apache.commons.io.filefilter.FalseFileFilter", "ConstantValue");
      classWriter0.newFieldItem("The filters must not be null", "db BgYdi%&AP!", "iL90oQ$+av?HHW+k");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-394), "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter", "ETe#H<", "iL90oQ$+av?HHW+k");
      fieldWriter0.visitAnnotation("!,'!'O", false);
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.newFloat((-291.00677F));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 5, "NN!3DiSOvqn&YD:I0$k", "NN!3DiSOvqn&YD:I0$k", "NN!3DiSOvqn&YD:I0$k", "NN!3DiSOvqn&YD:I0$k");
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong(1643L);
      fieldWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.newMethod("", "wheel.asm.FieldWriter", "org.apache.commons.io.filefilter.SizeFileFilter", true);
      classWriter0.newMethod("org.apache.commons.io.filefilter.SizeFileFilter", "org.apache.commons.io.filefilter.SizeFileFilter", "", false);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", (String) null, "org.apache.commons.io.filefilter.SizeFileFilter");
      ByteVector byteVector0 = new ByteVector(1805);
      ByteVector byteVector1 = new ByteVector();
      fieldWriter0.put(byteVector1);
      ByteVector byteVector2 = byteVector1.putByteArray((byte[]) null, (-1185), 10);
      fieldWriter0.put(byteVector0);
      assertFalse(byteVector0.equals((Object)byteVector2));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.7751292747786216
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-421), "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", (Object) null);
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putInt(2);
      byteVector0.putByte((-421));
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.HiddenFileFilter", false);
      fieldWriter0.put(byteVector0);
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.HiddenFileFilter");
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((PipedOutputStream) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      ClassWriter classWriter1 = new ClassWriter(188);
      classWriter0.newMethod("org.apache.commons.io.filefilter.SizeFileFilter", "org.apache.commons.io.filefilter.SizeFileFilter", "org.apache.commons.io.filefilter.AndFileFilter", false);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter1, 196, "9R~", "*o", (String) null, "$EUMkX8t\"R56b)HeDa");
      ByteVector byteVector0 = new ByteVector(5);
      fieldWriter0.visitAnnotation("n-iJy:bGL9gNHO%G", false);
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      classWriter0.newFieldItem("", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2741), "RuntimeVisibleAnnotations", "", "RuntimeInvisibleAnnotations", "ETe#H<");
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put11(2, 1);
      fieldWriter0.visitAnnotation("", true);
      fieldWriter0.put(byteVector1);
      fieldWriter0.put(byteVector1);
      assertSame(byteVector0, byteVector1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "", "tYT4#h", "The size must be non-negative", "tYT4#h");
      fieldWriter0.visitAnnotation("XEGP{VPgD*/iL:7;", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String string0 = "org.apache.commons.io.filefilter.HiddenFileFilter";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-421), "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", (Object) null);
      Attribute attribute0 = new Attribute("|?C(=j?3$#AAC");
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
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.version = (-1063);
      classWriter0.newFieldItem("", "", "");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1063), "", "ETe#H<", "", "");
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-38));
      String string0 = "org.apache.commons.io.filefilter.HiddenFileFilter";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-421), "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", "org.apache.commons.io.filefilter.HiddenFileFilter", (Object) null);
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.HiddenFileFilter");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      fieldWriter0.visitEnd();
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putInt(2);
      byteVector0.putByte((-421));
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
}