/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:27:24 GMT 2018
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.ByteArrayInputStream;
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "4=");
      improvedFile0.delete();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String string0 = "j}JB?";
      try { 
        archiveScanner0.scandir(improvedFile0, "W>k**Nw~5", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /4=
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
      String string0 = "";
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.basedir = (File) improvedFile0;
      improvedFile0.getAbsoluteFile();
      archiveScanner0.toFileType(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "bckup";
      ImprovedFile improvedFile0 = new ImprovedFile("bckup", "bckup");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "bckup";
      stringArray0[1] = ".EAR";
      stringArray0[2] = ".EAR";
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.toURL();
      archiveScanner0.isArchive(improvedFile0);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, ".EAR", true);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("bckup", "bckup");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "bckup";
      stringArray0[1] = ".EAR";
      stringArray0[2] = ".EAR";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.isArchive(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, " D");
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
      ImprovedFile improvedFile0 = new ImprovedFile(".jar", ".jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = ".jar";
      stringArray0[1] = ".jar";
      stringArray0[2] = ".jar";
      stringArray0[3] = ".jar";
      stringArray0[4] = ".zip";
      stringArray0[5] = ".jar";
      stringArray0[6] = ".jar";
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.toURL();
      archiveScanner0.isArchive(improvedFile0);
      ImprovedFile.createTempImprovedFile("com.lts.io.ArchiveScanner", ".jar", improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("Error trying to backup archive file, ");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ImprovedFile improvedFile1 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ".ear");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = ".ear";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.isArchive(improvedFile1);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(".ear");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".jar", ".jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = ".jar";
      stringArray0[1] = ".jar";
      stringArray0[2] = ".jar";
      stringArray0[3] = ".jar";
      stringArray0[4] = ".zip";
      stringArray0[5] = ".jar";
      stringArray0[6] = ".jar";
      archiveScanner0.setIncludes(stringArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner1.isArchive(improvedFile0);
      archiveScanner0.toFileType(improvedFile0);
      archiveScanner1.toFileType(improvedFile0);
      // Undeclared exception!
      try { 
        ImprovedFile.createTempDirectory("com.lts.LTSException", ".jar");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ImprovedFile", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("@Zw@Z#F7", ", is a file and cannot be removed.");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = ", is a file and cannot be removed.";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "@Zw@Z#F7";
      stringArray0[5] = ", is a file and cannot be removed.";
      stringArray0[6] = "**.jar";
      archiveScanner0.excludes = stringArray0;
      stringArray0[7] = ", is a file and cannot be removed.";
      archiveScanner0.setIncludes(stringArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner1.includes = stringArray0;
      archiveScanner1.isArchive(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "");
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
  /*Coverage entropy=1.4878167164014493
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ImprovedFile improvedFile1 = new ImprovedFile("", "1.");
      ImprovedFile improvedFile2 = new ImprovedFile(improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile2);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ".jar");
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile1);
      Vector<String> vector0 = new Vector<String>(0);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      archiveScanner1.filesNotIncluded = null;
      archiveScanner1.dirsNotIncluded = vector0;
      archiveScanner1.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner1.toFileType(improvedFile2);
      archiveScanner1.isArchive(improvedFile1);
      archiveScanner1.scandir(improvedFile2, "1.", false);
      try { 
        archiveScanner1.scanArchive(improvedFile1, "1.");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, /1.
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.499030672979008
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(", is a file and cannot be removed./narc0");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "wOPX,M&X;o");
      ImprovedFile improvedFile0 = new ImprovedFile(", is a file and cannot be removed.");
      improvedFile0.delete();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, ", is a file and cannot be removed.", true);
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
  /*Coverage entropy=1.0888999753452235
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ImprovedFile improvedFile1 = new ImprovedFile("", "1.");
      ImprovedFile improvedFile2 = new ImprovedFile(improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile2);
      String string0 = ".jar";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ".jar");
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile1);
      Vector<String> vector0 = new Vector<String>(0);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      archiveScanner1.dirsNotIncluded = vector0;
      archiveScanner1.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner1.processDirectory(improvedFile2, "!", true);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "Gl/zJT5Q@qcAy9", true);
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
      ImprovedFile improvedFile0 = new ImprovedFile("@Zw@Z#F7", ", is a file and cannot be removed.");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.getBasedir();
      improvedFile0.basicMakeDirectories((File) null);
      String[] stringArray0 = new String[8];
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      stringArray0[0] = ", is a file and cannot be removed.";
      improvedFile0.makeDirectories();
      stringArray0[1] = "";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "@Zw@Z#F7");
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "@Zw@Z#F7";
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      stringArray0[5] = ", is a file and cannot be removed.";
      stringArray0[6] = "**.jar";
      archiveScanner0.excludes = stringArray0;
      stringArray0[7] = ", is a file and cannot be removed.";
      archiveScanner0.setIncludes(stringArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner1.includes = stringArray0;
      improvedFile0.makeDirectories();
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, ", is a file and cannot be removed.", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
