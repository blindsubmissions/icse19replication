/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 08:04:30 GMT 2018
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.io.InputStream;
import java.util.Locale;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
      ImprovedFile improvedFile0 = new ImprovedFile("hjM}hWi]1#q");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, "hjM}hWi]1#q", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/evosuite_readability_gen/projects/78_caloriecount/hjM}hWi]1#q
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
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.scandir(improvedFile0, "", true);
      assertFalse(improvedFile0.isFile());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      improvedFile0.getCanonicalPath();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "/", false);
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = ".JA";
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
  //Test case number: 4
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "$VA,UES";
      Vector<InputStream> vector0 = new Vector<InputStream>();
      vector0.parallelStream();
      vector0.remove((Object) improvedFile0);
      archiveScanner0.dirsNotIncluded = vector0;
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.createFolder(evoSuiteFile0);
      boolean boolean0 = true;
      archiveScanner0.processDirectory(improvedFile0, string0, boolean0);
      long long0 = (-1L);
      System.setCurrentTimeMillis(long0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "D";
      stringArray0[1] = "fP!|";
      stringArray0[2] = ".title.";
      stringArray0[3] = "0g.]~'%]J~k87GZZS";
      stringArray0[4] = "SeGlW}N(H;P'";
      archiveScanner0.myTempdir = null;
      stringArray0[5] = "";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = ".JAR";
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String string0 = "JSh8R,_B";
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
  //Test case number: 7
  /*Coverage entropy=1.400326576231188
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("$$J8hc#bb X{uw!=JB", "^JEKcN Tc");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("$$J8hc#bb X{uw!=JB", "^JEKcN Tc", improvedFile0);
      ImprovedFile improvedFile2 = new ImprovedFile(improvedFile1, "2AQX1.IS3hB[");
      improvedFile2.getCanonicalPath();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "2AQX1.IS3hB[", false);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = ".JAR";
      String[] stringArray0 = new String[5];
      stringArray0[0] = string0;
      stringArray0[1] = string0;
      stringArray0[2] = string0;
      stringArray0[3] = string0;
      stringArray0[4] = string0;
      archiveScanner0.setExcludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, stringArray0[1]);
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
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "D";
      stringArray0[1] = "D";
      stringArray0[2] = ".title.";
      archiveScanner0.myTempdir = null;
      stringArray0[3] = "0g.]~'%]J~kz87GZZS";
      stringArray0[4] = "SeGlW}N(H;P'";
      archiveScanner0.myTempdir = null;
      stringArray0[5] = "";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = ".JAR";
      ImprovedFile improvedFile1 = new ImprovedFile(archiveScanner0.myTempdir, stringArray0[0]);
      String string1 = ".JAR";
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile1, string1);
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
      archiveScanner0.myTempdir = null;
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = ".JAR";
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
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "A9N";
      ImprovedFile improvedFile0 = new ImprovedFile("A9N", "A9N");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      boolean boolean0 = false;
      String string1 = ".EAR";
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string1, boolean0);
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
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "IO eror@scanning directory ";
      String string0 = "junk";
      stringArray0[1] = "junk";
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[2] = "user.home";
      stringArray0[3] = "dir1";
      stringArray0[4] = "A5A:MFx{/0&=`(zC94";
      stringArray0[5] = "I4Bu";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[6] = "Ag@X VC>~!qYW@$f&";
      stringArray0[7] = "Error creating archive file, ";
      stringArray0[8] = "uU'9HV>xj!9Bu*D$h*";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string1 = ".JAR";
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string1, boolean0);
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
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "IO eror@scanning directory ";
      String string0 = "junk";
      stringArray0[1] = "junk";
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[2] = "IO eror@scanning directory ";
      stringArray0[3] = "dir1";
      stringArray0[4] = "A5A:MFx{/0&=`(zC94";
      stringArray0[5] = "I4Bu";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[6] = "Ag@X VC>~!qYW@$f&";
      stringArray0[7] = "Error creating archive file, ";
      stringArray0[8] = "uU'9HV>xj!9Bu*D$h*";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string1 = ".JAR";
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string1, boolean0);
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
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "$VA,UES";
      Vector<InputStream> vector0 = new Vector<InputStream>();
      vector0.parallelStream();
      archiveScanner0.dirsNotIncluded = vector0;
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.createFolder(evoSuiteFile0);
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
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "";
      Vector<InputStream> vector0 = new Vector<InputStream>();
      vector0.parallelStream();
      String[] stringArray0 = null;
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.dirsNotIncluded = vector0;
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.createFolder(evoSuiteFile0);
      boolean boolean0 = true;
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
  //Test case number: 16
  /*Coverage entropy=1.5047882836811908
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "$$J8h+v#bb X{uw!=JB";
      ImprovedFile improvedFile0 = new ImprovedFile("$$J8h+v#bb X{uw!=JB", "$$J8h+v#bb X{uw!=JB");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.toFileType(improvedFile0);
      ImprovedFile improvedFile1 = improvedFile0.createTempDir(string0, string0);
      Vector<Locale.LanguageRange> vector0 = new Vector<Locale.LanguageRange>();
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = true;
      ArchiveScanner archiveScanner2 = new ArchiveScanner(improvedFile0);
      String string1 = "!NJB";
      String string2 = "-(2<[84RCE|QteV])*.jar";
      ImprovedFile.createTempImprovedFile(string1, string2, improvedFile1);
      // Undeclared exception!
      try { 
        archiveScanner2.scandir(improvedFile1, string0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }
}
