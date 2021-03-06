/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:59:48 GMT 2018
 */

package nu.staldal.lagoon;

import org.junit.Test;
import static org.junit.Assert.*;
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ready";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[4];
      stringArray1[0] = "oD~<g06rgf<";
      stringArray1[1] = "";
      stringArray1[2] = "%hVIf|SzhSi6";
      stringArray1[3] = "";
      LagoonCLI.main(stringArray1);
      assertNotSame(stringArray1, stringArray0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "File not found: ";
      stringArray0[1] = "targetURL";
      stringArray0[2] = "`B]rg ";
      stringArray0[3] = "";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[7];
      stringArray1[0] = "";
      stringArray1[1] = "oW=PjBc5t?V#LIKR";
      stringArray1[2] = "nu.staldal.lagoon.core.LagoonException";
      stringArray1[3] = "bNp,E%S@<g7Y%p";
      stringArray1[4] = ",*MlCHcS";
      stringArray1[5] = "";
      stringArray1[6] = "nu.staldal.lagoon.core.AuthenticationException";
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[4];
      stringArray2[0] = "targetURL";
      stringArray2[1] = "}CYzHW-";
      stringArray2[2] = "";
      stringArray2[3] = "^SJZqET|'\">mm";
      LagoonCLI.main(stringArray2);
      String[] stringArray3 = new String[0];
      LagoonCLI.main(stringArray3);
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray3);
      LagoonCLI.main(stringArray1);
      assertEquals(7, stringArray1.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[2];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("CKTZ4'<7");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "2");
      stringArray0[0] = "CKTZ4'<7";
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      stringArray0[1] = "2";
      LagoonCLI.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "z,9$b.-=fWu(wOfhGf.xml";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[7];
      stringArray1[0] = "org.apache.log.output.io.rotate.BaseFileNameFilter";
      stringArray1[1] = "org.apache.log.output.io.rotate.BaseFileNameFilter";
      stringArray1[2] = "sitemapFile";
      stringArray1[3] = "R=.wY5K*C";
      stringArray1[4] = "S+9@.xt%`(mm";
      stringArray1[5] = "]8d'.'&@";
      stringArray1[6] = ".qml.sitemap";
      LagoonCLI.main(stringArray1);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      assertNotSame(stringArray1, stringArray0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ready.sitemap";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Incorrect password");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "}");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Incorrect password";
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Incorrect password");
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[8];
      stringArray1[0] = "}";
      stringArray1[1] = "force";
      stringArray1[2] = "Zq_5J&~_c4pegbp4'>";
      stringArray1[3] = "}";
      stringArray1[4] = "Incorrect password";
      stringArray1[5] = "Incorrect password";
      stringArray1[6] = "Incorrect password";
      stringArray1[7] = "Incorrect password";
      LagoonCLI.main(stringArray1);
      assertEquals(8, stringArray1.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "QMNh51q>akcgeSQpJ";
      stringArray0[1] = "build";
      stringArray0[2] = "z,9$b.-=fWu(wOfhGf.xml.xml";
      stringArray0[3] = "force";
      stringArray0[4] = "org.apache.log.output.io.rotate.BaseFileNameFilter";
      stringArray0[5] = "Error while initializing Lagoon:";
      stringArray0[6] = "_ae8Sh}t<IVON`-";
      stringArray0[7] = "E(.|xs";
      stringArray0[8] = "M;s}:1,,B3qD>KP)";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[4];
      stringArray1[0] = "m'7 q((KX{z";
      stringArray1[1] = "8:C{C";
      stringArray1[2] = "Ready";
      stringArray1[3] = "juOs3;@$C{u";
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[2];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("CKTZ4'<7");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "2");
      stringArray2[0] = "CKTZ4'<7";
      stringArray2[1] = "2";
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray2);
      assertNotSame(stringArray2, stringArray1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = ";9";
      stringArray0[1] = "-84";
      stringArray0[2] = "r&04N>'T<";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[9];
      stringArray1[0] = "r&04N>'T<";
      stringArray1[1] = "r&04N>'T<";
      stringArray1[2] = "r&04N>'T<";
      stringArray1[3] = "r&04N>'T<";
      stringArray1[4] = "nu.staldal.xtree.ProcessingInstruction";
      stringArray1[5] = "r&04N>'T<";
      stringArray1[6] = "r&04N>'T<";
      stringArray1[7] = "-84";
      stringArray1[8] = "r&04N>'T<";
      LagoonCLI.main(stringArray1);
      assertNotSame(stringArray1, stringArray0);
  }
}
