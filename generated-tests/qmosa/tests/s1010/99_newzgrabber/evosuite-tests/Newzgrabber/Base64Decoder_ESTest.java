/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:26:37 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
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
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream("&8");
      PrintStream printStream0 = mockPrintStream0.append('y');
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      bufferedCustomInputStream0.TIMEOUT = 0;
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
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0, false);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "The following are the lines from the base64 decode");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("+", false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      Newzgrabber.verbose = true;
      mockFileOutputStream0.getChannel();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ProgressSet);
  }
}