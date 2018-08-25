/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:47:21 GMT 2018
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/<M>\\_6ODUO$H#C5#. &TX.W_HEAVY_1#4}UJ)`K,N<8Z.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "DZrb}RK}*BF<%");
      product0.getProduct("I] _QHu_jL&hYSq", " t_MY?*", "'b(QrOc&|9y#U-");
      product0.getProduct("<M>", "6odUo$H#C5#. &tX.w", "1#4}uj)`K,n<8Z");
      product0.getProduct("", "net.kencochrane.a4j.beans.BrowseList", "");
      product0.getProduct("97Y}lCY6F", "<M>", "97Y}lCY6F");
      product0.getProduct("", "", (String) null);
      product0.getProduct("", "I] _QHu_jL&hYSq", "");
      product0.getProduct("'b(QrOc&|9y#U-", ";0..Y;;EDr\"R5=!", "}._y)lsUcEgX9)");
      FullProduct fullProduct0 = product0.getProduct(";0..Y;;EDr\"R5=!", "", "cacheDir");
      assertNull(fullProduct0);
  }
}