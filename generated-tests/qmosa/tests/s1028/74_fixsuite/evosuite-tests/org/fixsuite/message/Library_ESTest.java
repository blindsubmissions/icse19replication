/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:31:12 GMT 2018
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
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
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("Loaded ");
      library0.getDictionaries();
      library0.loadFromDirectory("!5OQ3=HHUF0*M8");
      library0.loadFromDirectory(",Tx,je[+{)`>}FS");
      library0.loadFromDirectory("Fields.xml");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(",Tx,je[+{)`>}FS");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Fields.xml");
      library0.getDictionaries();
      Library library1 = new Library();
      library1.getDictionaries();
      library1.getDictionary(",Tx,je[+{)`>}FS");
      library1.getDictionary("%Y1{f-e`.W\"zh4zNtSs");
      library1.getDictionary("h");
      Library library2 = new Library();
      library2.getDictionary(",Tx,je[+{)`>}FS");
      library2.loadFromDirectory("");
      System.setCurrentTimeMillis(1L);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(",Tx,je[+{)`>}FS");
      FileSystemHandling.createFolder(evoSuiteFile0);
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("");
      assertTrue(boolean0);
  }
}
