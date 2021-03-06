/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 05:18:43 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, false);
      bufferedCustomInputStream0.markSupported();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ProgressSet);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.16302362949436594
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "Newzgrabber.Base64Decoder");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)60;
      byteArray0[2] = (byte)60;
      byteArray0[4] = (byte)60;
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)60;
      byteArray1[1] = (byte)10;
      byteArray1[2] = (byte)10;
      byteArray1[3] = (byte)60;
      byteArray1[4] = (byte)60;
      byteArray1[5] = (byte)10;
      byteArray1[6] = (byte)60;
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setStatusObject(byteArrayInputStream0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.setReader(byteArrayInputStream1);
      byteArrayInputStream0.mark((byte)60);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis(18L);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.1732052067491771
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OutputStream outputStream0 = null;
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)85;
      byteArray0[2] = (byte)85;
      byteArray0[3] = (byte)85;
      byteArray0[4] = (byte)85;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)85;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[8] = (byte)85;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "GlD;^yf;nafq");
      base64Decoder0.setStatusRow(47);
      base64Decoder0.ProgressSet = true;
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

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "Newzgrabber.AboutPanel");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)10;
      byteArray0[3] = (byte)10;
      byteArray0[3] = (byte)10;
      byteArray0[5] = (byte)65;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.ABORT = true;
      bufferedCustomInputStream0.readLine();
      Newzgrabber.IsBatch = false;
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "Newzgrabber.AboutPanel");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte) (-3);
      byteArray0[3] = (byte)10;
      byteArray0[5] = (byte)33;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      bufferedCustomInputStream0.readLine();
      Newzgrabber.IsBatch = true;
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)49;
      byteArray0[1] = (byte)49;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)49;
      byteArray1[2] = (byte)49;
      byteArray1[3] = (byte) (-107);
      byteArray1[4] = (byte)49;
      byteArray1[5] = (byte)10;
      byteArray1[7] = (byte)10;
      byteArray1[8] = (byte)26;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, false);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream1, (OutputStream) null);
      base64Decoder0.decodeStream();
      BufferedCustomInputStream bufferedCustomInputStream2 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder1.decodeStream();
      assertFalse(base64Decoder1.equals((Object)base64Decoder0));
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "");
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)97;
      byteArray0[2] = (byte)65;
      byte[] byteArray1 = new byte[5];
      byteArray1[1] = (byte) (-37);
      byteArray1[2] = (byte)97;
      byteArray1[3] = (byte)33;
      byteArray1[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setBegin(false);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, false);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream1, (OutputStream) null);
      base64Decoder1.setStatusObject(bufferedCustomInputStream1);
      base64Decoder1.decodeStream();
      base64Decoder1.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder1.decodeStream();
      assertEquals(1L, base64Decoder1.getLineCount());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)85;
      byteArray0[2] = (byte)85;
      byteArray0[3] = (byte)85;
      byteArray0[4] = (byte)85;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)85;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setBegin(true);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Base64Decoder base64Decoder2 = new Base64Decoder(bufferedCustomInputStream1, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder2.setStatusObject(bufferedCustomInputStream0);
      // Undeclared exception!
      try { 
        base64Decoder1.decodeStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.Base64Decoder", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "");
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-3);
      byteArray0[2] = (byte)65;
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-3);
      byteArray1[1] = (byte) (-37);
      byteArray1[2] = (byte) (-3);
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray1[3] = (byte)33;
      byteArray1[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setBegin(true);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, false);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream1, (OutputStream) null);
      base64Decoder1.LineCount = (-1L);
      base64Decoder1.decodeStream();
      System.setCurrentTimeMillis(25L);
      System.setCurrentTimeMillis((-2080L));
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ABORT);
  }
}
