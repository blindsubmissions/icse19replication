/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:08:09 GMT 2018
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      fileUtil0.fetchBlendedSearchFile("EJ}Dr5+C'?:_S(.", "EJ}Dr5+C'?:_S(.");
      fileUtil0.getAccessories("3rd_", arrayList0);
      fileUtil0.downloadKeywordSearchFile("Ajk*F`awH", "", "", "Ajk*F`awH");
      Integer integer0 = new Integer((-1));
      arrayList0.add(integer0);
      fileUtil0.fetchBNFile("M^9S-8kaPYJSW'=", "3rd_", "");
      fileUtil0.fetchAccessories("", arrayList0);
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
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      String string0 = null;
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Integer[] integerArray0 = new Integer[7];
      Integer integer0 = new Integer((-428));
      integerArray0[0] = integer0;
      Integer integer1 = new Integer(1);
      integerArray0[1] = integer1;
      int int0 = 0;
      Integer integer2 = new Integer(0);
      integerArray0[2] = integer2;
      Integer integer3 = new Integer(int0);
      integerArray0[3] = integer3;
      Integer integer4 = new Integer(int0);
      integerArray0[4] = integer4;
      Integer integer5 = new Integer((-428));
      integerArray0[5] = integer5;
      Integer integer6 = new Integer(0);
      integerArray0[6] = integer6;
      arrayList0.toArray(integerArray0);
      arrayList0.add("a-uN\"AD]+1w");
      fileUtil0.fetchAccessories((String) null, arrayList0);
      String string1 = "_";
      fileUtil0.fetchGenericSearchFile("associateID", "nf`=i9F^I", "", "_", "F", (String) null);
      fileUtil0.fetchThirdPartySearchFile("associateID", "", "associateID", "");
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
  //Test case number: 2
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadBrowseNodeFile("t_", "t_", "t_", "t_");
      LoadProperties.instance();
      fileUtil0.renameFile("S,w4~s/x1", "S,w4~s/x1");
      fileUtil0.downloadOneASINFile("", "", "t_", "", "t_");
      fileUtil0.fetchBlendedSearchFile("t_", "t_");
      fileUtil0.downloadSimilaritesFile("e4N", "S,w4~s/x1", "S,w4~s/x1");
      fileUtil0.getSimilarItems("e4N", "S,w4~s/x1");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.fetchBlendedSearchFile("Gd3?3+_qi", "cacheDir");
      fileUtil0.fetchBlendedSearchFile("t_", "t_");
      fileUtil0.fetchThirdPartySearchFile("S,w4~s/x1", "S,w4~s/x1", "S,w4~s/x1", "");
      fileUtil0.cacheDir = "";
      fileUtil0.fetchGenericSearchFile("ta_", "cacheDir", "", "-", "", "b_");
      fileUtil0.fetchBNFile("", "e4N", (String) null);
      fileUtil0.downloadBlendedSearchFile("f]?A6]Y6", "S,w4~s/x1");
      File file0 = fileUtil0.getBrowseNodeFile("", "", "ta_");
      assertNull(file0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.488327743368588
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadSimilaritesFile((String) null, (String) null, "#7`~=(Di`V (Mcu<>d");
      fileUtil0.downloadOneASINFile("^iXYvA0x=Nwc", "^iXYvA0x=Nwc", "^iXYvA0x=Nwc", "", "O-C");
      fileUtil0.downloadSimilaritesFile((String) null, (String) null, (String) null);
      fileUtil0.fetchGenericSearchFile("", (String) null, "7x?iGA~Q", "", "", "");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      arrayList0.addAll((Collection<? extends String>) linkedList0);
      fileUtil0.fetchAccessories("#7`~=(Di`V (Mcu<>d", arrayList0);
      fileUtil0.getSimilarItems("3+ftP.", (String) null);
      fileUtil0.fetchBNFile("3+ftP.", "", "3+ftP.");
      fileUtil0.downloadGenericSearchFile("'+3J(l'pqzPjv Z?k", "#7`~=(Di`V (Mcu<>d", "associateID", "O-C", "O-C", "#7`~=(Di`V (Mcu<>d");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "cacheLife");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.7072697097848133
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("XZ<ow@u[U7I*gujz{G%", "XZ<ow@u[U7I*gujz{G%", "XZ<ow@u[U7I*gujz{G%");
      LoadProperties.instance();
      fileUtil0.downloadAccessoriesFile("", (ArrayList) null, (String) null);
      fileUtil0.getASINFile("", "", "", (String) null);
      fileUtil0.fetchGenericSearchFile("JuO oz(d'`%ShcXj}", (String) null, "JuO oz(d'`%ShcXj}", "}sJ\"+ud?nlHmlM", "", (String) null);
      fileUtil0.fetchGenericSearchFile((String) null, "XZ<ow@u[U7I*gujz{G%", "XZ<ow@u[U7I*gujz{G%", (String) null, "", "");
      fileUtil0.deleteFile("}sJ\"+ud?nlHmlM");
      fileUtil0.getSimilarItems((String) null, "net.kencochrane.a4j.util.LoadProperties");
      fileUtil0.fetchThirdPartySearchFile(",v]DDQp:ZyC$]E", "", "XZ<ow@u[U7I*gujz{G%", (String) null);
      fileUtil0.downloadBrowseNodeFile("&Ub|(q#&Z*2", "&Ub|(q#&Z*2", "net.kencochrane.a4j.util.LoadProperties", "k_");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "}sJ\"+ud?nlHmlM", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "";
      fileUtil0.downloadKeywordSearchFile("_", "DK|eA/{wN0%j$/_", (String) null, "");
      fileUtil0.downloadBrowseNodeFile("DK|eA/{wN0%j$/_", "", "", "s_");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add((Object) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.iterator();
      Object object1 = new Object();
      linkedList0.add(object1);
      arrayList0.removeAll(linkedList0);
      arrayList0.add(object0);
      fileUtil0.getAccessories("", arrayList0);
      fileUtil0.downloadOneASINFile("", "DK|eA/{wN0%j$/_", "B1Gn9E2]mmTnL", "$S.v/@_~!UhEX+NRl", (String) null);
      fileUtil0.renameFile("7c|~=lC}dBJ8Pj?%b", "");
      fileUtil0.downloadKeywordSearchFile("DK|eA/{wN0%j$/_", "cacheLife", "s_", "");
      fileUtil0.fetchGenericSearchFile("", "", ".xml", "&jhr\"[Xs8J{[34Jp", "s_", "");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("cacheLife", "k_", (String) null, "a5O4|K6*V");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4454678304086483
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("Va|(DT|O1D(_", "Va|(DT|O1D(_");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      fileUtil0.fetchAccessories("?*^;+ysM[wS]f", arrayList0);
      fileUtil0.cacheDir = "tkn3D1Cu?3eCe";
      fileUtil0.renameFile("", "Va|(DT|O1D(_");
      fileUtil0.fetchGenericSearchFile("tkn3D1Cu?3eCe", "", "", "tkn3D1Cu?3eCe", "Z8hS5Em/1g$", "OUc`l~2BK");
      LoadProperties.instance();
      fileUtil0.fetchASINFile("mQK9gfCVig=~", "", "", "");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems(",u", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadBrowseNodeFile("t_", "t_", "t_", "t_");
      LoadProperties.instance();
      fileUtil0.renameFile("S,w4~s/x1", "S,w4~s/x1");
      fileUtil0.downloadOneASINFile("", "", "t_", "", "t_");
      fileUtil0.fetchBlendedSearchFile("t_", "t_");
      fileUtil0.downloadSimilaritesFile("e4N", "S,w4~s/x1", "S,w4~s/x1");
      fileUtil0.getSimilarItems("e4N", "S,w4~s/x1");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.fetchBlendedSearchFile("Gd3?3=+_qi", "cacheDir");
      fileUtil0.fetchBlendedSearchFile("t_", "t_");
      fileUtil0.fetchThirdPartySearchFile("S,w4~s/x1", "S,w4~s/x1", "S,w4~s/x1", "");
      fileUtil0.cacheDir = "";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("_E4N_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      fileUtil0.fetchGenericSearchFile("ta_", "cacheDir", "", "-", "", "b_");
      fileUtil0.fetchBNFile("", "e4N", (String) null);
      fileUtil0.downloadBlendedSearchFile("f]?A6]Y6", "S,w4~s/x1");
      fileUtil0.downloadKeywordSearchFile("ta_", "p", "-", "");
      fileUtil0.downloadGenericSearchFile("", "", "ts_", "t_", "-", "");
      fileUtil0.deleteFile("ts_");
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      LoadProperties.instance();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_5.XML");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-64);
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)14;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.getSimilarItems("5", "5");
      fileUtil0.downloadCart("5");
      fileUtil0.downloadKeywordSearchFile("5", "5", "", "?");
      fileUtil0.renameFile("5", "");
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.708311957050743
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      String string0 = "_";
      fileUtil0.downloadBrowseNodeFile("_", "_", "_", "_");
      LoadProperties.instance();
      fileUtil0.renameFile("_", "_");
      fileUtil0.downloadOneASINFile("5", "5", "_", "5", "_");
      String string1 = "e4N";
      fileUtil0.fetchASINFile("5", "_", "_", "_");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=_&type=_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "`b$oS");
      fileUtil0.downloadSimilaritesFile("e4N", "_", "_");
      fileUtil0.getSimilarItems("e4N", "_");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.fetchKeywordSearchFile("e4N", "_", "_", "e4N");
      fileUtil0.fetchBlendedSearchFile("_", "_");
      fileUtil0.fetchThirdPartySearchFile("_", "_", "_", "_");
      String string2 = "ta_";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("_E4N_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "3qL*E");
      String string3 = null;
      fileUtil0.fetchBNFile("5", "e4N", (String) null);
      fileUtil0.downloadBlendedSearchFile((String) null, "_");
      // Undeclared exception!
      try { 
        MockFile.createTempFile("", "5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.220025327834538
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadBrowseNodeFile("_", "_", "_", "_");
      LoadProperties.instance();
      fileUtil0.isAgeGood((File) null);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_5.XML");
      fileUtil0.fetchKeywordSearchFile("1t[!1<", "_", "c_", "c_");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.getSimilarItems("5", "K$r6_7");
      fileUtil0.downloadCart("1t[!1<");
      fileUtil0.fetchSimilarItems("5", (String) null);
      fileUtil0.downloadKeywordSearchFile("K$r6_7", "s'>e,pL)q.*@d-}|", "ta_", "&t=");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.iterator();
      fileUtil0.downloadCart("_");
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "k_", "lL$1d 195w1u$9`zz", "1t[!1<");
      assertNull(file0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.7521915465690423
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadBrowseNodeFile("t_", "t_", "t_", "t_");
      fileUtil0.renameFile("t_", "t_");
      fileUtil0.downloadOneASINFile("t_", "t_", "t_", "", "t_");
      fileUtil0.fetchGenericSearchFile("t_", "t_", "t_", "t_", "", "t_");
      fileUtil0.downloadSimilaritesFile("", "t_", "t_");
      fileUtil0.getSimilarItems("t_", "t_");
      fileUtil0.downloadOneASINFile("t_", "", "t_", "t_", "t_");
      fileUtil0.downloadBrowseNodeFile("", "t_", "t_", "cacheDir");
      fileUtil0.fetchThirdPartySearchFile("t_", "t_", "t_", "");
      fileUtil0.fetchThirdPartySearchFile(".NU,Q", "ShoppingCart=get&f=xml&dev-t=", "cacheDir", "cacheDir");
      fileUtil0.cacheDir = "t_";
      fileUtil0.fetchGenericSearchFile("ta_", "cacheDir", "", "", "t_", "b_");
      fileUtil0.downloadBlendedSearchFile("f]?A6]Y6", "t_");
      fileUtil0.downloadKeywordSearchFile("ta_", "ta_", "cacheDir", "");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("t_A_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "L,9(]9W]Nx-n|");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.iterator();
      fileUtil0.fetchAccessories("", arrayList0);
      fileUtil0.downloadAccessoriesFile("", arrayList0, "b_");
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
}
