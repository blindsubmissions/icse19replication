/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:36:14 GMT 2018
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.DirectoryScanner;
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
      String string0 = "4\\XB";
      ImprovedFile improvedFile0 = new ImprovedFile((String) null, "4XB");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String string1 = "";
      MockFile mockFile0 = new MockFile(":", "4XB");
      boolean boolean0 = true;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsIncluded = vector0;
      try { 
        archiveScanner0.scandir(mockFile0, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/ext1/evosuite_readability_gen/projects/78_caloriecount/:/4XB
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile(":I$F`");
      mockFile0.getCanonicalPath();
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      DirectoryScanner.matchPatternStart(".zip", "/home/ubuntu/ext1/evosuite_readability_gen/projects/78_caloriecount/:I$F`");
      archiveScanner0.isArchive(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, ":I$F`", false);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      MockFile mockFile0 = new MockFile("'H=:I$F`");
      DirectoryScanner.matchPatternStart("'H=:I$F`", "'H=:I$F`");
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory("$F`", "'H=:I$F`", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.scandir(improvedFile0, "'H=:I$F`", true);
      assertTrue(improvedFile0.exists());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.464816384890813
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DirectoryScanner.matchPatternStart("oJvu_*7+", "Error extracting archive to temp directory");
      MockFile mockFile0 = new MockFile(".EAR");
      MockFile mockFile1 = new MockFile(mockFile0, "-Vi%LgrIc-S?RtZxbH");
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile("oJvu_*7+", ".ear", mockFile1);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      File file0 = archiveScanner0.basedir;
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner1.filesNotIncluded = vector0;
      ArchiveScanner archiveScanner2 = new ArchiveScanner(improvedFile0);
      archiveScanner2.myTempdir = improvedFile0;
      // Undeclared exception!
      try { 
        archiveScanner2.scandir(mockFile1, (String) null, true);
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
  /*Coverage entropy=1.3592367006650063
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".EAR");
      MockFile mockFile1 = new MockFile(mockFile0, "Error extracting archive to temp directory");
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile("oJvu_*7+", "4W&", mockFile1);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      File file0 = archiveScanner0.basedir;
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner1.filesNotIncluded = vector0;
      ArchiveScanner archiveScanner2 = new ArchiveScanner(improvedFile0);
      archiveScanner2.myTempdir = improvedFile0;
      // Undeclared exception!
      try { 
        archiveScanner2.scandir(mockFile1, (String) null, true);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "2sDc\u00029UF";
      stringArray0[3] = "";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("ns[>[2bl+oPC0com.lts.io.archive.AbstractNestedArchive.jar");
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("IO error scanning directory ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.toFileType(improvedFile0);
      ImprovedFile improvedFile1 = new ImprovedFile("EAEzd6Gj(7{\"q`AY{W]0IO error scanning directory .jar");
      ImprovedFile.createTempDirectory("EAEzd6Gj(7{\"q`AY{W]0IO error scanning directory .jar", "Error trying to create temp file for entry .jar", (File) improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "EAEzd6Gj(7{\"q`AY{W]0IO error scanning directory .jar";
      stringArray0[1] = "b&";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("EAEzd6Gj(7{\"q`AY{W]0IO error scanning directory .jar");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner1.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      // Undeclared exception!
      try { 
        archiveScanner1.processArchive(improvedFile0, "");
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
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile(":I$F`");
      mockFile0.getCanonicalPath();
      DirectoryScanner.matchPatternStart(":I$F`", "/home/ubuntu/ext1/evosuite_readability_gen/projects/78_caloriecount/:I$F`");
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory(":I$F`", "$F`", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(":I$F`");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      stringArray0[0] = ":I$F`";
      stringArray0[1] = "/home/ubuntu/ext1/evosuite_readability_gen/projects/78_caloriecount/:I$F`";
      stringArray0[2] = ".WAR";
      stringArray0[3] = ":I$F`";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(mockFile0, "", false);
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ImprovedFile improvedFile1 = new ImprovedFile("", ".ear");
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile1);
      ArchiveScanner archiveScanner2 = new ArchiveScanner(improvedFile0);
      archiveScanner2.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      // Undeclared exception!
      try { 
        archiveScanner2.processArchive(improvedFile1, ".ear");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DirectoryScanner.matchPath("Error extracting archive to temp directory", "Error extracting archive to temp directory");
      ImprovedFile improvedFile0 = new ImprovedFile("Error extracting archive to temp directory", ".WAR0Error extracting archive to temp directory.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = ".WAR";
      archiveScanner0.addDefaultExcludes();
      stringArray0[1] = "Error extracting archive to temp directory";
      stringArray0[2] = ".WAR0Error extracting archive to temp directory.jar";
      stringArray0[3] = "Error extracting archive to temp directory";
      stringArray0[4] = "Error extracting archive to temp directory";
      stringArray0[5] = "Error trying to open file, ";
      improvedFile0.mkdir();
      stringArray0[6] = ".WAR0Error extracting archive to temp directory.jar";
      stringArray0[7] = "Error trying to list archive, ";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(".WAR0Error extracting archive to temp directory.jar");
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DirectoryScanner.matchPath("Error extracting archive to temp directory", "Error extracting archive to temp directory");
      ImprovedFile improvedFile0 = new ImprovedFile("Error extracting archive to temp directory", ".WAR0Error extracting archive to temp directory.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = ".WAR";
      archiveScanner0.addDefaultExcludes();
      stringArray0[1] = "Error extracting archive to temp directory";
      stringArray0[2] = ".WAR0Error extracting archive to temp directory.jar";
      stringArray0[3] = "Error extracting archive to temp directory";
      stringArray0[4] = "Error extracting archive to temp directory";
      stringArray0[5] = "Error trying to open file, ";
      archiveScanner0.excludes = stringArray0;
      improvedFile0.mkdir();
      stringArray0[6] = ".WAR0Error extracting archive to temp directory.jar";
      stringArray0[7] = "Error trying to list archive, ";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(".WAR0Error extracting archive to temp directory.jar");
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = ".EAR";
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      boolean boolean0 = true;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "IO error scanning directory 281320.5.jar";
      stringArray0[1] = ".EAR";
      stringArray0[2] = ".EAR";
      stringArray0[3] = ".EAR";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setBasedir((File) null);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, ".EAR", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
