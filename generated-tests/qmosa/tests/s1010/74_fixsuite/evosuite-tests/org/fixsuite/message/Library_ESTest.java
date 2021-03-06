/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:26:02 GMT 2018
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
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("Unknown XML file ");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("org.fixsuite.message.info.MessageInfo");
      library0.loadFromDirectory("org.fixsuite.message.info.MessageInfo");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("Unable to load any dictionaries");
      library0.loadFromDirectory("3v|V?].");
      library0.loadFromDirectory("F-Yxs13#}aj-m0");
      library0.getDictionary("org.fixsuite.message.info.MessageInfo");
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
      
      boolean boolean1 = library0.loadFromDirectory("F-Yxs13#}aj-m0");
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("s'=#5=5j.#}X]Qe[Q");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" milliseconds.");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-3);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      library0.loadFromDirectory("s'=#5=5j.#}X]Qe[Q");
      library0.loadFromDirectory("s'=#5=5j.#}X]Qe[Q");
      library0.getDictionary("s'=#5=5j.#}X]Qe[Q");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory(" milliseconds.");
      library0.loadFromDirectory("");
      library0.getDictionary(" milliseconds.");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      System.setCurrentTimeMillis((byte) (-3));
  }
}
