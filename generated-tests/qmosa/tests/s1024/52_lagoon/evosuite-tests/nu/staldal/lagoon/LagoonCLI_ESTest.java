/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:36:01 GMT 2018
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
      String[] stringArray0 = new String[0];
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[9];
      stringArray1[0] = "}l$-_C<Y8EC";
      stringArray1[1] = "z{s<nA}wy(.<%#l9A";
      stringArray1[2] = "vi\"C%dgc&\\H";
      stringArray1[3] = "nu.staldal.lagoon.core.AuthenticationException";
      stringArray1[4] = "8&z%d";
      stringArray1[5] = "nu.staldal.lagoon.core.LagoonException";
      stringArray1[6] = "";
      stringArray1[7] = "&iv^ 4_z,5RQgFusnn";
      stringArray1[8] = "";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray2 = new String[6];
      stringArray2[0] = "}l$-_C<Y8EC";
      stringArray2[1] = "";
      stringArray2[2] = "z{s<nA}wy(.<%#l9A";
      stringArray2[3] = "z{s<nA}wy(.<%#l9A";
      stringArray2[4] = "";
      stringArray2[5] = "8&z%d";
      LagoonCLI.main(stringArray2);
      assertFalse(stringArray2.equals((Object)stringArray0));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("nu.staldal.lagoon.core.AuthenticationException");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-21);
      byteArray0[1] = (byte)25;
      byteArray0[2] = (byte)21;
      byteArray0[3] = (byte)50;
      byteArray0[4] = (byte) (-89);
      byteArray0[5] = (byte) (-29);
      byteArray0[6] = (byte)3;
      byteArray0[7] = (byte)109;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      stringArray0[0] = "nu.staldal.lagoon.core.AuthenticationException";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[4];
      String string0 = ".xml";
      stringArray0[1] = "Lagoon initialized successfully";
      stringArray0[2] = "";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI lagoonCLI1 = new LagoonCLI();
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[4];
      stringArray1[0] = "Lagoon initialized successfully";
      String string1 = "7";
      stringArray1[1] = "7";
      stringArray1[2] = ".xml";
      stringArray1[3] = "Lagoon initialized successfully";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      LagoonCLI lagoonCLI2 = new LagoonCLI();
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

  /**
  //Test case number: 3
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Password is required but not specified.xml";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[6];
      stringArray1[0] = "Password is required but not specified";
      stringArray1[1] = "7xP'w";
      stringArray1[2] = "L+-hAI<(%coe*Vzg)";
      stringArray1[3] = "";
      stringArray1[4] = "F:qe-?#";
      stringArray1[5] = "qhToKgoHsJ:@P}G";
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[1];
      LagoonCLI.main(stringArray0);
      stringArray2[0] = "OoF<\"$sv'LJP7|+/$";
      LagoonCLI.main(stringArray2);
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

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".sitemap";
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
      String[] stringArray0 = new String[1];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("nu.staldal.lagoon.core.AuthenticationException");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-21);
      byteArray0[1] = (byte) (-21);
      byteArray0[2] = (byte)21;
      byteArray0[4] = (byte)21;
      byteArray0[5] = (byte) (-29);
      byteArray0[6] = (byte)3;
      byteArray0[7] = (byte)109;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      stringArray0[0] = "nu.staldal.lagoon.core.AuthenticationException";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[6];
      stringArray1[0] = "nu.staldal.lagoon.core.AuthenticationException";
      stringArray1[1] = "nu.staldal.lagoon.core.AuthenticationException";
      stringArray1[2] = "nu.staldal.lagoon.core.AuthenticationException";
      stringArray1[3] = "nu.staldal.lagoon.core.AuthenticationException";
      stringArray1[4] = "nu.staldal.lagoon.core.AuthenticationException";
      stringArray1[5] = "nu.staldal.lagoon.core.AuthenticationException";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "PHZ5^t;y#~'WXC$";
      stringArray0[1] = "build";
      stringArray0[2] = "]2,NA%8+P&g";
      stringArray0[3] = "5 l6l\"5LFK5K4v =.xml";
      stringArray0[4] = "LocalName may not be null";
      stringArray0[5] = "VAv@dba-+/O+!B!";
      stringArray0[6] = "A@R/";
      stringArray0[7] = "C";
      stringArray0[8] = "Element expected";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "ddt;e35w";
      stringArray0[1] = "force";
      stringArray0[2] = "R7yEnV:Z[:!UdH";
      stringArray0[3] = "!oAJD.sitemap";
      stringArray0[4] = "Syntax:\nnu.staldal.lagoon.LagoonCLI <property_file> [<interval>|buil|force\nnu.staldal.lagoon.LagoonCLI <sitemav_file> [~interval>|build|force].xml";
      stringArray0[5] = "kN5Xc";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[8];
      stringArray1[0] = "$\"N@m";
      stringArray1[1] = "^D~`tAm{QlEt])LS'";
      stringArray1[2] = "}O`+";
      stringArray1[3] = "!oAJD.xml";
      stringArray1[4] = "Syntax:\nnu.staldal.lagoon.LagoonCLI <property_file> [<interval>|buil|force\nnu.staldal.lagoon.LagoonCLI <sitemav_file> [~interval>|build|force].sitemap";
      stringArray1[5] = "space";
      stringArray1[6] = "O-k'*~6es('R=";
      stringArray1[7] = "7.xml";
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[15];
      stringArray2[1] = "7";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
