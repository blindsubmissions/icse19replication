/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:08:18 GMT 2018
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
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
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionary("2bT(HXL");
      library0.loadFromDirectory("]x9(");
      library0.loadFromDirectory("2bT(HXL");
      List<DictionaryInfo> list0 = library0.getDictionaries();
      library0.getDictionary("oqX/7?0aOE5fjn|6f)Q");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("2bT(HXL");
      library0.getDictionaries();
      library0.getDictionary("oqX/7?0aOE5fjn|6f)Q");
      library0.loadFromDirectory(".");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("Unable to load dictionary from ");
      library0.loadFromDirectory("#-GVID]");
      List<DictionaryInfo> list1 = library0.getDictionaries();
      assertTrue(list1.equals((Object)list0));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      System.setCurrentTimeMillis((-2518L));
      System.setCurrentTimeMillis((-450L));
      System.setCurrentTimeMillis((-2518L));
      Library library0 = new Library();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("/");
      System.setCurrentTimeMillis(930L);
  }
}