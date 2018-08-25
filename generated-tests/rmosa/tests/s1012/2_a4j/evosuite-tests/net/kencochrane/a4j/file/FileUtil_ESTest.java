/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:27:35 GMT 2018
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
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&=&mode=&type=&page=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "/*A~S03sMY4o#+p5-");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchGenericSearchFile("", "", "", "", "", "");
      Random.setNextRandom((-1307));
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "/*A~S03sMY4o#+p5-", "c_", "c_", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=null&type=null&offerpage=ta_&offer=ta_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Gth}n~(FS68e:");
      File file0 = fileUtil0.getASINFile((String) null, (String) null, "ta_", "ta_");
      assertNull(file0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=%7CA78NJkjI%5E%5C&mode=&type=AsinSearch&page=AsinSearch&f=xml");
      fileUtil0.oldestAge = (-47L);
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "[*oTjRCG|g/=avT$R&T$");
      fileUtil0.fetchKeywordSearchFile("|A78NJkjI^", "", "AsinSearch", "AsinSearch");
      Random.setNextRandom((-3607));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("amazonServerURL");
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=t_&mode=t_&type=lite&page=t_&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "*k3'");
      File file0 = fileUtil0.getBrowseNodeFile("t_", "t_", "t_");
      assertNull(file0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = 2L;
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "N27oKwx");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=_&type=_&page=_&offerstatus=_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "kUH4?l%zQQH~(MChVJNb");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchThirdPartySearchFile("_", "_", "_", "_");
      System.setCurrentTimeMillis(2600L);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=bkiNk&type=lite&offerpage=bkiNk&offer=all&f=xml");
      fileUtil0.fetchSimilarItems("", "");
      String string0 = "g_";
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "g_");
      fileUtil0.getSimilarItems("bkiNk", "bkiNk");
      String string1 = "r";
      // Undeclared exception!
      try { 
        MockFile.createTempFile("r", "bkiNk");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchASINFile(">},i%]fIBrI#JE_oT}L", "s_", "s_", "s_");
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "1", "type=", ">},i%]fIBrI#JE_oT}L", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      LoadProperties.instance();
      fileUtil0.fetchAccessories("T", arrayList0);
      File file0 = fileUtil0.getAccessories("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      fileUtil0.renameFile("j", "j");
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("j");
      FileSystemHandling.createFolder(evoSuiteFile0);
      LoadProperties.instance();
      fileUtil0.renameFile("j", "j");
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3579778549873243
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/TA_0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "$0}e~#QI3;EQpfOd");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/A_0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+.XML");
      FileSystemHandling.createFolder(evoSuiteFile1);
      LoadProperties.instance();
      File file0 = fileUtil0.getAccessories("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", arrayList0);
      assertNotNull(file0);
      assertEquals("A_0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+.XML", file0.getName());
      assertTrue(file0.isDirectory());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_1(OSAA@?R.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("1(OsAA@?r", arrayList0);
      assertEquals(1, fileInputStream0.available());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_V.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "v");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("v", "v");
      assertEquals(2, fileInputStream0.available());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5740973368489726
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/__NULL.XML");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=&mode=&type=lite&page=null&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      FileSystemHandling.appendLineToFile(evoSuiteFile1, (String) null);
      LoadProperties.instance();
      fileUtil0.fetchBNFile("", "", (String) null);
      File file0 = fileUtil0.getBrowseNodeFile("A", "BgJu0O", "BgJu0O");
      assertNull(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/>},I%]FIBRI#JE_OT}L_S__S__S_.XML");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile(">},i%]fIBrI#JE_oT}L", "s_", "s_", "s_");
      assertEquals(2, fileInputStream0.available());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3579778549873243
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_NULL_NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      fileUtil0.getASINFile((String) null, (String) null, (String) null, (String) null);
      fileUtil0.deleteFile("");
  }
}