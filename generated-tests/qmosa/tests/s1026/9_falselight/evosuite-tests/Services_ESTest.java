/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:50:12 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Services_ESTest extends Services_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", (-2319));
      services_HTTP_Result0.Error = null;
      services_HTTP_Result0.toString();
      services_HTTP_Result0.time = 0L;
      services_HTTP_Result0.code = 1390;
      services_HTTP_Result0.works = false;
      services_HTTP_Result0.toString();
      services_HTTP_Result0.Error = "https";
      Services.testSMTP("", 1390);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", (-3216));
      Services.testPOP3("", 1390);
      services_HTTP_Result0.toString();
      services_HTTP_Result0.reset();
      assertEquals(0, services_HTTP_Result0.code);
      
      String string0 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur : java.lang.IllegalArgumentException: port out of range:-3216**.\n****", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Services services0 = new Services();
      Services.testPOP3("2J+Jb{uC", 1);
      Services.testHTTPS("qc YY%", (-3635));
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP((String) null, (-130));
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTP("**Erreur d'E/S** (", (-2842));
      services_HTTP_Result0.Error = ".\n****";
      services_HTTP_Result1.time = 0L;
      Services.testHTTPS("**Erreur d'E/S** (", 0);
      Services.testHTTP("**Erreur d'E/S** (", 0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("**Erreur d'E/S** (", 0);
      Services.HTTP_Result services_HTTP_Result2 = Services.testHTTPS("a \"JyY-BIr,", 0);
      assertEquals(0L, services_HTTP_Result2.time);
      assertFalse(services_HTTP_Result2.works);
      assertEquals(0, services_HTTP_Result2.code);
      assertEquals(0, services_HTTP_Result2.page_weight);
      
      services_SIMPLE_Result0.reset();
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "i'<3 rw_a-mHb");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("", 0);
      assertTrue(services_HTTP_Result0.works);
      assertEquals(14, services_HTTP_Result0.page_weight);
      
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTP("", 449);
      assertEquals(0L, services_HTTP_Result1.time);
      assertEquals(0, services_HTTP_Result1.page_weight);
      assertFalse(services_HTTP_Result1.works);
      assertEquals(0, services_HTTP_Result1.code);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTPS("", 0);
      assertEquals((-1), services_HTTP_Result1.code);
      
      services_HTTP_Result1.reset();
      assertEquals(0L, services_HTTP_Result1.time);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "y[CuBSP");
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.code);
      
      EvoSuiteURL evoSuiteURL1 = new EvoSuiteURL("https://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL1, "");
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTPS("", 0);
      assertTrue(services_HTTP_Result1.works);
      assertEquals(8, services_HTTP_Result1.page_weight);
      
      NetworkHandling.createRemoteTextFile(evoSuiteURL1, (String) null);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", (-992));
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }
}