/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:50:23 GMT 2018
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(561);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-4);
      byteArray0[2] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-709), (-363));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "wheel.asm.FieldWriter", "3eWn+57z", (String) null, "wheel.asm.FieldWriter");
      Attribute attribute0 = new Attribute("FCR7(#I2/!@0HDGmzjd");
      fieldWriter0.visitAttribute(attribute0);
      assertFalse(attribute0.isCodeAttribute());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.addUninitializedType("", 0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putByte(16);
      fieldWriter0.visitAnnotation(")H}P&z", true);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-58);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-124);
      // Undeclared exception!
      try { 
        byteVector1.putByteArray(byteArray0, (byte) (-124), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.addUninitializedType("", 0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-112);
      byteArray0[1] = (byte) (-112);
      fieldWriter0.getSize();
      byteVector0.putByte((-3581));
      fieldWriter0.visitAnnotation(")H}P&z", false);
      fieldWriter0.visitEnd();
      // Undeclared exception!
      try { 
        byteVector0.putByteArray(byteArray0, 79, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1682824501765625
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65535);
      classWriter0.newLong(0L);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "r'z:P$axMOBK?-+6I]r", "org.2pache.commons.io.fi%efilter.NSmeFileFilter", "V", "");
      fieldWriter0.visitAnnotation("V", true);
      fieldWriter0.getSize();
      // Undeclared exception!
      try { 
        fieldWriter0.put((ByteVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9164648855394713
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.addUninitializedType("", 0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", (Object) null);
      fieldWriter0.visitAnnotation("", false);
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      classWriter0.newUTF8("*O`Uu3yvf");
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 1);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 0, "", "", "", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.8823109245150755
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-784));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-784), "U(/m9>G{d[^b", "U(/m9>G{d[^b", "RuntimeInvisibleParameterAnnotations", "U(/m9>G{d[^b");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 16777220, "RuntimeInvisibleParameterAnnotations", "U(/m9>G{d[^b", (String) null, "RuntimeInvisibleParameterAnnotations");
      fieldWriter1.getSize();
      FieldWriter fieldWriter2 = classWriter0.firstField;
      fieldWriter2.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter2.getSize();
      int int0 = fieldWriter1.getSize();
      assertEquals(16, int0);
      
      ByteVector byteVector1 = classWriter0.pool;
      ClassWriter classWriter1 = new ClassWriter(3124);
      FieldWriter fieldWriter3 = new FieldWriter(classWriter1, 16, "YfGHO>TI76{D_2pJ:", "U(/m9>G{d[^b", (String) null, (Object) null);
      fieldWriter0.put(byteVector1);
      int int1 = fieldWriter2.getSize();
      assertEquals(36, int1);
      
      fieldWriter3.put(byteVector0);
      int int2 = fieldWriter3.getSize();
      assertEquals(8, int2);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0905994737794786
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-784));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-784), "U(/m9>G{.[^H", "U(/m9>G{.[^H", "RuntimeInvisibleParameterAnnotations", "U(/m9>G{.[^H");
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      Object object0 = new Object();
      ByteVector byteVector1 = classWriter0.pool;
      FieldWriter fieldWriter1 = classWriter0.firstField;
      FieldWriter fieldWriter2 = new FieldWriter(classWriter0, 7, "RuntimeInvisibleParameterAnnotations", "wheel.asm.Edge", "", "wheel.asm.Edge");
      Attribute attribute0 = new Attribute("");
      fieldWriter2.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter2.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.856859036885367
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-784));
      ByteVector byteVector0 = classWriter0.pool;
      Object object0 = new Object();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Dy)]MU]XDlO>`eoQ/k", "", "Dy)]MU]XDlO>`eoQ/k", "");
      Object object1 = new Object();
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "c_>A1PAoY!+E<~0", "", "Dy)]MU]XDlO>`eoQ/k", (Object) null);
      fieldWriter1.visitAnnotation("RuntimeInvisibleParameterAnnotations", false);
      FieldWriter fieldWriter2 = classWriter0.lastField;
      fieldWriter2.put(byteVector0);
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector0);
      assertNotSame(fieldWriter0, fieldWriter1);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.8532361505557784
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.addUninitializedType("", 0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[2];
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (byte)0, "", "", "", "");
      Attribute attribute0 = new Attribute("(!O?pi`");
      fieldWriter1.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter1.getSize();
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
  /*Coverage entropy=1.2554823251787535
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-784));
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.newUTF8("");
      String[] stringArray0 = new String[0];
      classWriter0.visit((-66), (-507), "", "", "jt#2=4>uuH", stringArray0);
      Object object0 = new Object();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1155), "Dy)lMA]X!lO>`eoQ/k", "q", "", "Dy)lMA]X!lO>`eoQ/k");
      Object object1 = new Object();
      FieldWriter fieldWriter1 = fieldWriter0.next;
      FieldWriter fieldWriter2 = classWriter0.lastField;
      Attribute attribute0 = new Attribute("jt#2=4>uuH");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter2.visitAnnotation("jt#2=4>uuH", true);
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
