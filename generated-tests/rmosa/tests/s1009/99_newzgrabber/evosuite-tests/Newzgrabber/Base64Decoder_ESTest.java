/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 09:03:19 GMT 2018
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayInputStream;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.13579395875159386
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)2;
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)2;
      byte[] byteArray2 = new byte[8];
      byteArray2[0] = (byte)62;
      byteArray2[1] = (byte)10;
      byteArray2[2] = (byte)101;
      byteArray2[3] = (byte)62;
      byteArray2[4] = (byte)101;
      byteArray2[5] = (byte)101;
      byteArray2[6] = (byte)10;
      byteArray2[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray2);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, false);
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.normalize(uRI0);
      MockFile mockFile0 = new MockFile(uRI1);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      mockFileOutputStream0.release();
      bufferedCustomInputStream1.markSupported();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream1, mockFileOutputStream0);
      mockFileOutputStream0.write(byteArray2);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(8L, mockFile0.length());
      assertEquals(3L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.25731864054383163
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "f;GfPGEB./kmd/D<");
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)93;
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)10;
      byteArray1[2] = (byte)10;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)10;
      byteArray1[7] = (byte)10;
      byteArray1[1] = (byte)44;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      URI uRI0 = MockURI.aFileURI;
      MockURI.normalize(uRI0);
      MockFile mockFile0 = new MockFile(uRI0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      mockFileOutputStream0.release();
      mockFile0.setReadable(true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      mockFileOutputStream0.write((int) (byte)10);
      base64Decoder0.setReader(byteArrayInputStream0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(4L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.2711893730418441
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "f;GfPGEB./kmd/D<");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)93;
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)10;
      byteArray1[1] = (byte)10;
      byteArray1[2] = (byte)10;
      byteArray1[3] = (byte)2;
      byteArray1[4] = (byte)93;
      byteArray1[5] = (byte)2;
      byteArray1[6] = (byte)10;
      byteArray1[7] = (byte)44;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      URI uRI0 = MockURI.aFileURI;
      MockURI.normalize(uRI0);
      MockFile mockFile0 = new MockFile(uRI0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      mockFileOutputStream0.release();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.setReader(byteArrayInputStream0);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(4L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.14999492361041503
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ABORT");
      byte[] byteArray0 = new byte[13];
      byteArray0[0] = (byte)71;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)71;
      byteArray0[3] = (byte)2;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)71;
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "]>]]\u0000");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, false);
      URI uRI0 = MockURI.aFileURI;
      MockURI.normalize(uRI0);
      MockFile mockFile0 = new MockFile(uRI0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      mockFileOutputStream0.release();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      boolean boolean0 = base64Decoder0.ABORT;
      base64Decoder0.decodeStream();
      mockFileOutputStream0.release();
      mockFileOutputStream0.write((-1053));
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-15);
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte) (-15);
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)93;
      byteArray0[5] = (byte)2;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)44;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      URI uRI0 = MockURI.aFileURI;
      MockURI.normalize(uRI0);
      MockFile mockFile0 = new MockFile(uRI0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      mockFileOutputStream0.release();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      mockFileOutputStream0.write(byteArray0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.13579395875159386
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)2;
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)2;
      byte[] byteArray2 = new byte[8];
      byteArray2[0] = (byte)56;
      byteArray2[1] = (byte)10;
      byteArray2[2] = (byte)101;
      byteArray2[3] = (byte)56;
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, (String) null);
      byteArray2[4] = (byte)101;
      byteArray2[5] = (byte)101;
      byteArray2[6] = (byte)10;
      byteArray2[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray2);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(bufferedCustomInputStream0, false);
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.normalize(uRI0);
      MockFile mockFile0 = new MockFile(uRI1);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      mockFileOutputStream0.release();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream1, mockFileOutputStream0);
      mockFileOutputStream0.write(byteArray2);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
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
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)93;
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)25;
      byteArray1[2] = (byte)25;
      byteArray1[3] = (byte)2;
      byteArray1[4] = (byte)10;
      byteArray1[1] = (byte)10;
      byteArray1[1] = (byte)47;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      URI uRI0 = MockURI.aFileURI;
      MockURI.normalize(uRI0);
      MockFile mockFile0 = new MockFile(uRI0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      mockFileOutputStream0.release();
      BufferedCustomInputStream bufferedCustomInputStream1 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream1, mockFileOutputStream0);
      mockFileOutputStream0.write(byteArray1);
      base64Decoder0.decodeStream();
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }
}
