/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 14:36:40 GMT 2018
 */

package net.kencochrane.a4j.DAO;

import org.junit.Test;
import static org.junit.Assert.*;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.beans.FullProduct;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NET.KENCOCHRANE.A4J.DAO.PRODUCT_NET.KENCOCHRANE.A4J.DAO.PRODUCT_HEAVY_NET.KENCOCHRANE.A4J.DAO.PRODUCT.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Log file isn't there Setting default properties");
      product0.getProduct("Log file isn't there Setting default properties", "Log file isn't there Setting default properties", "Q6{");
      product0.getProduct("Log file isn't there Setting default properties", "Q6{", "Q6{");
      FullProduct fullProduct0 = product0.getProduct("net.kencochrane.a4j.DAO.Product", "net.kencochrane.a4j.DAO.Product", "net.kencochrane.a4j.DAO.Product");
      assertNotNull(fullProduct0);
  }
}
