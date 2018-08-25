/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:13:35 GMT 2018
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Product product0 = new Product();
      product0.getProduct("3|3U]* 8of]", "4/L/jbl\bL%LK(eYPIu", "");
      product0.getProduct("", "M]^cO]zpgAA j", "");
      product0.getProduct("", "psXFfz@", "psXFfz@");
      product0.getProduct("4/L/jbl\bL%LK(eYPIu", "", "");
      product0.getProduct("0bqp]ivyKAbo2(kY", "M]^cO]zpgAA j", "j");
      product0.getProduct("heavy", "", "heavy");
      product0.getProduct("", "", "dX&");
      product0.getProduct("", "", "heavy");
      product0.getProduct("A(SXt4W4z{%zKh!IK", "A(SXt4W4z{%zKh!IK", "");
      product0.getProduct("", "j", "j");
      product0.getProduct("4/L/jbl\bL%LK(eYPIu", "", "4/L/jbl\bL%LK(eYPIu");
      product0.getProduct("heavy", "heavy", "0bqp]ivyKAbo2(kY");
      product0.getProduct("3|3U]* 8of]", "", (String) null);
      FullProduct fullProduct0 = product0.getProduct("", "0bqp]ivyKAbo2(kY", "# of productOffers = ");
      assertNull(fullProduct0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_@G2RSZ5Q8M\\4_HEAVY_+;Q%P.AN1U3Q~.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", "@G2rsZ5Q8m\u0004", "+;Q%p.An1u3Q~");
      assertNull(fullProduct0);
  }
}
