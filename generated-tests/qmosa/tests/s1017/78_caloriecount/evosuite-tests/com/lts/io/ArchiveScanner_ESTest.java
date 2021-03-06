/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:47:33 GMT 2018
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("&unt._Wd");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer(1);
      vector0.add(integer0);
      Vector<Integer> vector1 = new Vector<Integer>(vector0);
      improvedFile0.delete();
      ImprovedFile improvedFile1 = ImprovedFile.createTempDirectory("&unt._Wd", "&unt._Wd", (File) improvedFile0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile1);
      File file0 = archiveScanner0.basedir;
      String string0 = ".WAR.jar";
      ImprovedFile improvedFile2 = new ImprovedFile((File) null, ".WAR.jar");
      ArchiveScanner archiveScanner2 = new ArchiveScanner(improvedFile2);
      archiveScanner1.scandir(improvedFile1, ".WAR.jar", false);
      // Undeclared exception!
      try { 
        archiveScanner2.scandir(improvedFile0, "Error trying to create temp directory ", true);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "yS]b%O)~=MB}Vfdc";
      ImprovedFile improvedFile0 = new ImprovedFile("yS]b%O)~=MB}Vfdc", "yS]b%O)~=MB}Vfdc");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.toFileType(improvedFile0);
      improvedFile0.toURI();
      archiveScanner0.toFileType(improvedFile0);
      String string1 = ".EAR";
      String[] stringArray0 = new String[5];
      improvedFile0.tempRename();
      stringArray0[0] = "yS]b%O)~=MB}Vfdc";
      improvedFile0.setReadable(false, true);
      stringArray0[1] = "yS]b%O)~=MB}Vfdc";
      stringArray0[2] = ".EAR";
      stringArray0[3] = "yS]b%O)~=MB}Vfdc";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      stringArray0[4] = "yS]b%O)~=MB}Vfdc";
      MockFile.createTempFile("yS]b%O)~=MB}Vfdc", "Could not create directory, ");
      archiveScanner0.includes = stringArray0;
      try { 
        archiveScanner0.scandir(improvedFile0, ".EAR", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/ext1/evosuite_readability_gen/projects/78_caloriecount/yS]b%O)~=MB}Vfdc/yS]b%O)~=MB}Vfdc
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.4270610433807247
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      String string0 = "U";
      File file0 = ImprovedFile.buildName("SIjN^K!!27{[", (-3355L), (String) null, (File) null);
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("JrE4}e{e", "U", file0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile1);
      boolean boolean0 = false;
      String string1 = "r&.jar";
      // Undeclared exception!
      try { 
        archiveScanner1.scandir(file0, "r&.jar", true);
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
  /*Coverage entropy=1.2700181519104905
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "V**8EYmX9tg";
      MockFile mockFile0 = new MockFile("V**8EYmX9tg");
      File file0 = ImprovedFile.buildName("[BiI/h( JWN", 473L, "The directory, ", mockFile0);
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory("WA9", "N:$FQu", file0);
      improvedFile0.createTempDir();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.deleteAll();
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(file0, "[BiI/h( JWN", true);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setBasedir((File) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "checkpoints not supported";
      stringArray0[1] = "checkpoints not supported";
      stringArray0[2] = "checkpoints not supported";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "com.lts.io.ArchiveScanner");
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
  public void test5()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "m(fAf3#oAv";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.setBasedir((File) null);
      String string0 = "checkpoints not supported";
      String[] stringArray1 = new String[3];
      stringArray1[0] = "checkpoints not supported";
      stringArray1[1] = "checkpoints not supported";
      stringArray1[2] = "checkpoints not supported";
      archiveScanner0.includes = stringArray1;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "checkpoints not supported");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      archiveScanner0.setBasedir((File) null);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.filesExcluded = vector0;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "checkpoints not supported";
      stringArray0[1] = "checkpoints not supported";
      stringArray0[2] = "checkpoints not supported";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("checkpoints not supported");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "m(fAf3#oAv";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.setBasedir((File) null);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "checkpoints not supported";
      stringArray1[1] = "checkpoints not supported";
      stringArray1[2] = "checkpoints not supported";
      archiveScanner0.includes = stringArray1;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "IO error scanning directory ", true);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setBasedir((File) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "KKbNjHVG=";
      stringArray0[1] = "KKbNjHVG=";
      stringArray0[2] = "KKbNjHVG=";
      archiveScanner0.basedir = (File) null;
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("");
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
  public void test9()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      archiveScanner0.haveSlowResults = false;
      stringArray0[0] = "m(fAf3#oAv";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.setBasedir((File) null);
      String string0 = "9.2";
      String[] stringArray1 = new String[3];
      stringArray1[0] = "9.2";
      stringArray1[1] = "9.2";
      stringArray1[2] = "9.2";
      archiveScanner0.includes = stringArray1;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "9.2", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
