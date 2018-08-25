/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:02:46 GMT 2018
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
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "nu.staldal.lagoon.core.AuthenticationMissingException";
      stringArray0[1] = "f,RO3_- ";
      stringArray0[2] = "<2jXu};P~ih^m";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "";
      stringArray1[1] = "";
      stringArray1[2] = "W%";
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[0];
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray2);
      assertFalse(stringArray2.equals((Object)stringArray1));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "ia";
      stringArray0[1] = "+4Hg#sV6";
      stringArray0[2] = "O(52fHH.v+QWEEC";
      stringArray0[3] = "nu.staldal.lagoon.core.LagoonException";
      stringArray0[4] = "nu.staldal.lagoon.core.LagoonException";
      stringArray0[5] = "I/O error: ";
      stringArray0[6] = "force";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[5];
      stringArray1[0] = "st";
      stringArray1[1] = ".sitemap";
      stringArray1[2] = "";
      stringArray1[3] = "D~,";
      stringArray1[4] = "";
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[1];
      stringArray2[0] = "user.dir";
      LagoonCLI.main(stringArray2);
      String[] stringArray3 = new String[6];
      stringArray3[0] = " not specified";
      stringArray3[1] = "nu.staldal.lagoon.core.AuthenticationMissingException";
      stringArray3[2] = "";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("user.dir");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "user.dir");
      stringArray3[3] = "nu.staldal.lagoon.core.LagoonException";
      stringArray3[4] = "Initializing Lagoon...";
      stringArray3[5] = "c{h-I&8Bv78;:$b";
      LagoonCLI.main(stringArray3);
      LagoonCLI.main(stringArray2);
      assertEquals(1, stringArray2.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "ia";
      stringArray0[1] = "+4Hg#sV6";
      stringArray0[3] = "nu.staldal.lagoon.core.LagoonException";
      stringArray0[4] = "nu.staldal.lagoon.core.LagoonException";
      stringArray0[5] = "I/O error: ";
      stringArray0[6] = "force";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[5];
      stringArray1[0] = "st";
      stringArray1[1] = ".sitemap";
      stringArray1[2] = "";
      stringArray1[3] = "D~,";
      stringArray1[4] = "";
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[1];
      stringArray2[0] = ".sitemap";
      LagoonCLI.main(stringArray2);
      String[] stringArray3 = new String[6];
      stringArray3[0] = " not specified";
      stringArray3[1] = "nu.staldal.lagoon.core.AuthenticationMissingException";
      stringArray3[2] = "";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("user.dir");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".sitemap");
      stringArray3[3] = "nu.staldal.lagoon.core.LagoonException";
      stringArray3[4] = "Initializing Lagoon...";
      stringArray3[5] = "nu.staldal.lagoon.core.AuthenticationMissingException";
      LagoonCLI.main(stringArray3);
      LagoonCLI.main(stringArray2);
      assertFalse(stringArray2.equals((Object)stringArray1));
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "build";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[0];
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      String[] stringArray2 = new String[8];
      stringArray2[0] = "build";
      stringArray2[1] = "build";
      stringArray2[2] = "xZx";
      stringArray2[3] = "build";
      stringArray2[4] = "build";
      stringArray2[5] = "build";
      stringArray2[6] = "build";
      stringArray2[7] = "build";
      LagoonCLI.main(stringArray2);
      assertEquals(8, stringArray2.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "build.xml";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      assertFalse(stringArray0.equals((Object)stringArray1));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[6];
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)91;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      stringArray0[0] = ".dir";
      stringArray0[1] = "7";
      stringArray0[2] = "O0PAHsfrYS?R}qsrQP";
      stringArray0[3] = "/F-\"rA.K<<5}1";
      stringArray0[4] = "nu.staldal.xtree.Element";
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      stringArray0[5] = "build.xml";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("L?{*B C6JwB6");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "1rDF!Y4N+v#co3xI&d");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "1rDF!Y4N+v#co3xI&d";
      stringArray0[1] = "L?{*B C6JwB6";
      stringArray0[2] = "1rDF!Y4N+v#co3xI&d";
      stringArray0[3] = "L?{*B C6JwB6";
      stringArray0[4] = "1rDF!Y4N+v#co3xI&d";
      stringArray0[5] = "L?{*B C6JwB6";
      stringArray0[6] = "1rDF!Y4N+v#co3xI&d";
      stringArray0[7] = "1rDF!Y4N+v#co3xI&d";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "1rDF!Y4N+v#co3xI&d");
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "L?{*B C6JwB6";
      LagoonCLI.main(stringArray1);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-M(0HZ&h_J=\\Y+";
      stringArray0[1] = "force";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = null;
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      // Undeclared exception!
      try { 
        LagoonCLI.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nu.staldal.lagoon.LagoonCLI", e);
      }
  }
}