/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 18:19:21 GMT 2018
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.fixsuite.message.Library;
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
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

  /**
  //Test case number: 2
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("=15YT~");
      library0.loadFromDirectory("");
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.094056456831614
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("/");
      boolean boolean0 = library0.loadFromDirectory("/");
      Library library1 = new Library();
      boolean boolean1 = library1.loadFromDirectory("/");
      assertTrue(boolean1);
      
      Library library2 = new Library();
      library2.loadFromDirectory("?_");
      boolean boolean2 = library0.loadFromDirectory("?_");
      assertFalse(boolean2 == boolean0);
  }
}
