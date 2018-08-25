/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:45:42 GMT 2018
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
      String string0 = "";
      byte[] byteArray0 = new byte[4];
      ClassLoader.getSystemClassLoader();
      ClassLoader.getSystemClassLoader();
      boolean boolean0 = false;
      rIFClassLoader0.setDefaultAssertionStatus(false);
      byteArray0[0] = (byte)1;
      rIFClassLoader0.getParent();
      byteArray0[1] = (byte) (-69);
      byteArray0[2] = (byte)1;
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("f)c~<~*IX#?", byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      Class<?> class0 = rIFClassLoader0.findClass("");
      assertNull(class0);
  }
}