/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 07:12:56 GMT 2018
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.io.PipedInputStream;
import java.util.Comparator;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      ImprovedFile improvedFile0 = new ImprovedFile("#cz''%8<pG!X)?", "#cz''%8<pG!X)?");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, "#cz''%8<pG!X)?", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/evosuite_readability_gen/projects/78_caloriecount/#cz''%8<pG!X)?/#cz''%8<pG!X)?
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
      ImprovedFile improvedFile0 = new ImprovedFile("java.i.tmpdir");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.scandir(improvedFile1, "java.i.tmpdir", false);
      assertEquals("/home/ubuntu/evosuite_readability_gen/projects/78_caloriecount/java.i.tmpdir", improvedFile1.getParent());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = false;
      String string0 = "&(u2~RBo4I |6;p";
      ImprovedFile improvedFile1 = ImprovedFile.createTempDirectory("java.io.tmpdir", "&(u2~RBo4I |6;p", (File) mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("java.io.tmpdir");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-17);
      byteArray0[1] = (byte) (-79);
      byteArray0[2] = (byte)87;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)75;
      byteArray0[5] = (byte) (-65);
      byteArray0[6] = (byte) (-109);
      byteArray0[7] = (byte)6;
      byteArray0[8] = (byte) (-73);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile1);
      // Undeclared exception!
      try { 
        archiveScanner1.scandir(improvedFile0, "java.io.tmpdir", true);
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
  /*Coverage entropy=0.9743147528693494
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      ImprovedFile improvedFile0 = new ImprovedFile((File) null, "createNode");
      ImprovedFile improvedFile1 = new ImprovedFile(improvedFile0, "o");
      ArchiveScanner archiveScanner1 = new ArchiveScanner((ImprovedFile) null);
      ArchiveScanner archiveScanner2 = new ArchiveScanner(improvedFile1);
      archiveScanner2.isArchive(improvedFile1);
      int int0 = archiveScanner2.toFileType(improvedFile1);
      assertEquals(0, int0);
      
      archiveScanner2.toFileType(improvedFile0);
      archiveScanner0.isArchive(improvedFile1);
      int int1 = archiveScanner2.toFileType(improvedFile0);
      assertEquals(2, int1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "";
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      archiveScanner0.excludes = stringArray0;
      stringArray0[0] = "gjYQ bHg%&5";
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "gjYQ bHg%&5");
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      ImprovedFile improvedFile1 = new ImprovedFile((File) null, "createNode");
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile1);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner1.dirsNotIncluded = vector0;
      archiveScanner1.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner1.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "java.io.tmpdir.jar";
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = true;
      archiveScanner1.processDirectory(improvedFile0, string0, boolean0);
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "y,yy-MM-X?E@H~+mm:ss";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "y,yy-MM-X?E@H~+mm:ss", true);
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
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<Object> vector0 = new Vector<Object>();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "java.io.tmpdir0&(u2~RBo4I |6;p.jar";
      stringArray0[1] = "oK'I";
      stringArray0[2] = ";-";
      String string0 = "BAX~";
      stringArray0[3] = "BAX~";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("java.io.tmpdir0&(u2~RBo4I |6;p.jar");
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
      String string0 = "A>3z5glLg";
      archiveScanner0.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
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
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      ImprovedFile improvedFile1 = new ImprovedFile((File) null, "createNode");
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile1);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner1.dirsNotIncluded = vector0;
      archiveScanner1.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner1.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "java.io.tmpdir.jar";
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        archiveScanner1.processDirectory(improvedFile0, string0, boolean0);
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "gjYQ bHg%&5";
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "gjYQ bHg%&5");
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
      String string0 = "java.io.tmpdir";
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String string1 = ";-";
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner1.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String[] stringArray0 = new String[4];
      String string2 = "/Create";
      stringArray0[0] = string2;
      stringArray0[1] = string0;
      stringArray0[2] = string0;
      stringArray0[3] = string1;
      archiveScanner1.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner1.processFile(stringArray0[3]);
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "6QU1GT|uV+p";
      stringArray0[1] = "6QU1GT|uV+p";
      stringArray0[2] = "6QU1GT|uV+p";
      stringArray0[3] = "6QU1GT|uV+p";
      stringArray0[4] = "6QU1GT|uV+p";
      stringArray0[5] = "6QU1GT|uV+p";
      Vector<PipedInputStream> vector0 = new Vector<PipedInputStream>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[6] = "6QU1GT|uV+p";
      String[] stringArray1 = new String[0];
      archiveScanner0.setExcludes(stringArray1);
      archiveScanner0.setIncludes(stringArray0);
      System.setCurrentTimeMillis(0);
      Comparator<PipedInputStream> comparator0 = (Comparator<PipedInputStream>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      vector0.sort(comparator0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "6QU1GT|uV+p", true);
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "6QU1GT|uV+p";
      stringArray0[1] = "6QU1GT|uV+p";
      stringArray0[2] = "6QU1GT|uV+p";
      stringArray0[3] = "6QU1GT|uV+p";
      stringArray0[4] = "6QU1GT|uV+p";
      stringArray0[5] = "6QU1GT|uV+p";
      Vector<PipedInputStream> vector0 = new Vector<PipedInputStream>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[6] = "6QU1GT|uV+p";
      String[] stringArray1 = new String[0];
      archiveScanner0.setExcludes(stringArray1);
      archiveScanner0.setIncludes(stringArray0);
      System.setCurrentTimeMillis(0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "6QU1GT|uV+p", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}