/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:57:00 GMT 2018
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      library0.loadFromDirectory("3]&ZWfI}#X{qZi ");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionary("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("gq5r$Bbxp");
      library0.getDictionary("gq5r$Bbxp");
      library0.loadFromDirectory("saDJg=SI[i");
      library0.getDictionaries();
      library0.getDictionary("3]&ZWfI}#X{qZi ");
      library0.loadFromDirectory("Loaded XML file ");
      library0.getDictionary("ypU@rb[;K!B8i--");
      library0.getDictionary("");
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("3]&ZWfI}#X{qZi ");
      assertNull(dictionaryInfo0);
  }
}
