/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 08:30:02 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.13269142083987176
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-123);
      byteArray0[1] = (byte)86;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)68;
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)86;
      byteArray0[1] = (byte)10;
      byteArray1[3] = (byte) (-123);
      byteArray1[4] = (byte)5;
      byteArray1[5] = (byte)10;
      byteArray1[6] = (byte)86;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Long long0 = new Long((byte) (-123));
      MockFile mockFile0 = new MockFile("mdBAzJciG;<_", "mdBAzJciG;<_");
      MockFile mockFile1 = new MockFile("ne+ja/O,0:/=R($P", "mdBAzJciG;<_");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("mdBAzJciG;<_");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      mockFile1.toURI();
      base64Decoder0.decodeStream();
      byteArrayInputStream0.reset();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(4L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-123);
      byteArray0[1] = (byte)44;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)68;
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)44;
      byteArray0[1] = (byte)10;
      byteArray1[3] = (byte) (-123);
      byteArray1[4] = (byte)5;
      byteArray1[5] = (byte)10;
      byteArray1[6] = (byte)44;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Long long0 = new Long((byte) (-123));
      MockFile mockFile0 = new MockFile("mdBAzJciG;<_", "mdBAzJciG;<_");
      MockFile mockFile1 = new MockFile("ne+ja/O,0:/=R($P", "mdBAzJciG;<_");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("mdBAzJciG;<_");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      mockFile1.toURI();
      base64Decoder0.decodeStream();
      Newzgrabber.verbose = true;
      byteArrayInputStream0.reset();
      FileSystemHandling.shouldAllThrowIOExceptions();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((byte) (-123));
      System.setCurrentTimeMillis((byte)5);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.25731864054383163
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)86;
      byteArray0[2] = (byte)4;
      byteArray0[4] = (byte)68;
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)86;
      byteArray1[2] = (byte)10;
      byteArray1[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      MockFile mockFile0 = new MockFile("mdBAzJciG;<_", "s<Om$6JIu.u=u=o^Qr");
      mockFile0.getAbsoluteFile();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      mockFileOutputStream0.flush();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder1.decodeStream();
      base64Decoder0.os = (OutputStream) mockFileOutputStream0;
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(3L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.13579395875159386
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[6] = (byte)95;
      byteArray0[2] = (byte)47;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/evosuite_readability_gen/projects/99_newzgrabber");
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "");
      FileSystemHandling.createFolder(evoSuiteFile0);
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)47;
      byte[] byteArray1 = new byte[7];
      byteArray0[8] = (byte)10;
      byteArray1[1] = (byte)95;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      MockFile mockFile0 = new MockFile("s<Om$6JIu.u=u=o^Qr", "s<Om$6JIu.u=u=o^Qr");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("Center");
      FileSystemHandling.appendDataToFile(evoSuiteFile1, byteArray1);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9s5'&i");
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, true);
      bufferedCustomInputStream1.mark(3577);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream1, mockFileOutputStream0);
      base64Decoder0.setStatusRow(120);
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((-2502L));
      base64Decoder0.decodeStream();
      assertEquals(3L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.13906079845474112
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)113;
      byteArray0[1] = (byte)86;
      byteArray0[2] = (byte)4;
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)68;
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)86;
      byteArray0[3] = (byte)10;
      byteArray1[3] = (byte)113;
      byteArray1[4] = (byte)113;
      byteArray1[5] = (byte)10;
      byteArray1[6] = (byte)113;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      MockFile mockFile0 = new MockFile("mdBAzJciG;<_", "mdBAzJciG;<_");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      URI uRI0 = MockURI.aFTPURI;
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      bufferedCustomInputStream0.markSupported();
      Base64Decoder base64Decoder2 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder2.decodeStream();
      assertNotSame(base64Decoder2, base64Decoder0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-123);
      byteArray0[1] = (byte)58;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)68;
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)58;
      byteArray0[1] = (byte)10;
      byteArray1[3] = (byte) (-123);
      byteArray1[4] = (byte)5;
      byteArray1[5] = (byte)10;
      byteArray1[6] = (byte)58;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Long long0 = new Long((byte) (-123));
      MockFile mockFile0 = new MockFile("mdBAzJciG;<_", "mdBAzJciG;<_");
      MockFile mockFile1 = new MockFile("ne+ja/O,0:/=R($P", "mdBAzJciG;<_");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("mdBAzJciG;<_");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      mockFile1.toURI();
      base64Decoder0.ABORT = true;
      base64Decoder0.decodeStream();
      byteArrayInputStream0.reset();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)95;
      byteArray0[2] = (byte)48;
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)68;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      byteArrayInputStream0.read();
      MockFile mockFile0 = new MockFile("s<Om$6JIu.u=u=o^Qr", "s<Om$6JIu.u=u=o^Qr");
      bufferedCustomInputStream0.setTempfile(".");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" K'9");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      Newzgrabber.IsBatch = true;
      base64Decoder0.setStatusRow((byte)10);
      base64Decoder0.decodeStream();
      // Undeclared exception!
      try { 
        byteArrayInputStream0.read(byteArray0, 1717986918, 5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)47;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)48;
      byte[] byteArray1 = new byte[7];
      byteArray0[8] = (byte)10;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      byteArrayInputStream0.read();
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0);
      BufferedCustomInputStream bufferedCustomInputStream2 = new BufferedCustomInputStream(byteArrayInputStream0);
      BufferedCustomInputStream bufferedCustomInputStream3 = new BufferedCustomInputStream(bufferedCustomInputStream2, false);
      MockFile mockFile0 = new MockFile("mdBAzJciG;<_");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.setStatusRow((byte)0);
      base64Decoder0.decodeStream();
      // Undeclared exception!
      try { 
        byteArrayInputStream0.read(byteArray0, (int) (byte)10, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.14999492361041503
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-123);
      byteArray0[1] = (byte)61;
      byteArray0[2] = (byte)61;
      byte byte0 = (byte)10;
      byteArray0[4] = (byte)68;
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)61;
      byteArray0[1] = (byte)10;
      byteArray1[3] = (byte) (-123);
      byteArray1[4] = (byte)61;
      byteArray1[5] = (byte)10;
      byteArray1[6] = (byte)61;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      byteArrayInputStream0.mark(1979);
      Long long0 = new Long((byte) (-123));
      MockFile mockFile0 = new MockFile("mdBAzJciG;<_", "mdBAzJciG;<_");
      MockFile mockFile1 = new MockFile("ne+ja/O,0:/=R($P", "mdBAzJciG;<_");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("mdBAzJciG;<_");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      mockFile0.toURI();
      base64Decoder0.decodeStream();
      byteArrayInputStream0.reset();
      try { 
        base64Decoder0.decodeStream();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }
}
