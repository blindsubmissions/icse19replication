/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:35:18 GMT 2018
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.fixsuite.message.Library;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.4205719259467045
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("G\\QhJ:64W}{");
      FileSystemHandling.createFolder(evoSuiteFile0);
      library0.getDictionaries();
      library0.loadFromDirectory("Loaded XML file ");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("GQhJ:64W}{");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("GQhJ:64W}{");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionary("GQhJ:64W}{");
      library0.getDictionary("Loaded XML file ");
      library0.getDictionaries();
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.8855741515766717
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.fixsuite.message.Library");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "b+_Z9");
      library0.loadFromDirectory("org.fixsuite.message.Library");
      library0.loadFromDirectory("");
      String string0 = "";
      library0.loadFromDirectory("Z");
      library0.getDictionaries();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Z");
      String string1 = null;
      // Undeclared exception!
      try { 
        library0.getDictionary((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }
}
