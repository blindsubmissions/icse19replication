/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:46:14 GMT 2018
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.fixsuite.message.Library;
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory(" DXgDtqQ");
      library0.loadFromDirectory(" DXgDtqQ");
      library0.getDictionaries();
      library0.loadFromDirectory("^!OgPMk<A^;&");
      library0.loadFromDirectory("SXt4W4z{%zKh!IK ");
      library0.loadFromDirectory("Zp#n,VZsoxW");
      library0.getDictionaries();
      library0.getDictionaries();
      List<DictionaryInfo> list0 = library0.getDictionaries();
      library0.loadFromDirectory("PXTb");
      library0.getDictionary("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory(":nH .QZGmx");
      library0.getDictionary("");
      library0.loadFromDirectory("");
      library0.getDictionary("'4/L/jbl\b");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      List<DictionaryInfo> list1 = library0.getDictionaries();
      assertNotSame(list1, list0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionary("");
      library0.getDictionaries();
      library0.getDictionaries();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" e:uV|");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      library0.loadFromDirectory("jfp<slK%Hc#w");
      library0.loadFromDirectory("");
      library0.getDictionary("!iZn");
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("Unknown XML file ");
      assertNull(dictionaryInfo0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.2852930241200995
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionary("");
      library0.getDictionaries();
      library0.getDictionaries();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" e:uV|");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = library0.loadFromDirectory("");
      assertTrue(boolean0);
      
      library0.getDictionary("!iZn");
      boolean boolean1 = library0.loadFromDirectory("!iZn");
      assertFalse(boolean1 == boolean0);
  }
}
