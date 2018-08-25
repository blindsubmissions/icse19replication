/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 18:23:22 GMT 2018
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
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("W_", "W_", "W_");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=yS=!P&mode=&type=lite&page=yS=!P&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "+78j:;3m-,e4#O");
      File file0 = fileUtil0.getBrowseNodeFile("", "yS=!P", "yS=!P");
      assertNull(file0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=nr%26%7BTon2%7D&mode=nr&{Ton2}&type=nr&{Ton2}&page=nr&{Ton2}&f=xml");
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, "N7'\"LJC2\"4>y{>jY;^%F");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchKeywordSearchFile("", "N7'\"LJC2\"4>y{>jY;^%F", "", "UTF-8");
      fileUtil0.downloadKeywordSearchFile("nr&{Ton2}", "nr&{Ton2}", "nr&{Ton2}", "nr&{Ton2}");
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=oV8%40%3Ahq80G%7C%29QI%3BDj&type=oV8@:hq80G|)QI;Dj&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "##x_kDQ' e");
      fileUtil0.fetchBlendedSearchFile("oV8@:hq80G|)QI;Dj", "oV8@:hq80G|)QI;Dj");
      MockFile.createTempFile("oV8@:hq80G|)QI;Dj", "oV8@:hq80G|)QI;Dj");
      System.setCurrentTimeMillis((-1430L));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&oV8@:Hq80GHR)I;+j=%7FoV8%40%3AHq80GHR%29%7FI%3B%2Bj&mode=oV8@:Hq80GHR)I;+j&type=oV8@:Hq80GHR)I;+j&page=oV8@:Hq80GHR)I;+j&offer=oV8@:Hq80GHR)I;+j&f=xml");
      fileUtil0.oldestAge = (-1L);
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "1#ta");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("oV8@:Hq80GHR)I;+j", "oV8@:Hq80GHR)I;+j", "oV8@:Hq80GHR)I;+j", "oV8@:Hq80GHR)I;+j", "oV8@:Hq80GHR)I;+j", "oV8@:Hq80GHR)I;+j");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch= &type= &page= &offerstatus= &f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ">S.nn])#E?{A^C<1@gR");
      fileUtil0.fetchThirdPartySearchFile(" ", " ", " ", " ");
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "-", ".xml", "J$Ab");
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.fetchAccessories("fn)", arrayList0);
      fileUtil0.getAccessories("fn)", arrayList0);
      File file0 = fileUtil0.getAccessories("V;d,IhDq2<\",}AH", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchSimilarItems("+<N&i58G2Bh:s,", "+<N&i58G2Bh:s,");
      fileUtil0.downloadSimilaritesFile("SimilaritySearch", "SimilaritySearch", "lite");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=S.n])#E?{A^C<1@gR\\&type=lite&offerpage=S.n])#E?{A^C<1@gR\\&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "S.n])#E?{A^C<1@gR");
      fileUtil0.getSimilarItems("S.n])#E?{A^C<1@gR", "S.n])#E?{A^C<1@gR");
      MockFile.createTempFile("S.n])#E?{A^C<1@gR", "S.n])#E?{A^C<1@gR");
      System.setCurrentTimeMillis(1323L);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=rv*3.r<7zP$&type=rv*3.r<7zP$&offerpage=rv*3.r<7zP$&offer=rv*3.r<7zP$&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "JUoCEO#>V[rgzalj)>");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("rv*3.r<7zP$", "rv*3.r<7zP$", "rv*3.r<7zP$", "rv*3.r<7zP$");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("\u0000J-.!jQ!UPX$", "\u0000J-.!jQ!UPX$");
      fileUtil0.cacheDir = "";
      fileUtil0.renameFile("", "");
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.getAccessories((String) null, arrayList0);
      fileUtil0.fetchAccessories((String) null, arrayList0);
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
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[67];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ShoppingCart=clear&f=xml&dev-t=");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ShoppingCart=clear&f=xml&dev-t=");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ShoppingCart=clear&f=xml&dev-t=");
      byte[] byteArray1 = new byte[107];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "oNU?%Z#P#er");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ShoppingCart=clear&f=xml&dev-t=");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ShoppingCart=clear&f=xml&dev-t=");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ShoppingCart=clear&f=xml&dev-t=");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ShoppingCart=clear&f=xml&dev-t=");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "oNU?%Z#P#er");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.shouldAllThrowIOExceptions();
      fileUtil0.getSimilarItems("", "?[LD)}~SOq[");
      File file0 = fileUtil0.downloadKeywordSearchFile("", "?[LD)}~SOq[", "t_", "");
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[37];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      byteArray0[4] = (byte)73;
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "<1Q#EQS");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "SimilaritySearch");
      byte[] byteArray1 = new byte[79];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "SimilaritySearch");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.deleteFile("<1Q#EQS");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "SimilaritySearch");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "SimilaritySearch");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "<1Q#EQS");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "SimilaritySearch");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "SimilaritySearch");
      File file0 = fileUtil0.getSimilarItems("", "");
      assertEquals(424L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[29];
      byteArray0[9] = (byte)0;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = (long) (byte)0;
      String string0 = "";
      fileUtil0.fetchSimilarItems("", "");
      String string1 = null;
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFile", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5247073930301434
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchBNFile("", "", "");
      String string0 = "SimilaritySearch";
      fileUtil0.getBrowseNodeFile("", "yS=!P", "SimilaritySearch");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      // Undeclared exception!
      try { 
        arrayList0.remove(2124);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2124, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4180693652516905
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=yS=!P&mode=&type=lite&page=yS=!P&offer=new&f=xml");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("net.kencochrane.a4j.util.a4jUtil", "", "net.kencochrane.a4j.util.a4jUtil");
      assertNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
      
      fileUtil0.oldestAge = (-1895L);
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.util.a4jUtil");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_YS=!P_YS=!P.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "=");
      File file1 = fileUtil0.getBrowseNodeFile("", "yS=!P", "yS=!P");
      assertEquals(1L, file1.length());
      assertNotNull(file1);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=pqEZ&type=pqEZ&offerpage=pqEZ&offer=pqEZ&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "gttp://xml.amazon.net/onca/xml3");
      LoadProperties.instance();
      File file0 = fileUtil0.getASINFile("pqEZ", "pqEZ", "pqEZ", "pqEZ");
      assertNull(file0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = 1924L;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/RV*3.R<7ZP$_RV*3.R<7ZP$_RV*3.R<7ZP$_RV*3.R<7ZP$.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("rv*3.r<7zP$", "rv*3.r<7zP$", "rv*3.r<7zP$", "rv*3.r<7zP$");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.4681399390162087
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/PQEZ_PQEZ_PQEZ_PQEZ.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.getASINFile("pqEZ", "pqEZ", "pqEZ", "pqEZ");
      fileUtil0.deleteFile("");
      Random.setNextRandom(1677);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=;3ljbdDI &type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=modify&f=xml&dev-t=");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) ";3ljbdDI ");
      fileUtil0.downloadAccessoriesFile("ShoppingCart=modify&f=xml&dev-t=", arrayList0, "ShoppingCart=modify&f=xml&dev-t=");
      System.setCurrentTimeMillis(1000L);
  }
}