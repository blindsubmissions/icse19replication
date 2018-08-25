/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:40:22 GMT 2018
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
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("Supplied path is not a directory.");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("kaPYJSW'=)c~");
      library0.loadFromDirectory("kaPYJSW'=)c~");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("");
      library0.loadFromDirectory("MsgType.xml");
      library0.getDictionary("");
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("*3.F>Ir&81PR&N4u)");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("*3.F>Ir&81PR&N4u)");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "*3.F>Ir&81PR&N4u)");
      boolean boolean0 = library0.loadFromDirectory("");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681098
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/evosuite_readability_gen/projects/74_fixsuite");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      Library library0 = new Library();
      library0.getDictionaries();
      FileSystemHandling.shouldAllThrowIOExceptions();
      library0.loadFromDirectory("m");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("*3.F>Ir&81PR&N4u)");
      FileSystemHandling.createFolder(evoSuiteFile1);
      library0.loadFromDirectory("");
      // Undeclared exception!
      try { 
        library0.loadFromDirectory((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
}