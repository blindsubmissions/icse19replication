/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:56:06 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1084);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(pipedInputStream0);
      MockFile mockFile0 = new MockFile("7$u{", "You must first build\na Newsgroups file from\nthe Options panel's\n\"Build Group List\"");
      mockFile0.toPath();
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Locale locale0 = Locale.JAPAN;
      PrintStream printStream0 = mockPrintStream0.printf(locale0, "", (Object[]) null);
      mockPrintStream0.print('&');
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ProgressSet);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      OutputStream outputStream0 = null;
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.ABORT = true;
      base64Decoder0.decodeStream();
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, (byte)10);
      Object object0 = new Object();
      Base64Decoder base64Decoder2 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Base64Decoder base64Decoder3 = new Base64Decoder(bufferedCustomInputStream0, bufferedOutputStream0);
      base64Decoder3.decodeStream();
      // Undeclared exception!
      try { 
        bufferedOutputStream0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      DataInputStream dataInputStream0 = new DataInputStream(bufferedCustomInputStream0);
      int int0 = 121;
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(byteArrayInputStream0, 121);
      BufferedCustomInputStream bufferedCustomInputStream2 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)10, false);
      String string0 = "c3Hftk#n";
      File file0 = null;
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream((OutputStream) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Null output stream
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte)10;
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)10;
      byte[] byteArray2 = new byte[8];
      byteArray2[0] = (byte)65;
      byteArray2[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray2);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)94);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.IsBatch = true;
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.foundbegin = false;
      base64Decoder1.decodeStream();
      byteArrayInputStream0.markSupported();
      Base64Decoder base64Decoder2 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      bufferedCustomInputStream0.skip(3L);
      base64Decoder2.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder2.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder2.decodeStream();
      base64Decoder2.decodeStream();
      assertFalse(base64Decoder2.ProgressSet);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.19144408195771734
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte)10;
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)10;
      byte[] byteArray2 = new byte[8];
      byteArray2[0] = (byte)65;
      byteArray2[2] = (byte) (-123);
      byteArray2[3] = (byte)94;
      byteArray2[4] = (byte)10;
      byteArray2[5] = (byte)10;
      byteArray2[6] = (byte)10;
      byteArray2[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray2);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, 5746, true);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream1, (OutputStream) null);
      base64Decoder0.decodeStream();
      byteArrayInputStream0.markSupported();
      base64Decoder1.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(4L, base64Decoder0.getLineCount());
      
      base64Decoder1.decodeStream();
      assertEquals(0L, base64Decoder1.getLineCount());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.18490739916777568
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte)10;
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)10;
      byte[] byteArray2 = new byte[8];
      byteArray2[0] = (byte)51;
      byteArray2[2] = (byte)2;
      byteArray2[3] = (byte)76;
      byteArray2[4] = (byte)10;
      byteArray2[5] = (byte)10;
      byteArray2[6] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray2);
      byteArrayInputStream0.reset();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, 912, false);
      File file0 = MockFile.createTempFile("u#\")qN", "u#\")qN");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(3L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.19144408195771734
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte)10;
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)10;
      byte[] byteArray2 = new byte[8];
      byteArray2[0] = (byte)63;
      byteArray2[2] = (byte)100;
      byteArray2[3] = (byte)94;
      byteArray2[4] = (byte)10;
      byteArray0[4] = (byte)10;
      byteArray2[6] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray2);
      byteArrayInputStream0.reset();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, 300, false);
      File file0 = MockFile.createTempFile("u#\")qN", "Finished downloads:");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }
}
