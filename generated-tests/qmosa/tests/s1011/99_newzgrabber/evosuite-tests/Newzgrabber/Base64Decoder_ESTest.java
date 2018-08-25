/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:49:09 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.InputStream;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, 1665, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream("Adding ");
      Locale locale0 = new Locale("Adding ", "Adding ");
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) bufferedCustomInputStream0;
      objectArray0[1] = (Object) locale0;
      objectArray0[2] = (Object) null;
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Adding ";
      stringArray0[1] = "Download";
      stringArray0[2] = "VhAQh";
      stringArray0[3] = "9ywc3wN!J";
      stringArray0[4] = "VhAQh";
      stringArray0[5] = "Adding ";
      stringArray0[6] = "9ywc3wN!J";
      stringArray0[7] = "Adding ";
      BufferedCustomInputStream.main(stringArray0);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream1, mockPrintStream0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0, false);
      mockPrintStream0.printf("", objectArray0);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      Newzgrabber.verbose = true;
      base64Decoder1.decodeStream();
      assertFalse(base64Decoder1.ABORT);
  }
}