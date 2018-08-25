/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 09:19:18 GMT 2018
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("`M1u+cvk}gI-");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ImprovedFile improvedFile1 = ImprovedFile.createTempDirectory("`M1u+cvk}gI-", "`M1u+cvk}gI-", (File) improvedFile0);
      archiveScanner0.scandir(improvedFile1, "`M1u+cvk}gI-", true);
      assertTrue(improvedFile1.isDirectory());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "Y[COri=^3";
      ImprovedFile improvedFile0 = new ImprovedFile("Y[COri=^3", "Y[COri=^3");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      ImprovedFile improvedFile2 = improvedFile1.createTempDir();
      improvedFile0.getCanonicalPath();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile2);
      improvedFile0.basicMakeDirectories(improvedFile2);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile1, "/home/ubuntu/evosuite_readability_gen/projects/78_caloriecount/Y[COri=^3/Y[COri=^3", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.400326576231188
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("H#iBfaT", "H#iBfaT");
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory("H#iBfaT", "H#iBfaT", (File) mockFile0);
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("H#iBfaT", "H#iBfaT", improvedFile0);
      improvedFile0.getCanonicalPath();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.toFileType(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "", false);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("com.lts.application.fatal.startup.r!ntimeException", "com.lts.application.fatal.startup.r!ntimeException");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, "com.lts.application.fatal.startup.r!ntimeException", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/evosuite_readability_gen/projects/78_caloriecount/com.lts.application.fatal.startup.r!ntimeException/com.lts.application.fatal.startup.r!ntimeException
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "bb`!_kWN";
      ImprovedFile improvedFile0 = new ImprovedFile("bb`!_kWN", "bb`!_kWN");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
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
  //Test case number: 5
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = ":_wJnA\"ZkpD";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ":_wJnA\"ZkpD");
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      boolean boolean0 = true;
      String string1 = ",XENl-f*";
      Vector<String> vector0 = new Vector<String>();
      EvoSuiteFile evoSuiteFile1 = null;
      String string2 = ".WAR";
      FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      FileSystemHandling.appendLineToFile(evoSuiteFile1, string2);
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.processDirectory(improvedFile0, string1, boolean0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string2, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "],g0";
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
  //Test case number: 7
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "bb`!_kWN";
      ImprovedFile improvedFile0 = new ImprovedFile("bb`!_kWN", "bb`!_kWN");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      ImprovedFile improvedFile2 = new ImprovedFile(".WAR", "bb`!_kWN");
      ImprovedFile improvedFile3 = improvedFile0.createTempDir();
      improvedFile2.getCanonicalPath();
      improvedFile1.getCanonicalPath();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[3];
      improvedFile3.deleteOnExit();
      stringArray0[0] = ".WAR";
      stringArray0[1] = "bb`!_kWN";
      stringArray0[2] = ".WAR";
      improvedFile3.deleteDirectory(true);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile3, "bb`!_kWN");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "@0[^V";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("@0[^V");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ImprovedFile improvedFile1 = new ImprovedFile("", "");
      improvedFile0.createTempDir();
      improvedFile0.getCanonicalPath();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "y '[p<)9yjF?6~";
      stringArray0[1] = "/";
      stringArray0[2] = "";
      stringArray0[3] = "/";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "y '[p<)9yjF?6~");
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
  /*Coverage entropy=1.400326576231188
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      System.setCurrentTimeMillis((-618L));
      String string0 = "yA,g";
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ImprovedFile improvedFile0 = new ImprovedFile("*$;8r-", "!WhU%=zI^Jyv(k.jar");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("*$;8r-", "yA,g", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      improvedFile0.setWritable(true, false);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "*$;8r-", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String string0 = ".WAR";
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[5];
      stringArray0[0] = ".WAR";
      stringArray0[1] = ".WAR";
      stringArray0[2] = "}cjCMt-`5kj>U";
      stringArray0[3] = ".WAR";
      stringArray0[4] = ".WAR";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "@0[^~";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("@0[^~");
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
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      String string0 = "dc3[iKGh}C9408p)";
      boolean boolean0 = true;
      archiveScanner0.processDirectory(improvedFile0, string0, boolean0);
      File file0 = archiveScanner0.getBasedir();
      boolean boolean1 = false;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(file0, string0, boolean1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[8];
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[8];
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
