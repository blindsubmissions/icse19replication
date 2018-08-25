/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:05:19 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import net.kencochrane.a4j.file.FileUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = 0L;
      fileUtil0.downloadOneASINFile("?0aOE5fjn|6f)Qn)&R(", "ts_", "ts_", "O1kZt(", "");
      File file0 = fileUtil0.getBrowseNodeFile("ts_", "#</Oq|e1PT.", "#</Oq|e1PT.");
      assertNull(file0);
      
      fileUtil0.downloadKeywordSearchFile("#</Oq|e1PT.", "#</Oq|e1PT.", "ts_", "2y#d+;QNcAQMG");
      fileUtil0.fetchBlendedSearchFile("XLJaKEr2)zOK", "ts_");
      File file1 = fileUtil0.getSimilarItems("new", "&ylw( :2v+!L/Op");
      assertNull(file1);
      
      fileUtil0.deleteFile("&ylw( :2v+!L/Op");
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("ts_", "#</Oq|e1PT.", "2y#d+;QNcAQMG", "2y#d+;QNcAQMG");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
      File file0 = fileUtil0.getSimilarItems("ta_", ")sb>%V09\"7w//Wil");
      assertNull(file0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadCart("1g$n!y>#wU}");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.oldestAge = 0L;
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
      String string0 = "b";
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "b");
      Object object0 = new Object();
      arrayList0.add(object0);
      Object object1 = new Object();
      // Undeclared exception!
      try { 
        arrayList0.listIterator((-488));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -488
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("");
      fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      ArrayList<Integer> arrayList1 = new ArrayList<Integer>(241);
      Integer integer0 = new Integer((-1));
      arrayList1.add(integer0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) fileUtil0;
      Integer integer1 = new Integer(241);
      arrayList1.add(integer1);
      objectArray0[1] = (Object) "";
      fileUtil0.fetchGenericSearchFile("'M$W{?Gk'% IDnt>", "'M$W{?Gk'% IDnt>", "", "'M$W{?Gk'% IDnt>", "", "");
      arrayList1.toArray(objectArray0);
      arrayList1.parallelStream();
      fileUtil0.fetchAccessories("/Z1rJ ?m", arrayList1);
      fileUtil0.fetchBlendedSearchFile("*/U57+Ea:", "");
      fileUtil0.fetchBlendedSearchFile("gn9|J#S%%h]a`+u602", " '-H`h4g{SU");
      fileUtil0.fetchGenericSearchFile("*/U57+Ea:", "", " '-H`h4g{SU", "=", "xPD", "");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("!W|0o?pIKNVW5", "", "r", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchKeywordSearchFile("fs35S", "fs35S", "!PUqk]J`EEn", "");
      fileUtil0.getASINFile("", "c-@7UCP.#=W^y71$FWC", "!PUqk]J`EEn", "#5Wy:<vKdk3~!s.gS");
      fileUtil0.cacheDir = "-'h.ot]l`W";
      fileUtil0.downloadKeywordSearchFile("-'h.ot]l`W", "", "94VeX>Gm?cj{:=[%", "fs35S");
      fileUtil0.downloadKeywordSearchFile("86400000", "94VeX>Gm?cj{:=[%", "fs35S", "net.kencochrane.a4j.file.FileUtil");
      fileUtil0.fetchSimilarItems("+L/#Z", "");
      fileUtil0.fetchSimilarItems("?&a%q;'[|'_", "@~P4mK32OY/,D");
      fileUtil0.getSimilarItems("fs35S", "-'h.ot]l`W");
      fileUtil0.getSimilarItems((String) null, "?&a%q;'[|'_");
      fileUtil0.getASINFile("http://xml.amazon.net/onca/xml3", "86400000", (String) null, "45wI3D.U");
      fileUtil0.fetchASINFile("!PUqk]J`EEn", "There is no Properties File Setting to default", "!PUqk]J`EEn", "@~P4mK32OY/,D");
      File file0 = fileUtil0.downloadGenericSearchFile("94VeX>Gm?cj{:=[%", "45wI3D.U", (String) null, "", "07,D)T|{*wSMol>1%m", "94VeX>Gm?cj{:=[%");
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadOneASINFile("", "e38>0mpEcGwTdiG#o&J", "", "", "k_");
      fileUtil0.fetchBNFile("", "g_", "-");
      fileUtil0.fetchBlendedSearchFile("-", "6tWoR+");
      fileUtil0.downloadOneASINFile("g_", "", "-", "", "|F");
      fileUtil0.downloadBlendedSearchFile("", "|F");
      fileUtil0.downloadBlendedSearchFile("all", "");
      fileUtil0.downloadKeywordSearchFile("associateID", "associateID", "associateID", (String) null);
      fileUtil0.getSimilarItems("associateID", "Log file isn't there Setting default properties");
      fileUtil0.downloadThirdPartySearchFile("", "-", "", "");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("amazonServerURL");
      File file0 = fileUtil0.getAccessories("associateID", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.540036303820981
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchGenericSearchFile("fKd}BioV4U", "fKd}BioV4U", "1", "?$~Mzf]Ijh?-v<", "`20jkWR", "UbU;i?}issjBb2&");
      fileUtil0.fetchThirdPartySearchFile("UbU;i?}issjBb2&", "UbU;i?}issjBb2&", "1", "!V15`7pbA");
      fileUtil0.fetchASINFile("SimilaritySearch", (String) null, "net.kencochrane.a4j.file.FileUtil", "UbU;i?}issjBb2&");
      fileUtil0.downloadThirdPartySearchFile("1", "fKd}BioV4U", "UbU;i?}issjBb2&", "");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.downloadThirdPartySearchFile((String) null, "", "fKd}BioV4U", "!V15`7pbA");
      fileUtil0.downloadCart("SimilaritySearch");
      fileUtil0.renameFile("Rn{lZQQ:W", "Rn{lZQQ:W");
      boolean boolean0 = fileUtil0.downloadOneASINFile("lKG}RU4yRt", "1", (String) null, "", "lKG}RU4yRt");
      fileUtil0.downloadKeywordSearchFile("P3'(&v_:1\"c|_^N", "", "", "");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      boolean boolean1 = fileUtil0.downloadAccessoriesFile("u:psU],jLqk#y1~>B%i", arrayList0, (String) null);
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("");
      fileUtil0.isAgeGood(mockFile0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("b4t!J");
      arrayList0.add("");
      arrayList0.parallelStream();
      arrayList0.add("");
      fileUtil0.fetchAccessories("", arrayList0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "WU", "pY^bvu", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_KBW>MX}}?^;.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      fileUtil0.fetchSimilarItems("kbW>mx}}?^;", "");
      fileUtil0.cacheDir = "";
      fileUtil0.downloadSimilaritesFile("% $f:BP&G8X", "% $f:BP&G8X", "% $f:BP&G8X");
      fileUtil0.downloadBlendedSearchFile("kbW>mx}}?^;", "% $f:BP&G8X");
      File file0 = fileUtil0.getASINFile("", "", "SimilaritySearch", "");
      assertNull(file0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.5400363038209806
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("");
      fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      ArrayList<Integer> arrayList1 = new ArrayList<Integer>(241);
      Integer integer0 = new Integer((-1));
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/!W|0O?PIKNVW5_R__.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      arrayList1.add(integer0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) fileUtil0;
      Integer integer1 = new Integer(241);
      arrayList1.add(integer1);
      objectArray0[1] = (Object) "";
      fileUtil0.fetchGenericSearchFile("'M$W{?Gk'% IDnt>", "'M$W{?Gk'% IDnt>", "", "'M$W{?Gk'% IDnt>", "", "");
      arrayList1.toArray(objectArray0);
      arrayList1.parallelStream();
      fileUtil0.fetchAccessories("/Z1rJ ?m", arrayList1);
      fileUtil0.fetchBlendedSearchFile("*/U57+Ea:", "");
      fileUtil0.fetchBlendedSearchFile("gn9|J#S%%h]a`+u602", " '-H`h4g{SU");
      fileUtil0.fetchGenericSearchFile("*/U57+Ea:", "", " '-H`h4g{SU", "=", "xPD", "");
      fileUtil0.fetchBlendedSearchFile("cacheLife", "(iDK1_$QO0");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("!W|0o?pIKNVW5", "", "r", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.351673301904631
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_'|9{N7:OH/DWN*_'|9{N7:OH/DWN*.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getBrowseNodeFile((String) null, "'|9{n7:oH/dwN*", "'|9{n7:oH/dwN*");
      fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      fileUtil0.downloadCart("[EEyoz4?(U");
      fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      fileUtil0.downloadSimilaritesFile((String) null, (String) null, (String) null);
      fileUtil0.downloadGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("&z>P f}_hN`TyaYxx", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("ta_");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_NULL.XML");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-30);
      byteArray0[1] = (byte)81;
      byteArray0[2] = (byte) (-23);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)60;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)52;
      byteArray0[7] = (byte) (-29);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.fetchGenericSearchFile("[`vvAD3", "[`vvAD3", "[`vvAD3", "[`vvAD3", "[`vvAD3", "[`vvAD3");
      fileUtil0.fetchBNFile((String) null, (String) null, (String) null);
      fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      fileUtil0.fetchThirdPartySearchFile((String) null, "(|*a#?q", "(|*a#?q", "(|*a#?q");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("[`vvAD3", "[`vvAD3");
      assertNull(fileInputStream0);
  }
}
