/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:35:55 GMT 2018
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "5}8bD0TFW8J>l";
      ImprovedFile improvedFile0 = new ImprovedFile("5}8bD0TFW8J>l", "5}8bD0TFW8J>l");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.getAbsoluteFile();
      archiveScanner0.isArchive(improvedFile0);
      improvedFile0.setReadable(false, true);
      try { 
        archiveScanner0.scandir(improvedFile0, "5}8bD0TFW8J>l", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/ext1/evosuite_readability_gen/projects/78_caloriecount/5}8bD0TFW8J>l/5}8bD0TFW8J>l
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ImprovedFile improvedFile1 = new ImprovedFile(improvedFile0, "k)J!(=A}+(D ");
      ImprovedFile improvedFile2 = new ImprovedFile(improvedFile1);
      improvedFile1.getCanonicalPath();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      improvedFile1.getCanonicalPath();
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(1, int0);
      
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile1);
      int int1 = archiveScanner1.toFileType(improvedFile2);
      assertEquals(2, int1);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "5}8bD0TFW8J>l";
      ImprovedFile improvedFile0 = new ImprovedFile("5}8bD0TFW8J>l", "5}8bD0TFW8J>l");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.getAbsoluteFile();
      archiveScanner0.isArchive(improvedFile0);
      improvedFile0.mkdirs();
      improvedFile0.setReadable(false, true);
      archiveScanner0.scandir(improvedFile0, "5}8bD0TFW8J>l", false);
      // Undeclared exception!
      try { 
        archiveScanner0.getExcludedDirectories();
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("OPk,r_");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "OPk,r_";
      stringArray0[1] = "OPk,r_";
      stringArray0[2] = "OPk,r_";
      stringArray0[3] = "OPk,r_";
      stringArray0[4] = "OPk,r_";
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.getCanonicalPath();
      archiveScanner0.toFileType(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("C");
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("deleteAction");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-23);
      byteArray0[1] = (byte) (-23);
      byteArray0[2] = (byte) (-23);
      byteArray0[3] = (byte) (-23);
      byteArray0[4] = (byte)7;
      byteArray0[5] = (byte)7;
      byteArray0[6] = (byte) (-23);
      byteArray0[7] = (byte)7;
      ImprovedFile improvedFile1 = new ImprovedFile("OPk,r_");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "OPk,r_";
      stringArray0[1] = "deleteAction";
      stringArray0[2] = "OPk,r_";
      stringArray0[3] = "OPk,r_";
      stringArray0[4] = "deleteAction";
      stringArray0[5] = "OPk,r_";
      archiveScanner0.setIncludes(stringArray0);
      improvedFile1.getCanonicalPath();
      archiveScanner0.toFileType(improvedFile1);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("deleteAction");
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
      ImprovedFile improvedFile0 = new ImprovedFile(",r_");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[0];
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "h/rg &F.jZ", true);
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
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("OPk,r_");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner1.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      improvedFile0.getCanonicalPath();
      archiveScanner1.toFileType(improvedFile0);
      System.setCurrentTimeMillis((-578L));
      // Undeclared exception!
      try { 
        archiveScanner1.processArchive(improvedFile0, "com.lts.io.ArchiveScanner");
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
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = ",r_";
      ImprovedFile improvedFile0 = new ImprovedFile("OPk,r_");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "OPk,r_";
      stringArray0[1] = ",r_";
      stringArray0[2] = ",r_";
      stringArray0[3] = "OPk,r_";
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.getCanonicalPath();
      archiveScanner1.toFileType(improvedFile0);
      System.setCurrentTimeMillis(2171L);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, ",r_", false);
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
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      System.setCurrentTimeMillis(421L);
      MockFile mockFile0 = new MockFile(".war", "05.vtC");
      MockFile mockFile1 = new MockFile(mockFile0, ".EAR");
      File file0 = ImprovedFile.createTempFileName("bR7<&>%Eg&Tg&1.jar", ".war", mockFile1);
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile("Error trying to create temp directory in ", ".war", file0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "05.vtC";
      stringArray0[1] = "bR7<&>%Eg&Tg&1.jar";
      stringArray0[2] = ".war";
      stringArray0[3] = ".war";
      stringArray0[4] = ".EAR";
      stringArray0[5] = "Error trying to create temp directory in ";
      stringArray0[6] = "bR7<&>%Eg&Tg&1.jar";
      stringArray0[7] = "Q^8C";
      stringArray0[8] = ".war";
      archiveScanner0.includes = stringArray0;
      archiveScanner0.toFileType(improvedFile0);
      System.setCurrentTimeMillis(2);
      System.setCurrentTimeMillis(1);
      System.setCurrentTimeMillis(2);
      System.setCurrentTimeMillis(0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(file0, ".war", true);
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
  /*Coverage entropy=1.1537419427010902
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("S}=}J>.+!`\\qd=W>:");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String string0 = "S}=}J>.+!`\\qd=W>:";
      ImprovedFile improvedFile0 = new ImprovedFile("Jv.kG2_v(gZv-{x@*1");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("IO error scanning directory ", "IO error scanning directory ");
      ImprovedFile improvedFile2 = ImprovedFile.createTempDirectory("S}=}J>.+!`qd=W>:", "Jv.kG2_v(gZv-{x@*1", (File) improvedFile1);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile2);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile1, "-Oc", true);
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
  /*Coverage entropy=1.464816384890813
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("bR7<&>%Eg&Tg&1.jar", "8J>l");
      MockFile mockFile1 = new MockFile(mockFile0, "$@v-#>Xn");
      ImprovedFile.createTempFileName(".ZIP", "8J>l", mockFile0);
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile("05.vtC", ".EAR", mockFile1);
      System.setCurrentTimeMillis(1128L);
      System.setCurrentTimeMillis((-1L));
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(mockFile1, "editNode", true);
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
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      System.setCurrentTimeMillis(421L);
      MockFile mockFile0 = new MockFile(".war", "05.vtC");
      MockFile mockFile1 = new MockFile(mockFile0, ".EAR");
      File file0 = ImprovedFile.createTempFileName("bR7<&>%Eg&Tg&1.jar", ".war", mockFile1);
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile("Error trying to create temp directory in ", ".war", file0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "05.vtC";
      stringArray0[1] = "bR7<&>%Eg&Tg&1.jar";
      stringArray0[2] = ".war";
      stringArray0[3] = ".war";
      stringArray0[4] = ".EAR";
      stringArray0[5] = "Error trying to create temp directory in ";
      stringArray0[6] = "bR7<&>%Eg&Tg&1.jar";
      stringArray0[7] = "Q^8C";
      improvedFile0.setReadable(false);
      stringArray0[8] = ".war";
      archiveScanner0.includes = stringArray0;
      archiveScanner0.toFileType(improvedFile0);
      System.setCurrentTimeMillis(2);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(mockFile1, ".war");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = ",r_";
      ImprovedFile improvedFile0 = new ImprovedFile("/p@JnCAnd");
      improvedFile0.createTempDir(",r_", ",r_");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "createNode";
      stringArray0[1] = ",r_";
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.getCanonicalPath();
      archiveScanner0.excludes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("createNode");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
