/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:32:33 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.25731864054383163
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      System.setCurrentTimeMillis(1L);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)24;
      byteArray0[1] = (byte)10;
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)10;
      byteArray1[2] = (byte)24;
      byteArray1[4] = (byte)24;
      byteArray1[5] = (byte)10;
      byteArray1[6] = (byte)24;
      byteArray1[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 8);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)10, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((byte)10);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.15841057013179086
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      System.setCurrentTimeMillis(1L);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      byteArray0[2] = (byte)109;
      byteArray0[3] = (byte)109;
      byteArray0[4] = (byte)109;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)109;
      byteArray0[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MockFile mockFile0 = new MockFile(":", ":");
      mockFile0.mkdir();
      mockFile0.toURI();
      mockFile0.setReadOnly();
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      bufferedCustomInputStream0.setRemoveCarriages(false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, (byte)109);
      BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(mockPrintStream0, (byte)10);
      mockFile0.setExecutable(false, false);
      System.setCurrentTimeMillis((byte)109);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.ABORT = true;
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("bOCm9");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "EiOQ9z{/==rE;Bp");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)10;
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "EiOQ9z{/==rE;Bp");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 898);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(pushbackInputStream0, (byte)112, true);
      MockFile mockFile0 = new MockFile("EiOQ9z{/==rE;Bp", "EiOQ9z{/==rE;Bp");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, (byte)1);
      bufferedOutputStream0.flush();
      bufferedOutputStream0.close();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, bufferedOutputStream0);
      Newzgrabber.verbose = true;
      BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(mockPrintStream0, (byte)1);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, bufferedOutputStream0);
      base64Decoder1.decodeStream();
      assertEquals(1L, base64Decoder1.getLineCount());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.17884491271684755
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)10;
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)10;
      byteArray1[2] = (byte)46;
      byteArray1[3] = (byte)46;
      byteArray1[4] = (byte)46;
      byteArray1[5] = (byte)10;
      byteArray1[6] = (byte)46;
      byteArray1[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 8);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)10, false);
      MockFile mockFile0 = new MockFile("Username", "Username");
      mockFile0.mkdir();
      mockFile0.toURI();
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, (byte)46);
      BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(bufferedOutputStream0, 8);
      mockFile0.setExecutable(true, false);
      bufferedOutputStream0.write(byteArray0);
      System.setCurrentTimeMillis((-817L));
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, bufferedOutputStream0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(3L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.167944147734173
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      System.setCurrentTimeMillis(1L);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      byteArray0[2] = (byte)85;
      byteArray0[3] = (byte)85;
      byteArray0[4] = (byte)85;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)85;
      byteArray0[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 8);
      MockFile mockFile0 = new MockFile("\u0018\u0000\u0018");
      mockFile0.mkdir();
      mockFile0.toURI();
      mockFile0.setReadOnly();
      MockFile mockFile1 = new MockFile(mockFile0, "\u0015\u0015");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, (byte)85);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(pushbackInputStream0, (byte)85);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream1);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, bufferedOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals(3L, base64Decoder0.getLineCount());
      
      System.setCurrentTimeMillis(8);
      pushbackInputStream0.skip(0L);
      System.setCurrentTimeMillis(4L);
      Base64Decoder base64Decoder2 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream1);
      base64Decoder2.decodeStream();
      assertEquals(0L, base64Decoder2.getLineCount());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)10;
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)10;
      byteArray1[2] = (byte)51;
      byteArray1[3] = (byte)51;
      byteArray1[4] = (byte)51;
      byteArray1[5] = (byte)10;
      byteArray1[6] = (byte)51;
      byteArray1[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 8);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)10, false);
      MockFile mockFile0 = new MockFile("Username", "Username");
      mockFile0.mkdir();
      mockFile0.toURI();
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, (byte)51);
      BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(bufferedOutputStream0, 8);
      mockFile0.setExecutable(false, false);
      System.setCurrentTimeMillis(1998L);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      MockPrintStream mockPrintStream1 = new MockPrintStream(filterOutputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, bufferedOutputStream1);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(3L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      System.setCurrentTimeMillis(1L);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      byteArray0[2] = (byte)92;
      byteArray0[3] = (byte)92;
      byteArray0[4] = (byte)92;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)92;
      byteArray0[7] = (byte)92;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 8);
      MockFile mockFile0 = new MockFile("\u0018\u0000\u0018");
      FileSystemHandling.shouldAllThrowIOExceptions();
      mockFile0.toURI();
      mockFile0.setReadOnly();
      MockFile mockFile1 = new MockFile(mockFile0, "\u0015\u0015");
      mockFile0.getAbsoluteFile();
      pushbackInputStream0.mark(3714);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile1);
      mockFile1.delete();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(pushbackInputStream0, (byte)92);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      mockFile1.setExecutable(true, false);
      System.setCurrentTimeMillis((byte)92);
      MockPrintStream mockPrintStream1 = new MockPrintStream(bufferedOutputStream0);
      Base64Decoder base64Decoder2 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder1.decodeStream();
      System.setCurrentTimeMillis(1L);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      byteArray0[2] = (byte)109;
      byteArray0[3] = (byte)109;
      byteArray0[4] = (byte)109;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)109;
      byteArray0[7] = (byte)10;
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "0/H,; Y9QJj`c.");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)10);
      pushbackInputStream0.unread(byteArray0);
      pushbackInputStream0.mark(3714);
      MockPrintStream mockPrintStream0 = new MockPrintStream("0/H,; Y9QJj`c.");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(pushbackInputStream0, (byte)109);
      System.setCurrentTimeMillis((byte)109);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      base64Decoder0.setLineCount((-76L));
      base64Decoder0.setStatusObject(defaultTableModel0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals((-70L), base64Decoder0.getLineCount());
  }
}
