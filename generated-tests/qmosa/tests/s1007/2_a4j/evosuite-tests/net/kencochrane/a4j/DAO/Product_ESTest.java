/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:40:46 GMT 2018
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/L2_PJ_AGE GROUP - _HEAVY_AGE GROUP - .XML");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-97);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)23;
      byteArray0[3] = (byte)95;
      byteArray0[4] = (byte) (-57);
      byteArray0[5] = (byte)125;
      byteArray0[6] = (byte) (-1);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, (String) null);
      byteArray0[7] = (byte)0;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      Product product0 = new Product();
      product0.getProduct("}VxE", "Age Group - ", "}VxE");
      FullProduct fullProduct0 = product0.getProduct("L2_Pj", "Age Group - ", "Age Group - ");
      assertNotNull(fullProduct0);
  }
}
