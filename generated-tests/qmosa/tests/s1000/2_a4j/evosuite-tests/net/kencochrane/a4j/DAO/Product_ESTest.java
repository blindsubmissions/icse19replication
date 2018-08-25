/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:56:47 GMT 2018
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
      product0.getProduct("net.kencochrane.a4j.DAO.Product", (String) null, "net.kencochrane.a4j.DAO.Product");
      product0.getProduct("net.kencochrane.a4j.DAO.Product", (String) null, "7Kttk h'");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/HEAVY_HEAVY_HEAVY_YOT,YO.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "BZ%SiNI9");
      product0.getProduct("heavy", "", "");
      product0.getProduct("`O/vI`ewm7+GH\"[NE", "", "`O/vI`ewm7+GH\"[NE");
      product0.getProduct("", "", "heavy");
      FileSystemHandling.shouldAllThrowIOExceptions();
      product0.getProduct("heavy", "heavy", "yOt,yo");
      product0.getProduct("heavy", "$XAEd$_I'|$", "`O/vI`ewm7+GH\"[NE");
      product0.getProduct("yOt,yo", "$XAEd$_I'|$", "yOt,yo");
      product0.getProduct("yOt,yo", "3ox", "heavy");
      product0.getProduct("xS2*X[QLO?kPFEUwD=", "State = ", "State = ");
      product0.getProduct("t'Y`60(W<X", "V2[,\"Kjld12<H", "KZ8>E]>");
      FullProduct fullProduct0 = product0.getProduct((String) null, "0FtYfn1$08#D102CR", "]cb <~");
      assertNull(fullProduct0);
  }
}
