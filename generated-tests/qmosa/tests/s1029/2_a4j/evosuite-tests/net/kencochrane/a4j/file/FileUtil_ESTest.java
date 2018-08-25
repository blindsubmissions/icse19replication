/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:45:58 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import net.kencochrane.a4j.file.FileUtil;
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
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getASINFile("yzSA4", "", "c+f{xlZ-", "");
      fileUtil0.fetchSimilarItems("", "Xxw!/r");
      fileUtil0.downloadThirdPartySearchFile(">MUE", "-", "UW^IQi8]]W)5;x692", "=WnXcuk.8DNDvT>(X");
      fileUtil0.downloadCart("2R=CbMD%vHQ|/l@");
      fileUtil0.downloadSimilaritesFile("Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "s_");
      MockFile mockFile0 = new MockFile((File) null, "c+f{xlZ-");
      mockFile0.mkdir();
      MockFile.createTempFile(".xml", "c+f{xlZ-", (File) mockFile0);
      fileUtil0.isAgeGood(mockFile0);
      fileUtil0.downloadCart("");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.clear();
      fileUtil0.fetchAccessories("s_", arrayList0);
      fileUtil0.fetchGenericSearchFile("-", "2R=CbMD%vHQ|/l@", "f)c~<~*IX#?", "c+f{xlZ-", "=WnXcuk.8DNDvT>(X", "-");
      fileUtil0.fetchThirdPartySearchFile("-", "2R=CbMD%vHQ|/l@", "/;3',TyJsCsJY{`lWJ7", "`f`HUJ}");
      fileUtil0.renameFile("P6+,cH]^di!vE!wQ", "UW^IQi8]]W)5;x692");
      fileUtil0.renameFile("AsinSearch", "cacheLife");
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.821563807860364
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "a6[^zWq^";
      fileUtil0.fetchASINFile("9'\u0003tR*9a3|D", "", "9'\u0003tR*9a3|D", "9'\u0003tR*9a3|D");
      fileUtil0.downloadThirdPartySearchFile((String) null, "(hCc-+>##e4", "@35OizYJ-", "amazonServerURL");
      fileUtil0.getAccessories("(hCc-+>##e4", (ArrayList) null);
      fileUtil0.fetchSimilarItems("", "");
      fileUtil0.fetchBNFile("(hCc-+>##e4", "", "@35OizYJ-");
      fileUtil0.renameFile("", "@35OizYJ-");
      fileUtil0.fetchThirdPartySearchFile("", "amazonServerURL", "(hCc-+>##e4", "amazonServerURL");
      fileUtil0.downloadBrowseNodeFile("", "a6[^zWq^", "a6[^zWq^", "twsT|nNJ9v+yO5n,");
      fileUtil0.fetchBlendedSearchFile("3B}6^47b6=N7im~)p&-", "");
      fileUtil0.downloadBlendedSearchFile("", "86400000");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("3rd_", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchKeywordSearchFile("", (String) null, "", "");
      fileUtil0.downloadKeywordSearchFile("", "", "net.kencochrane.a4j.file.FileUtil", "");
      fileUtil0.deleteFile("");
      fileUtil0.deleteFile("");
      fileUtil0.downloadThirdPartySearchFile("ts_", (String) null, (String) null, "3rd_");
      fileUtil0.getASINFile("ts_", "ts_", (String) null, "");
      fileUtil0.fetchThirdPartySearchFile("", "net.kencochrane.a4j.file.FileUtil", "", "");
      fileUtil0.downloadBlendedSearchFile("", "");
      fileUtil0.fetchASINFile("ts_", "", "", (String) null);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-1));
      arrayList0.add(integer0);
      fileUtil0.fetchAccessories("net.kencochrane.a4j.file.FileUtil", arrayList0);
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "", "", "", "net.kencochrane.a4j.file.FileUtil");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.6393405872324323
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadGenericSearchFile("There is no Properties File Setting to default", "", "There is no Properties File Setting to default", "There is no Properties File Setting to default", "[,MdYKm=L", "[,MdYKm=L");
      fileUtil0.getSimilarItems("There is no Properties File Setting to default", "");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.fetchBNFile("QlO~jTQX)nR}", "TtPV(ChDz5|5cy[", (String) null);
      fileUtil0.deleteFile("cacheLife");
      fileUtil0.downloadSimilaritesFile((String) null, "", (String) null);
      fileUtil0.fetchKeywordSearchFile("-pn^,Y_4e2w2]}!", "", "& YSRf7;0G:df^=GN ", "");
      fileUtil0.getBrowseNodeFile("QlO~jTQX)nR}", "& YSRf7;0G:df^=GN ", "");
      fileUtil0.fetchBNFile("", "& YSRf7;0G:df^=GN ", (String) null);
      fileUtil0.renameFile("[,MdYKm=L", "");
      fileUtil0.downloadGenericSearchFile("TtPV(ChDz5|5cy[", "", "", "~", "ta_", "~");
      fileUtil0.getASINFile((String) null, "C3tdPf-1K", "", (String) null);
      fileUtil0.isAgeGood((File) null);
      fileUtil0.fetchSimilarItems((String) null, ":03?._~!rdXc<u#e");
      fileUtil0.fetchBNFile("", "& YSRf7;0G:df^=GN ", "$U+;jK");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("+rtoP=r_gyrcUnJJ&#", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.334549109212566
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getBrowseNodeFile("", "w`]&=e6U8E", "w`]&=e6U8E");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.downloadBlendedSearchFile("Yb", "Yb");
      fileUtil0.downloadKeywordSearchFile("Yb", "Yb", "Yb", "Yb");
      fileUtil0.downloadOneASINFile("cacheLife", "", "", "", "");
      fileUtil0.getASINFile("Yb", "", "Yb", ";");
      fileUtil0.deleteFile("Nf28xA:FpBu7SC${");
      fileUtil0.downloadGenericSearchFile("cacheLife", "", "b", "cacheLife", "Yb", ";");
      fileUtil0.oldestAge = 0L;
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.clear();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=SimilaritySearch&type=cacheLife&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Nf28xA:FpBu7SC${");
      arrayList0.add("amazonServerURL");
      fileUtil0.getAccessories("", arrayList0);
      fileUtil0.downloadAccessoriesFile("", arrayList0, "SimilaritySearch");
      fileUtil0.downloadKeywordSearchFile("cacheLife", "", ";", ";");
      fileUtil0.downloadBlendedSearchFile("SimilaritySearch", "cacheLife");
      File file0 = fileUtil0.downloadGenericSearchFile("K=QE/Ik[.N@p", "-", "", "g_", "SimilaritySearch", "-");
      assertNull(file0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.253857589601352
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_W`]&=E6U8E_W`]&=E6U8E.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "6J1l");
      fileUtil0.getBrowseNodeFile("", "w`]&=e6U8E", "w`]&=e6U8E");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile1);
      fileUtil0.downloadBlendedSearchFile("Yb", "Yb");
      fileUtil0.downloadKeywordSearchFile("Yb", "Yb", "Yb", "Yb");
      String string0 = "";
      String string1 = "cacheLife";
      fileUtil0.downloadOneASINFile("cacheLife", "", "", "", "");
      String string2 = ";";
      fileUtil0.getASINFile("Yb", "", "Yb", ";");
      fileUtil0.deleteFile("Nf28xA:FpBu7SC${");
      fileUtil0.downloadGenericSearchFile("cacheLife", "", "b", "cacheLife", "Yb", ";");
      fileUtil0.oldestAge = 0L;
      ArrayList<String> arrayList0 = new ArrayList<String>();
      // Undeclared exception!
      try { 
        arrayList0.add((-898), "K=QE/Ik[.N@p");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -898, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3066687254045313
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/YB_YB__.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "6J1l");
      fileUtil0.getBrowseNodeFile("", "w`]&=e6U8E", "w`]&=e6U8E");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile1);
      String string0 = "offerpage=";
      fileUtil0.downloadSimilaritesFile("", "w`]&=e6U8E", "offerpage=");
      fileUtil0.downloadBlendedSearchFile("Yb", "Yb");
      fileUtil0.downloadKeywordSearchFile("Yb", "Yb", "Yb", "Yb");
      fileUtil0.downloadOneASINFile("cacheLife", "", "", "", "");
      fileUtil0.getASINFile("Yb", "", "Yb", "");
      fileUtil0.deleteFile("Nf28xA:FpBu7SC${");
      MockFile.createTempFile("offerpage=", "", (File) null);
      fileUtil0.oldestAge = 14L;
      ArrayList<String> arrayList0 = new ArrayList<String>();
      fileUtil0.downloadThirdPartySearchFile("dev-t=", "Yb", "dev-t=", "");
      arrayList0.add("b");
      // Undeclared exception!
      try { 
        arrayList0.add((-898), "K=QE/Ik[.N@p");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -898, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.5631514064163308
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFile mockFile0 = new MockFile("Yb", "Yb");
      fileUtil0.downloadKeywordSearchFile("Yb", "Yb", "Yb", "Yb");
      fileUtil0.downloadOneASINFile("", "", "", "", "");
      fileUtil0.getASINFile("Yb", "", "Yb", "Yb");
      fileUtil0.deleteFile("Nf28xA:FpBu7SC${");
      fileUtil0.downloadGenericSearchFile("Yb", "", "", "Yb", "Yb", "");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      MockFile mockFile1 = new MockFile("Nf28xA:FpBu7SC${", "Yb");
      fileUtil0.downloadThirdPartySearchFile("s*C&^A'hb-", "", "", "");
      fileUtil0.downloadCart("s");
      fileUtil0.downloadBlendedSearchFile("b", "amazonServerURL");
      fileUtil0.fetchKeywordSearchFile("amazonServerURL", "amazonServerURL", "", "");
      fileUtil0.downloadBrowseNodeFile("amazonServerURL", "b", "", "Nf28xA:FpBu7SC${");
      fileUtil0.fetchAccessories("", arrayList0);
      fileUtil0.fetchKeywordSearchFile("", "wyaXEA}4_vB", (String) null, "");
      File file0 = fileUtil0.downloadBlendedSearchFile("", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.2823743761592494
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadSimilaritesFile("", "", (String) null);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=.,19AzX#nS]&type=lite&offerpage=s_&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "&eWUl2%E");
      fileUtil0.downloadKeywordSearchFile("", "", (String) null, "");
      fileUtil0.fetchSimilarItems(".,19AzX#nS]", "s_");
      fileUtil0.renameFile("7t{lbSs\u0002", "Zl\b0!U$O\"1");
      fileUtil0.deleteFile("7t{lbSs\u0002");
      fileUtil0.getBrowseNodeFile("", (String) null, ".,19AzX#nS]");
      fileUtil0.fetchBNFile("_", "", "wM1pOGueA-5j.F)");
      fileUtil0.downloadCart(".,19AzX#nS]");
      File file0 = fileUtil0.downloadKeywordSearchFile("", "wM1pOGueA-5j.F)", (String) null, "");
      assertNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.4583113296830845
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadCart("");
      fileUtil0.downloadKeywordSearchFile("Yb", "Yb", "Yb", "Yb");
      fileUtil0.downloadOneASINFile("cacheLife", "", "", "", "");
      fileUtil0.getASINFile("Yb", "", "Yb", ";");
      fileUtil0.deleteFile("Nf28xA:FpBu7SC${");
      fileUtil0.downloadGenericSearchFile("cacheLife", "", "b", "cacheLife", "Yb", ";");
      fileUtil0.downloadThirdPartySearchFile("", "0^{k^%^<P", "_Z_3!^C4>", ";");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=cacheLife&mode=&type=;&page=;&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Nf28xA:FpBu7SC${");
      arrayList0.add("amazonServerURL");
      fileUtil0.getAccessories("", arrayList0);
      fileUtil0.downloadAccessoriesFile("", arrayList0, "SimilaritySearch");
      fileUtil0.downloadKeywordSearchFile("cacheLife", "", ";", ";");
      fileUtil0.downloadBlendedSearchFile("SimilaritySearch", "cacheLife");
      fileUtil0.downloadGenericSearchFile("b", "amazonServerURL", "", "amazonServerURL", "SimilaritySearch", "amazonServerURL");
      fileUtil0.renameFile("@*UNpn", "w`]&=e6U8E");
      fileUtil0.renameFile("SimilaritySearch", "0^{k^%^<P");
      MockFile mockFile0 = new MockFile("", "_Z_3!^C4>");
  }
}
