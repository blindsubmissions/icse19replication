/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:14:43 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
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
      StringReader stringReader0 = new StringReader("),@',V^4iw");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.prevCharIsLF = true;
      javaCharStream0.prevCharIsCR = false;
      javaCharStream0.getBeginColumn();
      stringReader0.read();
      stringReader0.ready();
      stringReader0.reset();
      javaCharStream0.backup(0);
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = 4095;
      stringReader0.reset();
      javaCharStream0.bufline = intArray0;
      javaCharStream0.backup(0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "),@',V^4iw");
      // Undeclared exception!
      try { 
        stringReader0.read(charBuffer0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Mq71KMuzCvdd$S;O");
      int int0 = 0;
      stringReader0.mark(0);
      stringReader0.reset();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      int int1 = 0;
      int int2 = (-1);
      javaCharStream0.ReInit((Reader) stringReader0, 0, (-1));
      javaCharStream0.FillBuff();
      javaCharStream0.getBeginLine();
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      int int0 = 11;
      stringReader0.reset();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 11, 4565);
      InputStream inputStream0 = null;
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
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      int int0 = 0;
      stringReader0.markSupported();
      stringReader0.skip(0);
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 0, 1661);
      boolean boolean0 = true;
      char[] charArray0 = new char[3];
      charArray0[0] = 'b';
      javaCharStream0.column = 0;
      stringReader0.markSupported();
      charArray0[1] = '`';
      charArray0[2] = 'Y';
      javaCharStream0.nextCharBuf = charArray0;
      javaCharStream0.prevCharIsCR = true;
      // Undeclared exception!
      try { 
        javaCharStream0.getEndColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, 0, 0);
      javaCharStream0.bufpos = 0;
      javaCharStream0.getColumn();
      javaCharStream0.tokenBegin = 1;
      // Undeclared exception!
      try { 
        javaCharStream0.BeginToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      int int0 = 258;
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 258, 1135);
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
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      // Undeclared exception!
      try { 
        javaCharStream0.getLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Reader reader0 = null;
      int int0 = 0;
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, 2184, 92, 0);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.ReInit((Reader) null);
      javaCharStream0.tokenBegin = (-441);
      javaCharStream0.nextCharInd = 2184;
      // Undeclared exception!
      try { 
        javaCharStream0.ExpandBuff(true);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, (-2154), (-2154));
      javaCharStream0.adjustBeginLineColumn(335, (-1541));
      // Undeclared exception!
      try { 
        javaCharStream0.ExpandBuff(true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      sequenceInputStream0.read();
      sequenceInputStream0.available();
      sequenceInputStream0.read();
      sequenceInputStream0.skip((-1L));
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream0, 1294, 1294);
      StringReader stringReader0 = new StringReader("");
      stringReader0.read();
      javaCharStream0.ReInit((Reader) stringReader0, 1294, 1294);
      javaCharStream0.ReInit((Reader) stringReader0, (-1), 0, 991);
      // Undeclared exception!
      try { 
        javaCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream0);
      javaCharStream0.line = (-1);
      javaCharStream0.ReInit((InputStream) sequenceInputStream0, 5638, (-587));
      StringReader stringReader0 = new StringReader("Kjm30t+!%IS");
      javaCharStream0.ReInit((Reader) stringReader0);
      // Undeclared exception!
      try { 
        javaCharStream0.ReInit((Reader) stringReader0, 397, 1, (-587));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.8848713335781608
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.getBeginColumn();
      javaCharStream0.readChar();
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
  //Test case number: 13
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, 755, 755, 755);
      javaCharStream0.nextCharInd = 755;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)85;
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)85);
      pipedInputStream0.mark((byte)85);
      javaCharStream0.ReInit((InputStream) pipedInputStream0, (int) (byte)117, (int) (byte)85);
      byteArray0[1] = (byte)117;
      byteArray0[2] = (byte)59;
      byteArray0[3] = (byte) (-77);
      byteArray0[4] = (byte) (-71);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)38;
      javaCharStream0.buffer = null;
      byteArray0[7] = (byte)29;
      byteArray0[8] = (byte)14;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (-1));
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0);
      javaCharStream0.backup(755);
      javaCharStream0.adjustBeginLineColumn(755, (-1826));
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
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("qd]%/\"#vw:9qGST");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 3253, 3253);
      javaCharStream0.GetImage();
      // Undeclared exception!
      try { 
        javaCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0437938808441543
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, (-2154), (-2154));
      javaCharStream0.adjustBeginLineColumn(169, 169);
      javaCharStream0.adjustBeginLineColumn(335, (-1503));
      javaCharStream0.ExpandBuff(false);
      // Undeclared exception!
      try { 
        javaCharStream0.UpdateLineColumn('<');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringReader stringReader0 = new StringReader("o?U2w#HMG/B7et-");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 4083, 4083, 4083);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      stringReader0.reset();
      javaCharStream0.column = 4083;
      javaCharStream0.BeginToken();
      javaCharStream0.GetSuffix(4083);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      StringReader stringReader0 = new StringReader("");
      stringReader0.reset();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.Done();
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-107);
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)69;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[4] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-107), 0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.GetSuffix((byte)0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6525902233018674
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("~-AIb'");
      int int0 = 258;
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 258, 1135);
      javaCharStream0.readChar();
      javaCharStream0.readChar();
      try { 
        javaCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  //Test case number: 22
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 94, 94, 84);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.ReInit((Reader) stringReader0);
      javaCharStream0.backup(84);
      javaCharStream0.GetImage();
      javaCharStream0.BeginToken();
      try { 
        javaCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream0);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.adjustBeginLineColumn(0, (-1878));
      try { 
        JavaCharStream.hexval('/');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JavaCharStream.hexval('9');
      int int0 = (-425);
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-425));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6402061313456076
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringReader stringReader0 = new StringReader("o?U2w#HMG/B7et-");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 4083, 4083, 4083);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      stringReader0.reset();
      javaCharStream0.column = 4083;
      javaCharStream0.BeginToken();
      JavaCharStream.hexval('a');
      javaCharStream0.readChar();
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      try { 
        JavaCharStream.hexval('M');
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JavaCharStream.hexval('8');
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.9512595041439562
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("jZ");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      stringReader0.reset();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)9;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "jZ");
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)9;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.reset();
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (-365), (-365));
      javaCharStream0.BeginToken();
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      try { 
        JavaCharStream.hexval('S');
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
  /*Coverage entropy=0.6337812145189847
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      StringReader stringReader0 = new StringReader("");
      stringReader0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.adjustBeginLineColumn(0, (-1878));
      try { 
        JavaCharStream.hexval('`');
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
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      try { 
        JavaCharStream.hexval('P');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      JavaCharStream.hexval('7');
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
  //Test case number: 33
  /*Coverage entropy=1.5194145786535667
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      StringReader stringReader0 = new StringReader("");
      stringReader0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.adjustBeginLineColumn(0, (-1878));
      JavaCharStream.hexval('C');
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
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JavaCharStream.hexval('5');
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        JavaCharStream.hexval('T');
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
  /*Coverage entropy=0.37559286771423334
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JavaCharStream.hexval('b');
      FileSystemHandling.shouldAllThrowIOExceptions();
      JavaCharStream.hexval('b');
      JavaCharStream.hexval('c');
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 12, 11, 11);
      try { 
        javaCharStream0.FillBuff();
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      try { 
        JavaCharStream.hexval(':');
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
  /*Coverage entropy=0.9147879660354019
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringReader stringReader0 = new StringReader("o?U2w#HMG/B7et-");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 4083, 4083, 4083);
      javaCharStream0.ReadByte();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      stringReader0.reset();
      javaCharStream0.BeginToken();
      char[] charArray0 = javaCharStream0.buffer;
      javaCharStream0.FillBuff();
      javaCharStream0.BeginToken();
      try { 
        JavaCharStream.hexval('K');
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
  /*Coverage entropy=0.7169287516253211
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringReader stringReader0 = new StringReader("o?U2w#HMG/B7et-");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 4083, 4083, 4083);
      javaCharStream0.ReadByte();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      stringReader0.reset();
      javaCharStream0.BeginToken();
      char[] charArray0 = javaCharStream0.buffer;
      javaCharStream0.FillBuff();
      javaCharStream0.BeginToken();
      try { 
        JavaCharStream.hexval('Y');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.876766215154992
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      StringReader stringReader0 = new StringReader("");
      stringReader0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.adjustBeginLineColumn((-1085), (-4005));
      JavaCharStream.hexval('6');
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
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      String string0 = "";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      byte byte0 = (byte)9;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte)9;
      byteArray0[2] = (byte)9;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      char char0 = '^';
      try { 
        JavaCharStream.hexval('^');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      JavaCharStream.hexval('F');
      try { 
        JavaCharStream.hexval('k');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        JavaCharStream.hexval('@');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char char0 = '>';
      try { 
        JavaCharStream.hexval('>');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      StringReader stringReader0 = new StringReader("");
      stringReader0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.AdjustBuffSize();
      JavaCharStream.hexval('2');
  }
}