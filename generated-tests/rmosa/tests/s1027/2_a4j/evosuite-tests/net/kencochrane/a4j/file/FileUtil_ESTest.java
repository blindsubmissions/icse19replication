/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 17:51:07 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import net.kencochrane.a4j.file.FileUtil;
import net.kencochrane.a4j.util.LoadProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=amazonServerURL&type=amazonServerURL&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=add&f=xml&dev-t=");
      fileUtil0.fetchBlendedSearchFile("ShoppingCart=add&f=xml&dev-t=", "ShoppingCart=add&f=xml&dev-t=");
      File file0 = fileUtil0.downloadBlendedSearchFile("amazonServerURL", "amazonServerURL");
      assertNull(file0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=ta_&mode=a4j-config.txt&type=lite&page=a4j-config.txt&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "M}r<VGT37");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadBrowseNodeFile("M}r<VGT37", "", "", "");
      LoadProperties.instance();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("a4j-config.txt", "ta_", "a4j-config.txt");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Y&pUSKwQzbI", "Y&pUSKwQzbI", "Y&pUSKwQzbI", "Y&pUSKwQzbI");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("Q%Hpu;Hx} 9&,");
      assertNull(file0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=-2145338308&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.util.a4jUtil");
      Integer integer0 = new Integer((-2145338308));
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      arrayList0.add(integer0);
      System.setCurrentTimeMillis((-2145338308));
      arrayList0.stream();
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("net.kencochrane.a4j.util.a4jUtil", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=!G@?gee@&type=!G@?gee@&page=!G@?gee@&offerstatus=!G@?gee@&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "rS!z_{[c(S^k@)+bWc|");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = 86400000L;
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("!G@?gee@", "!G@?gee@", "!G@?gee@", "!G@?gee@");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchSimilarItems("N;J", "N;J");
      File file0 = fileUtil0.getSimilarItems("N;J", "");
      assertNull(file0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=ah6K%7E%3D&mode=ah6K~=&type=ah6K~=&page=ah6K~=&f=xml");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "-}(EuVV}xw/bXb5$8O\"");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("ah6K~=", "ah6K~=", "ah6K~=", "ah6K~=");
      assertNull(fileInputStream0);
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
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      arrayList0.ensureCapacity(4);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("amazonServerURL", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/evosuite_readability_gen/projects/2_a4j");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "( E'A&54@1:!ueDLo1");
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&d&pL=d%26pL&mode=d&pL&type=d&pL&page=d&pL&offer=d&pL&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "*+<#7ma5:_");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("d&pL", "d&pL", "d&pL", "d&pL", "d&pL", "d&pL");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/evosuite_readability_gen/projects/2_a4j");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("ts_", "ts_");
      fileUtil0.renameFile("", "");
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6769877743224173
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=ta_&mode=a4j-config.txt&type=lite&page=a4j-config.txt&offer=new&f=xml");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A4J-CONFIG.TXT_TA__A4J-CONFIG.TXT.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "M}r<VGT37");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadBrowseNodeFile("M}r<VGT37", "", "", "");
      LoadProperties.instance();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("a4j-config.txt", "ta_", "a4j-config.txt");
      assertNotNull(fileInputStream0);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3667110520552042
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/THERE IS NO PROPERTIES FILE SETTING TO DEFAULT_AH6KT0_~=_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.downloadGenericSearchFile("bD", "bD", "bD", "", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.oldestAge = 26L;
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ah6Kt0_~=");
      byte[] byteArray0 = new byte[10];
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ah6Kt0_~=");
      byteArray0[2] = (byte)0;
      fileUtil0.downloadBrowseNodeFile("@H%Oeu<,X", "ry&1HR&Fa", "u!E}'p7CO#-n7IH.R{b", "");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "There is no Properties File Setting to default");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "There is no Properties File Setting to default");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.getBrowseNodeFile("There is no Properties File Setting to default", "ah6Kt0_~=", (String) null);
      File file0 = fileUtil0.getBrowseNodeFile((String) null, "l$:@pdF", "}qI");
      assertNull(file0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/AH6KT0_~=_AH6KT0_~=_AH6KT0_~=.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ah6Kt0_~=");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ah6Kt0_~=");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)115;
      byteArray0[2] = (byte)115;
      byteArray0[0] = (byte)115;
      byteArray0[6] = (byte)115;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "There is no Properties File Setting to default");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "There is no Properties File Setting to default");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "P{t9vvoU1}fP2_ejdtd");
      File file0 = fileUtil0.getBrowseNodeFile("ah6Kt0_~=", "ah6Kt0_~=", "ah6Kt0_~=");
      assertNotNull(file0);
      
      System.setCurrentTimeMillis((byte)115);
      fileUtil0.deleteFile("MS}UODjlB`H");
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertEquals(399L, file0.length());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_N;J.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getSimilarItems("N;J", "N;J");
      System.setCurrentTimeMillis(1291L);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_N;J.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("N;J", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5740973368489728
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_AMAZONSERVERURL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      Integer integer0 = new Integer((-2145338308));
      arrayList0.add(integer0);
      arrayList0.ensureCapacity(4);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("amazonServerURL", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Y&PUSKWQZBI_Y&PUSKWQZBI_Y&PUSKWQZBI_Y&PUSKWQZBI.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0~@O)=Y%t$zLDjU");
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      fileUtil0.deleteFile("0~@O)=Y%t$zLDjU");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Y&pUSKwQzbI", "Y&pUSKwQzbI", "Y&pUSKwQzbI", "Y&pUSKwQzbI");
      assertEquals(16, fileInputStream0.available());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=&offerpage=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "K^*{$GgEo@Z8a");
      fileUtil0.getASINFile("", "", "", "");
      boolean boolean0 = fileUtil0.downloadOneASINFile("", (String) null, "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=(T8[;lqyh<;ksS8`&type=lite&offerpage=m9&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "J-}bBBPz)rX(G");
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("(T8[;lqyh<;ksS8`", "m9", "(T8[;lqyh<;ksS8`");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/THERE IS NO PROPERTIES FILE SETTING TO DEFAULT_AH6KT0_~=_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.downloadGenericSearchFile("bD", "bD", "bD", "", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.oldestAge = (-222L);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ah6Kt0_~=");
      byte[] byteArray0 = new byte[10];
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ah6Kt0_~=");
      byteArray0[2] = (byte)0;
      fileUtil0.downloadBrowseNodeFile("@H%Oeu<,X", "ry&1HR&Fa", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "There is no Properties File Setting to default");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "There is no Properties File Setting to default");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      fileUtil0.getBrowseNodeFile("There is no Properties File Setting to default", "ah6Kt0_~=", (String) null);
      File file0 = fileUtil0.getBrowseNodeFile((String) null, "l$:@pdF", "}qI");
      assertNull(file0);
  }
}
