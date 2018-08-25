/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:20:21 GMT 2018
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "";
      String string1 = "";
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ImprovedFile improvedFile1 = new ImprovedFile(improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      archiveScanner0.setIncludes(stringArray0);
      improvedFile1.mkdirs();
      boolean boolean0 = true;
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile1, "", true);
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
  /*Coverage entropy=1.3778195080390327
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("y'wR~O)^EzN'", "r&");
      ImprovedFile.buildName("y'wR~O)^EzN'", 0L, "Error copying directory, could not create directory ", improvedFile0);
      ImprovedFile.createTempImprovedFile("y'wR~O)^EzN'", "wWAR.jar", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "", true);
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "wWrR";
      ImprovedFile improvedFile0 = new ImprovedFile("wWrR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "dir0";
      stringArray0[1] = "wWrR";
      stringArray0[2] = "wWrR";
      stringArray0[3] = "wWrR";
      stringArray0[4] = "wWrR";
      archiveScanner0.setExcludes(stringArray0);
      String[] stringArray1 = new String[0];
      archiveScanner0.setIncludes(stringArray1);
      improvedFile0.mkdirs();
      Vector<PipedInputStream> vector0 = new Vector<PipedInputStream>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.processDirectory(improvedFile0, "wWrR", true);
      try { 
        ImprovedFile.backup((File) improvedFile0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.io.FileNotFoundException
         //
         verifyException("com.lts.io.ImprovedFile", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.400326576231188
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "wWAR";
      ImprovedFile improvedFile0 = new ImprovedFile("wWAR");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("wWAR", "wWAR", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS);
      boolean boolean0 = improvedFile1.mkdirs();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("wWAR/wWAR0.ZIP");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, string0, boolean0);
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
      String string0 = "wWAR";
      ImprovedFile improvedFile0 = new ImprovedFile("wWAR");
      String string1 = ".ZIP";
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "wWAR";
      stringArray0[1] = "wWAR";
      stringArray0[2] = ".ZIP";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.mkdirs();
      Vector<PipedInputStream> vector0 = new Vector<PipedInputStream>();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)87;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      improvedFile0.mkdirs();
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, ".ZIP");
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
      String string0 = "wWAR";
      ImprovedFile improvedFile0 = new ImprovedFile("wWAR");
      String string1 = ".ZIP";
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "wWAR";
      stringArray0[1] = "wWAR";
      stringArray0[2] = ".ZIP";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.mkdirs();
      Vector<PipedInputStream> vector0 = new Vector<PipedInputStream>();
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "#{]HNcN{mJaBl]w#h0.ZIP.jar");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("wWrR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[0];
      archiveScanner0.setIncludes(stringArray0);
      Vector<PipedInputStream> vector0 = new Vector<PipedInputStream>();
      archiveScanner0.dirsNotIncluded = vector0;
      try { 
        archiveScanner0.processDirectory(improvedFile0, "wWrR", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/evosuite_readability_gen/projects/78_caloriecount/wWrR
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
      ImprovedFile improvedFile0 = new ImprovedFile("wWAR");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("wWAR");
      FileSystemHandling.createFolder(evoSuiteFile0);
      improvedFile0.toURL();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      improvedFile0.deleteOnExit();
      archiveScanner0.basedir = (File) improvedFile0;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "wWAR";
      stringArray0[1] = "wWAR";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("wWAR");
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
      String string0 = "wWAR";
      ImprovedFile improvedFile0 = new ImprovedFile("wWAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "wWAR";
      stringArray0[1] = "wWAR";
      stringArray0[2] = ".ZIP";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.mkdirs();
      Vector<PipedInputStream> vector0 = new Vector<PipedInputStream>();
      File file0 = null;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "wWAR", true);
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
      ImprovedFile improvedFile0 = new ImprovedFile("wAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "wAR";
      stringArray0[1] = "wAR";
      stringArray0[2] = "wAR";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("wAR");
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
      ImprovedFile improvedFile0 = new ImprovedFile("wWrR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "dir0";
      stringArray0[1] = "wWrR";
      stringArray0[2] = "wWrR";
      stringArray0[3] = "wWrR";
      stringArray0[4] = "wWrR";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      improvedFile0.mkdirs();
      Vector<PipedInputStream> vector0 = new Vector<PipedInputStream>();
      improvedFile0.mkdirs();
      String string0 = ".ZIP";
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
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("wWrR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsIncluded = vector0;
      String[] stringArray0 = new String[5];
      stringArray0[0] = "dir0";
      stringArray0[1] = "wWrR";
      stringArray0[2] = "wWrR";
      stringArray0[3] = "wWrR";
      stringArray0[4] = "wWrR";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      boolean boolean0 = improvedFile0.mkdirs();
      Vector<PipedInputStream> vector1 = new Vector<PipedInputStream>();
      String string0 = ".EAR";
      archiveScanner0.processDirectory(improvedFile0, string0, boolean0);
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream(stringArray0[0]);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("wWrR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.getAbsolutePath();
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsIncluded = vector0;
      String[] stringArray0 = new String[5];
      stringArray0[0] = "dir0";
      stringArray0[1] = "wWrR";
      stringArray0[2] = "wWrR";
      stringArray0[3] = "wWrR";
      stringArray0[4] = "wWrR";
      improvedFile0.createNewFile();
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      boolean boolean0 = improvedFile0.mkdirs();
      Vector<PipedInputStream> vector1 = new Vector<PipedInputStream>();
      String string0 = ".EAR";
      try { 
        archiveScanner0.processDirectory(improvedFile0, string0, boolean0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/evosuite_readability_gen/projects/78_caloriecount/wWrR
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
      String string0 = "wWrR";
      ImprovedFile improvedFile0 = new ImprovedFile("wWrR", "wWrR");
      File file0 = MockFile.createTempFile("wWrR", "wWrR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      boolean boolean0 = improvedFile0.mkdirs();
      ImprovedFile improvedFile1 = new ImprovedFile(string0);
      String string1 = ",d: ";
      MockFile.createTempFile(string0, string1, (File) improvedFile0);
      Vector<PipedInputStream> vector0 = new Vector<PipedInputStream>();
      archiveScanner0.dirsNotIncluded = vector0;
      String string2 = "";
      try { 
        archiveScanner0.processDirectory(file0, string2, boolean0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /tmp/wWrR0wWrR
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
