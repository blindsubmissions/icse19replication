/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 18:51:37 GMT 2018
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(", ");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-57);
      byteArray0[1] = (byte)60;
      byteArray0[2] = (byte) (-85);
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray0[3] = (byte)78;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("#9niV2/", "#9niV2/");
      LoadProperties.instance();
      fileUtil0.renameFile(", ", ", ");
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchSimilarItems("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.getSimilarItems("", "");
      FileSystemHandling.shouldAllThrowIOExceptions();
      Random.setNextRandom(100);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("Xt");
      assertNull(file0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&wu(U374q CV#\"J1eFJ<=wu%28U374q+CV%23%22J1eFJ%3C&mode=wu(U374q CV#\"J1eFJ<&type=wu(U374q CV#\"J1eFJ<&page=wu(U374q CV#\"J1eFJ<&offer=wu(U374q CV#\"J1eFJ<&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "wu(U374q CV#\"J1eFJ<");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchGenericSearchFile("wu(U374q CV#\"J1eFJ<", "wu(U374q CV#\"J1eFJ<", "wu(U374q CV#\"J1eFJ<", "wu(U374q CV#\"J1eFJ<", "wu(U374q CV#\"J1eFJ<", "wu(U374q CV#\"J1eFJ<");
      File file0 = fileUtil0.downloadGenericSearchFile("2a9mP Dck4g0V", "k0U^wid2&", (String) null, (String) null, "^Pwk.", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_86400000.XML");
      arrayList0.add("86400000");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=86400000,86400000&type=lite&offerpage=1&offer=all&f=xml");
      arrayList0.stream();
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "olPdG[Y?m.frS3;m/'qG");
      arrayList0.add("86400000");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      System.setCurrentTimeMillis(1L);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getAccessories("'),Gt-XwD;", arrayList0);
      Random.setNextRandom((-1));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=/#]aFt{&type=/#]aFt{&page=/#]aFt{&offerstatus=/#]aFt{&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=remove&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("/#]aFt{", "/#]aFt{", "/#]aFt{", "/#]aFt{");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("86400000");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("86400000", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fileUtil0.fetchBNFile("86400000", "86400000", "86400000");
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("86400000", ",L", "ts_", "86400000");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getASINFile("wu(U374q C\"J1eFJ<", "wu(U374q C\"J1eFJ<", "$ct[", "$ct[");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("wu(U374q C\"J1eFJ<", "wu(U374q C\"J1eFJ<", "wu(U374q C\"J1eFJ<", "wu(U374q C\"J1eFJ<");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "9y3;Vl,Ze26RZ'-");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "9y3;Vl,Ze26RZ'-";
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0042424730540764
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      String string0 = ".012345679B89";
      byte[] byteArray0 = new byte[36];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ".012345679B89");
      String string1 = "P\\xYt\"%U>koBW";
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "PxYt\"%U>koBW");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "PxYt\"%U>koBW");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ".012345679B89");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".012345679B89");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "PxYt\"%U>koBW");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.oldestAge = 18L;
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "PxYt\"%U>koBW");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".012345679B89");
      fileUtil0.getSimilarItems("", ".012345679B89");
      Random.setNextRandom((-2144042166));
      ArrayList<Integer> arrayList0 = null;
      try {
        arrayList0 = new ArrayList<Integer>((-2144042166));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -2144042166
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3579778549873243
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[22];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      MockFile mockFile0 = new MockFile(".012345679B89");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".012345679B89");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "PxYt\"o%#>koBW");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ".012345679B89");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile1, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.isAgeGood(mockFile0);
      fileUtil0.getSimilarItems("", (String) null);
      File file0 = fileUtil0.getSimilarItems("PxYt\"o%#>koBW", ".012345679B89");
      assertNull(file0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_86400000.XML");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "G>A");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "@iqA2^");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("86400000", "net.kencochrane.a4j.file.FileUtil");
      assertNotNull(fileInputStream0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/86400000_86400000_86400000.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchBNFile("86400000", "86400000", "86400000");
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("86400000", "1", "1", "86400000");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_86400000.XML");
      arrayList0.add("86400000");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "86400000");
      arrayList0.add("86400000");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("86400000", arrayList0);
      assertEquals(8, fileInputStream0.available());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=%7C%23%5DaFt%7B&mode=|#]aFt{&type=|#]aFt{&page=|#]aFt{&f=xml");
      fileUtil0.oldestAge = 1L;
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "There is no Properties File Setting to default");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("|#]aFt{", "|#]aFt{", "|#]aFt{", "|#]aFt{");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/evosuite_readability_gen/projects/2_a4j");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=wu(U374q C\"J1eFJ<&type=wu(U374q C\"J1eFJ<&offerpage=wu(U374q C\"J1eFJ<&offer=wu(U374q C\"J1eFJ<&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7N3ns<+A:tz_j;+#[;VP");
      File file0 = fileUtil0.getASINFile("wu(U374q C\"J1eFJ<", "wu(U374q C\"J1eFJ<", "wu(U374q C\"J1eFJ<", "wu(U374q C\"J1eFJ<");
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=1&mode=86400000&type=lite&page=1&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "#({jZ69,e1a0vW.-Fm2");
      fileUtil0.oldestAge = (-183L);
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("86400000", "1", "1", "86400000");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[36];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ".012345679B89");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "PxYt\"%U>koBW");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "PxYt\"%U>koBW");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ".012345679B89");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".012345679B89");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "PxYt\"%U>koBW");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0143456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.deleteFile("PxYt\"%U>koBW");
      fileUtil0.oldestAge = (-2L);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "PxYt\"%U>koBW");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".012345679B89");
      File file0 = fileUtil0.getSimilarItems("", ".012345679B89");
      assertNotNull(file0);
      assertEquals(996L, file0.length());
  }
}
