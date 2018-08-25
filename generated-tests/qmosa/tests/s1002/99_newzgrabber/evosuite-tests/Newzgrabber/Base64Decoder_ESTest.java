/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:05:40 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)68;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("mz3Q|F3@|Hn]5Iv5s");
      mockFileOutputStream0.write(byteArray0, (int) (byte)0, 13);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ProgressSet);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, 42);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ABORT);
  }
}
