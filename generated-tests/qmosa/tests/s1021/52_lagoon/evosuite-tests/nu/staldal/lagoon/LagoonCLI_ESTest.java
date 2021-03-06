/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:47:22 GMT 2018
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "nu.staldal.lagoon.core.LagoonException";
      stringArray0[1] = "";
      stringArray0[2] = "build";
      stringArray0[3] = "sourceDir";
      stringArray0[4] = "E/cj`&+Y/C";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray1 = new String[4];
      stringArray1[0] = "";
      stringArray1[1] = "E/cj`&+Y/C";
      stringArray1[2] = "nu.staldal.lagoon.core.LagoonException";
      stringArray1[3] = "nu.staldal.lagoon.core.LagoonException";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      String[] stringArray2 = new String[0];
      LagoonCLI.main(stringArray2);
      assertEquals(0, stringArray2.length);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "I/O error: ";
      stringArray0[1] = "6";
      stringArray0[2] = "_f";
      stringArray0[3] = "'";
      stringArray0[4] = "hl+";
      stringArray0[5] = "PAQ\"J@q_`Luo3.sitemap";
      stringArray0[6] = "2_nS";
      stringArray0[7] = "}-'%k] ,m.M";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[8];
      stringArray1[0] = "org.apache.log.output.io.rotate.BaseFileNameFilter";
      stringArray1[1] = "I/O error: ";
      stringArray1[2] = "Omv__mkLJ81";
      stringArray1[3] = "org.apache.log.output.io.rotate.BaseFileNameFilter";
      stringArray1[4] = "VUtH]kB&k";
      stringArray1[6] = "g]*(*8uYC";
      stringArray1[7] = "~Xpm^<O<5JC.z`d";
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[2];
      stringArray2[0] = "/Qc9d2_nS";
      stringArray2[1] = "force";
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray2);
      assertNotSame(stringArray2, stringArray0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "jm,eUvcLGr'Q";
      stringArray0[1] = "PAQ\"J@q_`Luo3.xml";
      stringArray0[2] = "?'cQ}Ckz";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[7];
      stringArray1[0] = "-";
      stringArray1[1] = "build";
      stringArray1[2] = "force";
      stringArray1[3] = "-";
      stringArray1[4] = "-";
      stringArray1[5] = "-";
      stringArray1[6] = "-";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "~Xpm^<O<5JC.z`d";
      stringArray0[1] = "-";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("~Xpm^<O<5JC.z`d");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "-");
      stringArray0[2] = "-";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "~Xpm^<O<5JC.z`d";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray1);
      assertNotSame(stringArray1, stringArray0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("~Xpm^<O<5JC.z`d");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "-");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "~Xpm^<O<5JC.z`d";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "h:?]";
      stringArray0[1] = "i$B~=k(c=S";
      stringArray0[2] = "[.FYph;pFw%";
      stringArray0[3] = "~Xpm^<O<5JC.z`d.sitemap";
      stringArray0[4] = " s";
      stringArray0[5] = "Exiting Lagoon...";
      stringArray0[6] = "";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[7];
      stringArray1[0] = "build";
      stringArray1[1] = "u:f^!<";
      stringArray1[2] = "&FnQR3[am_H0E";
      stringArray1[3] = "org.apache.log.output.io.rotate.BaseFileNameFilter";
      stringArray1[4] = " ms";
      stringArray1[5] = "g]*(*8uYC";
      stringArray1[6] = "?";
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[1];
      stringArray2[0] = "6.xml";
      LagoonCLI.main(stringArray2);
      String[] stringArray3 = new String[8];
      stringArray3[1] = "6";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Lagoon initialized successfully");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray3);
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
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[3];
      stringArray0[0] = ";o.sitemap";
      stringArray0[1] = "6";
      stringArray0[2] = "%gicpG!pRFt-:qwj[";
      LagoonCLI.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }
}
