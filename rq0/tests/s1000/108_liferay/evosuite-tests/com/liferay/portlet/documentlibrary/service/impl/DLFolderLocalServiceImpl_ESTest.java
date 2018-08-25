/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:28:08 GMT 2018
 */

package com.liferay.portlet.documentlibrary.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.caucho.amber.AmberQuery;
import com.caucho.amber.collection.CollectionImpl;
import com.caucho.amber.manager.AmberConnection;
import com.caucho.config.Names;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskDueDateComparator;
import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceWrapper;
import com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl;
import java.util.Date;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.Delayed;
import org.dom4j.bean.BeanAttributeList;
import org.dom4j.bean.BeanElement;
import org.dom4j.bean.BeanMetaData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hibernate.collection.PersistentBag;
import org.hibernate.collection.PersistentList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DLFolderLocalServiceImpl_ESTest extends DLFolderLocalServiceImpl_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      String[] stringArray0 = new String[0];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.addFolderResources((-2065L), stringArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFoldersAndFileEntriesAndFileShortcuts(1L, 1L, (-1), (String[]) null, true, (-735), (-1), (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl1 = new DLFolderLocalServiceImpl();
      BaseWorkflowTaskNameComparator baseWorkflowTaskNameComparator0 = new BaseWorkflowTaskNameComparator();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFoldersAndFileEntriesAndFileShortcuts(0L, (long) 4, 4, true, 4, 4, (OrderByComparator) baseWorkflowTaskNameComparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      try { 
        dLFolderLocalServiceImpl0.validateFolder(0L, 0L, "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFoldersAndFileEntriesAndFileShortcutsCount((-1631L), (-1631L), 800, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFileEntriesAndFileShortcuts(12622780800000L, 12622780800000L, 2333, 2333, 2333);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFoldersCount(1440L, 1440L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFolder(4L, 4L, "#3&6vk`se9qU25");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      long long0 = (-1262L);
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.moveFolder((-1262L), (-1262L), serviceContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      long long0 = 747L;
      int int0 = 1413;
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator(false);
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFolders(747L, 747L, false, 1413, 1413, (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getParentFolderId(16711705L, 16711705L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.addFolder(0L, 0L, 0L, true, 0L, "org.dom4j.dom.DOMText", "org.dom4j.dom.DOMText", (ServiceContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator(true);
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFolders(0L, 0L, (-1), (-1), (OrderByComparator) baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.validateFolder(7L, 7L, " already exists");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      int int0 = 2147128280;
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getMountFoldersCount(2075L, 2075L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFolders(4194304L, 4194304L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      DLFolderLocalServiceWrapper dLFolderLocalServiceWrapper0 = new DLFolderLocalServiceWrapper(dLFolderLocalServiceImpl0);
      long long0 = (-3623L);
      // Undeclared exception!
      try { 
        dLFolderLocalServiceWrapper0.getFolder((-3623L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      long long0 = dLFolderLocalServiceImpl0.getParentFolderId(0L, 0L);
      assertEquals(0L, long0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.addFolderResources((-1L), true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.fetchFolder((-1L), (-1L), "workflowDefinition");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getCompanyFoldersCount(1441L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      int int0 = 2147128280;
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFileEntriesAndFileShortcutsCount(2075L, 2075L, 2147128280);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFolders(4194304L, 4194304L, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      long long0 = 0L;
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFoldersCount(0L, 0L, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.updateLastPostDate((-1679L), (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      BaseWorkflowTaskDueDateComparator baseWorkflowTaskDueDateComparator0 = new BaseWorkflowTaskDueDateComparator(false);
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getMountFolders(2370L, 747L, 1, 8, baseWorkflowTaskDueDateComparator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      PersistentList persistentList0 = new PersistentList();
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.updateFolderAndFileEntryTypes(3600000L, 3600000L, "workflowDefinition", "workflowDefinition", 3600000L, persistentList0, true, serviceContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getMountFolder((-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      PersistentBag persistentBag0 = new PersistentBag();
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.updateFolderAndFileEntryTypes(16711680L, 16711680L, "7}3e6(!(y", "7}3e6(!(y", 16711680L, persistentBag0, false, serviceContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.deleteFolder((-2028L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      String[] stringArray0 = new String[10];
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFoldersAndFileEntriesAndFileShortcutsCount(1825L, 1825L, (-2605), stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getFolderId((-799L), (-799L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      Vector<Long> vector0 = new Vector<Long>();
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.updateFolder(0L, 0L, "('", "", 0L, (List<Long>) vector0, false, serviceContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.updateFolder((-1085L), "workflowDefinition", "workflowDefinition", 0L, (List<Long>) null, true, serviceContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      ServiceContext serviceContext0 = new ServiceContext();
      serviceContext0.setAttribute("A", "A");
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.updateFolder(2697L, 2697L, "A", "A", 2697L, (List<Long>) null, true, serviceContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      Class<Names> class0 = Names.class;
      BeanMetaData beanMetaData0 = new BeanMetaData(class0);
      BeanAttributeList beanAttributeList0 = new BeanAttributeList((BeanElement) null, beanMetaData0);
      beanAttributeList0.parallelStream();
      ServiceContext serviceContext0 = new ServiceContext();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.updateFolder((-1501L), "workflowDefinition", "workflowDefinition", 1485L, (List<Long>) beanAttributeList0, false, serviceContext0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.dom4j.bean.BeanAttribute cannot be cast to java.lang.Long
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "</em></td>";
      stringArray0[2] = "rjG(7GJb@B";
      stringArray0[3] = "";
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.addFolderResources((DLFolder) null, stringArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      long long0 = dLFolderLocalServiceImpl0.getFolderId(0L, 0L);
      assertEquals(0L, long0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.deleteFolder((DLFolder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getParentFolderId((DLFolder) null, 6005);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.getCompanyFolders(1096L, 1057, 1057);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      long long0 = dLFolderLocalServiceImpl0.getParentFolderId((DLFolder) null, 0L);
      assertEquals(0L, long0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DLFolderLocalServiceImpl dLFolderLocalServiceImpl0 = new DLFolderLocalServiceImpl();
      // Undeclared exception!
      try { 
        dLFolderLocalServiceImpl0.addFolderResources((DLFolder) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl", e);
      }
  }
}