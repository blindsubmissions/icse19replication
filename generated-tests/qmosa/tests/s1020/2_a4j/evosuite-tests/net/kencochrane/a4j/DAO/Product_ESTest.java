/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:18:01 GMT 2018
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
      product0.getProduct("#=4R%J;ep,Q-", "M", "M");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/#=4R%J;EP,Q-_#=4R%J;EP,Q-_HEAVY_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "M");
      product0.getProduct("r", "'py'*h", "r");
      product0.getProduct("#=4R%J;ep,Q-", "#=4R%J;ep,Q-", "");
      FullProduct fullProduct0 = product0.getProduct("", "{%nkiycq<vQ<k)8O5F", "{%nkiycq<vQ<k)8O5F");
      assertNull(fullProduct0);
  }
}
