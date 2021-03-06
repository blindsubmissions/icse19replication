/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:33:14 GMT 2018
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/U<S__HEAVY_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "*g'5--4DiR<r1ut-6W");
      product0.getProduct((String) null, (String) null, "");
      product0.getProduct((String) null, "C_S", "C_S");
      product0.getProduct((String) null, (String) null, (String) null);
      product0.getProduct("0f/0=uK=w<+", "Comments = ", "Comments = ");
      product0.getProduct("Comments = ", "0f/0=uK=w<+", "u<S");
      product0.getProduct((String) null, "u<S", "o5F>;:Q]");
      product0.getProduct("o5F>;:Q]", ":{4P`xa", "\f5\"QH%,_^C<0f(U");
      product0.getProduct("FHn\u0007Bec^", ")u.d?^tKlw\"Mc'g)Q>", (String) null);
      product0.getProduct("u<S", "", "");
      FullProduct fullProduct0 = product0.getProduct("-m=_5~#,z*Ny5Q)kB", "", "C_S");
      assertNull(fullProduct0);
  }
}
