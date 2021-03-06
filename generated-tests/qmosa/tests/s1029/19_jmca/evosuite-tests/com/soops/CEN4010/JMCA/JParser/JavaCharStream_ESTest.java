/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:35:12 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaCharStream_ESTest extends JavaCharStream_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      char[] charArray0 = new char[9];
      charArray0[0] = 'Y';
      charArray0[1] = 'z';
      charArray0[2] = 'F';
      charArray0[3] = '+';
      charArray0[4] = 'n';
      charArray0[5] = '4';
      charArray0[6] = '7';
      charArray0[7] = 'a';
      charArray0[8] = '.';
      stringReader0.read(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.column = 10;
      javaCharStream0.Done();
      // Undeclared exception!
      try { 
        javaCharStream0.getBeginLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.ReInit((Reader) stringReader0, (-3344), 0, 545);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      char[] charArray0 = new char[3];
      charArray0[0] = '.';
      charArray0[1] = 'u';
      charArray0[2] = '9';
      int int0 = stringReader0.read(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 3853, 978);
      javaCharStream0.GetImage();
      int int1 = javaCharStream0.getBeginLine();
      assertFalse(int1 == int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      try { 
        javaCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      char[] charArray0 = new char[2];
      charArray0[0] = '%';
      charArray0[1] = '(';
      stringReader0.read(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 2120, 62, 62);
      javaCharStream0.Done();
      stringReader0.skip(2120);
      javaCharStream0.ReInit((Reader) stringReader0, 99, 62, 99);
      // Undeclared exception!
      try { 
        javaCharStream0.getColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaCharStream.hexval('F');
      JavaCharStream javaCharStream0 = null;
      try {
        javaCharStream0 = new JavaCharStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      javaCharStream0.ReInit((InputStream) mockFileInputStream0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Invalid escape character at line ");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.ReInit((Reader) stringReader0, 0, 0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Invalid escape character at line ");
      stringReader0.read();
      stringReader0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1, 1, 1);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.ReadByte();
      javaCharStream0.BeginToken();
      char[] charArray0 = new char[3];
      charArray0[0] = 'a';
      charArray0[1] = 'v';
      charArray0[2] = 'a';
      stringReader0.read(charArray0);
      javaCharStream0.ReInit((Reader) stringReader0, 0, 1, 1679);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)68;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read(byteArray0, 0, 1);
      javaCharStream0.bufpos = 1679;
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0);
      javaCharStream0.Done();
      // Undeclared exception!
      try { 
        javaCharStream0.AdjustBuffSize();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("D~nmt");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.getBeginColumn();
      PipedInputStream pipedInputStream0 = new PipedInputStream(3257);
      PushbackInputStream pushbackInputStream0 = null;
      try {
        pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // size <= 0
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-14);
      byteArray0[2] = (byte)21;
      byteArray0[3] = (byte) (-106);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)70;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)7;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1323, (-2028));
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      try { 
        javaCharStream0.ReadByte();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      stringReader0.skip((-1887L));
      stringReader0.skip((-1887L));
      stringReader0.close();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.adjustBeginLineColumn(0, 0);
      try { 
        stringReader0.mark(246);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      StringReader stringReader0 = new StringReader("z_\"%t~|sy?;Sr4CQr@");
      stringReader0.markSupported();
      stringReader0.reset();
      stringReader0.reset();
      stringReader0.markSupported();
      int int0 = (-224);
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-224), (-2020));
      javaCharStream0.ReInit((Reader) stringReader0);
      // Undeclared exception!
      try { 
        javaCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        JavaCharStream.hexval('U');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.0922160573371918
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char char0 = 'd';
      JavaCharStream.hexval('d');
      JavaCharStream javaCharStream0 = null;
      try {
        javaCharStream0 = new JavaCharStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.0228085294147036
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("DUat~)");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1, 0, 1);
      StringReader stringReader1 = new StringReader("jq&KWiynber)L|GML");
      javaCharStream0.inBuf = 344;
      javaCharStream0.ReInit((Reader) stringReader1, 0, 3558, 0);
      javaCharStream0.BeginToken();
      javaCharStream0.backup((-902));
      char char0 = javaCharStream0.BeginToken();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals('', char0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        javaCharStream0.getEndColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      int int0 = JavaCharStream.hexval('0');
      assertEquals(0, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.4913328579294729
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      sequenceInputStream0.available();
      SequenceInputStream sequenceInputStream1 = new SequenceInputStream(sequenceInputStream0, sequenceInputStream0);
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream1);
      javaCharStream0.GetImage();
      javaCharStream0.AdjustBuffSize();
      try { 
        JavaCharStream.hexval('$');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.4384078754444761
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.skip((-1138L));
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte) (-104);
      byteArray0[2] = (byte) (-117);
      pipedOutputStream0.close();
      pipedInputStream0.read();
      pipedOutputStream0.flush();
      byteArray0[3] = (byte)30;
      byteArray0[4] = (byte)1;
      pipedOutputStream0.flush();
      pipedInputStream0.read(byteArray0);
      pipedInputStream0.mark(1489);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.Done();
      JavaCharStream javaCharStream1 = new JavaCharStream(pipedInputStream0, (byte)1, 10);
      assertEquals((-1), javaCharStream1.bufpos);
      
      int int0 = JavaCharStream.hexval('c');
      assertEquals(12, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.0253262207700673
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Invalid escape character at line ");
      stringReader0.read();
      stringReader0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1, 1, 1);
      javaCharStream0.ReadByte();
      javaCharStream0.BeginToken();
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0);
      // Undeclared exception!
      try { 
        javaCharStream1.ExpandBuff(true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      StringReader stringReader1 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.GetImage();
      javaCharStream0.backup(498);
      stringReader0.mark(91);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.readChar();
      javaCharStream0.BeginToken();
      try { 
        JavaCharStream.hexval('\u0000');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char char0 = '1';
      JavaCharStream.hexval('1');
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 1);
      try { 
        pipedInputStream0.connect(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char char0 = 'D';
      JavaCharStream.hexval('D');
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 13);
      try { 
        pipedInputStream0.connect(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.skip((-1138L));
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte) (-104);
      byteArray0[2] = (byte) (-117);
      pipedOutputStream0.close();
      pipedInputStream0.read();
      pipedOutputStream0.flush();
      byteArray0[3] = (byte)30;
      byteArray0[4] = (byte)1;
      pipedOutputStream0.flush();
      pipedInputStream0.read(byteArray0);
      pipedInputStream0.mark(1489);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.Done();
      StringReader stringReader0 = new StringReader("");
      javaCharStream0.ReInit((Reader) stringReader0, 9, (int) (byte)30, (int) (byte)1);
      // Undeclared exception!
      try { 
        javaCharStream0.getLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.951848439223888
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte) (-104);
      pipedOutputStream0.close();
      pipedInputStream0.read();
      pipedOutputStream0.flush();
      pipedOutputStream0.flush();
      pipedInputStream0.read(byteArray0);
      pipedInputStream0.mark(96);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.Done();
      JavaCharStream javaCharStream1 = new JavaCharStream(pipedInputStream0, 1489, 431);
      JavaCharStream.hexval('4');
      try { 
        javaCharStream1.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.8381196037849845
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("DUat~)");
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      sequenceInputStream0.available();
      SequenceInputStream sequenceInputStream1 = new SequenceInputStream(sequenceInputStream0, sequenceInputStream0);
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream1);
      char[] charArray0 = new char[2];
      charArray0[0] = '$';
      charArray0[1] = 'i';
      javaCharStream0.nextCharBuf = charArray0;
      javaCharStream0.GetImage();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.mark(0);
      JavaCharStream javaCharStream1 = new JavaCharStream(pipedInputStream0);
      javaCharStream1.Done();
      JavaCharStream javaCharStream2 = new JavaCharStream(sequenceInputStream0, 13, 3331);
      try { 
        JavaCharStream.hexval('H');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.8945571734275531
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.skip((-1138L));
      StringReader stringReader0 = new StringReader("_Hgwd0THP tV$W3R*Lq");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.GetImage();
      javaCharStream0.backup(2);
      stringReader0.mark(91);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.readChar();
      JavaCharStream javaCharStream1 = new JavaCharStream(pipedInputStream0, 4094, 2);
      try { 
        JavaCharStream.hexval('V');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0126631103850336
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      stringReader0.skip((-1887L));
      stringReader0.skip(0L);
      stringReader0.close();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.adjustBeginLineColumn(646, 1);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-63);
      byteArray0[1] = (byte) (-31);
      byteArray0[2] = (byte) (-10);
      byteArray0[3] = (byte) (-1);
      JavaCharStream.hexval('9');
      StringReader stringReader1 = new StringReader("");
      assertFalse(stringReader1.equals((Object)stringReader0));
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        JavaCharStream.hexval('[');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.527658530557932
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte) (-104);
      pipedOutputStream0.close();
      pipedInputStream0.read();
      pipedOutputStream0.flush();
      pipedOutputStream0.flush();
      pipedInputStream0.read(byteArray0);
      pipedInputStream0.mark(96);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.Done();
      JavaCharStream javaCharStream1 = new JavaCharStream(pipedInputStream0, 431, (-1));
      try { 
        JavaCharStream.hexval('W');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-104);
      pipedOutputStream0.close();
      pipedOutputStream0.flush();
      pipedOutputStream0.flush();
      pipedInputStream0.read(byteArray0);
      JavaCharStream.hexval('5');
      StringReader stringReader0 = new StringReader("fM'QVh!,\"I");
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.9792045174343245
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("DUat~)");
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      sequenceInputStream0.available();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.readChar();
      javaCharStream0.BeginToken();
      javaCharStream0.GetImage();
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.604874228490577
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      stringReader0.skip((-1887L));
      stringReader0.read();
      stringReader0.skip(0L);
      stringReader0.close();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.adjustBeginLineColumn(646, 1);
      try { 
        JavaCharStream.hexval('Z');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte) (-104);
      pipedOutputStream0.close();
      pipedInputStream0.read();
      pipedOutputStream0.flush();
      char char0 = 'G';
      try { 
        JavaCharStream.hexval('G');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.5996992982632343
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-104);
      pipedOutputStream0.close();
      pipedOutputStream0.flush();
      pipedOutputStream0.flush();
      pipedInputStream0.read(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, (byte)8, 63);
      JavaCharStream.hexval('e');
      try { 
        javaCharStream0.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      try { 
        JavaCharStream.hexval('L');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.8908672406920366
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Invalid escape character at line ");
      stringReader0.read();
      stringReader0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 110, 4062, 1);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.ReadByte();
      javaCharStream0.BeginToken();
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0);
      javaCharStream1.ReInit((Reader) stringReader0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedInputStream0.mark(4062);
      JavaCharStream javaCharStream2 = new JavaCharStream(pipedInputStream0);
      javaCharStream2.Done();
      javaCharStream2.ReInit((InputStream) pipedInputStream0, 1, 14);
      javaCharStream2.GetSuffix(1);
      try { 
        JavaCharStream.hexval('J');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      try { 
        JavaCharStream.hexval('R');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.7258654461894092
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char char0 = 'E';
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "(,bv,`@PFj");
      JavaCharStream.hexval('E');
      StringReader stringReader0 = new StringReader("");
      int int0 = 1;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1, 14);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      javaCharStream0.Done();
      stringReader0.ready();
      int int1 = 72;
      javaCharStream0.inputStream = null;
      // Undeclared exception!
      try { 
        javaCharStream0.adjustBeginLineColumn(72, 72);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }
}
