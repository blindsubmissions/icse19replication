/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:52:09 GMT 2018
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/>LGZYP~5J8V=P1KTZ_8&YWQW+~P{QD3CR'Z_HEAVY_8&YWQW+~P{QD3CR'Z.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      product0.getProduct(">LGzYP~5J8V=p1Ktz", "8&ywqw+~p{qD3cr'z", "8&ywqw+~p{qD3cr'z");
      FullProduct fullProduct0 = product0.getProduct(">LGzYP~5J8V=p1Ktz", "nX_'JPp_B%", "=(v\".'!*oDF<f");
      assertNull(fullProduct0);
  }
}
