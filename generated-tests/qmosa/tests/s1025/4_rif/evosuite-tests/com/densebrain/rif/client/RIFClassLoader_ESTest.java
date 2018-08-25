/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:40:19 GMT 2018
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
      String string0 = "{`]";
      rIFClassLoader0.getParent();
      ClassLoader.getSystemClassLoader();
      String string1 = "";
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setPackageAssertionStatus("", true);
      rIFClassLoader0.findClass("{`]");
      byte[] byteArray0 = new byte[4];
      rIFClassLoader0.getParent();
      byteArray0[0] = (byte)51;
      rIFClassLoader0.setDefaultAssertionStatus(false);
      byte byte0 = (byte)124;
      byteArray0[1] = (byte)124;
      byte byte1 = (byte) (-1);
      byteArray0[2] = (byte) (-1);
      byte byte2 = (byte)1;
      byteArray0[3] = (byte)1;
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("{`]", byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }
}