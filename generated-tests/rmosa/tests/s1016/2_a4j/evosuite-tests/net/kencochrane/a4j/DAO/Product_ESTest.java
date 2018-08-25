/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 12:24:57 GMT 2018
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/WQ=%VE~_J8W( 9RD7%UK=E6~YE_HEAVY_J8W( 9RD7%UK=E6~YE.XML");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      product0.getProduct("wq=%Ve~", "J8W( 9RD7%uK=e6~yE", "J8W( 9RD7%uK=e6~yE");
      FullProduct fullProduct0 = product0.getProduct("", "", "wq=%Ve~");
      assertNull(fullProduct0);
  }
}
