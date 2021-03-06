/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 09:26:24 GMT 2018
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.DirectoryScanner;
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
      ImprovedFile improvedFile0 = new ImprovedFile((File) null, "userBho.e");
      ImprovedFile improvedFile1 = ImprovedFile.createTempDirectory("userBho.e", "@KiwO#yG.g$jVW|7", (File) improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.scandir(improvedFile1, "userBho.e", false);
      // Undeclared exception!
      try { 
        ImprovedFile.createTempDirectory();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ImprovedFile", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile((File) null, ".ear");
      ImprovedFile improvedFile1 = new ImprovedFile(improvedFile0, ".ear");
      ImprovedFile improvedFile2 = new ImprovedFile((File) null, ".ZIP");
      improvedFile0.toURI();
      ImprovedFile.createTempDirectory("wF)FX>GukCZoj=*7)", "Delete.jar", (File) improvedFile2);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      DirectoryScanner.matchPatternStart(".ZIP", ".ear");
      improvedFile1.setReadable(false);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile2, "u\"Vw-", false);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "f\\l,";
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
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[0];
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile((String) null);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "!";
      stringArray0[1] = "!";
      stringArray0[2] = "!";
      stringArray0[3] = "!";
      stringArray0[4] = "!";
      stringArray0[5] = "Could not create directory ";
      stringArray0[6] = "Could not create directory ";
      stringArray0[7] = "Could not create directory ";
      stringArray0[8] = "!";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "!");
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String string0 = "/Edit";
      String string1 = "";
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("/Edit", "", (File) null);
      improvedFile1.mkdir();
      improvedFile1.setReadOnly();
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string2 = ".jar";
      boolean boolean0 = true;
      String[] stringArray0 = new String[8];
      stringArray0[0] = string1;
      stringArray0[1] = string0;
      stringArray0[2] = string1;
      stringArray0[3] = string1;
      stringArray0[4] = string1;
      stringArray0[5] = string2;
      stringArray0[6] = string0;
      stringArray0[7] = string1;
      archiveScanner0.excludes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile1, string2, boolean0);
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
  /*Coverage entropy=1.400326576231188
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      File file0 = null;
      ImprovedFile improvedFile0 = new ImprovedFile((File) null, ".ear");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("e~[X@zjF!o30|p-StpL", ".ear", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "e~[X@zjF!o30|p-StpL";
      String string0 = "";
      DirectoryScanner.matchPatternStart("e~[X@zjF!o30|p-StpL", "");
      improvedFile0.setReadable(false);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner1.scandir(improvedFile0, "", false);
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
      MockFile mockFile0 = new MockFile(".ear", ".EAR");
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile(".ear", ".ear", mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.tempRename();
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(mockFile0, ".ear", false);
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String string0 = "/Edit";
      String string1 = "";
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("/Edit", "", (File) null);
      improvedFile1.mkdir();
      improvedFile1.setReadOnly();
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string2 = ".jar";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/Edit0");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      boolean boolean0 = true;
      String[] stringArray0 = new String[8];
      stringArray0[0] = string1;
      stringArray0[1] = string0;
      stringArray0[2] = string1;
      stringArray0[3] = string1;
      stringArray0[4] = string1;
      stringArray0[5] = string2;
      stringArray0[6] = string0;
      stringArray0[7] = string1;
      archiveScanner0.excludes = stringArray0;
      String string3 = " hIz/`q6";
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string3, boolean1);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "!";
      stringArray0[1] = "!";
      stringArray0[2] = "!";
      stringArray0[3] = "!";
      stringArray0[4] = "!";
      stringArray0[5] = "Could not create directory ";
      stringArray0[6] = "Could not create directory ";
      stringArray0[7] = "Could not create directory ";
      stringArray0[8] = "!";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setBasedir(".ZIP02nw8@!<.jar");
      archiveScanner0.setIncludes(stringArray0);
      MockFile mockFile0 = new MockFile((File) null, "8qt@D.T");
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("Could not create directory ");
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
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "/Edit";
      stringArray0[1] = "/Edit";
      archiveScanner0.setExcludes(stringArray0);
      String[] stringArray1 = new String[8];
      stringArray1[0] = "/Edit";
      stringArray1[1] = "/Edit";
      stringArray1[2] = "/Edit";
      stringArray1[3] = "/Edit";
      stringArray1[4] = "W~R[";
      stringArray1[5] = "/Edit";
      stringArray1[6] = "/Edit";
      stringArray1[7] = "/Edit";
      archiveScanner0.setIncludes(stringArray1);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "W~R[");
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
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "com.lts.io.archive.AbstractNestedArchive";
      archiveScanner0.setExcludes(stringArray0);
      String string0 = "/Edit";
      String string1 = "";
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile("/Edit", "", (File) null);
      improvedFile0.mkdir();
      improvedFile0.setReadOnly();
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string2 = ".jar";
      boolean boolean0 = true;
      String[] stringArray1 = new String[8];
      stringArray1[0] = string1;
      stringArray1[1] = string0;
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray1[2] = string0;
      stringArray1[3] = string1;
      String string3 = "FILE_DOES_NOT_EXIST";
      DirectoryScanner.matchPatternStart(stringArray1[3], string3);
      stringArray1[4] = string1;
      stringArray1[5] = stringArray1[3];
      stringArray1[6] = string0;
      stringArray1[7] = string1;
      archiveScanner0.excludes = stringArray1;
      try { 
        archiveScanner0.processDirectory(improvedFile0, string2, boolean0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /tmp/Edit0
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "com.lts.io.archive.AbstractNestedArchive";
      archiveScanner0.setExcludes(stringArray0);
      String string0 = "/Edit";
      String string1 = "";
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("/Edit", "", (File) null);
      improvedFile1.mkdir();
      improvedFile1.setReadOnly();
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string2 = ".jar";
      boolean boolean0 = false;
      String[] stringArray1 = new String[8];
      stringArray1[0] = string1;
      stringArray1[1] = string0;
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray1[2] = string0;
      stringArray1[3] = string1;
      improvedFile1.toPath();
      String string3 = "FILE_DOES_NOT_EXIST";
      DirectoryScanner.matchPatternStart(stringArray1[3], string3);
      stringArray1[4] = string1;
      stringArray1[5] = stringArray1[3];
      stringArray1[6] = string0;
      stringArray1[7] = string1;
      archiveScanner0.excludes = stringArray1;
      try { 
        archiveScanner0.processDirectory(improvedFile1, string2, boolean0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /tmp/Edit0
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "!";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setBasedir("quit");
      String[] stringArray1 = new String[6];
      stringArray1[0] = ".ZIP02nw#@!<.jar";
      stringArray1[1] = "!";
      stringArray1[2] = "!";
      stringArray1[3] = "Could not create directory ";
      stringArray1[4] = ".ZIP02nw#@!<.jar";
      stringArray1[5] = "quit";
      archiveScanner0.setIncludes(stringArray1);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("Could not create directory ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
