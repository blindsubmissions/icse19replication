/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 09:39:17 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import net.kencochrane.a4j.file.FileUtil;
import net.kencochrane.a4j.util.LoadProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
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
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      fileUtil0.fetchAccessories("popcornmonste2-20", arrayList0);
      fileUtil0.oldestAge = 1855L;
      File file0 = fileUtil0.getAccessories("popcornmonste2-20", (ArrayList) null);
      assertNull(file0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=&mode=&type=lite&page=&offer=new&f=xml");
      fileUtil0.fetchBNFile(".V4=/Uem4[5Q(7SuY=8", "r[`?9]xpJ1\"X'4", "r[`?9]xpJ1\"X'4");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ".V4=/Uem4[5Q(7SuY=8");
      fileUtil0.getBrowseNodeFile("", "", "");
      File file0 = fileUtil0.getBrowseNodeFile("popcornmonste2-20", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=&type=&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "a4j-config.txt");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchGenericSearchFile(":{B~Lk", ":{B~Lk", "1", "|MAe<uca", "amazonServerURL", (String) null);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&o*V2JtpOQ1 U1=o*V2JtpOQ1+U1&mode=o*V2JtpOQ1 U1&type=o*V2JtpOQ1 U1&page=o*V2JtpOQ1 U1&offer=4%p#c7<Lx*&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "o*V2JtpOQ1 U1");
      fileUtil0.downloadGenericSearchFile("o*V2JtpOQ1 U1", "o*V2JtpOQ1 U1", "o*V2JtpOQ1 U1", "o*V2JtpOQ1 U1", "o*V2JtpOQ1 U1", "4%p#c7<Lx*");
      MockFile mockFile0 = new MockFile("o*V2JtpOQ1 U1", "4%p#c7<Lx*");
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = 1000L;
      fileUtil0.renameFile("*h6FdKXa", "*h6FdKXa");
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("*h6FdKXa");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = 1000L;
      fileUtil0.renameFile("*h6FdKXa", "*h6FdKXa");
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart(")WB{9j%8^jCB");
      assertNull(file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=%26Item.&type=&Item.&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "agzmazonServerURL");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("&Item.", "&Item.");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadSimilaritesFile("/", "/", "/");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=L&type=L&offerpage=L&offer=L&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchASINFile("L", "L", "L", "L");
      boolean boolean0 = fileUtil0.downloadOneASINFile("&CartId=", "L", "", "L", "L");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=i2nwv&type=i2nwv&page=i2nwv&offerstatus=i2nwv&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Log file isn't there Setting default properties");
      fileUtil0.downloadThirdPartySearchFile("i2nwv", "i2nwv", "i2nwv", "i2nwv");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "c_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_YR<FA-;WSSUST28}*`X.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("YR<fA-;wssusT28}*`X", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.5247073930301434
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getBrowseNodeFile("AY:JH\"!:UQ:*u0{e7W", "AY:JH\"!:UQ:*u0{e7W", "AY:JH\"!:UQ:*u0{e7W");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-64);
      byteArray0[1] = (byte) (-53);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AY:JH\"!:UQ:*u0{e7W");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AY:JH\"!:UQ:*u0{e7W");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "(f6QU{7i-8f[!]YN'");
      byte[] byteArray1 = new byte[14];
      fileUtil0.oldestAge = 8L;
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http:/`;ml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AY:JH\"!:UQ:*u0{e7W");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http:/`;ml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http:/`;ml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http:/`;ml.amazon.net/onca/xml3");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "AY:JH\"!:UQ:*u0{e7W");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "http:/`;ml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http:/`;ml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "(f6QU{7i-8f[!]YN'");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http:/`;ml.amazon.net/onca/xml3");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "http:/`;ml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http:/`;ml.amazon.net/onca/xml3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "(f6QU{7i-8f[!]YN'");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) fileUtil0);
      arrayList0.add((Object) "SimilaritySearch");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "(f6QU{7i-8f[!]YN'");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertEquals(450, fileInputStream0.available());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4180693652516905
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=null&type=lite&offerpage=null&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.data.Query");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".s5g0V860wH");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getSimilarItems((String) null, (String) null);
      String string0 = "pS&^Vp|Xhc[!k<)q";
      MockFile mockFile0 = new MockFile((String) null, "pS&^Vp|Xhc[!k<)q");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      String string1 = "";
      ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(4537);
      linkedList0.push(integer0);
      // Undeclared exception!
      try { 
        arrayList1.addAll((-147), (Collection<? extends Integer>) linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -147, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5247073930301438
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "+&sKvk9oU](");
      fileUtil0.getSimilarItems("+&sKvk9oU](", "+&sKvk9oU](");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertEquals(12, fileInputStream0.available());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getSimilarItems("64 9XQvhGRH_#K4", "64 9XQvhGRH_#K4");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=null&type=lite&offerpage=null&offer=all&f=xml");
      fileUtil0.downloadSimilaritesFile("64 9XQvhGRH_#K4", "64 9XQvhGRH_#K4", "");
      fileUtil0.getSimilarItems("5Q6|A&#\"8 v%", (String) null);
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "5Q6|A&#\"8 v%");
      File file0 = fileUtil0.getSimilarItems((String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=&type=&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=add&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=L&type=L&offerpage=L&offer=L&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "FpVU>H(/h378&B;>'aq");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("FpVU>H(/h378&B;>'aq");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, (byte[]) null);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadOneASINFile("L", "L", "L", "L", "FpVU>H(/h378&B;>'aq");
      Random.setNextRandom(2487);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/L_L_L_L.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("L", "L", "L", "L");
      assertNull(fileInputStream0);
  }
}
