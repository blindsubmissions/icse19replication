/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:29:18 GMT 2018
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/KLN\\$RILP$,;)3W&]2_KLN\\$RILP$,;)3W&]2_HEAVY_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "UKB.Gc/W.86}ZOk<");
      product0.getProduct("kln$rIlp$,;)3W&]2", "kln$rIlp$,;)3W&]2", "");
      FullProduct fullProduct0 = product0.getProduct("", "UR$R:3$2=?_m>i|]$q", "");
      assertNull(fullProduct0);
  }
}
