/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:16:50 GMT 2018
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.function.Predicate;
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.getAccessories((String) null, arrayList0);
      fileUtil0.renameFile("1t1H}Pu ;?OnzMs_K", "1t1H}Pu ;?OnzMs_K");
      ArrayList<String> arrayList1 = new ArrayList<String>();
      fileUtil0.cacheDir = "1";
      arrayList1.add(":=pG%=$4I");
      fileUtil0.getAccessories(":=pG%=$4I", arrayList1);
      fileUtil0.fetchSimilarItems("1t1H}Pu ;?OnzMs_K", "1");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("1B/.l%Y", "1B/.l%Y", "", "1t1H}Pu ;?OnzMs_K");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("1", "1");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      fileUtil0.downloadAccessoriesFile("popcornmonste2-20", arrayList0, "1");
      fileUtil0.fetchKeywordSearchFile("t_", (String) null, "t_", "");
      fileUtil0.downloadOneASINFile((String) null, "t_", (String) null, "", "");
      ArrayList<String> arrayList1 = new ArrayList<String>();
      fileUtil0.fetchAccessories("f!qb?8bi?&:?", arrayList1);
      fileUtil0.renameFile("", "<1P6g7T");
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchKeywordSearchFile("t_", "t_", "}g", "}g");
      fileUtil0.downloadThirdPartySearchFile("=H8LI>E)vHQ2{B", "8YfR|]<4hs\"c", "/", "=H8LI>E)vHQ2{B");
      fileUtil0.getASINFile("=H8LI>E)vHQ2{B", "g@)DOrKBm", "", "");
      fileUtil0.downloadCart("M7NY-kvO\"G");
      fileUtil0.fetchASINFile("M7NY-kvO\"G", "M7NY-kvO\"G", "w0YDoUG", "_(WjT~_nE");
      fileUtil0.fetchThirdPartySearchFile("=H8LI>E)vHQ2{B", "=H8LI>E)vHQ2{B", "", "");
      fileUtil0.downloadBrowseNodeFile("M7NY-kvO\"G", "", "", "");
      fileUtil0.getBrowseNodeFile("w0YDoUG", "M7NY-kvO\"G", "cacheLife");
      fileUtil0.isAgeGood((File) null);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.downloadAccessoriesFile("YpSH", arrayList0, "_(WjT~_nE");
      fileUtil0.deleteFile("M7NY-kvO\"G");
      fileUtil0.fetchKeywordSearchFile("g@)DOrKBm", "YpSH", "YpSH", (String) null);
      fileUtil0.fetchKeywordSearchFile("", "/", "", ".xml");
      File file0 = fileUtil0.downloadGenericSearchFile("KxiV;'", (String) null, "jV5Bb", "YpSH", "", "Q6Iu^t\"P>5RdN+wc{@V");
      assertNull(file0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", (String) null);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      fileUtil0.fetchAccessories("UyK3>t\"g7HamCdD){3", arrayList0);
      fileUtil0.downloadGenericSearchFile("AsinSearch", "AsinSearch", "xPHTul|-ESD", "UyK3>t\"g7HamCdD){3", "xPHTul|-ESD", "AsinSearch");
      fileUtil0.fetchGenericSearchFile("UyK3>t\"g7HamCdD){3", "", "Nt0``", "UyK3>t\"g7HamCdD){3", "w+4Ofp5W%F1", "Nt0``");
      fileUtil0.downloadBlendedSearchFile("aM<1)<&]1}0Z7", "aM<1)<&]1}0Z7");
      fileUtil0.deleteFile("");
      fileUtil0.fetchThirdPartySearchFile("AsinSearch", "=!", "xPHTul|-ESD", "=!");
      fileUtil0.downloadOneASINFile("aM<1)<&]1}0Z7", "w+4Ofp5W%F1", "", "UyK3>t\"g7HamCdD){3", "g$!_GGmGVxM*-");
      fileUtil0.downloadThirdPartySearchFile("", "Nt0``", "9Djvk-fGik:zh2c4G", "aM<1)<&]1}0Z7");
      fileUtil0.fetchKeywordSearchFile("cacheDir", "wN[Ghl", "associateID", "");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", (String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      String string0 = "ta_";
      fileUtil0.fetchBlendedSearchFile("ta_", "l1");
      String string1 = "g_";
      fileUtil0.fetchASINFile("ta_", "ta_", "g_", "ZkM#!Cm`M!");
      String string2 = "cacheLife";
      String string3 = "cacheDir";
      fileUtil0.downloadGenericSearchFile("e!", "e!", "cacheLife", "ta_", "ZkM#!Cm`M!", "cacheDir");
      fileUtil0.downloadSimilaritesFile("cacheDir", "cacheDir", "");
      fileUtil0.downloadBlendedSearchFile("", "");
      String string4 = "F6JoH&%e3NMz:~3>i";
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Predicate<String> predicate0 = Predicate.isEqual((Object) null);
      arrayList0.removeIf(predicate0);
      arrayList0.add("/");
      // Undeclared exception!
      try { 
        arrayList0.set(2402, "");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2402, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchKeywordSearchFile("t_", "t_", "}g", "}g");
      fileUtil0.downloadThirdPartySearchFile("=H8LI>E)vHQ2{B", "8YfR|]<4hs\"c", "/", "=H8LI>E)vHQ2{B");
      MockFile mockFile0 = new MockFile("g@)DOrKBm");
      fileUtil0.downloadCart("M7NY-kvO\"G");
      fileUtil0.fetchASINFile("M7NY-kvO\"G", "M7NY-kvO\"G", "w0YDoUG", "_(WjT~_nE");
      fileUtil0.fetchThirdPartySearchFile("=H8LI>E)vHQ2{B", "=H8LI>E)vHQ2{B", "", "");
      fileUtil0.downloadBrowseNodeFile("M7NY-kvO\"G", "", "", "");
      fileUtil0.getBrowseNodeFile("w0YDoUG", "M7NY-kvO\"G", "cacheLife");
      fileUtil0.isAgeGood(mockFile0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.downloadAccessoriesFile("YpSH", arrayList0, "_(WjT~_nE");
      fileUtil0.deleteFile("M7NY-kvO\"G");
      fileUtil0.fetchKeywordSearchFile("g@)DOrKBm", "YpSH", "YpSH", (String) null);
      fileUtil0.fetchKeywordSearchFile("", "/", "", ".xml");
      File file0 = fileUtil0.downloadGenericSearchFile("KxiV;'", (String) null, "jV5Bb", "YpSH", "", "Q6Iu^t\"P>5RdN+wc{@V");
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.8133554045006157
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", (String) null);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      fileUtil0.fetchKeywordSearchFile((String) null, "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3");
      fileUtil0.downloadSimilaritesFile("UyK3>t\"g7HamCdD){3", "D", "");
      fileUtil0.downloadGenericSearchFile("AsinSearch", "AsinSearch", "AsinSearch", "UyK3>t\"g7HamCdD){3", "AsinSearch", "AsinSearch");
      fileUtil0.downloadBlendedSearchFile("aM<1)<&]1}0Z7", "aM<1)<&]1}0Z7");
      fileUtil0.deleteFile("");
      fileUtil0.fetchThirdPartySearchFile("AsinSearch", "=!", "AsinSearch", "=!");
      fileUtil0.downloadOneASINFile("aM<1)<&]1}0Z7", "w+4Ofp5W%F1", "", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3");
      fileUtil0.downloadThirdPartySearchFile("", "Nt0``", "9Djvk-fGik:zh2c4G", "aM<1)<&]1}0Z7");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_NULL_.XML");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)60;
      byteArray0[4] = (byte) (-99);
      byteArray0[5] = (byte) (-15);
      byteArray0[6] = (byte)1;
      byteArray0[7] = (byte)1;
      byteArray0[8] = (byte) (-71);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.fetchKeywordSearchFile("cacheDir", "wN[Ghl", "associateID", "");
      fileUtil0.fetchBNFile("", (String) null, "");
      fileUtil0.downloadAccessoriesFile("", arrayList0, "q*:$w}>Rz(z:");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "aM<1)<&]1}0Z7");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.7306332123896766
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", (String) null);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=cacheDir&mode=wN[Ghl\\&type=associateID&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Rb%{KY'?Tp^");
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      fileUtil0.fetchKeywordSearchFile((String) null, "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3");
      fileUtil0.downloadSimilaritesFile("UyK3>t\"g7HamCdD){3", "^D", "");
      fileUtil0.downloadGenericSearchFile("AsinSearch", "AsinSearch", "AsinSearch", "UyK3>t\"g7HamCdD){3", "AsinSearch", "AsinSearch");
      fileUtil0.downloadBlendedSearchFile(",=_c~=1yX1", ",=_c~=1yX1");
      fileUtil0.deleteFile("H>v*pX&>|9q,kV(l-2p");
      fileUtil0.fetchThirdPartySearchFile("AsinSearch", "=!", "AsinSearch", "=!");
      fileUtil0.downloadOneASINFile(",=_c~=1yX1", "w+4Ofp5W%F1", "", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3");
      fileUtil0.downloadThirdPartySearchFile("", "Nt0``", "9Djvk-fGik:zh2c4G", ",=_c~=1yX1");
      fileUtil0.fetchKeywordSearchFile("cacheDir", "wN[Ghl", "associateID", "");
      fileUtil0.fetchThirdPartySearchFile("", "9Djvk-fGik:zh2c4G", "UyK3>t\"g7HamCdD){3", "");
      fileUtil0.downloadAccessoriesFile("", arrayList0, "q*:$w}>Rz(z:");
      fileUtil0.fetchSimilarItems("", ",=_c~=1yX1");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("X^", "DSB0XDDW1GQ3S");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.9264175554979963
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      fileUtil0.downloadSimilaritesFile("UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3");
      fileUtil0.fetchAccessories("UyK3>t\"g7HamCdD){3", arrayList0);
      fileUtil0.downloadSimilaritesFile("UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)2;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.downloadGenericSearchFile("AsinSearch", "AsinSearch", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "AsinSearch");
      fileUtil0.fetchGenericSearchFile("UyK3>t\"g7HamCdD){3", "", "Nta0``", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "Nta0``");
      fileUtil0.downloadCart("UyK3>t\"g7HamCdD){3");
      fileUtil0.fetchThirdPartySearchFile("AsinSearch", "=!", "UyK3>t\"g7HamCdD){3", "=!");
      fileUtil0.downloadOneASINFile("aM<1)<&]1}0Z7", "", "", "UyK3>t\"g7HamCdD){3", "g$!_GGmGVxM*-");
      fileUtil0.downloadBlendedSearchFile("aM<1)<&]1}0Z7", "Nta0``");
      fileUtil0.fetchKeywordSearchFile("", "g$!_GGmGVxM*-", "", "g$!_GGmGVxM*-");
      fileUtil0.downloadAccessoriesFile("aM<1)<&]1}0Z7", arrayList0, "AsinSearch");
      fileUtil0.fetchBlendedSearchFile("Nta0``", "");
      fileUtil0.fetchSimilarItems((String) null, "{Q$=H(Az)");
      fileUtil0.fetchBlendedSearchFile("{Esk0", ";u}F");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("O6mJ", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.788626037967039
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("UyK3ot\"g7HamCdD){3", "UyK3ot\"g7HamCdD){3", (String) null);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=%2C%3D_c%7E%3D1yX1&type=,=_c~=1yX1&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Rb%{KY'?Tp^");
      fileUtil0.fetchKeywordSearchFile((String) null, "UyK3ot\"g7HamCdD){3", "UyK3ot\"g7HamCdD){3", "UyK3ot\"g7HamCdD){3");
      fileUtil0.downloadSimilaritesFile("UyK3ot\"g7HamCdD){3", "", "");
      fileUtil0.downloadGenericSearchFile("AsinSearch", "AsinSearch", "AsinSearch", "UyK3ot\"g7HamCdD){3", "AsinSearch", "AsinSearch");
      fileUtil0.downloadBlendedSearchFile(",=_c~=1yX1", ",=_c~=1yX1");
      fileUtil0.deleteFile("H>v*pX&>|9q,kV(l-2p");
      fileUtil0.fetchGenericSearchFile((String) null, "=!", "UyK3ot\"g7HamCdD){3", "w+4Ofp5W%F1", (String) null, ",=_c~=1yX1");
      fileUtil0.downloadOneASINFile(",=_c~=1yX1", "w+4Ofp5W%F1", "", "UyK3ot\"g7HamCdD){3", "UyK3ot\"g7HamCdD){3");
      fileUtil0.downloadThirdPartySearchFile("", "AsinSearch", "", ",=_c~=1yX1");
      fileUtil0.fetchKeywordSearchFile("cacheDir", "wN[Ghl", "associateID", "");
      fileUtil0.fetchThirdPartySearchFile("", "AsinSearch", "UyK3ot\"g7HamCdD){3", "");
      fileUtil0.downloadAccessoriesFile("", arrayList0, "q*:$w}>Rz(z:");
      fileUtil0.fetchSimilarItems("", ",=_c~=1yX1");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "DSB0XDDW1GQ3S");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.0315905757832304
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      fileUtil0.downloadSimilaritesFile("UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3");
      fileUtil0.fetchAccessories("UyK3>t\"g7HamCdD){3", arrayList0);
      fileUtil0.downloadSimilaritesFile("UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/CACHEDIR_CACHEDIR__AM<1)<&]1}0Z7.XML");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.downloadGenericSearchFile("AsinSearch", "AsinSearch", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "AsinSearch");
      fileUtil0.fetchGenericSearchFile("UyK3>t\"g7HamCdD){3", "", "Nta0``", "UyK3>t\"g7HamCdD){3", "UyK3>t\"g7HamCdD){3", "Nta0``");
      fileUtil0.fetchThirdPartySearchFile("AsinSearch", "=!", "UyK3>t\"g7HamCdD){3", "=!");
      fileUtil0.downloadOneASINFile("aM<1)<&]1}0Z7", "", "", "UyK3>t\"g7HamCdD){3", "");
      fileUtil0.downloadBlendedSearchFile("aM<1)<&]1}0Z7", "Nta0``");
      fileUtil0.fetchKeywordSearchFile("", "aM<1)<&]1}0Z7", "UyK3>t\"g7HamCdD){3", "aM<1)<&]1}0Z7");
      fileUtil0.downloadAccessoriesFile("aM<1)<&]1}0Z7", arrayList0, "AsinSearch");
      fileUtil0.fetchBlendedSearchFile("Nta0``", "");
      fileUtil0.fetchSimilarItems((String) null, "{Q$=H(Az)");
      fileUtil0.fetchASINFile("cacheDir", "", "cacheDir", "aM<1)<&]1}0Z7");
      fileUtil0.downloadOneASINFile("a_", "emK{X$", "", "UyK3>t\"g7HamCdD){3", (String) null);
      File file0 = fileUtil0.getBrowseNodeFile((String) null, "Oe", "AsinSearch");
      assertNull(file0);
  }
}