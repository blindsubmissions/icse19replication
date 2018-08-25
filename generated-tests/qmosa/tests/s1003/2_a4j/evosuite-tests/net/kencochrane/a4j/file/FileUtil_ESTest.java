/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:43:36 GMT 2018
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
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = null;
      fileUtil0.downloadSimilaritesFile("86400000", "86400000", "]");
      fileUtil0.fetchGenericSearchFile("/", "LYJ", "]", "/", "x5)Pb{J:D F=\u0003lT", "/");
      fileUtil0.downloadThirdPartySearchFile("86400000", "86400000", "Kma^C3\fO6=", "Kma^C3\fO6=");
      fileUtil0.downloadOneASINFile("]", "]", "86400000", "]", "]");
      fileUtil0.fetchThirdPartySearchFile("KOZ", "", "1", (String) null);
      fileUtil0.getBrowseNodeFile("86400000", "V]A[<U", "V]A[<U");
      fileUtil0.fetchGenericSearchFile("V]A[<U", "-7iEXo", "]", "", "]", (String) null);
      fileUtil0.fetchBNFile("_", (String) null, "-7iEXo");
      fileUtil0.downloadBlendedSearchFile("]", "-7iEXo");
      fileUtil0.getASINFile("", "-7iEXo", (String) null, "86400000");
      File file0 = fileUtil0.downloadKeywordSearchFile("", "1", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.8309404302537744
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchASINFile((String) null, (String) null, (String) null, "");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "");
      fileUtil0.downloadCart("");
      fileUtil0.getAccessories("bb~EmF8y", arrayList0);
      fileUtil0.downloadSimilaritesFile("xT$5n@2x[sI", "/h;52kqn[4)2WHo", (String) null);
      fileUtil0.downloadKeywordSearchFile("#|\"pe\"C,UNjh1", "#|\"pe\"C,UNjh1", (String) null, "#|\"pe\"C,UNjh1");
      LoadProperties.instance();
      fileUtil0.downloadSimilaritesFile((String) null, "#|\"pe\"C,UNjh1", "");
      fileUtil0.fetchKeywordSearchFile("#|\"pe\"C,UNjh1", "", "", (String) null);
      fileUtil0.fetchSimilarItems("/", "xT$5n@2x[sI");
      fileUtil0.getBrowseNodeFile((String) null, "", "AsinSearch");
      fileUtil0.downloadGenericSearchFile("associateID", (String) null, "", (String) null, "/h;52kqn[4)2WHo", (String) null);
      fileUtil0.deleteFile("/+1aD`##eZ}");
      fileUtil0.fetchSimilarItems("/", (String) null);
      fileUtil0.getSimilarItems("", "&:I}g");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("ps4:X_~4Qj]wp1g0", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile("T|e~%Bt8VusB", "T|e~%Bt8VusB");
      fileUtil0.downloadThirdPartySearchFile("T|e~%Bt8VusB", "T|e~%Bt8VusB", "T|e~%Bt8VusB", "T|e~%Bt8VusB");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.clear();
      fileUtil0.getAccessories("T|e~%Bt8VusB", arrayList0);
      LoadProperties.instance();
      fileUtil0.cacheDir = "%G9iXo)=]";
      fileUtil0.downloadKeywordSearchFile("T|e~%Bt8VusB", "%G9iXo)=]", "c_", "");
      fileUtil0.downloadBlendedSearchFile("", "");
      fileUtil0.fetchASINFile("", "T|e~%Bt8VusB", "", "");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.deleteFile("T|e~%Bt8VusB");
      fileUtil0.getBrowseNodeFile("T|e~%Bt8VusB", "", "c_");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("}]LOJZP!T9N#AJ6?5f>", "/K#", "", "T|e~%Bt8VusB", ".xml", "d^ slGRG>X_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.304619384820671
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
      fileUtil0.downloadOneASINFile((String) null, (String) null, "", "/,&!+19+9PUN;pH", (String) null);
      fileUtil0.getSimilarItems("", "");
      fileUtil0.downloadKeywordSearchFile("", "", "", "net.kencochrane.a4j.file.FileUtil");
      fileUtil0.fetchKeywordSearchFile("_", "_", (String) null, "_");
      fileUtil0.downloadThirdPartySearchFile("", "9k|s`g90d3U", "9k|s`g90d3U", "");
      fileUtil0.getASINFile("", "", "LI4rO%g}8y w2", "@/o@?.GjTHou2o;47");
      fileUtil0.downloadGenericSearchFile("@/o@?.GjTHou2o;47", "", "", "9k|s`g90d3U", "9k|s`g90d3U", "^IG^.h%d");
      File file0 = fileUtil0.downloadBlendedSearchFile("DQ", "");
      assertNull(file0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = MockFile.createTempFile("\"%`\";&)fC8$gcE!L)}", "\"%`\";&)fC8$gcE!L)}");
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      fileUtil0.downloadBlendedSearchFile("\"%`\";&)fC8$gcE!L)}", "");
      fileUtil0.fetchBlendedSearchFile("\"%`\";&)fC8$gcE!L)}", "");
      fileUtil0.fetchASINFile("\"%`\";&)fC8$gcE!L)}", "-", "-", "\"%`\";&)fC8$gcE!L)}");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean1 = fileUtil0.downloadAccessoriesFile("", arrayList0, "86400000");
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3959081192939284
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile("Yx%Hl}Td", "Yx%Hl}Td");
      fileUtil0.fetchAccessories("Yx%Hl}Td", (ArrayList) null);
      fileUtil0.downloadBrowseNodeFile("vDw@jDQX", (String) null, "`b.mk'[dIEQKWB", "");
      fileUtil0.fetchSimilarItems("k7", "");
      fileUtil0.getSimilarItems("", "k_");
      fileUtil0.downloadCart("Yx%Hl}Td");
      fileUtil0.renameFile("", "cacheDir");
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.6393405872324323
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadSimilaritesFile("", "", "");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S__Y$-?,YFQ!]&IT.XML");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)108;
      byteArray0[4] = (byte)36;
      byteArray0[5] = (byte)60;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)60;
      byteArray0[8] = (byte)4;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.fetchSimilarItems("", "u%G5:");
      fileUtil0.fetchGenericSearchFile("", "", "ta_", "", "CrEN)fu[Tj6FV", ";229*c|48HPJ[':");
      fileUtil0.downloadBrowseNodeFile("", "", (String) null, "");
      fileUtil0.fetchSimilarItems("", "_At@glLkJ9N\u0001ps7");
      fileUtil0.downloadSimilaritesFile("cacheLife", (String) null, (String) null);
      fileUtil0.downloadGenericSearchFile("", "", "", "", "", "hsmxxQFq!J");
      fileUtil0.downloadCart((String) null);
      fileUtil0.downloadSimilaritesFile("_At@glLkJ9N\u0001ps7", "associateID", "");
      fileUtil0.deleteFile("");
      fileUtil0.deleteFile("");
      fileUtil0.fetchThirdPartySearchFile("Wi}))", "cacheLife", "jgr", (String) null);
      fileUtil0.fetchBNFile("associateID", "", "");
      fileUtil0.downloadKeywordSearchFile((String) null, "", (String) null, "k~");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("_y$-?,yFq!]&it", "");
      assertEquals(9, fileInputStream0.available());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.8309404302537744
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile("ts_", "ts_");
      fileUtil0.downloadOneASINFile("net.kencochrane.a4j.file.FileUtil", ",]Xtg*N.Y9M{]U#K", "p>\"!{]m& @H", "p>\"!{]m& @H", "p>\"!{]m& @H");
      LoadProperties.instance();
      fileUtil0.fetchSimilarItems("p>\"!{]m& @H", "p>\"!{]m& @H");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "p>\"!{]m& @H");
      fileUtil0.fetchAccessories("IwU`", arrayList0);
      fileUtil0.getASINFile("p>\"!{]m& @H", "p>\"!{]m& @H", "p>\"!{]m& @H", (String) null);
      fileUtil0.downloadBlendedSearchFile("K", "IwU`");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=KXG~T&type=OKU@F)ZWLW3R))&page=all&offerstatus=net.kencochrane.a4j.file.FileUtil&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "new");
      fileUtil0.downloadKeywordSearchFile("lite", "S5{ z9b4|H'^4!93\"+@", ",]Xtg*N.Y9M{]U#K", "ts_");
      fileUtil0.downloadBrowseNodeFile("lite", "lite", "OKU@F)ZWLW3R))", "OKU@F)ZWLW3R))");
      fileUtil0.downloadThirdPartySearchFile("KXG~T", "OKU@F)ZWLW3R))", "all", "net.kencochrane.a4j.file.FileUtil");
      fileUtil0.fetchBNFile("lite", "IwU`", ",]Xtg*N.Y9M{]U#K");
      fileUtil0.downloadOneASINFile("ts_", "all", "all", "associateID", "");
      fileUtil0.renameFile("ts_", "QMZ#`#x?1Hz&%F'rs");
      fileUtil0.deleteFile("S5{ z9b4|H'^4!93\"+@");
      fileUtil0.renameFile("net.kencochrane.a4j.file.FileUtil", "S5{ z9b4|H'^4!93\"+@");
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.84461358358424
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile("ts_", "ts_");
      fileUtil0.downloadOneASINFile("net.kencochrane.a4j.file.FileUtil", ",]Xtg*N.Y9M{]U#K", "p>\"!{]m& @H", "p>\"!{]m& @H", "p>\"!{]m& @H");
      LoadProperties.instance();
      fileUtil0.fetchSimilarItems("p>\"!{]m& @H", "p>\"!{]m& @H");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "p>\"!{]m& @H");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_IWU`.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.fetchAccessories("IwU`", arrayList0);
      fileUtil0.getASINFile("p>\"!{]m& @H", "p>\"!{]m& @H", "p>\"!{]m& @H", (String) null);
      fileUtil0.downloadBlendedSearchFile("K", "IwU`");
      fileUtil0.downloadKeywordSearchFile("lite", "S5{ z9b4|H'^4!93\"+@", ",]Xtg*N.Y9M{]U#K", "ts_");
      fileUtil0.downloadBrowseNodeFile("lite", "lite", "OKU@F)ZWLW3R))", "OKU@F)ZWLW3R))");
      fileUtil0.downloadThirdPartySearchFile("KXG~T", "OKU@F)ZWLW3R))", "all", "net.kencochrane.a4j.file.FileUtil");
      fileUtil0.fetchBNFile("lite", "IwU`", ",]Xtg*N.Y9M{]U#K");
      fileUtil0.downloadOneASINFile("ts_", "all", "all", "associateID", "");
      fileUtil0.renameFile("ts_", "QMZ#`#x?1Hz&%F'rs");
      fileUtil0.deleteFile("S5{ z9b4|H'^4!93\"+@");
      fileUtil0.renameFile("net.kencochrane.a4j.file.FileUtil", "S5{ z9b4|H'^4!93\"+@");
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile("ts_", "ts_");
      fileUtil0.downloadOneASINFile("net.kencochrane.a4j.file.FileUtil", ",]Xtg*N.Y9M{]U#K", "p>\"!{]m& @H", "p>\"!{]m& @H", "p>\"!{]m& @H");
      LoadProperties.instance();
      fileUtil0.fetchSimilarItems("p>\"!{]m& @H", "p>\"!{]m& @H");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "p>\"!{]m& @H");
      arrayList0.spliterator();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/LITE_IWU`_,]XTG*N.Y9M{]U#K.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.fetchAccessories("IwU`", arrayList0);
      fileUtil0.getASINFile("p>\"!{]m& @H", "p>\"!{]m& @H", "p>\"!{]m& @H", (String) null);
      fileUtil0.downloadBlendedSearchFile("K", "IwU`");
      fileUtil0.downloadKeywordSearchFile("lite", "S5{ z9b4|H'^4!93\"+@", ",]Xtg*N.Y9M{]U#K", "ts_");
      fileUtil0.downloadBrowseNodeFile("lite", "lite", "OKU@F)ZWLW3R))", "OKU@F)ZWLW3R))");
      fileUtil0.downloadThirdPartySearchFile("KXG~T", "OKU@F)ZWLW3R))", "all", "net.kencochrane.a4j.file.FileUtil");
      fileUtil0.fetchBNFile("lite", "IwU`", ",]Xtg*N.Y9M{]U#K");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.renameFile("ts_", "M&mb");
      fileUtil0.deleteFile("S5{ z9b4|H'^4!93\"+@");
      fileUtil0.renameFile("net.kencochrane.a4j.file.FileUtil", "S5{ z9b4|H'^4!93\"+@");
      fileUtil0.downloadBrowseNodeFile(",]Xtg*N.Y9M{]U#K", "K", "lite", "net.kencochrane.a4j.file.FileUtil");
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.5400363038209806
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      fileUtil0.downloadBlendedSearchFile("", "");
      fileUtil0.fetchGenericSearchFile("", "", "", "", "", "");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchASINFile("", "", "", "");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.listIterator();
      fileUtil0.getAccessories("c_", arrayList0);
      fileUtil0.fetchThirdPartySearchFile("", "", "-R+P7", "c_");
      boolean boolean1 = fileUtil0.downloadOneASINFile("", "-R+P7", "", "tIT;N^{X'[5ZU3c.", "9\"Q_;VCNDgnuT");
      assertFalse(boolean1 == boolean0);
  }
}
