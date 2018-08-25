/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:34:45 GMT 2018
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
      ClassLoader.getSystemClassLoader();
      rIFClassLoader0.clearAssertionStatus();
      ClassLoader.getSystemClassLoader();
      rIFClassLoader0.setPackageAssertionStatus("5J\"qlZz+WIEr#0?KmN", false);
      String string0 = "";
      ClassLoader.getSystemClassLoader();
      rIFClassLoader0.findClass("");
      ClassLoader.getSystemClassLoader();
      rIFClassLoader0.setClassAssertionStatus("", true);
      byte[] byteArray0 = new byte[1];
      ClassLoader.getSystemClassLoader();
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setDefaultAssertionStatus(true);
      byteArray0[0] = (byte)32;
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("Z,G_@:d)u@sq", byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }
}
