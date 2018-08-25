/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 15:30:55 GMT 2018
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
import java.io.PushbackInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.13906079845474112
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)117;
      byteArray0[1] = (byte)117;
      byteArray0[2] = (byte)59;
      byteArray0[3] = (byte)36;
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)117;
      byteArray0[7] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream1.close();
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(byteArrayInputStream1);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.updateProgress();
      byteArrayInputStream0.reset();
      bufferedCustomInputStream0.available();
      base64Decoder0.setBegin(false);
      base64Decoder0.decodeStream();
      byteArrayInputStream0.reset();
      bufferedCustomInputStream0.available();
      base64Decoder0.setBegin(true);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream((InputStream) null, 300);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream1, (OutputStream) null);
      base64Decoder1.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.setLineCount(300);
      bufferedCustomInputStream1.readLine();
      base64Decoder1.setOutputStream((OutputStream) null);
      Newzgrabber.verbose = false;
      base64Decoder0.decodeStream();
      base64Decoder1.decodeStream();
      base64Decoder0.decodeStream();
      Base64Decoder base64Decoder2 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder2.decodeStream();
      assertFalse(base64Decoder2.equals((Object)base64Decoder1));
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      bufferedCustomInputStream0.setRemoveCarriages(false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setLineCount((byte)2);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(8L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.13906079845474112
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)117;
      byteArray0[1] = (byte)117;
      byteArray0[2] = (byte)44;
      byteArray0[3] = (byte)36;
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)117;
      byteArray0[7] = (byte)117;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "\u00AC");
      byteArray0[8] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.close();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.updateProgress();
      base64Decoder0.setBegin(true);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      byteArrayInputStream0.reset();
      base64Decoder0.decodeStream();
      bufferedCustomInputStream0.readByteLine();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      bufferedCustomInputStream0.available();
      System.setCurrentTimeMillis((byte)117);
      System.setCurrentTimeMillis((byte)117);
      System.setCurrentTimeMillis((byte)10);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((-1163L));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-106);
      byteArray0[1] = (byte) (-106);
      byteArray0[2] = (byte)44;
      byteArray0[3] = (byte)36;
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-106);
      byteArray0[7] = (byte)0;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "\u00AC");
      byteArray0[8] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.close();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.updateProgress();
      base64Decoder0.setBegin(true);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      byteArrayInputStream0.reset();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      bufferedCustomInputStream0.available();
      System.setCurrentTimeMillis((byte) (-106));
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((byte)0);
      System.setCurrentTimeMillis((-2316L));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)10;
      byteArray0[0] = (byte)10;
      byteArray0[5] = (byte)10;
      byteArray0[4] = (byte)2;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      bufferedCustomInputStream0.setRemoveCarriages(true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.IsBatch = true;
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((byte)2);
      System.setCurrentTimeMillis((byte)0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)77;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[4] = (byte)77;
      byteArray0[8] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      bufferedCustomInputStream0.read(byteArray0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((byte)77);
      System.setCurrentTimeMillis((-1));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)46;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte) (-16);
      byteArray0[4] = (byte)46;
      byteArray0[0] = (byte)46;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      bufferedCustomInputStream0.setRemoveCarriages(true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      bufferedCustomInputStream0.read(byteArray0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder1.decodeStream();
      System.setCurrentTimeMillis((byte) (-16));
      base64Decoder0.decodeStream();
      base64Decoder1.decodeStream();
      base64Decoder1.decodeStream();
      assertFalse(base64Decoder1.ABORT);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)117;
      byteArray0[2] = (byte)117;
      byteArray0[7] = (byte)10;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)117;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)10;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      bufferedCustomInputStream0.closeTemp();
      base64Decoder0.setLineCount((-1L));
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-84);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-84);
      byteArray0[3] = (byte) (-84);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[4] = (byte)36;
      byteArray0[6] = (byte) (-84);
      byteArray0[7] = (byte) (-84);
      byteArray0[8] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setBegin(false);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.setLineCount((byte)36);
      base64Decoder0.ABORT = true;
      byteArrayInputStream0.reset();
      System.setCurrentTimeMillis((byte) (-84));
      base64Decoder0.decodeStream();
      assertEquals(36L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.14999492361041503
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte byte0 = (byte)0;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)117;
      byteArray0[1] = (byte)117;
      byteArray0[2] = (byte)117;
      byteArray0[3] = (byte)52;
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)117;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)10;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.close();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      OutputStream outputStream0 = null;
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.updateProgress();
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
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)44;
      byteArray0[3] = (byte)36;
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte)0;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.close();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder0.setBegin(true);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0, (-1880483006), (byte)44);
      byteArrayInputStream0.reset();
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((byte)0);
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((byte)0);
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((byte)10);
      base64Decoder0.decodeStream();
      assertEquals(4L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.1425058673927378
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)47;
      byteArray0[1] = (byte)117;
      byteArray0[2] = (byte)117;
      byteArray0[3] = (byte)47;
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte)0;
      byteArray0[7] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      byteArrayInputStream0.close();
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      byteArrayInputStream0.reset();
      bufferedCustomInputStream1.available();
      base64Decoder0.setBegin(true);
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
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)117;
      byteArray0[1] = (byte)117;
      byteArray0[2] = (byte)43;
      byteArray0[3] = (byte)36;
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)117;
      byteArray0[7] = (byte)117;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "\u00AC");
      byteArray0[8] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.close();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.updateProgress();
      base64Decoder0.setBegin(true);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      byteArrayInputStream0.reset();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      bufferedCustomInputStream0.available();
      System.setCurrentTimeMillis((byte)117);
      System.setCurrentTimeMillis((byte)117);
      System.setCurrentTimeMillis((byte)10);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((-1163L));
  }
}