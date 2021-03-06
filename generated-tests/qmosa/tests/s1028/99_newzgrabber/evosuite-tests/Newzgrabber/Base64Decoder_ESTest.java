/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:34:17 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(pushbackInputStream0, 47);
      File file0 = MockFile.createTempFile("Getting the line data", "&kgAh;AW-|E3RC");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      bufferedCustomInputStream0.TIMEOUT = 47;
      base64Decoder0.setStatusRow(47);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ABORT);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)85;
      byteArray0[1] = (byte)81;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)119;
      byteArray0[4] = (byte) (-123);
      byteArray0[5] = (byte)47;
      byteArray0[6] = (byte)16;
      byteArray0[7] = (byte)4;
      byteArray0[8] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 6, (byte)119);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)4, false);
      bufferedCustomInputStream0.read();
      PrintStream printStream0 = DebugGraphics.logStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(printStream0, (byte)81);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, bufferedOutputStream0);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ProgressSet);
  }
}
