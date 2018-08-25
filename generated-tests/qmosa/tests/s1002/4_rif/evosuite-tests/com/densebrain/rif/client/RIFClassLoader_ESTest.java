/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:07:31 GMT 2018
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
      rIFClassLoader0.getParent();
      rIFClassLoader0.getParent();
      String string0 = "";
      rIFClassLoader0.findClass("");
      String string1 = "=`92cl";
      ClassLoader.getSystemClassLoader();
      rIFClassLoader0.setPackageAssertionStatus("=`92cl", false);
      ClassLoader.getSystemClassLoader();
      String string2 = "";
      rIFClassLoader0.getParent();
      rIFClassLoader0.findClass("");
      byte[] byteArray0 = new byte[1];
      rIFClassLoader0.getParent();
      byte byte0 = (byte) (-53);
      rIFClassLoader0.clearAssertionStatus();
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("", byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }
}