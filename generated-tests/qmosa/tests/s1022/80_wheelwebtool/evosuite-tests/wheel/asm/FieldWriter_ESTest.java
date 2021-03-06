/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:49:19 GMT 2018
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
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1363, "", "", (String) null, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@2258e025
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-764), "", "Synthetic", "5#T&;!Z>g?Wi^6%", "5#T&;!Z>g?Wi^6%");
      fieldWriter0.next = null;
      fieldWriter0.visitAnnotation("W", false);
      fieldWriter0.visitEnd();
      Attribute attribute0 = new Attribute(" )AfL;");
      Object object0 = new Object();
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "^@77J=.s", "%Bmf`4Y'/$uldk'{", "", "%Bmf`4Y'/$uldk'{");
      fieldWriter1.visitAttribute(attribute0);
      FieldWriter fieldWriter2 = classWriter0.firstField;
      fieldWriter2.next = fieldWriter1;
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-764), "", "Synthetic", "5#T&;!Z>g?Wi^6%", "5#T&;!Z>g?Wi^6%");
      fieldWriter0.next = null;
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitAnnotation("W", false);
      fieldWriter0.visitEnd();
      Attribute attribute0 = new Attribute(" )AfL;");
      Object object0 = new Object();
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "^@77J=.s", "^@77J=.s", "", "^@77J=.s");
      FieldWriter fieldWriter2 = classWriter0.firstField;
      fieldWriter2.next = fieldWriter1;
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(167);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-764), "", "Synthetic", "5#T&;!Z>g?Wi^6%", "5#T&;!Z>g?Wi^6%");
      fieldWriter0.next = null;
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.visitAnnotation("", true);
      fieldWriter1.visitEnd();
      Attribute attribute0 = new Attribute("ispl0S]l}*A[(I6I");
      Attribute attribute1 = attribute0.next;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)49;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)2;
      byteArray0[3] = (byte)0;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 340, "dn&P*l8a", "dn&P*l8a", "dn&P*l8a", (Object) null);
      Attribute attribute0 = new Attribute("dn&P*l8a");
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
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 340, "dn&P*l8a", "dn&P*l8a", "dn&P*l8a", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putUTF8("dn&P*l8a");
      fieldWriter0.put(byteVector1);
      assertSame(byteVector1, byteVector0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1682824501765625
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 20, "5#T&;!Z>g?Wi^6%", "5#T&;!Z>g?Wi^6%", "Deprecated", (Object) null);
      fieldWriter0.visitAnnotation("Deprecated", true);
      Attribute attribute0 = new Attribute("Deprecated");
      Attribute attribute1 = attribute0.next;
      fieldWriter0.getSize();
      ByteVector byteVector0 = null;
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
  //Test case number: 7
  /*Coverage entropy=1.229918603764207
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-764));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-125), "5#T&;!Z>g?Wi^6%", "", "3jo (m!Vjjs}G3TXO", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      fieldWriter0.visitAnnotation("ul05", false);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter1.visitEnd();
      Attribute attribute0 = new Attribute("NJ ");
      Object object0 = new Object();
      FieldWriter fieldWriter2 = new FieldWriter(classWriter0, (-173), "?>}#W6Ff^)", " )AfL;", "^@77J=.s", "Synthetic");
      FieldWriter fieldWriter3 = classWriter0.firstField;
      fieldWriter3.put(byteVector0);
      int int0 = fieldWriter1.getSize();
      assertEquals(40, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1682824501765625
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 340, "dn&P*l8a", "dn&P*l8a", "dn&P*l8a", (Object) null);
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "dn&P*l8a");
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("dn&P*l8a", true);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putUTF8("dn&P*l8a");
      fieldWriter0.put(byteVector1);
      assertSame(byteVector1, byteVector0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.9433483923290392
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 340, "dn&P*l8a", "dn&P*l8a", "dn&P*l8a", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
      
      fieldWriter0.visitEnd();
      Attribute attribute0 = new Attribute("dn&P*l8a");
      Object object0 = new Object();
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 16, ".FuSwwo?lsqKX0XG!w", "w-^(`}gC~y%qpl%3z", (String) null, (Object) null);
      FieldWriter fieldWriter2 = classWriter0.firstField;
      int int1 = fieldWriter1.getSize();
      assertEquals(8, int1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0317671113505356
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-764), "", "Synthetic", "", "");
      fieldWriter0.next = null;
      String string0 = "W";
      boolean boolean0 = false;
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute("a9dH +");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
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
  //Test case number: 11
  /*Coverage entropy=0.9368883075390159
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)104;
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(1);
      ByteVector byteVector2 = byteVector0.putUTF8("(xI;U>|)5qX9p");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte) (-7), "J%>mt+>z", "3OA||{?h+S", (String) null, (Object) null);
      fieldWriter0.put(byteVector1);
      fieldWriter0.put(byteVector2);
      fieldWriter0.put(byteVector0);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector1);
      fieldWriter0.getSize();
      int int0 = fieldWriter1.getSize();
      assertEquals(20, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9649629230074277
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(20);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1579), "J%>mt+>z", "J%>mt+>z", "J%>mt+>z", "J%>mt+>z");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "J%>mt+>z", "J%>mt+>z", "J%>mt+>z", "J%>mt+>z");
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(710);
      ByteVector byteVector2 = byteVector1.putUTF8("J%>mt+>z");
      FileSystemHandling.shouldAllThrowIOExceptions();
      classWriter0.invalidFrames = false;
      classWriter0.version = 710;
      fieldWriter0.put(byteVector1);
      fieldWriter1.put(byteVector0);
      fieldWriter1.put(byteVector2);
      fieldWriter1.put(byteVector2);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
      
      fieldWriter0.put(byteVector0);
      fieldWriter0.put(byteVector2);
      int int1 = fieldWriter1.getSize();
      assertEquals(24, int1);
  }
}
