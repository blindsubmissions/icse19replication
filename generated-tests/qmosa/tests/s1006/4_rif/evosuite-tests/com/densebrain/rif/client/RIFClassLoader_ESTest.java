/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:12:54 GMT 2018
 */

package com.densebrain.rif.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.densebrain.rif.client.RIFClassLoader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RIFClassLoader_ESTest extends RIFClassLoader_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      String string0 = "uG!";
      rIFClassLoader0.findClass("uG!");
      rIFClassLoader0.clearAssertionStatus();
      String string1 = "[Ex%:`<";
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      rIFClassLoader0.setDefaultAssertionStatus(false);
      rIFClassLoader0.setPackageAssertionStatus("", false);
      rIFClassLoader0.setPackageAssertionStatus("&a?ll5", false);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-119);
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("[Ex%:`<", byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }
}
