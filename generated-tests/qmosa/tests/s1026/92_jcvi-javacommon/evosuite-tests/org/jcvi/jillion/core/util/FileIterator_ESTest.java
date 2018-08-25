/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:01:06 GMT 2018
 */

package org.jcvi.jillion.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileFilter;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
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
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvi.jillion.core.util.MultipleFileFilter", "org.jcvi.jillion.core.util.MultipleFileFilter");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(false);
      FileFilter[] fileFilterArray0 = new FileFilter[2];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      linkedList0.add((FileFilter) multipleFileFilter0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      multipleFileFilter0.accept(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      fileFilterArray0[1] = (FileFilter) multipleFileFilter1;
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(fileFilterArray0);
      multipleFileFilter2.accept(mockFile0);
      fileIterator_FileIteratorBuilder1.fileFilter(multipleFileFilter2);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder2.fileFilter(fileFilterArray0[1]);
      fileIterator_FileIteratorBuilder2.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder2.includeDirectories(false);
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
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
  //Test case number: 2
  /*Coverage entropy=2.0253262207700673
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("YNP*eu[9H}w|O>],-", "+");
      File file0 = MockFile.createTempFile("EE#]_yR'", "", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(file0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
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
  //Test case number: 3
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(false);
      boolean boolean0 = true;
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
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
  //Test case number: 4
  /*Coverage entropy=3.040727294264432
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = null;
      mockFile0.toURL();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.createDepthFirstFileIteratorBuilder((File) null);
      mockFile0.setReadOnly();
      fileIterator0.setUpInitialState(mockFile0);
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      // Undeclared exception!
      try { 
        mockFile0.renameTo((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFile", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      mockFile0.setWritable(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator_FileIteratorBuilder1.build();
      fileIterator0.setUpInitialState(mockFile0);
      fileIterator0.setUpInitialState(mockFile0);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator1.updateFileIterator(mockFile0);
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder1.build();
      fileIterator1.forEachRemaining(consumer0);
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator0.updateFileIterator(mockFile0);
      fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator0.setUpInitialState(mockFile0);
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      // Undeclared exception!
      try { 
        fileIterator2.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // can not remove
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.0443902281158373
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      boolean boolean0 = true;
      mockFile0.setWritable(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator0.setUpInitialState(mockFile0);
      fileIterator0.setUpInitialState(mockFile0);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator1.updateFileIterator(mockFile0);
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder1.build();
      fileIterator1.forEachRemaining(consumer0);
      mockFile0.getCanonicalFile();
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      // Undeclared exception!
      try { 
        fileIterator2.next();
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
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      mockFile0.setWritable(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator0.setUpInitialState(mockFile0);
      fileIterator0.setUpInitialState(mockFile0);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      multipleFileFilter0.accept(mockFile0);
      fileIterator1.iterator();
      fileIterator_FileIteratorBuilder1.fileFilter(multipleFileFilter0);
      fileIterator1.setUpInitialState(mockFile0);
      fileIterator0.iterator();
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
  //Test case number: 8
  /*Coverage entropy=2.9252027641711082
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%ajGy~':P:0u");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      MockFile mockFile1 = new MockFile("%ajGy~':P:0u", "%ajGy~':P:0u");
      File file0 = MockFile.createTempFile("org.jcvi.jillion.internal.core.util.AbstractFOQueue", "0", (File) mockFile0);
      MockFile mockFile2 = new MockFile(file0, "org.jcvi.jillion.internal.core.util.AbstractFOQueue");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.getNextFile();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      fileIterator_FileIteratorBuilder2.includeHiddenFiles(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder1.fileFilter((FileFilter) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = fileIterator_FileIteratorBuilder3.includeDirectories(false);
      fileIterator_FileIteratorBuilder3.build();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      fileIterator1.setUpInitialState(file0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder5 = FileIterator.createDepthFirstFileIteratorBuilder((File) null);
      assertFalse(fileIterator_FileIteratorBuilder5.equals((Object)fileIterator_FileIteratorBuilder4));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.9252027641711082
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%ajGy~':P:0u");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      MockFile mockFile1 = new MockFile("%ajGy~':P:0u", "%ajGy~':P:0u");
      File file0 = MockFile.createTempFile("org.jcvi.jillion.internal.core.util.AbstractFOQueue", "0", (File) mockFile0);
      MockFile mockFile2 = new MockFile(file0, "org.jcvi.jillion.internal.core.util.AbstractFOQueue");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.getNextFile();
      FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      fileIterator0.getNextFile();
      assertTrue(fileIterator0.hasNext());
      
      fileIterator_FileIteratorBuilder2.fileFilter((FileFilter) null);
      fileIterator_FileIteratorBuilder2.includeDirectories(true);
      fileIterator_FileIteratorBuilder1.build();
      File file1 = fileIterator0.next();
      FileIterator.createNonRecursiveFileIteratorBuilder(file1);
      boolean boolean0 = fileIterator0.hasNext();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%ajGy~':P:0u");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      MockFile mockFile1 = new MockFile("%ajGy~':P:0u", "%ajGy~':P:0u");
      File file0 = MockFile.createTempFile("org.jcvi.jillion.internal.core.util.AbstractFOQueue", "0", (File) mockFile0);
      MockFile mockFile2 = new MockFile(file0, "org.jcvi.jillion.internal.core.util.AbstractFOQueue");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      FileFilter[] fileFilterArray0 = new FileFilter[6];
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList1);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter1;
      fileFilterArray0[1] = (FileFilter) multipleFileFilter0;
      fileFilterArray0[2] = (FileFilter) multipleFileFilter0;
      fileFilterArray0[3] = (FileFilter) multipleFileFilter0;
      fileFilterArray0[4] = (FileFilter) multipleFileFilter0;
      fileFilterArray0[5] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(fileFilterArray0);
      multipleFileFilter2.accept(file0);
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.fileFilter(fileFilterArray0[0]);
      fileIterator0.setUpInitialState(file0);
      fileIterator0.iterator();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      fileIterator1.hasNext();
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder2.build();
      // Undeclared exception!
      try { 
        fileIterator2.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // can not remove
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%ajGy~':P:0u");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      MockFile mockFile1 = new MockFile("%ajGy~':P:0u", "%ajGy~':P:0u");
      MockFile.createTempFile("org.jcvi.jillion.internal.core.util.AbstractFOQueue", "0", (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.getNextFile();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator_FileIteratorBuilder3.fileFilter((FileFilter) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder4.includeDirectories(true);
      fileIterator_FileIteratorBuilder1.build();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder2.build();
      fileIterator1.getNextFile();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder5 = FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      assertNotSame(fileIterator_FileIteratorBuilder5, fileIterator_FileIteratorBuilder1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.9669434861893547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%ajGy~':P:0u");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      MockFile mockFile1 = new MockFile("%ajGy~':P:0u", "%ajGy~':P:0u");
      File file0 = MockFile.createTempFile("org.jcvi.jillion.internal.core.util.AbstractFOQueue", "0", (File) mockFile0);
      MockFile mockFile2 = new MockFile(file0, "org.jcvi.jillion.internal.core.util.AbstractFOQueue");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.getNextFile();
      FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      FileFilter[] fileFilterArray0 = new FileFilter[2];
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(fileFilterArray0);
      fileFilterArray0[1] = (FileFilter) multipleFileFilter1;
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(fileFilterArray0);
      multipleFileFilter0.accept(file0);
      fileIterator0.iterator();
      fileIterator_FileIteratorBuilder1.fileFilter(fileFilterArray0[0]);
      MockFile mockFile3 = new MockFile("");
      fileIterator0.setUpInitialState(mockFile3);
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile2);
      fileIterator_FileIteratorBuilder2.includeHiddenFiles(false);
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
  //Test case number: 13
  /*Coverage entropy=2.8679224603950764
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%ajGy~':P:0u");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      MockFile mockFile1 = new MockFile("%ajGy~':P:0u", "#mw#X");
      File file0 = MockFile.createTempFile("A7=)2^#@ZD0", "0", (File) mockFile1);
      file0.createNewFile();
      MockFile mockFile2 = new MockFile(file0, "A7=)2^#@ZD0");
      fileIterator_FileIteratorBuilder0.build();
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder1.fileFilter(multipleFileFilter0);
      fileIterator_FileIteratorBuilder2.fileFilter(multipleFileFilter0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder3.build();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEachRemaining(consumer0);
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
  //Test case number: 14
  /*Coverage entropy=3.2085808850183217
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%ay~':P:0u");
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MockFile mockFile1 = new MockFile("%ay~':P:0u", "%ay~':P:0u");
      File file0 = MockFile.createTempFile("org.jcvi.jillion.internal.core.util.AbstractFOQueue", "0", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.updateFileIterator(file0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder2.fileFilter((FileFilter) null);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEachRemaining(consumer0);
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator0.updateFileIterator(mockFile0);
      fileIterator_FileIteratorBuilder3.includeHiddenFiles(true);
      fileIterator1.setUpInitialState(file0);
      MockFile mockFile2 = new MockFile("LpClrTsEFva75r");
      MockFile.createTempFile("org.jcvi.jillion.core.util.iter.IteratorUtil$EmptyIterator", "!vJYONwfia`QHT");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile2);
      assertFalse(fileIterator_FileIteratorBuilder4.equals((Object)fileIterator_FileIteratorBuilder3));
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.312615876974234
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MockFile mockFile1 = new MockFile("", "");
      MockFile.createTempFile("org.jcvi.jillion.internal.core.util.AbstractFOQueue", "0", (File) mockFile0);
      MockFile mockFile2 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile2);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      mockFile1.setExecutable(true, true);
      fileIterator0.forEach(consumer0);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator1.forEach(consumer1);
      fileIterator0.getNextFile();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile2);
      assertFalse(fileIterator_FileIteratorBuilder2.equals((Object)fileIterator_FileIteratorBuilder1));
  }
}
