/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:27:01 GMT 2018
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      improvedFile0.deleteOnExit();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.toFileType(improvedFile0);
      archiveScanner0.isArchive(improvedFile0);
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
  //Test case number: 1
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".zip");
      improvedFile0.deleteOnExit();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.isArchive(improvedFile0);
      archiveScanner0.toFileType(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "Lookup failed for key = ", false);
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
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "{+2St#~n58b<y`");
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory(".error.", ".error.", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.scandir(improvedFile0, "", true);
      String string0 = "";
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("");
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
      MockFile mockFile0 = new MockFile("", "{+2St#~n58b<y`");
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory(".error.", ".error.", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = ".error.";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "ZJE8");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".zip");
      improvedFile0.deleteOnExit();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.isArchive(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ".zip";
      stringArray0[1] = ".zip";
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.mkdir();
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(".zip");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "{+2St#~n58b<y`");
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory(".error.", ".error.", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      archiveScanner0.excludes = stringArray0;
      stringArray0[1] = ".error.";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(mockFile0, "");
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".zip");
      improvedFile0.deleteOnExit();
      ImprovedFile improvedFile1 = new ImprovedFile(".zip", ".zip");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS);
      boolean boolean0 = archiveScanner0.haveSlowResults;
      archiveScanner0.setExcludes(archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile1, ".zip", false);
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
  /*Coverage entropy=1.4270610433807247
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Pf:j;P$ahbCAmSF$Y", ", does not exst ad coulC not be created.");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile(", does not exst ad coulC not be created.", "c)HIZ n :fhY.jar", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      String string0 = "hJmv$&\\9w!x";
      improvedFile1.mkdir();
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, ", does not exst ad coulC not be created.", false);
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
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(", could not delete temp file to make way for directory.", ", could not delete temp file to make way for directory.");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      improvedFile0.mkdir();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      boolean boolean0 = archiveScanner0.haveSlowResults;
      try { 
        archiveScanner0.processDirectory(improvedFile0, ", could not delete temp file to make way for directory.", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/ext1/evosuite_readability_gen/projects/78_caloriecount/, could not delete temp file to make way for directory./, could not delete temp file to make way for directory.
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(", could not delete temp file to make way for directory.");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "com.lts.io.ArchiveScanner");
      ImprovedFile improvedFile0 = new ImprovedFile(", could not delete temp file to make way for directory.", ", could not delete temp file to make way for directory.");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<Object> vector1 = new Vector<Object>();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "com.lts.io.ArchiveScanner";
      stringArray0[1] = ", could not delete temp file to make way for directory.";
      stringArray0[2] = "com.lts.io.ArchiveScanner";
      stringArray0[3] = "com.lts.io.ArchiveScanner";
      stringArray0[4] = "com.lts.io.ArchiveScanner";
      stringArray0[5] = "com.lts.io.ArchiveScanner";
      stringArray0[6] = "com.lts.io.ArchiveScanner";
      stringArray0[7] = "com.lts.io.ArchiveScanner";
      stringArray0[8] = "^I5Kv6[M.jar";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.processDirectory(improvedFile0, "com.lts.io.ArchiveScanner", true);
      System.setCurrentTimeMillis(2053L);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "com.lts.io.ArchiveScanner");
      ImprovedFile improvedFile0 = new ImprovedFile("KNY!NF.jar", "KNY!NF.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      vector0.spliterator();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "KNY!NF.jar";
      stringArray0[1] = "KNY!NF.jar";
      stringArray0[2] = "com.lts.io.ArchiveScanner";
      stringArray0[3] = ".zip";
      stringArray0[4] = "com.lts.io.ArchiveScanner";
      stringArray0[5] = "com.lts.io.ArchiveScanner";
      stringArray0[6] = "KNY!NF.jar";
      stringArray0[7] = ".zip";
      stringArray0[8] = "KNY!NF.jar";
      archiveScanner0.setIncludes(stringArray0);
      String[] stringArray1 = new String[0];
      archiveScanner0.setExcludes(stringArray1);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "KNY!NF.jar", true);
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
  /*Coverage entropy=1.464816384890813
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(", could not delete temp file to make way for directory.", ", could not delete temp file to make way for directory.");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(", could not delete temp file to make way for directory./, could not delete temp file to make way for directory./, could not delete temp file to make way for directory.281320., could not delete temp file to make way for directory.");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ", could not delete temp file to make way for directory.");
      ImprovedFile.buildName(", could not delete temp file to make way for directory.", 0L, ", could not delete temp file to make way for directory.", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = ", could not delete temp file to make way for directory.";
      stringArray0[1] = ", could not delete temp file to make way for directory.";
      String string0 = "-i0U<K[4@";
      stringArray0[2] = "-i0U<K[4@";
      stringArray0[3] = ", could not delete temp file to make way for directory.";
      stringArray0[4] = ", could not delete temp file to make way for directory.";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, ", could not delete temp file to make way for directory.", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
