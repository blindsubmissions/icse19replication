/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 09:20:37 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import net.kencochrane.a4j.file.FileUtil;
import net.kencochrane.a4j.util.LoadProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
      Random.setNextRandom((-336));
      fileUtil0.renameFile("?L4HNT-jpkIcCL", "?L4HNT-jpkIcCL");
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=Bk%7ENrG%3FK+YP%5C%40U%28%7E&type=Bk~NrG?K YP\\@U(~&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "}H6c5_iLv8RLAY&CzxK");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("Bk~NrG?K YP@U(~", "Bk~NrG?K YP@U(~");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = (-1L);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&=SfPHZ%5ExJZ%28%2FA_&mode=SfPHZ^xJZ(/A_&type=&page=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "%W0}05z0 ");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "SfPHZ^xJZ(/A_", "SfPHZ^xJZ(/A_", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=c\":R*Xo?]~gSann&type=c\":R*Xo?]~gSann&page=c\":R*Xo?]~gSann&offerstatus=c\":R*Xo?]~gSann&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "UcARLSperator");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchThirdPartySearchFile("c\":R*Xo?]~gSann", "c\":R*Xo?]~gSann", "c\":R*Xo?]~gSann", "c\":R*Xo?]~gSann");
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      arrayList0.sort(comparator0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("^", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=&mode=&type=lite&page=&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "W(#K$#,Uh-Vj<;ZOd[}");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "W(#K$#,Uh-Vj<;ZOd[}";
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=%24%7By1%2Be&mode=${y1+e&type=${y1+e&page=${y1+e&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=clear&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchKeywordSearchFile("${y1+e", "${y1+e", "${y1+e", "${y1+e");
      File file0 = fileUtil0.downloadKeywordSearchFile("${y1+e", "`;bdFgEK[?b:{n", "ShoppingCart=clear&f=xml&dev-t=", "`;bdFgEK[?b:{n");
      assertNull(file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/G_R~ROLB23#G504J_G_R~ROLB23#G504J.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ShoppingCart=add&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      String string0 = null;
      String string1 = "net.kencochrane.a4j.file.FileUtil";
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=ShoppingCart=add&f=xml&dev-t=&type=null&offerpage=null&offer=net.kencochrane.a4j.file.FileUtil&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.file.FileUtil");
      fileUtil0.getASINFile("ShoppingCart=add&f=xml&dev-t=", (String) null, "net.kencochrane.a4j.file.FileUtil", (String) null);
      Random.setNextRandom(1);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      fileUtil0.fetchASINFile("ShoppingCart=add&f=xml&dev-t=", "M(jJM?2", "1", "ShoppingCart=add&f=xml&dev-t=");
      ArrayList<String> arrayList0 = null;
      try {
        arrayList0 = new ArrayList<String>((-1642));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1642
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchSimilarItems("IU:H0uLs@4-59+#' A", "IU:H0uLs@4-59+#' A");
      File file0 = fileUtil0.getSimilarItems("I4>^", "I4>^");
      assertNull(file0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("^");
      assertNull(file0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5740973368489728
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_^.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "wMOf");
      LoadProperties.instance();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      arrayList0.sort(comparator0);
      fileUtil0.fetchAccessories("^", arrayList0);
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_I4>^.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "dY4*'?eo~nr");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("I4>^", "I4>^");
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
      assertEquals(11L, file0.length());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_QUJOB.*Y.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchSimilarItems("qujOb.*y", "dev-t=");
      File file0 = fileUtil0.getSimilarItems("qujOb.*y", "");
      assertEquals("/S_QUJOB.*Y.XML", file0.toString());
      assertNotNull(file0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "*{<A|=l{PJ_");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNotNull(fileInputStream0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4681399390162087
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/BK~NRG?K YP\\@U(~_BK~NRG?K YP\\@U(~_BK~NRG?K YP\\@U(~.XML");
      byte[] byteArray0 = new byte[2];
      fileUtil0.downloadBrowseNodeFile("Bk~NrG?K YP@U(~", "Bk~NrG?K YP@U(~", "@wWBZSM", "cacheLife");
      byteArray0[0] = (byte)100;
      byteArray0[1] = (byte)2;
      fileUtil0.oldestAge = (long) (byte)100;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.getBrowseNodeFile("Bk~NrG?K YP@U(~", "Bk~NrG?K YP@U(~", "Bk~NrG?K YP@U(~");
      fileUtil0.getBrowseNodeFile("Bk~NrG?K YP@U(~", "Bk~NrG?K YP@U(~", "Bk~NrG?K YP@U(~");
      System.setCurrentTimeMillis((byte)100);
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.2148896539491203
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/G_R~ROLB23#G504J_G_R~ROLB23#G504J.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "o(x#>");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.kencoc/rane.a4j.data.Query");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.kencoc/rane.a4j.data.Query");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.kencoc/rane.a4j.data.Query");
      FileUtil fileUtil0 = new FileUtil();
      byte[] byteArray0 = new byte[78];
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "net.kencoc/rane.a4j.data.Query");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.kencoc/rane.a4j.data.Query");
      fileUtil0.oldestAge = 1L;
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.kencoc/rane.a4j.data.Query");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.ken[ochrane.a4j.file.FileUtil");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "o(x#>");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.ken[ochrane.a4j.file.FileUtil");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "net.ken[ochrane.a4j.file.FileUtil");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "net.ken[ochrane.a4j.file.FileUtil");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "net.kencoc/rane.a4j.data.Query");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.ken[ochrane.a4j.file.FileUtil");
      MockFile mockFile0 = new MockFile("G", "R~roLb23#g504J");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "net.kencoc/rane.a4j.data.Query");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "net.kencoc/rane.a4j.data.Query");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      LoadProperties.instance();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("G", "G", "R~roLb23#g504J", "R~roLb23#g504J");
      assertNotNull(fileInputStream0);
      
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5247073930301438
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/G_R~ROLB23#G504J_G_R~ROLB23#G504J.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ShoppingCart=add&f=xml&dev-t=");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/G_R~ROLB23#G504J_G_R~ROLB23#G504J.XML");
      FileSystemHandling.createFolder(evoSuiteFile1);
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=G&type=G&offerpage=R~roLb23#g504J&offer=R~roLb23#g504J&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Pko@K>\u0006jM`x");
      fileUtil0.getASINFile("ShoppingCart=add&f=xml&dev-t=", (String) null, "Pko@K>\u0006jM`x", (String) null);
      fileUtil0.fetchASINFile("G", "G", "R~roLb23#g504J", "R~roLb23#g504J");
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/G_R~ROLB23#G504J_G_R~ROLB23#G504J.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.kencochrane.a4j.data.Query");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=o(Wx#>&type=lite&offerpage=&Asin.&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.data.Query");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.kencochrane.a4j.data.Query");
      FileUtil fileUtil0 = new FileUtil();
      byte[] byteArray0 = new byte[38];
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "net.kencochrane.a4j.data.Query");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "net.kencochrane.a4j.data.Query");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "net.kencochrane.a4j.data.Query");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.downloadSimilaritesFile("o(Wx#>", "&Asin.", "net.kencochrane.a4j.file.FileUtil");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "G");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      System.setCurrentTimeMillis(559L);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=0&type=lite&offerpage=1&offer=all&f=xml");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/evosuite_readability_gen/projects/2_a4j");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=clear&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Object> arrayList1 = new ArrayList<Object>();
      arrayList0.removeAll(arrayList1);
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("YpwzfoGXjQ4%L-R", arrayList0, ".1L{S");
      assertFalse(boolean0);
  }
}
