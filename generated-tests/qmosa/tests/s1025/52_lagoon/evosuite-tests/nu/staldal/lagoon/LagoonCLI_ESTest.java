/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:47:55 GMT 2018
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = " not specified";
      stringArray0[2] = "=]vH";
      stringArray0[3] = "{`]";
      stringArray0[4] = "";
      stringArray0[5] = ".xml";
      stringArray0[6] = "";
      stringArray0[7] = "0#YaISck:rH+CL";
      stringArray0[8] = "nu.staldal.lagoon.core.AuthenticationMissingException";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[2];
      stringArray1[0] = "^]*]^4q$'l}tA.";
      stringArray1[1] = "ek/\"l9";
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = new String[0];
      LagoonCLI.main(stringArray2);
      assertFalse(stringArray2.equals((Object)stringArray0));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "c^p\"S6-H&vC";
      stringArray0[1] = "force";
      stringArray0[2] = "`3";
      stringArray0[3] = "T+&20K>";
      stringArray0[4] = "^8TdA:x;>8Rm@7Z";
      stringArray0[5] = "9']R\"Sv' ";
      stringArray0[6] = "W_*<W_57h8?x.%>8";
      stringArray0[7] = "";
      stringArray0[8] = "nu.staldal.lagoon.core.AuthenticationMissingException";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[6];
      String string0 = "SOK\\w1cI#t";
      stringArray1[0] = "SOKw1cI#t";
      String string1 = "}SfC1";
      stringArray1[1] = "}SfC1";
      String string2 = "RS-}\\:cMP/H";
      String string3 = "";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      String[] stringArray2 = null;
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
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      stringArray0[1] = "nu.staldal.lagoon.core.AuthenticationException";
      stringArray0[2] = "build";
      stringArray0[3] = "Blh*:{qs)1";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[4];
      stringArray1[0] = "build";
      stringArray1[1] = "build";
      stringArray1[2] = "Blh*:{qs)1";
      stringArray1[3] = "Blh*:{qs)1";
      LagoonCLI.main(stringArray1);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "e?4-Iu}K \"@I'4#";
      stringArray0[1] = "3";
      stringArray0[2] = "9^~mi.xml";
      stringArray0[3] = "yPB~qqpfv2N,k3,";
      stringArray0[4] = "[1;7";
      stringArray0[5] = "build";
      stringArray0[6] = "X57-";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "nu.staldal.lagoon.core.AuthenticationMissingException";
      LagoonCLI.main(stringArray1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray1);
      assertEquals(1, stringArray1.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)51;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)78;
      byteArray0[3] = (byte)72;
      byteArray0[4] = (byte)60;
      byteArray0[5] = (byte)1;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "shYJfl1.sitemap");
      stringArray0[0] = "shYJfl1.sitemap";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
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
  //Test case number: 5
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("9^~mi");
      String[] stringArray0 = new String[1];
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "9^~mi");
      stringArray0[0] = "9^~mi";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[1];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("M^}mi");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "base");
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[0] = "M^}mi";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "e?4-Iu}K \"@I'4#";
      stringArray0[1] = "3";
      stringArray0[2] = "9^~mi.xml";
      String[] stringArray1 = new String[6];
      stringArray1[0] = "yPB~qqpfv2N,k3,";
      stringArray1[1] = "kM_~kb;()d";
      stringArray1[2] = "e?4-Iu}K \"@I'4#";
      stringArray1[3] = "yPB~qqpfv2N,k3,";
      stringArray1[4] = "yPB~qqpfv2N,k3,";
      stringArray1[5] = "e?4-Iu}K \"@I'4#";
      LagoonCLI.main(stringArray1);
      LagoonCLI.main(stringArray0);
      String[] stringArray2 = new String[3];
      stringArray2[0] = "9^~mi.xml";
      stringArray2[1] = "3";
      stringArray2[2] = "9^~mi.xml";
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
}