/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 05:33:32 GMT 2018
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      ClassLoader.getSystemClassLoader();
      rIFClassLoader0.findClass("4h$(If,");
      Class<?> class0 = rIFClassLoader0.findClass("4h$(If,");
      assertNull(class0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      rIFClassLoader0.getParent();
      byte[] byteArray0 = new byte[1];
      rIFClassLoader0.setClassAssertionStatus("", false);
      byteArray0[0] = (byte)1;
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("", byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }
}
