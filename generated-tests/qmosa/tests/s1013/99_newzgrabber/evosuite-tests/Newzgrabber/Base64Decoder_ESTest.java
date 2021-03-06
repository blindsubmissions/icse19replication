/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:11:31 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.PipedOutputStream;
import java.net.URI;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)10;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-11);
      byteArray0[8] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      MockFile mockFile0 = new MockFile("CC7oY#H('UX0?#", "oz/V");
      File file0 = MockFile.createTempFile("oz/V", "", (File) mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Locale locale0 = Locale.FRENCH;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) (byte)0;
      objectArray0[1] = (Object) (byte)0;
      objectArray0[2] = (Object) (byte)0;
      objectArray0[3] = (Object) (byte)0;
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.decodeStream();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "CC7oY#H('UX0?#";
      stringArray0[2] = "CC7oY#H('UX0?#";
      stringArray0[3] = "oz/V";
      stringArray0[4] = "oz/V";
      Newzgrabber.main(stringArray0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)10;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-11);
      byteArray0[8] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      MockFile mockFile0 = new MockFile("CC7oY#H('UX0?#", "oz/V");
      File file0 = MockFile.createTempFile("oz/V", "", (File) mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Locale locale0 = Locale.FRENCH;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) (byte)0;
      objectArray0[1] = (Object) (byte)0;
      objectArray0[2] = (Object) (byte)0;
      objectArray0[3] = (Object) (byte)0;
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.decodeStream();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "CC7oY#H('UX0?#";
      stringArray0[2] = "";
      stringArray0[3] = "oz/V";
      stringArray0[4] = "oz/V";
      Newzgrabber.main(stringArray0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)10;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)0;
      byteArray0[8] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      MockFile mockFile0 = new MockFile("CC7oY#H('UX0?#", "oz/V");
      File file0 = MockFile.createTempFile("oz/V", "oz/V", (File) mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Locale locale0 = Locale.FRENCH;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) (byte)0;
      objectArray0[1] = (Object) (byte)0;
      objectArray0[2] = (Object) (byte)0;
      objectArray0[3] = (Object) (byte)0;
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.ABORT = true;
      base64Decoder0.decodeStream();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "oz/V";
      stringArray0[1] = "CC7oY#H('UX0?#";
      stringArray0[2] = "CC7oY#H('UX0?#";
      stringArray0[3] = "oz/V";
      stringArray0[4] = "oz/V";
      Newzgrabber.main(stringArray0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.22371807606583377
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-25);
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte) (-40);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      MockFile mockFile0 = new MockFile(".", "\u0000\u0000\u0000");
      MockFile mockFile1 = new MockFile("Snt*q?S\u0007I&UG:#}", ".");
      mockFile1.mkdir();
      MockFile.createTempFile("\u009C\u0000\u00B0", ".", (File) mockFile1);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Locale locale0 = Locale.FRENCH;
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.decodeStream();
      String[] stringArray0 = new String[0];
      Newzgrabber.main(stringArray0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((byte) (-25));
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-25);
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte)10;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      byteArray0[3] = (byte) (-40);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(".");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      Newzgrabber.IsBatch = true;
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      Base64Decoder base64Decoder2 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, (byte)10, true);
      Base64Decoder base64Decoder3 = new Base64Decoder(bufferedCustomInputStream1, objectOutputStream0);
      Base64Decoder base64Decoder4 = new Base64Decoder(bufferedCustomInputStream1, objectOutputStream0);
      base64Decoder4.decodeStream();
      base64Decoder3.decodeStream();
      base64Decoder3.decodeStream();
      Base64Decoder base64Decoder5 = new Base64Decoder(bufferedCustomInputStream0, objectOutputStream0);
      Base64Decoder base64Decoder6 = new Base64Decoder(bufferedCustomInputStream0, objectOutputStream0);
      Base64Decoder base64Decoder7 = new Base64Decoder(bufferedCustomInputStream0, objectOutputStream0);
      Base64Decoder base64Decoder8 = new Base64Decoder(bufferedCustomInputStream1, objectOutputStream0);
      base64Decoder6.decodeStream();
      MockFileOutputStream mockFileOutputStream0 = null;
      try {
        mockFileOutputStream0 = new MockFileOutputStream((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.17884491271684755
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      byteArray0[5] = (byte)10;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      byteArray0[3] = (byte)61;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(".");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      Base64Decoder base64Decoder2 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, (byte)10, true);
      Base64Decoder base64Decoder3 = new Base64Decoder(bufferedCustomInputStream1, objectOutputStream0);
      Base64Decoder base64Decoder4 = new Base64Decoder(bufferedCustomInputStream1, objectOutputStream0);
      Base64Decoder base64Decoder5 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder5.decodeStream();
      base64Decoder3.decodeStream();
      base64Decoder5.decodeStream();
      Base64Decoder base64Decoder6 = new Base64Decoder(bufferedCustomInputStream0, objectOutputStream0);
      Base64Decoder base64Decoder7 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      Base64Decoder base64Decoder8 = new Base64Decoder(bufferedCustomInputStream1, objectOutputStream0);
      Base64Decoder base64Decoder9 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      URI uRI0 = MockURI.aFTPURI;
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile(uRI0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URI scheme is not \"file\"
         //
         verifyException("java.io.File", e);
      }
  }
}
