/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:28:22 GMT 2018
 */

package org.jcvi.jillion.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileFilter;
import java.net.URI;
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
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "D<|I@<2x";
      MockFile mockFile0 = new MockFile("D<|I@<2x");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      boolean boolean0 = false;
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
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
  //Test case number: 1
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("XWax/^f 7+28", "XWax/^f 7+28");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      mockFile0.setReadable(false, false);
      mockFile0.setLastModified(0L);
      MockFile.createTempFile("`>aZ", "aGOrh>Aw.!CP+#R/", (File) mockFile0);
      FileFilter[] fileFilterArray0 = new FileFilter[1];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(fileFilterArray0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter1);
      mockFile0.setWritable(false, false);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.next();
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
  //Test case number: 2
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, ":?H~TeUdTAp;AZpjT%");
      File file0 = MockFile.createTempFile("org.jcvi.jillion.core.util.iter.IteratorUtil$EmptyIterator", (String) null, (File) mockFile0);
      MockFile mockFile1 = new MockFile(file0, ":?H~TeUdTAp;AZpjT%");
      mockFile0.setExecutable(false, true);
      mockFile1.setExecutable(false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      mockFile1.delete();
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
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator0.forEach(consumer0);
      boolean boolean0 = true;
      fileIterator0.setUpInitialState(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
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
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  //Test case number: 5
  /*Coverage entropy=1.8891591637540215
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = MockFile.createTempFile(".ZSF;E3O~", "");
      MockFile mockFile0 = new MockFile(file0, "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      boolean boolean0 = true;
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      mockFile0.setLastModified(1L);
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
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("+o8Ss3:oX");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileFilter[] fileFilterArray0 = new FileFilter[6];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[1] = (FileFilter) multipleFileFilter1;
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[2] = (FileFilter) multipleFileFilter2;
      MultipleFileFilter multipleFileFilter3 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[3] = (FileFilter) multipleFileFilter3;
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter4 = new MultipleFileFilter(linkedList1);
      fileFilterArray0[4] = (FileFilter) multipleFileFilter4;
      MultipleFileFilter multipleFileFilter5 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[5] = (FileFilter) multipleFileFilter5;
      MultipleFileFilter multipleFileFilter6 = new MultipleFileFilter(fileFilterArray0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder2.fileFilter(multipleFileFilter6);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder3.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rootDir must be a directory
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.597508782744932
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("XWax/^f 7+28", "XWax/^f 7+28");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      mockFile0.setReadable(false, false);
      mockFile0.setLastModified(0L);
      MockFile.createTempFile("XWax/^f 7+28", "aGOrh>Aw.!CP+#R/", (File) mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      FileFilter[] fileFilterArray0 = new FileFilter[0];
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(fileFilterArray0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      mockFile0.setWritable(false, false);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
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
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "+o\\8Ss3:oX";
      MockFile mockFile0 = new MockFile("+o8Ss3:oX");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileFilter[] fileFilterArray0 = new FileFilter[6];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder2.fileFilter(multipleFileFilter0);
      fileIterator_FileIteratorBuilder3.includeDirectories(false);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder2.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rootDir must be a directory
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList1);
      FileFilter[] fileFilterArray0 = new FileFilter[4];
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      fileFilterArray0[1] = (FileFilter) multipleFileFilter1;
      fileFilterArray0[0] = (FileFilter) multipleFileFilter2;
      fileFilterArray0[3] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter3 = new MultipleFileFilter(fileFilterArray0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      fileIterator_FileIteratorBuilder1.build();
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.2580965380214835
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      mockFile0.mkdirs();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder2.build();
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator1.forEach(consumer0);
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator0.setUpInitialState(mockFile0);
      assertEquals("", mockFile0.getName());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.6923109941417853
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("XWax/^f 7+28", "XWax/^f 7+28");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      mockFile0.setReadable(false, false);
      mockFile0.setLastModified(0L);
      File file0 = MockFile.createTempFile("`J8aZ", "aGOrh>Aw.!CP+#R/", (File) mockFile0);
      FileFilter[] fileFilterArray0 = new FileFilter[1];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(fileFilterArray0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter1);
      mockFile0.setWritable(false, false);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.setUpInitialState(file0);
      FileIterator.createNonRecursiveFileIteratorBuilder(file0);
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
  //Test case number: 12
  /*Coverage entropy=3.0870423502280255
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(false);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder2.build();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder2.includeDirectories(false);
      MockFile mockFile1 = new MockFile("", "");
      fileIterator0.setUpInitialState(mockFile1);
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.992196960885483
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.setLastModified(0L);
      MockFile.createTempFile("8<*RfD{L9);x pM+~HU", "8<*RfD{L9);x pM+~HU", (File) mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      LinkedList<FileFilter> linkedList2 = new LinkedList<FileFilter>(linkedList1);
      LinkedList<FileFilter> linkedList3 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      LinkedList<FileFilter> linkedList4 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList3);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      // Undeclared exception!
      try { 
        MockFile.createTempFile("", "org.jcvi.jillion.core.util.iter.IteratorUtil");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.867440499124446
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      FileFilter[] fileFilterArray0 = new FileFilter[4];
      fileFilterArray0[2] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(fileFilterArray0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      MockFile mockFile1 = new MockFile(mockFile0, "sVr");
      fileIterator0.setUpInitialState(mockFile1);
      assertEquals(0L, mockFile1.getUsableSpace());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.3276698862269427
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("no elements in empty iterator");
      mockFile0.mkdirs();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/no elements in empty iterator1no elements in empty iterator");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "no elements in empty iterator");
      mockFile0.setReadable(true, false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      mockFile0.getAbsolutePath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      MockFile.createTempFile("no elements in empty iterator", "no elements in empty iterator");
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/tmp/no elements in empty iterator0no elements in empty iterator");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile1);
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      fileIterator2.hasNext();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      FileIterator fileIterator3 = fileIterator_FileIteratorBuilder2.build();
      fileIterator3.spliterator();
      FileIterator fileIterator4 = fileIterator_FileIteratorBuilder0.build();
      assertNotSame(fileIterator4, fileIterator1);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.115475024880771
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      mockFile0.setExecutable(false, false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.setLastModified(0L);
      mockFile0.setLastModified(0L);
      MockFile.createTempFile(".01TYA$To 34`Cd", "", (File) mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      mockFile0.toURI();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      // Undeclared exception!
      try { 
        MockFile.createTempFile("", ".01TYA$To 34`Cd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }
}
