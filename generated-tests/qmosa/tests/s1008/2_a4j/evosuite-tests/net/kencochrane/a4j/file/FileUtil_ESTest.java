/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:52:24 GMT 2018
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchASINFile("a_", "z5<k#5LC43q@c8Y", "", "");
      File file0 = fileUtil0.downloadKeywordSearchFile("", "a_", "all", "all");
      assertNull(file0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadBrowseNodeFile(">RY@\"d8cDm4", "gIeuBfO{y#", "", ">RY@\"d8cDm4");
      fileUtil0.fetchThirdPartySearchFile("net.kencochrane.a4j.file.FileUtil", "g!n_C$F8\"D4 e)e", "b_", "net.kencochrane.a4j.file.FileUtil");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-977));
      arrayList0.add(integer0);
      fileUtil0.cacheDir = "";
      fileUtil0.fetchAccessories("", arrayList0);
      fileUtil0.getBrowseNodeFile("", "", "");
      fileUtil0.downloadCart("4[EG]r,0beUTj1 ");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("4[EG]r,0beUTj1 ", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadKeywordSearchFile("9", "9", "9", "9");
      String string0 = "";
      fileUtil0.downloadBlendedSearchFile("", "9");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.fetchThirdPartySearchFile("9", "9", "9", "9");
      String string1 = "^m1KLI\\nb8]!B*(2";
      String string2 = null;
      fileUtil0.downloadBrowseNodeFile("^m1KLI\nb8]!B*(2", "9", (String) null, "<X;R[f!MO");
      String string3 = "-tT-6";
      fileUtil0.fetchThirdPartySearchFile("^m1KLI\nb8]!B*(2", "^m1KLI\nb8]!B*(2", "^m1KLI\nb8]!B*(2", "-tT-6");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      Object object1 = new Object();
      arrayList0.add(object1);
      arrayList0.add(object0);
      fileUtil0.downloadAccessoriesFile("9", arrayList0, "");
      String string4 = "associateID";
      String string5 = null;
      // Undeclared exception!
      try { 
        fileUtil0.renameFile("associateID", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getASINFile("cacheDir", "cacheDir", "cacheDir", (String) null);
      fileUtil0.fetchKeywordSearchFile("D7J|oyQC", "D7J|oyQC", "D7J|oyQC", "D7J|oyQC");
      fileUtil0.downloadBlendedSearchFile("+G[/UQFc", "+G[/UQFc");
      File file0 = fileUtil0.downloadThirdPartySearchFile("D7J|oyQC", "Log file isn't there Setting default properties", "7swCsV7y", "ts_");
      assertNull(file0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      arrayList0.spliterator();
      fileUtil0.getAccessories("", arrayList0);
      fileUtil0.fetchKeywordSearchFile("", "", "", "");
      fileUtil0.downloadThirdPartySearchFile("", "net.kencochrane.a4j.util.LoadProperties", "", "T||]%|~ZG.LC(6mb~A");
      fileUtil0.fetchKeywordSearchFile("", "T||]%|~ZG.LC(6mb~A", (String) null, "");
      fileUtil0.getBrowseNodeFile("net.kencochrane.a4j.util.LoadProperties", "@>-=6JQ%t&fx,L", "net.kencochrane.a4j.util.LoadProperties");
      fileUtil0.fetchBlendedSearchFile("AGmeJ)4qdg_/", "a_");
      Integer integer0 = new Integer(7);
      arrayList0.add(integer0);
      fileUtil0.downloadAccessoriesFile("3rd_", arrayList0, "I~-|SH-#r+.Olx");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "]RHe['l4y{", "]RHe['l4y{", "I~-|SH-#r+.Olx", "\"-q6AW$MO[2+kQ/Sl.g");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getSimilarItems("B}", "B}");
      fileUtil0.fetchThirdPartySearchFile("B}", "B}", "cacheLife", "B}");
      fileUtil0.downloadBlendedSearchFile("=L@Nby{Di&?l|EZ}*", "a_");
      fileUtil0.downloadKeywordSearchFile("B}", "net.kencochrane.a4j.util.LoadProperties", "x\u0005tTVG|UMk^gu9G", "a_");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.getAccessories("B}", arrayList0);
      fileUtil0.fetchThirdPartySearchFile("cacheLife", "B}", "a_", "B}");
      fileUtil0.downloadThirdPartySearchFile("U=S;l", "cacheLife", "-Z_,fpM", "B}");
      fileUtil0.getAccessories("SimilaritySearch", arrayList0);
      fileUtil0.fetchBlendedSearchFile("uGw{", "");
      fileUtil0.downloadGenericSearchFile("net.kencochrane.a4j.util.LoadProperties", "onpA@0]L('o<c", "x\u0005tTVG|UMk^gu9G", "", "cacheDir", "");
      fileUtil0.downloadSimilaritesFile("-", "Fx t/ABA $rQxMfp{z", "6gl>oYZ}.(oH|s96@");
      fileUtil0.downloadThirdPartySearchFile("=L@Nby{Di&?l|EZ}*", "-", "SimilaritySearch", "");
      File file0 = fileUtil0.downloadBlendedSearchFile("", "-Z_,fpM");
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("l<", "l<");
      mockFile0.delete();
      fileUtil0.isAgeGood(mockFile0);
      fileUtil0.fetchASINFile("QS|v?htZLQ_f\"4", "cacheLife", "k_", "cacheDir");
      fileUtil0.getBrowseNodeFile("cacheDir", "cacheDir", "cacheDir");
      fileUtil0.fetchThirdPartySearchFile("l<", "l<", "QS|v?htZLQ_f\"4", "3rd_");
      fileUtil0.getASINFile("cacheDir", "", "", (String) null);
      fileUtil0.deleteFile("k_");
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getASINFile("86c;'p`tO`dCLV8", "86c;'p`tO`dCLV8", "86c;'p`tO`dCLV8", "86c;'p`tO`dCLV8");
      fileUtil0.downloadGenericSearchFile("86c;'p`tO`dCLV8", "86c;'p`tO`dCLV8", "", "", "86c;'p`tO`dCLV8", "");
      fileUtil0.downloadCart("");
      fileUtil0.fetchASINFile((String) null, "", "86c;'p`tO`dCLV8", "/");
      fileUtil0.fetchThirdPartySearchFile("7-80D\u0004s", "7-80D\u0004s", "", "w/L*");
      fileUtil0.downloadOneASINFile("", "", "", "Nr:8N=", "");
      fileUtil0.getASINFile("", "http://xml.amazon.net/onca/xml3", "", "");
      fileUtil0.deleteFile("");
      fileUtil0.downloadBrowseNodeFile("", "", "", "http://xml.amazon.net/onca/xml3");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("w/L*", "Nr:8N=", "", "Nr:8N=", "MS[_", "iM_YfaKBgvQ~Mwl");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.488327743368588
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getASINFile("1", "1", "1", "1");
      fileUtil0.fetchThirdPartySearchFile("1", "WUxhir]B2oD]Dx&@F5=", "", "cacheLife");
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
      
      fileUtil0.fetchSimilarItems("6>3}a", "+IH0H`oBX");
      fileUtil0.deleteFile("");
      fileUtil0.renameFile("1", "1");
      fileUtil0.downloadThirdPartySearchFile("", "", "", "q~nQd=Y#z)~:!");
      File file0 = fileUtil0.getBrowseNodeFile("@GQB)@MopBAw*", (String) null, (String) null);
      assertNull(file0);
      
      fileUtil0.downloadBrowseNodeFile("1", "", "", "");
      boolean boolean1 = fileUtil0.downloadOneASINFile("e-?P", "+IH0H`oBX", "q~nQd=Y#z)~:!", (String) null, "+IH0H`oBX");
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadCart("Qjp&");
      fileUtil0.downloadBrowseNodeFile("v{JQKX", "", "\"WN H5&", (String) null);
      fileUtil0.renameFile("", "\"WN H5&");
      fileUtil0.fetchKeywordSearchFile("all", "/", "Qjp&", "all");
      fileUtil0.deleteFile("-");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "Qjp&", "1u<(sV]8U{kw}jp%,n");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      fileUtil0.fetchASINFile("", "", "", "");
      fileUtil0.deleteFile("");
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.553237002993714
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "d{0#Y4%ee!;Yw.9xr>V");
      fileUtil0.downloadBrowseNodeFile("", "d{0#Y4%ee!;Yw.9xr>V", "d{0#Y4%ee!;Yw.9xr>V", "");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/R_VMO[__]'%9WQBNDWET<QJK.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "4}~$2!H+!GA n");
      fileUtil0.downloadKeywordSearchFile("'HhfAcFk9,$-jk-Y", "", "_m76", "FQKwgc<irS^!|aiNk S");
      fileUtil0.downloadCart("");
      fileUtil0.downloadBlendedSearchFile("Qqq3JV&a", "d{0#Y4%ee!;Yw.9xr>V");
      fileUtil0.downloadGenericSearchFile("net.kencochrane.a4j.util.LoadProperties", "]'%9wqBNDWet<qjK", "", "d{0#Y4%ee!;Yw.9xr>V", "Qqq3JV&a", (String) null);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) null);
      fileUtil0.downloadAccessoriesFile((String) null, arrayList0, "");
      fileUtil0.downloadBlendedSearchFile("'HhfAcFk9,$-jk-Y", "_m76");
      fileUtil0.downloadSimilaritesFile("]'%9wqBNDWet<qjK", "ey\"(\"aT]CwLwd[", "ey\"(\"aT]CwLwd[");
      fileUtil0.downloadThirdPartySearchFile("FQKwgc<irS^!|aiNk S", "'HhfAcFk9,$-jk-Y", "", "JBq");
      fileUtil0.downloadAccessoriesFile("FQKwgc<irS^!|aiNk S", arrayList0, "d{0#Y4%ee!;Yw.9xr>V");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("r_vmO[", "", "]'%9wqBNDWet<qjK");
      assertEquals(14, fileInputStream0.available());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.479955520544517
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("tX )E", "tX )E");
      fileUtil0.downloadCart("tX )E");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=1;XU-2`&mode=\\#^uu!B1x/lh-*M,)6&type=lite&page=There is no Properties File Setting to default&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "tX )E");
      fileUtil0.fetchKeywordSearchFile("+(jC + 3`", "#^uu!B1x/lh-*M,)6", "tX )E", "There is no Properties File Setting to default");
      fileUtil0.downloadKeywordSearchFile("tX )E", "tX )E", "+(jC + 3`", "#^uu!B1x/lh-*M,)6");
      MockFile.createTempFile("#^uu!B1x/lh-*M,)6", "tX )E", (File) null);
      fileUtil0.downloadSimilaritesFile("tX )E", "lite", "tX )E");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.iterator();
      fileUtil0.downloadAccessoriesFile("+(jC + 3`", arrayList0, "There is no Properties File Setting to default");
      fileUtil0.renameFile("1;XU-2`", "tX )E");
      fileUtil0.downloadBrowseNodeFile("+(jC + 3`", "R", "+(jC + 3`", "+(jC + 3`");
      fileUtil0.downloadBlendedSearchFile("1;XU-2`", "#^uu!B1x/lh-*M,)6");
      fileUtil0.renameFile("@Yly^-s.@l", "tX )E");
      fileUtil0.downloadSimilaritesFile("@Yly^-s.@l", "+(jC + 3`", "http://xml.amazon.net/onca/xml3");
      fileUtil0.downloadBrowseNodeFile("tX )E", "tX )E", "http://xml.amazon.net/onca/xml3", "1;XU-2`");
      fileUtil0.downloadOneASINFile("#^uu!B1x/lh-*M,)6", "'d&Andc.-pE]$E]0\t", "", "tX )E", "Jk=S(2?.}+~aac+SeU");
      fileUtil0.downloadGenericSearchFile("#^uu!B1x/lh-*M,)6", "'d&Andc.-pE]$E]0\t", "", "http://xml.amazon.net/onca/xml3", "zsWYd.xqZ4/?(dPNX", "R");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("#^uu!B1x/lh-*M,)6", "1;XU-2`", "There is no Properties File Setting to default");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.597508782744932
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchKeywordSearchFile("c(w", "U_w94([2tu", "popcornmonste2-20", "popcornmonste2-20");
      fileUtil0.fetchBlendedSearchFile((String) null, "cacheLife");
      fileUtil0.fetchSimilarItems("SF*KdO/{3)AN:saQ[", "=E048F A6fmw7p6");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=popcornmonste2-20&type=Iz 6~/3ztsI&page=6&kX&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "pIIKg$f#s[uwS}eqYG");
      fileUtil0.downloadBlendedSearchFile("SF*KdO/{3)AN:saQ[", "SF*KdO/{3)AN:saQ[");
      fileUtil0.downloadKeywordSearchFile("", "popcornmonste2-20", "Iz 6~/3ztsI", "6&kX");
      fileUtil0.fetchBNFile("", (String) null, "U_w94([2tu");
      fileUtil0.downloadBrowseNodeFile("U_w94([2tu", "]pHI%@07}", "SF*KdO/{3)AN:saQ[", "");
      fileUtil0.getASINFile("=E048F A6fmw7p6", "c(w", (String) null, "1n");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("cacheLife", "pIIKg$f#s[uwS}eqYG", "nF+ad/p6I", "]pHI%@07}", "pIIKg$f#s[uwS}eqYG", "SF*KdO/{3)AN:saQ[");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.313153678733635
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getBrowseNodeFile("", "", "j<+3");
      fileUtil0.downloadGenericSearchFile("", "An5`a`*.Ij*xzXGWlJ@", "plW6%,D ", "plW6%,D ", "", "j<+3");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_ML/WZON.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchGenericSearchFile("d3", "d3", "d3", "d3", "d3", "d3");
      fileUtil0.downloadThirdPartySearchFile("d3", "d3", "d3", "d3");
      fileUtil0.downloadOneASINFile("plW6%,D ", "An5`a`*.Ij*xzXGWlJ@", "plW6%,D ", "", "An5`a`*.Ij*xzXGWlJ@");
      fileUtil0.getSimilarItems("ML/wzOn", "ML/wzOn");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.downloadBrowseNodeFile("", "d3", "d3", "ML/wzOn");
      Random.setNextRandom(1689);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("ML/wzOn", "");
      assertNull(fileInputStream0);
  }
}
