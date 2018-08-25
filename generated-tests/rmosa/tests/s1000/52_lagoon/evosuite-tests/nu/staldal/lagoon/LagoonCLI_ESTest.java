/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 04:31:43 GMT 2018
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
  public void test00()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LagoonCLI.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[1] = "4";
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
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[10];
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[7];
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
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "?}<}<~H3^3Ry:.sitemap";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[0] = "?}<}<~H3^3Ry:.sitemap";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "1.xml";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.25731864054383163
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[1];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("?}<}<~H3^3Ry:");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "?}<}<~H3^3Ry:");
      stringArray0[0] = "?}<}<~H3^3Ry:";
      String[] stringArray1 = new String[4];
      stringArray1[0] = "?}<}<~H3^3Ry:";
      stringArray1[1] = "1";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertNotSame(stringArray0, stringArray1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[1] = "0";
      LagoonCLI.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("?}<}<~H3^3Ry:");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "targetURL");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "?}<}<~H3^3Ry:";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
}