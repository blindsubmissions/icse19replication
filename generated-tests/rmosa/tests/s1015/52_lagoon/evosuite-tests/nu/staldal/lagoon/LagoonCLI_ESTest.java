/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 11:58:24 GMT 2018
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
      String[] stringArray0 = new String[15];
      stringArray0[1] = "0";
      LagoonCLI.main(stringArray0);
      assertEquals(15, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  //Test case number: 4
  /*Coverage entropy=0.2337916587064593
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("All elements are not yet ended");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "HC`0=~tJs:>");
      stringArray0[0] = "#QX.sitemap";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "All elements are not yet ended";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[8];
      stringArray2[0] = "All elements are not yet ended";
      stringArray2[1] = "#SQ7([%U";
      stringArray2[2] = "All elements are not yet ended";
      stringArray2[3] = "All elements are not yet ended";
      stringArray2[4] = "All elements are not yet ended";
      stringArray2[5] = "#SQ7([%U";
      stringArray2[6] = "HC`0=~tJs:>";
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "#SQ7([%U");
      stringArray2[7] = "#QX.sitemap";
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray0);
      String[] stringArray3 = new String[0];
      LagoonCLI.main(stringArray3);
      LagoonCLI.main(stringArray1);
      assertFalse(stringArray1.equals((Object)stringArray3));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "[x&|(Ma.xml";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[1] = "3";
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
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("`SC1|J].Zl f]");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "targetURL");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "`SC1|J].Zl f]";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
}
