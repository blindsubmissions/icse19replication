/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:55:08 GMT 2018
 */

package org.jcvi.jillion.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileFilter;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jcvi.jillion.core.util.FileIterator;
import org.jcvi.jillion.core.util.MultipleFileFilter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileIterator_ESTest extends FileIterator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      File file0 = null;
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
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = MockFile.createTempFile("i8X^7LbuAlt\"XP{6M", (String) null);
      MockFile mockFile0 = new MockFile(file0, "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
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
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = null;
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.fileFilter(multipleFileFilter0);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder2.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = null;
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder1.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = MockFile.createTempFile("gyS:amC9xe>r", "gyS:amC9xe>r");
      MockFile mockFile0 = new MockFile(file0, "gyS:amC9xe>r");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileFilter[] fileFilterArray0 = new FileFilter[7];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[1] = (FileFilter) multipleFileFilter1;
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder1.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rootDir must be a directory
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("c$pdqC ,]iM>\nI|hbQ");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      FileFilter[] fileFilterArray0 = new FileFilter[9];
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[1] = (FileFilter) multipleFileFilter1;
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList1);
      fileFilterArray0[2] = (FileFilter) multipleFileFilter2;
      MultipleFileFilter multipleFileFilter3 = new MultipleFileFilter(linkedList1);
      fileFilterArray0[3] = (FileFilter) multipleFileFilter3;
      MultipleFileFilter multipleFileFilter4 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[4] = (FileFilter) multipleFileFilter4;
      LinkedList<FileFilter> linkedList2 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter5 = new MultipleFileFilter(linkedList2);
      fileFilterArray0[5] = (FileFilter) multipleFileFilter5;
      MultipleFileFilter multipleFileFilter6 = new MultipleFileFilter(linkedList1);
      fileFilterArray0[6] = (FileFilter) multipleFileFilter6;
      MultipleFileFilter multipleFileFilter7 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[7] = (FileFilter) multipleFileFilter7;
      MultipleFileFilter multipleFileFilter8 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[8] = (FileFilter) multipleFileFilter8;
      MultipleFileFilter multipleFileFilter9 = new MultipleFileFilter(fileFilterArray0);
      linkedList0.add((FileFilter) multipleFileFilter9);
      MultipleFileFilter multipleFileFilter10 = new MultipleFileFilter(linkedList0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter10);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder1.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rootDir must be a directory
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.4224142040147285
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.setReadOnly();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator0.hasNext();
      fileIterator0.spliterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      fileIterator0.hasNext();
      fileIterator0.getNextFile();
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      fileIterator1.iterator();
      fileIterator1.getNextFile();
      assertTrue(fileIterator1.hasNext());
      
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      boolean boolean0 = fileIterator0.hasNext();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.9490123306617946
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "");
      mockFile0.getCanonicalPath();
      mockFile0.mkdirs();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.setWritable(false, false);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
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
  //Test case number: 8
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.getCanonicalPath();
      mockFile0.mkdirs();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      mockFile0.setWritable(false, false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.hasNext();
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
  //Test case number: 10
  /*Coverage entropy=3.291336152795343
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "");
      mockFile0.setReadOnly();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator0.hasNext();
      fileIterator0.spliterator();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      fileIterator_FileIteratorBuilder1.includeDirectories(false);
      fileIterator_FileIteratorBuilder2.includeDirectories(false);
      fileIterator0.hasNext();
      fileIterator0.getNextFile();
      fileIterator0.getNextFile();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder2.build();
      fileIterator0.iterator();
      fileIterator0.getNextFile();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder2.includeHiddenFiles(false);
      fileIterator1.hasNext();
      // Undeclared exception!
      try { 
        fileIterator1.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more files
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.992196960885483
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = null;
      MockFile mockFile0 = new MockFile((String) null, "");
      mockFile0.getCanonicalPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(false);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.hasNext();
      fileIterator0.getNextFile();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEach(consumer0);
      // Undeclared exception!
      try { 
        fileIterator0.setUpInitialState((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.347877419079571
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.setReadOnly();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator0.hasNext();
      fileIterator0.spliterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator0.hasNext();
      fileIterator0.getNextFile();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      fileIterator1.getNextFile();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator1.forEach(consumer0);
      fileIterator1.setUpInitialState(mockFile0);
      // Undeclared exception!
      try { 
        fileIterator1.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // can not remove
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.1540225277359086
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U:A;|_si[Ii", "org.jcvi.jillion.core.util.MultipleFileFilter");
      mockFile0.getCanonicalPath();
      mockFile0.mkdirs();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.setWritable(false, false);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      MockFile.createTempFile("GS3]--", "jGM{NK|WY", (File) mockFile0);
      MockFile mockFile1 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile1);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
      assertTrue(fileIterator0.hasNext());
      
      File file0 = fileIterator0.next();
      assertTrue(file0.isFile());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.4339872044851467
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.setReadOnly();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator0.hasNext();
      fileIterator0.spliterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      fileIterator0.hasNext();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator0.getNextFile();
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      fileIterator1.iterator();
      File file0 = fileIterator1.getNextFile();
      assertNotNull(file0);
      
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      boolean boolean0 = fileIterator0.hasNext();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator_FileIteratorBuilder0.build();
      fileIterator0.spliterator();
      MockFile mockFile1 = new MockFile("org.jcvi.jillion.internal.core.util.AbstractFOQueue");
      fileIterator0.setUpInitialState(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      linkedList0.add((FileFilter) null);
      FileFilter[] fileFilterArray0 = new FileFilter[0];
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(fileFilterArray0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.fileFilter(multipleFileFilter0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      fileIterator_FileIteratorBuilder2.fileFilter(multipleFileFilter0);
      fileIterator0.getNextFile();
      fileIterator0.iterator();
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.698011019844113
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U:A;|_si[Ii", "U:A;|_si[Ii");
      mockFile0.getCanonicalPath();
      mockFile0.mkdirs();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.setWritable(true, false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      MockFile mockFile1 = new MockFile("org.jcvi.jillion.core.util.FileIterator$NonRecursiveFileIteratorBuilder");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      MockFile mockFile2 = new MockFile("5~b^m;b[I5td");
      fileIterator0.setUpInitialState(mockFile2);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      mockFile0.toPath();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile1);
      fileIterator1.hasNext();
      // Undeclared exception!
      try { 
        fileIterator1.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more files
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.2101676771053294
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.setReadOnly();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      MockFile mockFile1 = new MockFile("");
      fileIterator_FileIteratorBuilder0.build();
      fileIterator0.spliterator();
      MockFile mockFile2 = new MockFile("org.jcvi.jillion.core.util.iter.IteratorUtil");
      fileIterator0.setUpInitialState(mockFile2);
      mockFile1.deleteOnExit();
      fileIterator_FileIteratorBuilder1.build();
      MockFile mockFile3 = new MockFile(mockFile1, "org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator$DirectoryFileFilter");
      mockFile3.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile3);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile1);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile2);
      assertFalse(fileIterator_FileIteratorBuilder3.equals((Object)fileIterator_FileIteratorBuilder2));
  }
}
