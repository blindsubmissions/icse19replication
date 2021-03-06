/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:00:18 GMT 2018
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
      String[] stringArray0 = new String[0];
      LagoonCLI.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[4];
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
  /*Coverage entropy=0.25731864054383163
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[1] = " epected";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("`*A.V'P`27,z]hN");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "t~ie:e6f:Dhk#`T}P'");
      stringArray0[2] = "S'B)X*=";
      stringArray0[4] = "r";
      stringArray0[5] = "Property ";
      stringArray0[7] = "Sum)Wg";
      stringArray0[8] = "nu.tldal.xtree.T5ext";
      String[] stringArray1 = new String[1];
      stringArray1[0] = "`*A.V'P`27,z]hN";
      LagoonCLI.main(stringArray1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray2 = new String[1];
      stringArray2[0] = ")K$Vt.sitemap";
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertNotSame(stringArray0, stringArray1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "~,5.F}.J'[.CC.xml";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[1] = "8";
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
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
  //Test case number: 7
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "targetURL";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("targetURL");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "targetURL");
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "-9";
      LagoonCLI.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }
}
