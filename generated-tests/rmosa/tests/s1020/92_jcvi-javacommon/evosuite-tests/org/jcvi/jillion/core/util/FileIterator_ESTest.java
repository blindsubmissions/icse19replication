/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 14:47:05 GMT 2018
 */

package org.jcvi.jillion.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jcvi.jillion.core.util.FileIterator;
import org.jcvi.jillion.core.util.MultipleFileFilter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileIterator_ESTest extends FileIterator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      MockFile.createTempFile("taK7-p:q", "taK7-p:q", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileFilter[] fileFilterArray0 = new FileFilter[4];
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(fileFilterArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder1.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) null);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6769877743224173
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile(";b>>oS}");
      File file0 = MockFile.createTempFile("org.jcvi.jillion.core.util.MultipleFileFilter", ";b>>oS}", (File) mockFile0);
      file0.toURI();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(file0);
      file0.setWritable(false, true);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rootDir must be a directory
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      MockFile mockFile1 = new MockFile("y=7r?/~6Kgw=", "y=7r?/~6Kgw=");
      mockFile1.mkdirs();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.36060911398924
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      mockFile0.setExecutable(false);
      MockFile mockFile1 = new MockFile("`Gc");
      MockFile.createTempFile("`Gc", "", (File) mockFile1);
      mockFile0.setReadable(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5241676616734616
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f>iw,Dn");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      File file0 = MockFile.createTempFile("f>iw,Dn", "R_Y=9 CIuj\"_", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      file0.createNewFile();
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.updateFileIterator(file0);
      assertTrue(fileIterator0.hasNext());
      
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      assertTrue(fileIterator1.hasNext());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.445467830408648
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      mockFile0.setExecutable(false);
      mockFile0.setReadable(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      // Undeclared exception!
      try { 
        fileIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more files
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      assertSame(fileIterator_FileIteratorBuilder0, fileIterator_FileIteratorBuilder1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.445467830408648
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      mockFile0.setExecutable(false);
      mockFile0.setReadable(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      assertNotSame(fileIterator1, fileIterator0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      assertSame(fileIterator_FileIteratorBuilder0, fileIterator_FileIteratorBuilder1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) null);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) null);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) null);
      FileFilter[] fileFilterArray0 = new FileFilter[0];
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(fileFilterArray0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.36060911398924
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      mockFile0.setExecutable(false);
      mockFile0.setReadable(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      // Undeclared exception!
      try { 
        fileIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // can not remove
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.5968338688975634
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f>iw,Dn");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      MockFile.createTempFile("f>iw,Dn", "R_Y=9 CIuj\"_", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.next();
      fileIterator0.getNextFile();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      assertTrue(fileIterator1.hasNext());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.930740681012239
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvi.jillion.core.util.MultipleFileFilter");
      File file0 = MockFile.createTempFile(";b>>oS}", (String) null, (File) mockFile0);
      mockFile0.toURI();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      mockFile0.setWritable(false, false);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(file0);
      fileIterator0.getNextFile();
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvi.jillion.core.util.MultipleFileFilter");
      MockFile.createTempFile(";b>>oS}", "org.jcvi.jillion.core.util.MultipleFileFilter", (File) mockFile0);
      mockFile0.toURI();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileFilter[] fileFilterArray0 = new FileFilter[1];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(fileFilterArray0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter1);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      MockFile mockFile1 = new MockFile(";b>>oS}", "ZA2L|Up{Q");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
      fileIterator_FileIteratorBuilder2.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder3.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.445467830408648
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      mockFile0.setExecutable(false);
      MockFile.createTempFile("y$:N]f", "y$:N]f", (File) mockFile0);
      mockFile0.setReadable(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      MockFile mockFile1 = new MockFile(mockFile0, "Cgm-]%=mZ");
      fileIterator0.setUpInitialState(mockFile1);
      // Undeclared exception!
      try { 
        fileIterator0.forEach((Consumer<? super File>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("J");
      MockFile mockFile1 = new MockFile("f>iw,D", "J");
      mockFile0.mkdirs();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.setUpInitialState(mockFile1);
      assertEquals(0L, mockFile1.getFreeSpace());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f>ic,Dn");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      MockFile.createTempFile(".+*&ka6}]h:tb-Z=*", "f>ic,Dn", (File) mockFile0);
      MockFile mockFile1 = new MockFile("R_Y=9 CIuj\"_", "f>ic,Dn");
      fileIterator_FileIteratorBuilder0.build();
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }
}