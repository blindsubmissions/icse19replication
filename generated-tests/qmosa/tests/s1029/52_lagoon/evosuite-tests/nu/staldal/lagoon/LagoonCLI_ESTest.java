/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 19:11:33 GMT 2018
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "h3Y9G";
      stringArray0[1] = "mnI";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[8];
      stringArray1[0] = "Ln";
      stringArray1[1] = "build";
      stringArray1[2] = "krJg5b+(r";
      stringArray1[3] = "space";
      stringArray1[4] = "nu.staldal.xtree.NodeWithChildren";
      stringArray1[5] = "LocalName may not be null";
      stringArray1[6] = "Wz'm9a*7u+Gg{q)qt%";
      stringArray1[7] = "Yr8";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      assertNotSame(stringArray0, stringArray1);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[9];
      stringArray0[0] = ".xml";
      stringArray0[1] = "1";
      stringArray0[2] = "nu.staldal.lagoon.LagoonCLI";
      stringArray0[3] = "Ready";
      stringArray0[4] = "Ready.sitemap";
      stringArray0[5] = "nu.staldal.lagoon.core.AuthenticationMissingException.xml";
      stringArray0[6] = "`)^$kU*G.sitemap";
      stringArray0[7] = "Ready";
      stringArray0[8] = "nu.staldal.lagoon.core.LagoonException.xml";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[0];
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[1];
      stringArray2[0] = "nu.staldal.lagoon.core.AuthenticationMissingException";
      LagoonCLI.main(stringArray2);
      String[] stringArray3 = new String[2];
      stringArray3[0] = "_#WS";
      stringArray3[1] = "Ready";
      String[] stringArray4 = new String[6];
      stringArray4[0] = "HC`$";
      stringArray4[1] = "Incorrect password";
      LagoonCLI.main(stringArray3);
      LagoonCLI.main(stringArray2);
      String[] stringArray5 = new String[8];
      stringArray5[0] = "#J[~x6Zvr";
      stringArray5[1] = "Incorrect password";
      LagoonCLI.main(stringArray1);
      assertNotSame(stringArray1, stringArray0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "%Qw~q";
      stringArray0[1] = "%Qw~q";
      String[] stringArray1 = new String[4];
      stringArray1[0] = "Ready.sitemap";
      stringArray1[1] = "%Qw~q";
      stringArray1[2] = "nu.staldal.lagoon.core.AuthenticationMissingException.xml";
      stringArray1[3] = "%Qw~q";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[1];
      stringArray2[0] = "`)^$kU*G.sitemap";
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Password is required but not specified";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Password is required but not specified");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Password is required but not specified");
      LagoonCLI.main(stringArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "AA7";
      stringArray0[1] = "force";
      stringArray0[2] = "Password is required but not specified.sitemap";
      stringArray0[3] = "nu.staldal.xtree.Node";
      stringArray0[4] = "voA?I-A/5!=U*S}";
      stringArray0[5] = "}hJK{<&nJ5l<gy-}";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[10];
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
