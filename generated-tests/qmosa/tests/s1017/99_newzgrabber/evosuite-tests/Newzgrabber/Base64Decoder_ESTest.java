/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:27:56 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = true;
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, 604, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setOutputStream((OutputStream) null);
      base64Decoder0.setBegin(false);
      base64Decoder0.setOutputStream((OutputStream) null);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      try { 
        bufferedCustomInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Resetting to invalid mark
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, pipedOutputStream0);
      base64Decoder0.LineCount = 500L;
      Newzgrabber.verbose = true;
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
