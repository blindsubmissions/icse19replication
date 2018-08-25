/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 05:02:16 GMT 2018
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
      String[] stringArray0 = new String[2];
      stringArray0[1] = "C/L^^8&";
      LagoonCLI.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LagoonCLI.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[8];
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "N`#{I";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.2337916587064593
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "2";
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      stringArray0[1] = "2";
      stringArray0[2] = "2";
      stringArray0[3] = "2";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("2");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "#pDxPj7X.xml");
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "#pDxPj7X.xml";
      stringArray1[1] = "2";
      stringArray0[4] = "#pDxPj7X.xml";
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[1];
      stringArray2[0] = "#pDxPj7X.xml";
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray1);
      assertEquals(3, stringArray1.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "2&YW1p4f[y#$6~&}ZZ.sitemap";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[8];
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
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[1] = "0";
      LagoonCLI.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/  ok%]{bf3W(P-");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "targetURL");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "/  ok%]{bf3W(P-";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
}
