/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 17:39:19 GMT 2018
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
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.16302362949436594
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)108;
      byteArray0[1] = (byte)74;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      byteArray0[2] = (byte)108;
      byteArray0[3] = (byte)108;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(byteArrayInputStream0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream1, pipedOutputStream0);
      try { 
        base64Decoder0.decodeStream();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.2711893730418441
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)26;
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)88;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      byteArrayInputStream0.read();
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, (byte)87, true);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream1, pipedOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder0.setReader((InputStream) null);
      base64Decoder0.setStatusRow(1);
      base64Decoder0.setStatusRow(2578);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)26;
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)88;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)88, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream("The following are the lines from the base64 decode");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.LineCount = 1118L;
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ProgressSet);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)87;
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)2;
      byteArray1[1] = (byte)10;
      byteArray1[2] = (byte)88;
      byteArray1[4] = (byte)2;
      byteArray1[5] = (byte)51;
      byteArray1[6] = (byte)10;
      byteArray1[7] = (byte)26;
      byteArray1[8] = (byte)88;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      byteArrayInputStream0.read();
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)88, false);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, pipedOutputStream0);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream1, pipedOutputStream0);
      base64Decoder1.decodeStream();
      assertEquals(2L, base64Decoder1.getLineCount());
  }
}
