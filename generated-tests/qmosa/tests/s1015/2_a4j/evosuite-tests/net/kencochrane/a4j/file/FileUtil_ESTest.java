/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:59:38 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.function.Predicate;
import net.kencochrane.a4j.file.FileUtil;
import net.kencochrane.a4j.util.LoadProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "URLSeperator");
      fileUtil0.getASINFile("]", "]", "]", "");
      fileUtil0.downloadCart("");
      fileUtil0.fetchBNFile("Log file isn't there Setting default properties", "", "");
      fileUtil0.downloadBrowseNodeFile("JbF", "", "Log file isn't there Setting default properties", "fTrUE~}\" SI");
      fileUtil0.deleteFile("Log file isn't there Setting default properties");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      arrayList0.add((Integer) null);
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      fileUtil0.fetchAccessories("Log file isn't there Setting default properties", arrayList0);
      fileUtil0.downloadBlendedSearchFile("JbF", "");
      fileUtil0.fetchBNFile("86400000", "9", "3rd_");
      fileUtil0.renameFile("fTrUE~}\" SI", "");
      fileUtil0.isAgeGood((File) null);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "^ZLP<a{?yaX7Bw6Iv1", "Y!w_xJ@");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.464816384890813
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      fileUtil0.getAccessories("j~3}isIG:3", arrayList0);
      fileUtil0.deleteFile("j~3}isIG:3");
      ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
      Predicate<Object> predicate0 = Predicate.isEqual((Object) arrayList1);
      Predicate<Object> predicate1 = predicate0.negate();
      Predicate.isEqual((Object) "j~3}isIG:3");
      Predicate<Object> predicate2 = predicate0.and(predicate1);
      predicate0.and(predicate2);
      arrayList1.removeIf(predicate0);
      fileUtil0.fetchAccessories("powMro f_5P<r:4~w", arrayList1);
      fileUtil0.deleteFile("");
      File file0 = fileUtil0.getAccessories("j~3}isIG:3", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
      fileUtil0.deleteFile("");
      fileUtil0.renameFile("", "=-1njLHZ&");
      fileUtil0.fetchBNFile("", "", "=-1njLHZ&");
      fileUtil0.fetchGenericSearchFile((String) null, "", "", "", "", "U*P>4Fw!gJ)WkpA");
      fileUtil0.getSimilarItems("U*P>4Fw!gJ)WkpA", "");
      File file0 = fileUtil0.getSimilarItems("U*P>4Fw!gJ)WkpA", "R/Jx5dFko");
      assertNull(file0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.488327743368588
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadCart("hxTc8 ]m>");
      LoadProperties.instance();
      fileUtil0.downloadKeywordSearchFile("mIo9yN^qr[g;>", "pT", "mIo9yN^qr[g;>", "pT");
      fileUtil0.getSimilarItems("ta_", "pT");
      fileUtil0.downloadCart("-");
      fileUtil0.fetchKeywordSearchFile("78)JFH4D6)@g/LC}J", "78)JFH4D6)@g/LC}J", (String) null, "");
      fileUtil0.fetchASINFile((String) null, "s_", "s_", "mIo9yN^qr[g;>");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      fileUtil0.downloadAccessoriesFile("n-v", arrayList0, "n-v");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("Log file isn't there Setting default properties", "hxTc8 ]m>", "Log file isn't there Setting default properties");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile("~]/", "@8=rd21wC96kG");
      LoadProperties.instance();
      fileUtil0.downloadThirdPartySearchFile("@8=rd21wC96kG", "", "", "3g9jT");
      fileUtil0.fetchBNFile("X*0$@rVdl#%R<r", "", "");
      fileUtil0.fetchASINFile("]", "@8=rd21wC96kG", "]", "@8=rd21wC96kG");
      fileUtil0.deleteFile("URLSeperator");
      fileUtil0.fetchKeywordSearchFile("", "IwH0", "]", "IwH0");
      fileUtil0.downloadKeywordSearchFile("", "", "", "X*0$@rVdl#%R<r");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      fileUtil0.getAccessories("sdu8S%u?op8rt('=K", arrayList0);
      fileUtil0.downloadGenericSearchFile("X*0$@rVdl#%R<r", "IwH0", "", "19J", "", "/");
      fileUtil0.downloadCart("lite");
      fileUtil0.downloadCart("@8=rd21wC96kG");
      fileUtil0.downloadSimilaritesFile("|t?Kt-*LJEIlO)%R]", "X*0$@rVdl#%R<r", ".");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("]", "", "]");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadCart("l");
      fileUtil0.fetchThirdPartySearchFile("<M>", "6odUo$H#C5#. &tX.w", "1#4}uj)`K,n<8Z", "6odUo$H#C5#. &tX.w");
      fileUtil0.fetchKeywordSearchFile("", "6odUo$H#C5#. &tX.w", "", "mVM5cd^XqH");
      fileUtil0.cacheDir = "l";
      fileUtil0.deleteFile("");
      fileUtil0.downloadThirdPartySearchFile("", "<M>", "I] _QHu_jL&hYSq", " t_MY?*");
      fileUtil0.deleteFile("");
      fileUtil0.fetchGenericSearchFile(":=T$L3&d}jANs", "Hc)$;0..Y;;E", "1#4}uj)`K,n<8Z", "ts_", ")lsUcEgX9)qGe'sUG", ".xml");
      fileUtil0.fetchThirdPartySearchFile("6odUo$H#C5#. &tX.w", "http://xml.amazon.net/onca/xml3", "k,{@$(NSLi |ZlD", "mVM5cd^XqH");
      fileUtil0.downloadThirdPartySearchFile("l", "&Ss", "", "R&cWfA4$Ul");
      File file0 = fileUtil0.getBrowseNodeFile("lk?OYK%dshiZc~0wu(C", "", "=ED3bYV3'<smeM<?p[Z");
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4036404106149494
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getBrowseNodeFile("GtJS", "GtJS", "GtJS");
      fileUtil0.fetchThirdPartySearchFile("", "amazonServerURL", "amazonServerURL", "amazonServerURL");
      fileUtil0.fetchBlendedSearchFile("amazonServerURL", "There is no Properties File Setting to default");
      fileUtil0.downloadBlendedSearchFile("", "There is no Properties File Setting to default");
      fileUtil0.downloadBlendedSearchFile((String) null, "There is no Properties File Setting to default");
      fileUtil0.fetchSimilarItems((String) null, "There is no Properties File Setting to default");
      fileUtil0.downloadGenericSearchFile(" <Z$W9m", "{y-70-I~RIWk)", "K*Tbs#]e-M4Y/AaA@=", (String) null, "", "K*Tbs#]e-M4Y/AaA@=");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, "http://xml.amazon.net/onca/xml3", "cacheLife", (String) null, "", " <Z$W9m");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.5577938601077324
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadSimilaritesFile("net.kencochrane.a4j.file.FileUtil", "TYM,zqXvN)a", "TYM,zqXvN)a");
      fileUtil0.downloadCart("amazonServerURL");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.downloadAccessoriesFile("/", (ArrayList) null, "g_");
      File file0 = MockFile.createTempFile("y[d=/~))ShgSf", ",52 b[s=CuNudx{2");
      fileUtil0.isAgeGood(file0);
      fileUtil0.downloadBrowseNodeFile("l}6\"hpgZlhyDhnm`ib", "y[d=/~))ShgSf", ",52 b[s=CuNudx{2", "/");
      fileUtil0.deleteFile("");
      fileUtil0.renameFile("", "amazonServerURL");
      fileUtil0.fetchBlendedSearchFile("", "l}6\"hpgZlhyDhnm`ib");
      fileUtil0.getSimilarItems("", "g_");
      fileUtil0.downloadOneASINFile("", "", "", (String) null, "g_");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("net.kencochrane.a4j.file.FileUtil", "There is no Properties File Setting to default", "", ",52 b[s=CuNudx{2", "g_", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.7516666169315167
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/AMAZONSERVERURL_NULL_AMAZONSERVERURL.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.getBrowseNodeFile("GtJS", "GtJS", "GtJS");
      fileUtil0.fetchBNFile("amazonServerURL", (String) null, "amazonServerURL");
      fileUtil0.fetchThirdPartySearchFile("", "amazonServerURL", "amazonServerURL", "amazonServerURL");
      fileUtil0.fetchSimilarItems("", "D-T47y0YP3}tVp");
      fileUtil0.fetchBlendedSearchFile("amazonServerURL", "There is no Properties File Setting to default");
      fileUtil0.downloadBlendedSearchFile("", "Stwu?");
      fileUtil0.fetchBNFile("~xJ4<+", "amazonServerURL", "~xJ4<+");
      fileUtil0.downloadCart("");
      fileUtil0.downloadGenericSearchFile("", "", "", "", "", "@0|)UunF->m2Mfp");
      File file0 = fileUtil0.downloadKeywordSearchFile("K^xpHr", "~xJ4<+", "", "Stwu?");
      assertNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/UD:GK~VMMU1AR_UD:GK~VMMU1AR_UD:GK~VMMU1AR_UD:GK~VMMU1AR.XML");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)53;
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)47;
      byteArray0[4] = (byte)100;
      byteArray0[5] = (byte)4;
      byteArray0[6] = (byte) (-32);
      byteArray0[7] = (byte)101;
      byteArray0[8] = (byte) (-7);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.fetchASINFile("ud:gK~vmmU1aR", "ud:gK~vmmU1aR", "ud:gK~vmmU1aR", "ud:gK~vmmU1aR");
      System.setCurrentTimeMillis(426L);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.9264175554979963
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getASINFile("d", "d", "d", "d");
      fileUtil0.fetchGenericSearchFile("d", "d", "d", "d", "d", "");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)120;
      byteArray0[1] = (byte)57;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.fetchKeywordSearchFile("}F;", "d", "d", "d");
      fileUtil0.getAccessories("k]BS'S^K[3", arrayList0);
      fileUtil0.getBrowseNodeFile("", "d", "");
      fileUtil0.renameFile("d", "d");
      fileUtil0.fetchThirdPartySearchFile("", "", "", "d");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "k]BS'S^K[3");
      assertEquals(2, fileInputStream0.available());
  }
}
