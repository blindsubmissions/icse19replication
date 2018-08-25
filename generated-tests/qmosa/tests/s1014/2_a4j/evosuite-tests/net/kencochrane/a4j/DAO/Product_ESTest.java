/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:36:32 GMT 2018
 */

package net.kencochrane.a4j.DAO;

import org.junit.Test;
import static org.junit.Assert.*;
import net.kencochrane.a4j.DAO.Product;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Product_ESTest extends Product_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Product product0 = new Product();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/I0_I0_HEAVY_I0.XML");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-47);
      byteArray0[5] = (byte) (-27);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      product0.getProduct("", "G;z@J%b%", "");
      product0.getProduct("i0", "i0", "Reading Level - ");
      product0.getProduct("i0", "i0", "D.)dSekJ");
      product0.getProduct("i0", "i0", "i0");
      product0.getProduct("D.)dSekJ", "i0", "D.)dSekJ");
      product0.getProduct("Reading Level - ", "i0", "Reading Level - ");
      System.setCurrentTimeMillis((-1L));
  }
}
