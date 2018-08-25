/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:59:36 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
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
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadSimilaritesFile("", "qXg_Rg7>/vLpHhu{C", "t_");
      fileUtil0.downloadKeywordSearchFile("Log file isn't there Setting default properties", "t_", (String) null, "");
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "t_", "");
      assertFalse(boolean0);
      
      fileUtil0.getAccessories("t{", (ArrayList) null);
      fileUtil0.fetchBlendedSearchFile("", "");
      fileUtil0.deleteFile(";{f");
      fileUtil0.fetchASINFile("lite", "", "", "t{");
      fileUtil0.fetchAccessories((String) null, (ArrayList) null);
      boolean boolean1 = fileUtil0.downloadOneASINFile((String) null, "t{", "6(x,|[P8M<y9#n1H,", "t_", "t{");
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchThirdPartySearchFile("k_", "b_", "k_", "http://xml.amazon.net/onca/xml3");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      arrayList0.parallelStream();
      fileUtil0.getAccessories("a_", arrayList0);
      fileUtil0.fetchBlendedSearchFile("/7W+R-", "k_");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.downloadThirdPartySearchFile("lS,;L&.ow`zL05|E~\"!", ":}7e{,Y3A", "", "");
      fileUtil0.downloadBrowseNodeFile("http://xml.amazon.net/onca/xml3", "", "cacheDir", "c_");
      File file0 = fileUtil0.downloadGenericSearchFile("M(A[{l]p!V@'^vTodDw", "", "~>M", "@3JMvq\"D+yC#Y]yR@", "", "http://xml.amazon.net/onca/xml3");
      assertNull(file0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getSimilarItems("_", "");
      fileUtil0.fetchKeywordSearchFile("", "", "", "coSV?YuCTj@[h");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("Tm~jDr%'4");
      fileUtil0.getAccessories("", arrayList0);
      fileUtil0.cacheDir = "";
      fileUtil0.downloadBrowseNodeFile("4j*o4W>V}M]^", "_", "_", "4j*o4W>V}M]^");
      fileUtil0.downloadKeywordSearchFile("", "Z{b2B$_", "", (String) null);
      fileUtil0.downloadThirdPartySearchFile("_", "", "_", "Z{b2B$_");
      fileUtil0.getBrowseNodeFile("c_", "", "");
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
  //Test case number: 3
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      fileUtil0.downloadKeywordSearchFile("Fq.B\"`\n-NtLz", "V@]D[ku`!?Ip", "Fq.B\"`\n-NtLz", "W:@mHp4I");
      fileUtil0.downloadCart("");
      fileUtil0.fetchGenericSearchFile("W:@mHp4I", "", "Fq.B\"`\n-NtLz", "", "", "W:@mHp4I");
      fileUtil0.renameFile("V@]D[ku`!?Ip", "|");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("Fq.B\"`\n-NtLz", "There is no Properties File Setting to default");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile("", "");
      fileUtil0.downloadGenericSearchFile("_oX+WT<J6`e0eJ", "_oX+WT<J6`e0eJ", "", "'%ArS_&@OW3p5,L)Tng", "", "ePPZR_%:S");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      UnaryOperator<Integer> unaryOperator0 = UnaryOperator.identity();
      UnaryOperator.identity();
      arrayList0.replaceAll(unaryOperator0);
      fileUtil0.downloadAccessoriesFile("'%ArS_&@OW3p5,L)Tng", arrayList0, "Z:G@dt&");
      fileUtil0.downloadCart(" \"");
      fileUtil0.downloadGenericSearchFile((String) null, "T/N3^54 <~g~&U", "Z:G@dt&", "", "dRI;^X1U[D>LNaB5", "");
      fileUtil0.downloadCart("");
      fileUtil0.renameFile("Z:G@dt&", "ePPZR_%:S");
      fileUtil0.fetchBlendedSearchFile("_oX+WT<J6`e0eJ", "");
      fileUtil0.deleteFile("'%ArS_&@OW3p5,L)Tng");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "\"1}}a0L{PeFq\"o++:Ih", "#R<$C^kX7bA");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.2047854169135204
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadKeywordSearchFile((String) null, (String) null, "4~).|^ji<(0<R\f", (String) null);
      fileUtil0.cacheDir = "";
      fileUtil0.getASINFile("4~).|^ji<(0<R\f", "1", "@)`N:tO;R", "4~).|^ji<(0<R\f");
      fileUtil0.cacheDir = "";
      fileUtil0.fetchASINFile("", "", "c_", "");
      fileUtil0.cacheDir = null;
      fileUtil0.downloadThirdPartySearchFile("c_", "SimilaritySearch", "SimilaritySearch", "");
      fileUtil0.downloadThirdPartySearchFile("net.kencochrane.a4j.util.LoadProperties", "h2QB^.7\">DYN'Ox", "#S", "@)`N:tO;R");
      fileUtil0.downloadGenericSearchFile("@)`N:tO;R", "~z):VsuP^P@F1j>dh", "~z):VsuP^P@F1j>dh", "URLSeperator", "", "cyaccr%L");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      fileUtil0.getAccessories((String) null, arrayList0);
      fileUtil0.deleteFile("");
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "h2QB^.7\">DYN'Ox");
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadSimilaritesFile("", "", "");
      fileUtil0.renameFile("", "");
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.871476118054867
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getASINFile("_20xBJ{g", "_20xBJ{g", "_20xBJ{g", "_20xBJ{g");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_SQ',P{NZ1Z`(GON2 /.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.renameFile("sq',p{Nz1Z`(GON2 /", "_20xBJ{g");
      fileUtil0.downloadBlendedSearchFile("/blC", "/blC");
      fileUtil0.getSimilarItems("sq',p{Nz1Z`(GON2 /", "_20xBJ{g");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.getAccessories("/blC", arrayList0);
      fileUtil0.oldestAge = (-403L);
      ArrayList<Object> arrayList1 = new ArrayList<Object>();
      fileUtil0.fetchAccessories((String) null, arrayList1);
      LoadProperties.instance();
      fileUtil0.fetchBNFile("_20xBJ{g", "KWGik)/S^", (String) null);
      fileUtil0.downloadAccessoriesFile("x%CJDCJk^S'", arrayList1, "KWGik)/S^");
      fileUtil0.fetchBlendedSearchFile("KWGik)/S^", "sq',p{Nz1Z`(GON2 /");
      fileUtil0.fetchBlendedSearchFile("x%CJDCJk^S'", "KWGik)/S^");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("L^cg2Azl! X{-", ".8K:0\"%-rQBni~O", "Q!-1az(6v6]g5GtsZL", "c_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1597316160754936
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getASINFile("_20xBJ{g", "_20xBJ{g", "_20xBJ{g", "_20xBJ{g");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_SQ',P{NZ1Z`(GON2 /.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.renameFile("sq',p{Nz1Z`(GON2 /", "_20xBJ{g");
      fileUtil0.fetchSimilarItems("sq',p{Nz1Z`(GON2 /", "/blC");
      fileUtil0.getSimilarItems("_20xBJ{g", "/blC");
      fileUtil0.fetchSimilarItems("", "");
      fileUtil0.fetchGenericSearchFile("sq',p{Nz1Z`(GON2 /", "_20xBJ{g", "x`5Te~PDd*`?4X", (String) null, "x`5Te~PDd*`?4X", "sq',p{Nz1Z`(GON2 /");
      File file0 = fileUtil0.getASINFile("x`5Te~PDd*`?4X", "lite", "sq',p{Nz1Z`(GON2 /", "BYTi");
      assertNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.6250481587325405
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchGenericSearchFile("", "", "popcornmonste2-20", "-", "popcornmonste2-20", "-");
      MockFile mockFile0 = new MockFile("-");
      mockFile0.getAbsolutePath();
      mockFile0.toURI();
      mockFile0.mkdirs();
      mockFile0.setExecutable(true, true);
      fileUtil0.fetchKeywordSearchFile("[e'M(t$Lr&Fqy+yKG", (String) null, (String) null, "");
      fileUtil0.getSimilarItems("-", (String) null);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SR&GI)3[Q AH_[E'M(T$LR&\\FQY+YKG__-.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      fileUtil0.isAgeGood(mockFile0);
      fileUtil0.getASINFile("-", "2]_OF59063$]F-<", "[e'M(t$Lr&Fqy+yKG", "");
      fileUtil0.renameFile("+w<2?+U]J<<ysXr7]]", "sr&gI)3[Q ah");
      fileUtil0.fetchASINFile("sr&gI)3[Q ah", "", "[e'M(t$Lr&Fqy+yKG", "-");
      fileUtil0.fetchGenericSearchFile("+w<2?+U]J<<ysXr7]]", "-", "-", "okA1h", "^~%d?=b", "-");
      fileUtil0.getSimilarItems("", "+w<2?+U]J<<ysXr7]]");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("vFE>", (String) null, "ef$(*C", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile("", "popcornmonste2-20");
      MockFile mockFile0 = new MockFile("-");
      mockFile0.getAbsolutePath();
      mockFile0.toURI();
      mockFile0.mkdirs();
      mockFile0.setExecutable(true, true);
      fileUtil0.fetchKeywordSearchFile("[e'M(t$Lr&Fqy+yKG", (String) null, (String) null, "");
      fileUtil0.getSimilarItems("-", (String) null);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_/HOME/UBUNTU/EXT1/EVOSUITE_READABILITY_GEN/PROJECTS/2_A4J/-_{`ITM?L0(J+,K+J:|M.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      fileUtil0.getASINFile("-", "2]_OF59063$]F-<", "[e'M(t$Lr&Fqy+yKG", "b");
      fileUtil0.renameFile("+w<2?+U]J<<ysXr7]]", "sr&gI)3[Q ah");
      fileUtil0.fetchASINFile("sr&gI)3[Q ah", "", "[e'M(t$Lr&Fqy+yKG", "-");
      fileUtil0.fetchGenericSearchFile("+w<2?+U]J<<ysXr7]]", "-", "-", "okA1h", "^~%d?=b", "-");
      fileUtil0.getSimilarItems("", "+w<2?+U]J<<ysXr7]]");
      fileUtil0.fetchThirdPartySearchFile("vFE", (String) null, "ef$(*C", (String) null);
      fileUtil0.getBrowseNodeFile("}Zz\"i5YT1,&Ehi", "/home/ubuntu/ext1/evosuite_readability_gen/projects/2_a4j/-", "]pVAncT7BS|0J");
      fileUtil0.fetchBNFile("", "/home/ubuntu/ext1/evosuite_readability_gen/projects/2_a4j/-", "{`ITM?l0(j+,K+j:|M");
      System.setCurrentTimeMillis((-1L));
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.5968338688975634
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&Log file isn't there Setting default properties=Log+file+isn%27t+there+Setting+default+properties&mode=Log file isn't there Setting default properties&type=Log file isn't there Setting default properties&page=Log file isn't there Setting default properties&offer=Log file isn't there Setting default properties&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.fetchAccessories("R", arrayList0);
      fileUtil0.fetchAccessories("1'`nNf !0x{py<#/(l", arrayList0);
      fileUtil0.downloadGenericSearchFile("86400000", "", "&t=", "R", "", "86400000");
      fileUtil0.downloadThirdPartySearchFile("XRsVpr", "", "", "1");
      fileUtil0.downloadCart("L'@xv~om=*f}$a-e4pW");
      FileUtil fileUtil1 = new FileUtil();
      fileUtil1.downloadOneASINFile("c_", "XRsVpr", "< ':", "", "< ':");
      fileUtil1.downloadKeywordSearchFile("", "", (String) null, "1'`nNf !0x{py<#/(l");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_1'`NNF !0X{PY<#/(L.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      Random.setNextRandom(0);
      fileUtil0.fetchBNFile("c_", "L'@xv~om=*f}$a-e4pW", "SimilaritySearch");
      fileUtil1.downloadAccessoriesFile("R", arrayList0, (String) null);
      fileUtil1.fetchAccessories("1'`nNf !0x{py<#/(l", arrayList0);
      File file0 = fileUtil0.downloadBlendedSearchFile("", "< ':");
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.4799555205445176
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&Log file isn't there Setting default properties=Log+file+isn%27t+there+Setting+default+properties&mode=Log file isn't there Setting default properties&type=Log file isn't there Setting default properties&page=Log file isn't there Setting default properties&offer=Log file isn't there Setting default properties&f=xml");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/LOG FILE ISN'T THERE SETTING DEFAULT PROPERTIES_LOG FILE ISN'T THERE SETTING DEFAULT PROPERTIES_LOG FILE ISN'T THERE SETTING DEFAULT PROPERTIES_LOG FILE ISN'T THERE SETTING DEFAULT PROPERTIES.XML");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "#");
      fileUtil0.oldestAge = (-326L);
      fileUtil0.fetchASINFile("Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "Log file isn't there Setting default properties");
      fileUtil0.getSimilarItems("Log file isn't there Setting default properties", "Log file isn't there Setting default properties");
      fileUtil0.fetchGenericSearchFile("Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "Log file isn't there Setting default properties");
      fileUtil0.fetchThirdPartySearchFile("#", "Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "#");
      System.setCurrentTimeMillis((-326L));
      boolean boolean1 = fileUtil0.downloadBrowseNodeFile("Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "+my", "#");
      assertFalse(boolean1 == boolean0);
  }
}
