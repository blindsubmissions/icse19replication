/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 11:30:36 GMT 2018
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getSimilarItems("", "");
      fileUtil0.fetchSimilarItems("", "");
      File file0 = fileUtil0.getSimilarItems("", "_");
      assertNull(file0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.fetchAccessories("9cu[4H+.#C(,G`*", arrayList0);
      arrayList0.ensureCapacity((-100));
      arrayList0.trimToSize();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("", "", "");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("associateID", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "t=");
      LoadProperties.instance();
      fileUtil0.renameFile("\"eVp:.s4oZp", "\"eVp:.s4oZp");
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchKeywordSearchFile("Q11QR_3rKHAZt", "Q11QR_3rKHAZt", "d+fs#/qIS^;V)qkF", "l@M");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=s_&mode=s_&type=s_&page=s_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "p1a4@ge=");
      fileUtil0.downloadKeywordSearchFile("s_", "s_", "s_", "s_");
      Random.setNextRandom((-2145274301));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0114042647073518
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/FV/R*')HBAYP_FV/R*')HBAYP_FV/R*')HBAYP.XML");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=Fv/R*')hbaYp&mode=ta_&type=lite&page=Fv/R*')hbaYp&offer=new&f=xml");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "1 rxmIMwtCZ0< /B]<");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getBrowseNodeFile("Fv/R*')hbaYp", "Fv/R*')hbaYp", "Fv/R*')hbaYp");
      fileUtil0.getBrowseNodeFile("ta_", "Fv/R*')hbaYp", "Fv/R*')hbaYp");
      System.setCurrentTimeMillis((-3282L));
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      String string0 = "ivKR*')hbYp";
      fileUtil0.fetchASINFile("$", "ivKR*')hbYp", "ivKR*')hbYp", "$");
      String string1 = "z:";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/$_IVKR*')HBYP_IVKR*')HBYP_$.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Object> arrayList0 = null;
      try {
        arrayList0 = new ArrayList<Object>((-711));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -711
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart(")e$Rdw");
      assertNull(file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&x=x&mode=x&type=x&page=x&offer=x&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "qaJ+rzC&.K(m\"<&IqIl");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadGenericSearchFile("x", "x", "x", "x", "x", "x");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("x", "x", "", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=http%3A%2F%2Fxmlamazo.net%2Fonca%2Fxml3&type=http://xmlamazo.net/onca/xml3&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "cN<]`n13wy-_=`1D");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("http://xmlamazo.net/onca/xml3", "http://xmlamazo.net/onca/xml3");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=x%5EKuRvFb%7Cp9+91+LN76&type=x^KuRvFb|p9 91 LN76&f=xml");
      fileUtil0.cacheDir = "86400000";
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "+");
      File file0 = fileUtil0.downloadBlendedSearchFile("x^KuRvFb|p9 91 LN76", "x^KuRvFb|p9 91 LN76");
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/3RD_1392409281320_0.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " /Daf!,oe");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&type=&page=&offerstatus=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "V8M)uHQ!,57NuZ8;AS");
      fileUtil0.fetchThirdPartySearchFile("", "", "", "");
      FileUtil fileUtil1 = new FileUtil();
      assertFalse(fileUtil1.equals((Object)fileUtil0));
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_V.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "V");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("V", arrayList0);
      assertEquals(1, fileInputStream0.available());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3579778549873243
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.0123456789.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "fX}&;H3sZ#5Fu*");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "fX}&;H3sZ#5Fu*");
      File file0 = fileUtil0.getSimilarItems(".0123456789", ".0123456789");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "fX}&;H3sZ#5Fu*");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".0123456789");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ht[p://xml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ht[p://xml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ht[p://xml.amazon.net/onca/xml3");
      file0.toURI();
      byte[] byteArray0 = new byte[13];
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ht[p://xml.amazon.net/onca/xml3");
      fileUtil0.getSimilarItems("Neouv1k#92JcfEPa&", "ht[p://xml.amazon.net/onca/xml3");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ht[p://xml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "fX}&;H3sZ#5Fu*");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      file0.setWritable(true, true);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "fX}&;H3sZ#5Fu*");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ht[p://xml.amazon.net/onca/xml3");
      byte[] byteArray1 = new byte[38];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ht[p://xml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ht[p://xml.amazon.net/onca/xml3");
      file0.setReadOnly();
      file0.setLastModified(30L);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "fX}&;H3sZ#5Fu*");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ht[p://xml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "-zf%Zg]l~7!>F(/;_V");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ht[p://xml.amazon.net/onca/xml3");
      fileUtil0.isAgeGood(file0);
      System.setCurrentTimeMillis(30L);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "jU0&@@qG/4U9q~");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchSimilarItems("", "");
      fileUtil0.deleteFile("jU0&@@qG/4U9q~");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3579778549873245
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/FV/R*')HBAYP_FV/R*')HBAYP_FV/R*')HBAYP.XML");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AsinSearch");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getBrowseNodeFile("Fv/R*')hbaYp", "Fv/R*')hbaYp", "Fv/R*')hbaYp");
      File file0 = fileUtil0.getBrowseNodeFile("ta_", "Fv/R*')hbaYp", "Fv/R*')hbaYp");
      assertNull(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/ASSOCIATEID__.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "associateID");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("associateID", "", "");
      assertEquals(11, fileInputStream0.available());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      String string0 = "ivKR*')hbYp";
      String string1 = "$";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/$_IVKR*')HBYP_IVKR*')HBYP_$.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ivKR*')hbYp");
      fileUtil0.fetchASINFile("$", "ivKR*')hbYp", "ivKR*')hbYp", "$");
      ArrayList<Object> arrayList0 = null;
      try {
        arrayList0 = new ArrayList<Object>((-711));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -711
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=ta_&type=lite&offerpage=&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7`!WW5]vw!'E,`2veQ0=");
      fileUtil0.cacheDir = "ta_";
      fileUtil0.getSimilarItems("ta_", "");
      Random.setNextRandom((-2145274301));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=k`~HQ\\p'W(`C&type=k`~HQ\\p'W(`C&offerpage=k`~HQ\\p'W(`C&offer=k`~HQ\\p'W(`C&f=xml");
      LoadProperties.instance();
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "N,p");
      boolean boolean0 = fileUtil0.downloadOneASINFile("k`~HQp'W(`C", "k`~HQp'W(`C", "k`~HQp'W(`C", "k`~HQp'W(`C", "k`~HQp'W(`C");
      assertFalse(boolean0);
  }
}