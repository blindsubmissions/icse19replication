/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:33:49 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import net.kencochrane.a4j.file.FileUtil;
import net.kencochrane.a4j.util.LoadProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
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
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=Urx&type=Urx&page=Urx&offerstatus=Urx&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.data.Query");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = 1000L;
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("Urx", "Urx", "Urx", "Urx");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=&offerpage=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=modify&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getASINFile("QK4V[.20K", "\"d{|;VQbNa", "all", ".xml");
      fileUtil0.getASINFile("", "", "", "");
      File file0 = fileUtil0.getASINFile("cacheLife", "Fl 0fS[", "all", "\"d{|;VQbNa");
      assertNull(file0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("AsinSearch");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      byte[] byteArray0 = new byte[29];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, " P++^XbXU;QGSIq2 ");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      MockFile mockFile0 = new MockFile("AsinSearch");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " P++^XbXU;QGSIq2 ");
      byte[] byteArray1 = new byte[97];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " P++^XbXU;QGSIq2 ");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " P++^XbXU;QGSIq2 ");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " P++^XbXU;QGSIq2 ");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " P++^XbXU;QGSIq2 ");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, " P++^XbXU;QGSIq2 ");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "G#Er`4cs$` QQn#Ix>0u");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "G#Er`4cs$` QQn#Ix>0u");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "G#Er`4cs$` QQn#Ix>0u");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "G#Er`4cs$` QQn#Ix>0u");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      fileUtil0.isAgeGood(mockFile0);
      Random.setNextRandom((-273));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("AsinSearch");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      MockFile mockFile0 = new MockFile("AsinSearch");
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&type=Log file isn't there Setting default properties&page=&offerstatus=qG#Er`4cs/`n#Ix>0u&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      byte[] byteArray0 = new byte[41];
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      mockFile0.setExecutable(false, true);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "qG#Er`4cs/`n#Ix>0u");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "t0k{nnISx8oN{Cr/Hr");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "t0k{nnISx8oN{Cr/Hr");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.isAgeGood(mockFile0);
      FileUtil fileUtil1 = new FileUtil();
      assertFalse(fileUtil1.equals((Object)fileUtil0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = 0L;
      fileUtil0.renameFile("&CartId=", "&CartId=");
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=S.milartySearh&mode=S.milartySearh&type=S.milartySearh&page=S.milartySearh&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "RkT<!aHzpbPZ-");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchKeywordSearchFile("S.milartySearh", "S.milartySearh", "S.milartySearh", "S.milartySearh");
      Random.setNextRandom(142);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchSimilarItems("d{)", "d{)");
      fileUtil0.getSimilarItems("d{)", "d{)");
      File file0 = fileUtil0.getSimilarItems("d{)", "d{)");
      assertNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("`yu(n&br1t5R|s^*P", "~CJ**", "`yu(n&br1t5R|s^*P");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=~CJ**&mode=~CJ**&type=lite&page=~CJ**&offer=new&f=xml");
      byte[] byteArray0 = new byte[14];
      byteArray0[0] = (byte) (-10);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=get&f=xml&dev-t=");
      fileUtil0.getBrowseNodeFile("~CJ**", "~CJ**", "~CJ**");
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      fileUtil0.fetchAccessories("}VSl>5^P/tt", arrayList0);
      arrayList0.add("}VSl>5^P/tt");
      arrayList0.add("}VSl>5^P/tt");
      File file0 = fileUtil0.getAccessories("}VSl>5^P/tt", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("B#4NVSjU48m}M");
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=%3D&type==&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "a4j-config.txt");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile("=", "=");
      File file0 = fileUtil0.downloadBlendedSearchFile("a4j-config.txt", "=");
      assertNull(file0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&79=+]]DaY=79%3D%2B%5D%5DDaY&mode=79=+]]DaY&type=79=+]]DaY&page=79=+]]DaY&offer=79=+]]DaY&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.file.FileUtil");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchGenericSearchFile("lite", "lite", "net.kencochrane.a4j.file.FileUtil", "lite", "net.kencochrane.a4j.file.FileUtil", "{E[=");
      fileUtil0.fetchGenericSearchFile("79=+]]DaY", "79=+]]DaY", "79=+]]DaY", "79=+]]DaY", "79=+]]DaY", "79=+]]DaY");
      System.setCurrentTimeMillis(86400000L);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6731183626432506
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_BD0.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchSimilarItems("bD0", "3]CiR&56d");
      fileUtil0.getSimilarItems("3]CiR&56d", "");
      fileUtil0.getSimilarItems("", "Vp}0Hg6V@4jdG");
      fileUtil0.renameFile("", "");
      System.setCurrentTimeMillis(1L);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/QK0V_QK0V_QK0V.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      String string0 = "qk0v";
      fileUtil0.fetchBNFile("qk0v", "qk0v", "qk0v");
      MockFile mockFile0 = new MockFile("qk0v");
      try { 
        mockFile0.getCanonicalFile();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3579778549873243
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/~CJ**_~CJ**_~CJ**.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "&");
      LoadProperties.instance();
      fileUtil0.getBrowseNodeFile("~CJ**", "~CJ**", "~CJ**");
      fileUtil0.getBrowseNodeFile((String) null, (String) null, (String) null);
      File file0 = fileUtil0.getBrowseNodeFile("&", "MXpcH?zsu", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_CRS,=ORDB!R{+L3~2F.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "T4aGmQ[Fe/<+");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("cRS,=orDB!R{+L3~2F", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5247073930301438
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchASINFile("", "", "'", "cacheLife");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/TF-_TF-_TF-_TF-.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "TF-");
      fileUtil0.fetchASINFile("TF-", "TF-", "TF-", "TF-");
      File file0 = fileUtil0.getASINFile("TF-", "T{zo 9V]jN\"3:NnnE:", ">8\"4", "`pP4/");
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=RkT<!aHMzpbPZ-&type=lite&offerpage=RkT<!aHMzpbPZ-&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "RkT<!aHMzpbPZ-");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadSimilaritesFile("RkT<!aHMzpbPZ-", "RkT<!aHMzpbPZ-", "i+e!~nbj!rm|ui4XfK");
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("RkT<!aHMzpbPZ-", "RkT<!aHMzpbPZ-", "RkT<!aHMzpbPZ-");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=cRS,=orDB!R{+L3~2F,V2r]|B)MKCW>s&d%&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "cRS,=orDB!R{+L3~2F");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(":/E9HBB\\n");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("cRS,=orDB!R{+L3~2F");
      arrayList0.add("V2r]|B)MKCW>s&d%");
      fileUtil0.downloadAccessoriesFile("V2r]|B)MKCW>s&d%", arrayList0, ":/E9HBB\n");
      Random.setNextRandom(0);
  }
}