/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 11:18:26 GMT 2018
 */

package nu.staldal.lagoon;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import nu.staldal.lagoon.LagoonCLI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LagoonCLI_ESTest extends LagoonCLI_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "G\"cd'G$hCHzc6_vb";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[1] = "build";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "force";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.24493002679463532
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("5$W\\l&cDMh8;giF+b@");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "5$Wl&cMh8;giF8+b@.sitemap");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "5$Wl&cDMh8;giF+b@";
      LagoonCLI.main(stringArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[0];
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[5];
      stringArray2[0] = "]b";
      stringArray2[1] = "2";
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray1);
      assertEquals(0, stringArray1.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "i9q<Y.sitemap";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "48";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "0";
      LagoonCLI.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "targetURL";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("targetURL");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "targetURL");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("targetURL");
      FileSystemHandling.createFolder(evoSuiteFile1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "#qG.#JQ;.xml";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
}
