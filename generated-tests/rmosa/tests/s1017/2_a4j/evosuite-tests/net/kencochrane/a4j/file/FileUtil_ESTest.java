/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:18:39 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
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
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=2%21&type=2!&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "mode=");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile("2!", "2!");
      Random.setNextRandom(0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&OLN@=OLN%40&mode=OLN@&type=OLN@&page=OLN@&offer=OLN@&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "g.=9o9");
      fileUtil0.fetchGenericSearchFile("OLN@", "OLN@", "OLN@", "OLN@", "OLN@", "OLN@");
      Random.setNextRandom(3644);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      Random.setNextRandom(425);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-%7E%7C%2B&mode=I7gac5{j4V?bTkZ\\PQ0&type=0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+&page=a_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-107);
      byteArray0[1] = (byte)11;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte) (-17);
      byteArray0[4] = (byte)33;
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte) (-16);
      byteArray0[7] = (byte) (-54);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      MockFile mockFile0 = new MockFile("I7gac5{j4V?bTkZPQ0", "a_");
      File file0 = fileUtil0.downloadKeywordSearchFile("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "I7gac5{j4V?bTkZPQ0", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "a_");
      assertNull(file0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=gKo%5CH%3CCQ3_b%245ey&mode=gKo\\H<CQ3_b$5ey&type=gKo\\H<CQ3_b$5ey&page=gKo\\H<CQ3_b$5ey&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Log file isn't there Setting default properties");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/K_1392409281320_0.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("gKoH<CQ3_b$5ey", "gKoH<CQ3_b$5ey", "gKoH<CQ3_b$5ey", "gKoH<CQ3_b$5ey");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=G?gxj&type=G?gxj&page=G?gxj&offerstatus=G?gxj&f=xml");
      LoadProperties.instance();
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "a$mgev$yw");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("G?gxj", "G?gxj", "G?gxj", "G?gxj");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(", ");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile(", ");
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchSimilarItems((String) null, (String) null);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.downloadAccessoriesFile("", arrayList0, (String) null);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_;OLN@).XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ";OLN@)");
      ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories(";OLN@)", arrayList1);
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertEquals(6L, file0.length());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Ko#v>");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.fetchAccessories("", arrayList0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("net.kencochrane.a4j.util.LoadProperties", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5740973368489726
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/[B!J)_[B!J)_[B!J).XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "RFUiQS{~0");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("RFUiQS{~0", "3rd_", "3rd_");
      LoadProperties.instance();
      fileUtil0.fetchBNFile("[B!j)", "[B!j)", "[B!j)");
      // Undeclared exception!
      try { 
        fileUtil0.deleteFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ">eN");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertEquals(4, fileInputStream0.available());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.71408754118701
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_NULL_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      String string0 = "\\u:?F4TpSSmt?k}p";
      fileUtil0.downloadOneASINFile(string0, (String) null, "", "ta_", "");
      FileSystemHandling.shouldAllThrowIOExceptions();
      fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      Random.setNextRandom(425);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4241299173467736
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/.XML_.XML_.XML_.XML.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      byte[] byteArray0 = new byte[40];
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.getASINFile("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "");
      fileUtil0.getASINFile("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "I7gac5{j4V?bTkZPQ0", "I7gac5{j4V?bTkZPQ0", "I7gac5{j4V?bTkZPQ0");
      LoadProperties.instance();
      fileUtil0.renameFile("", "");
      fileUtil0.getASINFile(".xml", ".xml", ".xml", ".xml");
      System.setCurrentTimeMillis(37L);
      System.setCurrentTimeMillis(37L);
      fileUtil0.renameFile("I7gac5{j4V?bTkZPQ0", "AsinSearch");
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/.XML_.XML_.XML_.XML.XML");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)96;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte) (-56);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)89;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)19;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)1;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      File file0 = fileUtil0.getASINFile(".xml", ".xml", ".xml", ".xml");
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertEquals(9L, file0.length());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "RFUiQ\\S{~0";
      FileUtil fileUtil0 = new FileUtil();
      String string1 = "e-;a-j1";
      String string2 = null;
      String string3 = "";
      fileUtil0.fetchBNFile("e-;a-j1", (String) null, "");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=[B!j)&mode=[B!j)&type=lite&page=[B!j)&offer=new&f=xml");
      String string4 = "QRG_>D4@7{'J~X5";
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "QRG_>D4@7{'J~X5");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      fileUtil0.fetchBNFile("RFUiQS{~0", (String) null, (String) null);
      LoadProperties.instance();
      String string5 = "[B!j)";
      fileUtil0.fetchBNFile("[B!j)", "[B!j)", "[B!j)");
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=.xml&type=.xml&offerpage=.xml&offer=.xml&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "JZ+");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      File file0 = fileUtil0.getASINFile(".xml", ".xml", ".xml", ".xml");
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=null&type=lite&offerpage=null&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "9&!iO8KVq(P],7B");
      fileUtil0.getSimilarItems((String) null, (String) null);
      fileUtil0.downloadSimilaritesFile("9&!iO8KVq(P],7B", "9&!iO8KVq(P],7B", (String) null);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/.XML_.XML_.XML_.XML.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      byte[] byteArray0 = new byte[40];
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.getASINFile("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "");
      fileUtil0.getASINFile("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "I7gac5{j4V?bTkZPQ0", "I7gac5{j4V?bTkZPQ0", "I7gac5{j4V?bTkZPQ0");
      fileUtil0.oldestAge = (-1392409281283L);
      LoadProperties.instance();
      fileUtil0.renameFile("", "");
      fileUtil0.getASINFile(".xml", ".xml", ".xml", ".xml");
      System.setCurrentTimeMillis(37L);
      fileUtil0.renameFile("I7gac5{j4V?bTkZPQ0", "AsinSearch");
  }
}
