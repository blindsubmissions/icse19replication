/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:06:45 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Locale;
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
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, 1665, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream("Adding ");
      Locale locale0 = new Locale("Adding ", "Adding ");
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) bufferedCustomInputStream0;
      objectArray0[1] = (Object) locale0;
      objectArray0[2] = (Object) null;
      objectArray0[3] = (Object) locale0;
      objectArray0[4] = (Object) mockPrintStream0;
      Object object0 = new Object();
      objectArray0[5] = object0;
      objectArray0[6] = (Object) mockPrintStream0;
      PrintStream printStream0 = mockPrintStream0.format(locale0, "VhAQh", objectArray0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
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
      Newzgrabber.verbose = true;
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, (OutputStream) null);
      // Undeclared exception!
      try { 
        base64Decoder0.decodeStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.Base64Decoder", e);
      }
  }
}
