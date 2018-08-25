/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:28:12 GMT 2018
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.9743147528693494
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("comls.til.deepcopy.DeepCopyException", "comls.til.deepcopy.DeepCopyException");
      ImprovedFile improvedFile1 = new ImprovedFile(improvedFile0, "\">l`Q.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsIncluded = vector0;
      File file0 = ImprovedFile.buildName("\">l`Q.jar", (-411L), ".JAR", improvedFile0);
      archiveScanner0.toFileType(file0);
      archiveScanner0.toFileType(improvedFile0);
      long long0 = 0L;
      System.setCurrentTimeMillis(long0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3778195080390327
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      String string0 = "";
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0, "");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile(".WAR", (String) null, improvedFile0);
      mockFile0.setLastModified(128L);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesIncluded = vector0;
      improvedFile1.mkdir();
      mockFile0.createNewFile();
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(mockFile0, (String) null, false);
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
      ImprovedFile improvedFile0 = new ImprovedFile("comls.til.deepcopy.DeepCopyException", "comls.til.deepcopy.DeepCopyException");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("comls.til.deepcopy.DeepCopyException");
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "com.lts.pest.tree.SimpleTreeListener";
      ImprovedFile improvedFile0 = new ImprovedFile("com.lts.pest.tree.SimpleTreeListener");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[1] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[2] = "com.lts.pest.tree.SimpleTreeListener";
      String string1 = ".ZIP";
      stringArray0[3] = ".ZIP";
      stringArray0[4] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[5] = "com.lts.pest.tree.SimpleTreeListener";
      archiveScanner0.setExcludes(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "com.lts.pest.tree.SimpleTreeListener";
      archiveScanner0.setIncludes(stringArray1);
      System.setCurrentTimeMillis(2);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "com.lts.pest.tree.SimpleTreeListener");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("comls.til.deepcopy.DeepCopyException", "comls.til.deepcopy.DeepCopyException");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "comls.til.deepcopy.DeepCopyException");
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
      String string0 = "com.lts.pest.tree.SimpleTreeListener";
      ImprovedFile improvedFile0 = new ImprovedFile("com.lts.pest.tree.SimpleTreeListener");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[1] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[2] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[3] = ".ZIP";
      stringArray0[4] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[5] = "com.lts.pest.tree.SimpleTreeListener";
      archiveScanner0.setExcludes(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "com.lts.pest.tree.SimpleTreeListener";
      archiveScanner0.setIncludes(stringArray1);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("com.lts.pest.tree.SimpleTreeListener");
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
      ImprovedFile improvedFile0 = new ImprovedFile("com.lts.pest.tree.SimpleTreeListener");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.getCanonicalPath();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[1] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[2] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[3] = ".Z";
      stringArray0[4] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[5] = "com.lts.pest.tree.SimpleTreeListener";
      archiveScanner0.setExcludes(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "com.lts.pest.tree.SimpleTreeListener";
      archiveScanner0.setIncludes(stringArray1);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "com.lts.pest.tree.SimpleTreeListener", false);
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
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("com.lts.pest.tree.SimpleTreeListener");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[1] = "com.lts.pest.tree.SimpleTreeListener";
      stringArray0[2] = "com.lts.pest.tree.SimpleTreeListener";
      improvedFile0.toURL();
      String[] stringArray1 = new String[1];
      stringArray1[0] = ".ZIP";
      archiveScanner0.setExcludes(stringArray1);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("com.lts.pest.tree.SimpleTreeListener");
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
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      improvedFile0.delete();
      String string0 = "Could not remove the destination file, ";
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Z.Z";
      stringArray0[1] = "Z.Z";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "Z.Z";
      archiveScanner0.setExcludes(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "Could not remove the destination file, ";
      archiveScanner0.setIncludes(stringArray1);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "Could not remove the destination file, ");
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
  /*Coverage entropy=1.035016633484322
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      improvedFile0.delete();
      improvedFile0.mkdirs();
      ImprovedFile improvedFile1 = new ImprovedFile(improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      String[] stringArray0 = new String[5];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      stringArray0[0] = ".Z";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[1] = ".Z";
      Vector<PushbackInputStream> vector1 = new Vector<PushbackInputStream>(1);
      archiveScanner0.dirsNotIncluded = vector1;
      stringArray0[2] = ".Z";
      stringArray0[3] = "";
      stringArray0[4] = ".Z";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "Could not remove the destination file, ";
      archiveScanner0.processDirectory(improvedFile0, "\">l`Q.jar0..JAR.jar", true);
      archiveScanner0.setIncludes(stringArray1);
      boolean boolean0 = false;
      archiveScanner0.processDirectory(improvedFile1, "Could not remove the destination file, ", false);
      ImprovedFile improvedFile2 = new ImprovedFile(improvedFile1);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        improvedFile2.copyFrom((InputStream) sequenceInputStream0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      improvedFile0.mkdirs();
      String string0 = ".Z";
      ImprovedFile improvedFile1 = new ImprovedFile(".Z", ".Z");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      String[] stringArray0 = new String[5];
      stringArray0[0] = ".Z";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsIncluded = vector0;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      stringArray0[1] = ".Z";
      Vector<PushbackInputStream> vector1 = new Vector<PushbackInputStream>(1);
      archiveScanner0.dirsNotIncluded = vector1;
      stringArray0[2] = ".Z";
      stringArray0[3] = ".Z";
      stringArray0[4] = ".Z";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "";
      archiveScanner0.processDirectory(improvedFile0, "", true);
      archiveScanner0.setIncludes(stringArray1);
      try { 
        archiveScanner0.processDirectory(improvedFile1, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/evosuite_readability_gen/projects/78_caloriecount/.Z/.Z
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}