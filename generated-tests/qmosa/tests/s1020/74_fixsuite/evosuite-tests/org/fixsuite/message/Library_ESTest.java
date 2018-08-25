/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:22:00 GMT 2018
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
      library0.loadFromDirectory(" FIX dictionaries.");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("yh$z");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("yh$z");
      library0.getDictionaries();
      library0.loadFromDirectory("yh$z");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("yh$z");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      library0.loadFromDirectory("e;0BB2");
      library0.getDictionaries();
      library0.getDictionary("bqHuI^xeNe");
      library0.getDictionary("Fields.xml");
      library0.loadFromDirectory("yh$z");
      library0.loadFromDirectory("e;0BB2");
      library0.getDictionary(";k'y4%1d52");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("K;=E&");
      library0.getDictionaries();
      library0.getDictionary("Unable to load dictionary from ");
      library0.loadFromDirectory("bqHuI^xeNe");
      library0.loadFromDirectory("");
      System.setCurrentTimeMillis(0L);
  }
}