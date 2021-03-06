/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:44:28 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
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
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS((String) null, 1);
      services_HTTP_Result0.page_weight = 1;
      services_HTTP_Result0.page_weight = 0;
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur : java.lang.NullPointerException**.\n****", string0);
      
      services_HTTP_Result0.works = false;
      services_HTTP_Result0.reset();
      assertEquals(0, services_HTTP_Result0.page_weight);
      
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", (-1960));
      Services services0 = new Services();
      String string1 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur : java.lang.IllegalArgumentException: port out of range:-1960**.\n****", string1);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Services.testSMTP((String) null, 2403);
      Services.testHTTPS(") **", 1);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://&q29:455");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "l]S-Rf6cuUyW");
      Services.testSMTP("-Js#'C5+r", 0);
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("&q29", 455);
      services_HTTP_Result0.toString();
      Services.testPOP3("**Erreur d'E/S** (org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: ) **) **", 579);
      Services.testHTTPS("ly>rn-70Ga", 1002);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP(") **", 583);
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur d'E/S** (org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: ) **) **.\n****", string0);
      
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "Qml^c");
      services_HTTP_Result0.Error = ") **";
      Services.testSMTP(") **", 0);
      Services.testHTTPS(") **", 0);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://Qml^c:583");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Qml^c");
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTP(") **", 583);
      services_HTTP_Result1.works = false;
      services_HTTP_Result0.time = 0L;
      services_HTTP_Result1.Error = "Qml^c";
      System.setCurrentTimeMillis(1L);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("Qml^c", 583);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
      
      System.setCurrentTimeMillis(0L);
      Services.HTTP_Result services_HTTP_Result2 = Services.testHTTPS("Qml^c", 583);
      assertEquals(6, services_HTTP_Result2.page_weight);
      assertTrue(services_HTTP_Result2.works);
  }
}
