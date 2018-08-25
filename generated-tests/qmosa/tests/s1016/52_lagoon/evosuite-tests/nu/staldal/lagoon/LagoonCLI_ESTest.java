/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:21:49 GMT 2018
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
      String[] stringArray0 = new String[2];
      stringArray0[0] = "t@%]+X>s,jn[~+>0>W";
      stringArray0[1] = "Ym={Z~9ZVqeL";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[0];
      LagoonCLI.main(stringArray1);
      assertEquals(0, stringArray1.length);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "4t/;/*I=A+t:30dnH%.sitemap";
      stringArray0[0] = "4t/;/*I=A+t:30dnH%.sitemap";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "http://xml.org/sax/features/namespaces";
      stringArray0[1] = "dnH%";
      stringArray0[2] = "///";
      stringArray0[3] = "s}dahA?*";
      stringArray0[4] = "I/O error: ";
      stringArray0[5] = "Attribute ";
      stringArray0[6] = "VIK&QS";
      stringArray0[7] = "jX56K#:(c}~Iq}Lq]}";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "nu.staldal.lagoon.core.AuthenticationException";
      LagoonCLI.main(stringArray1);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("nu.staldal.lagoon.core.AuthenticationException");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)84;
      byteArray0[1] = (byte) (-28);
      byteArray0[2] = (byte)125;
      byteArray0[3] = (byte) (-31);
      byteArray0[4] = (byte)121;
      byteArray0[5] = (byte)100;
      byteArray0[6] = (byte) (-46);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String[] stringArray2 = new String[4];
      stringArray2[1] = "Ready";
      stringArray2[2] = "";
      LagoonCLI.main(stringArray2);
      LagoonCLI.main(stringArray1);
      assertEquals(1, stringArray1.length);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "nu.staldal.lagoon.core.AuthenticationException.xml";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "W\">DL H)");
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[4];
      stringArray1[0] = "nu.staldal.lagoon.core.AuthenticationException.xml";
      stringArray1[1] = "nu.staldal.lagoon.core.AuthenticationException.xml";
      stringArray1[2] = "nu.staldal.lagoon.core.AuthenticationException.xml";
      stringArray1[3] = "nu.staldal.lagoon.core.AuthenticationException.xml";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" ms");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " pBOC^30");
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[0] = " ms";
      LagoonCLI.main(stringArray0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-126);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-6);
      byteArray0[3] = (byte) (-24);
      byteArray0[4] = (byte) (-32);
      byteArray0[5] = (byte) (-53);
      byteArray0[6] = (byte)110;
      byteArray0[7] = (byte)70;
      byteArray0[8] = (byte)17;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
}
