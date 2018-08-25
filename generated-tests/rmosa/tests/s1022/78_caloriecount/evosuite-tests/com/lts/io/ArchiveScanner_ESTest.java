/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 15:41:06 GMT 2018
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.io.InputStream;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Amciqb}q&&c%");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Amciqb}q&&c%";
      stringArray0[1] = "Amciqb}q&&c%";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "Amciqb}q&&c%");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[0];
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "V)Yf;pICX)jtT");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Amciqb}q&&c%");
      FileSystemHandling.createFolder(evoSuiteFile0);
      String string0 = "Amciqbfq&&c%";
      ImprovedFile improvedFile0 = new ImprovedFile("Amciqbfq&&c%");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<InputStream> vector0 = null;
      Vector<Integer> vector1 = new Vector<Integer>();
      archiveScanner0.dirsNotIncluded = vector1;
      archiveScanner0.filesExcluded = vector0;
      improvedFile0.getCanonicalFile();
      improvedFile0.deleteAll();
      String[] stringArray0 = new String[8];
      stringArray0[0] = string0;
      String string1 = "qk";
      stringArray0[1] = string1;
      stringArray0[2] = string0;
      stringArray0[3] = string0;
      stringArray0[4] = string0;
      String string2 = "n1Sp";
      stringArray0[5] = string2;
      stringArray0[6] = string0;
      String string3 = "com.lts.io.ArchiveScanner";
      stringArray0[7] = string3;
      archiveScanner0.includes = stringArray0;
      String string4 = ", temp location: ";
      boolean boolean0 = true;
      archiveScanner0.processDirectory(improvedFile0, string4, boolean0);
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string0, boolean1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Amciqb}q&&z%");
      ImprovedFile improvedFile1 = new ImprovedFile(improvedFile0, "!");
      ImprovedFile improvedFile2 = ImprovedFile.createTempImprovedFile("Amciqb}q&&c%", "!", improvedFile1);
      ImprovedFile improvedFile3 = new ImprovedFile(improvedFile2, "Amciqb}q&&z%");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "!", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Amciqb}q&&c%");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)3;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)63;
      byteArray0[3] = (byte)6;
      byteArray0[4] = (byte) (-91);
      byteArray0[5] = (byte) (-126);
      byteArray0[6] = (byte)57;
      byteArray0[7] = (byte)125;
      byteArray0[8] = (byte)48;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Amciqb}q&&c%";
      stringArray0[1] = "Amciqb}q&&c%";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "Amciqb}q&&c%", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "\\V)Yf;pIC+)jtT";
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      String string0 = "ACij";
      ImprovedFile improvedFile1 = new ImprovedFile("j^vM");
      ImprovedFile.createTempImprovedFile("XC]]V}^", "ACij", improvedFile1);
      ImprovedFile improvedFile2 = new ImprovedFile((File) null, "ACij");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile1, "j^vM", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Cra@&29P`\u0002..jar");
      ImprovedFile improvedFile1 = new ImprovedFile(improvedFile0, "Cra@&29P`\u0002..jar");
      ImprovedFile.createTempImprovedFile("Cra@&29P`\u0002..jar", "%~M4", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "Cra@&29P`\u0002..jar", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.8486855577264172
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Amciqb}q&&c%");
      FileSystemHandling.createFolder(evoSuiteFile0);
      String string0 = "Amciqb}q&&c%";
      ImprovedFile improvedFile0 = new ImprovedFile("Amciqb}q&&c%");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<InputStream> vector0 = null;
      Vector<Integer> vector1 = new Vector<Integer>();
      archiveScanner0.dirsNotIncluded = vector1;
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-31);
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-18);
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-29);
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-5);
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-72);
      byteArray0[5] = byte5;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      archiveScanner0.filesExcluded = vector0;
      String string1 = ", temp location: ";
      boolean boolean0 = false;
      archiveScanner0.processDirectory(improvedFile0, string1, boolean0);
      boolean boolean1 = true;
      archiveScanner0.processDirectory(improvedFile0, string0, boolean1);
      System.setCurrentTimeMillis(archiveScanner0.DIRECTORY);
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Amciqb}q&&c%");
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Amciqb}q&&c%";
      String string0 = "aNA";
      stringArray0[1] = "aNA";
      stringArray0[2] = "Amciqb}q&&c%";
      stringArray0[3] = "Amciqb}q&&c%";
      stringArray0[4] = "Amciqb}q&&c%";
      stringArray0[5] = "Amciqb}q&&c%";
      stringArray0[6] = "V.";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".jar.j?r", ".jar.j?r");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = ".jar.j?r";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(".jar.j?r");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Amciqb}q&&c%");
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Amciqb}q&&c%";
      String string0 = "aNA";
      stringArray0[1] = "aNA";
      stringArray0[2] = "Amciqb}q&&c%";
      stringArray0[3] = "Amciqb}q&&c%";
      stringArray0[4] = "Amciqb}q&&c%";
      stringArray0[5] = "Amciqb}q&&c%";
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsIncluded = vector0;
      String string1 = "V.";
      stringArray0[6] = "V.";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      int int0 = ArchiveScanner.FILE;
      try { 
        archiveScanner0.processDirectory(improvedFile0, string0, boolean0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/evosuite_readability_gen/projects/78_caloriecount/Amciqb}q&&c%
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "oQ=-nw=";
      ImprovedFile improvedFile0 = new ImprovedFile("oQ=-nw=", "ADZ1Xk!<6Wzk_pryj_");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "oQ=-nw=";
      stringArray0[1] = "ADZ1Xk!<6Wzk_pryj_";
      stringArray0[2] = "ADZ1Xk!<6Wzk_pryj_";
      stringArray0[3] = "oQ=-nw=";
      stringArray0[4] = "Amciqb}q&&c%";
      stringArray0[5] = "oQ=-nw=";
      stringArray0[6] = "ADZ1Xk!<6Wzk_pryj_";
      stringArray0[7] = "Amciqb}q&&c%";
      archiveScanner0.setIncludes(stringArray0);
      ImprovedFile improvedFile1 = ImprovedFile.createTempDirectory(".tmp.jar", "Amciqb}q&&c%", (File) improvedFile0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile1);
      archiveScanner0.setExcludes(archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.toFileType(improvedFile0);
      archiveScanner1.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "Amciqb}q&&c%";
      ImprovedFile improvedFile0 = new ImprovedFile("Amciqb}q&&c%");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Amciqb}q&&c%";
      stringArray0[1] = "aNA";
      stringArray0[2] = "Amciqb}q&&c%";
      stringArray0[3] = "Amciqb}q&&c%";
      stringArray0[4] = "Amciqb}q&&c%";
      stringArray0[5] = "Amciqb}q&&c%";
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[6] = "Amciqb}q&&c%";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string1 = "Ekv64";
      String string2 = "sOKm'-?2&1iv";
      MockFile.createTempFile(string1, string2);
      boolean boolean0 = false;
      boolean boolean1 = true;
      try { 
        archiveScanner0.processDirectory(improvedFile0, string0, boolean1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/evosuite_readability_gen/projects/78_caloriecount/Amciqb}q&&c%
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
