/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:02:09 GMT 2018
 */

package com.liferay.portal.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.events.ServicePreAction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ServicePreAction_ESTest extends ServicePreAction_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServicePreAction servicePreAction0 = null;
      try {
        servicePreAction0 = new ServicePreAction();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.liferay.portal.util.PropsValues
         //
         verifyException("com.liferay.portal.events.ServicePreAction", e);
      }
  }
}
