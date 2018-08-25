/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:11:44 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.InputStream;
import java.io.PipedInputStream;
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "News Port");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "News Port");
      MockPrintStream mockPrintStream0 = new MockPrintStream("News Port");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.decodeStream();
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      mockPrintStream0.flush();
      base64Decoder0.decodeStream();
      base64Decoder0.updateProgress();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }
}
