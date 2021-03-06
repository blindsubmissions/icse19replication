/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:06:02 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      services_SIMPLE_Result0.works = true;
      services_SIMPLE_Result0.toString();
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("KJ", 1745);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "KJ");
      services_HTTP_Result0.Error = "";
      services_HTTP_Result0.works = true;
      services_HTTP_Result0.code = (-3796);
      Services.SIMPLE_Result services_SIMPLE_Result1 = Services.testSMTP("", 1745);
      services_SIMPLE_Result1.Error = "";
      Services.testPOP3("KJ", 1726);
      Services.testPOP3("", (-3796));
      services_SIMPLE_Result1.works = false;
      Services.HTTP_Result services_HTTP_Result1 = new Services.HTTP_Result();
      Services.HTTP_Result services_HTTP_Result2 = new Services.HTTP_Result();
      Services.HTTP_Result services_HTTP_Result3 = Services.testHTTPS("", 0);
      Services.SIMPLE_Result services_SIMPLE_Result2 = new Services.SIMPLE_Result();
      services_HTTP_Result3.reset();
      services_HTTP_Result2.reset();
      Services.testHTTPS((String) null, (-3796));
      Services.testPOP3("", 0);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Services services0 = new Services();
      Services.testPOP3("PcWs", (-544));
      Services.testHTTPS("] eGZ{b2B$_o", (-771));
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "8|eW;+=,4\ny/m#|");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", 0);
      services_HTTP_Result0.toString();
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur d'E/S** (org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: ) **.\n****", string0);
      
      services_HTTP_Result0.reset();
      services_HTTP_Result0.Error = null;
      services_HTTP_Result0.toString();
      services_HTTP_Result0.toString();
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      services_HTTP_Result0.code = 0;
      services_SIMPLE_Result0.toString();
      Services.testPOP3("", 0);
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTP("", 0);
      assertTrue(services_HTTP_Result1.works);
      assertEquals(16, services_HTTP_Result1.page_weight);
      
      String string1 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string1);
      
      Services.testHTTPS("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur d'E/S** (org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: ) **.\n****", 0);
      services_SIMPLE_Result0.reset();
      Services.SIMPLE_Result services_SIMPLE_Result1 = Services.testSMTP("", (-483));
      assertEquals(0L, services_SIMPLE_Result1.time);
      assertFalse(services_SIMPLE_Result1.works);
  }
}
