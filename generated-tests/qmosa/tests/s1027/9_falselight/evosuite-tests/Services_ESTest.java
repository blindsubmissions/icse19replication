/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:12:04 GMT 2018
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      services_SIMPLE_Result0.reset();
      Services.SIMPLE_Result services_SIMPLE_Result1 = Services.testPOP3("", (-3739));
      services_SIMPLE_Result1.reset();
      services_SIMPLE_Result0.reset();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://:2238");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      Services services0 = new Services();
      services_SIMPLE_Result1.works = false;
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("", (-3739));
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : **URL Mal Form\u00E9** (java.net.MalformedURLException: Invalid port number :-3739) **.\n****", string0);
      
      Services.SIMPLE_Result services_SIMPLE_Result2 = Services.testSMTP("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : **URL Mal Form\u00E9** (java.net.MalformedURLException: Invalid port number :-3739) **.\n****", (-3739));
      services_HTTP_Result0.reset();
      Services.HTTP_Result services_HTTP_Result1 = new Services.HTTP_Result();
      services_HTTP_Result1.time = (-2588L);
      services_SIMPLE_Result2.reset();
      services_HTTP_Result1.reset();
      assertEquals(0L, services_HTTP_Result1.time);
      assertFalse(services_HTTP_Result1.works);
      assertEquals(0, services_HTTP_Result1.code);
      assertEquals(0, services_HTTP_Result1.page_weight);
      
      services_HTTP_Result0.toString();
      Services.testSMTP(".", 583);
      String string1 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string1);
      
      services_HTTP_Result0.toString();
      Services.testPOP3("", 2238);
      Services.SIMPLE_Result services_SIMPLE_Result3 = new Services.SIMPLE_Result();
      String string2 = services_SIMPLE_Result3.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string2);
      
      Services.HTTP_Result services_HTTP_Result2 = Services.testHTTPS("", 2238);
      assertTrue(services_HTTP_Result2.works);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://:2238");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "z]HPVzTd");
      Services services0 = new Services();
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("w:q=Th1", 333);
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      services_SIMPLE_Result0.reset();
      Services.testSMTP("$,B8", 0);
      Services.testHTTPS("", 2238);
      System.setCurrentTimeMillis((-2051L));
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("**** Resultat : \n** Fonctionnement : ", 0);
      services_SIMPLE_Result0.reset();
      services_SIMPLE_Result0.reset();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      Services services0 = new Services();
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("", 0);
      assertEquals((-1), services_HTTP_Result0.code);
      
      services_HTTP_Result0.reset();
      services_SIMPLE_Result0.reset();
      services_HTTP_Result0.reset();
      services_HTTP_Result0.toString();
      Services.SIMPLE_Result services_SIMPLE_Result1 = Services.testSMTP("**** Resultat : \n** Fonctionnement : ", 0);
      services_SIMPLE_Result1.toString();
      services_HTTP_Result0.toString();
      Services.SIMPLE_Result services_SIMPLE_Result2 = new Services.SIMPLE_Result();
      Services.SIMPLE_Result services_SIMPLE_Result3 = new Services.SIMPLE_Result();
      services_SIMPLE_Result3.toString();
      Services.testHTTPS("", 2238);
      Services.testSMTP("", 0);
      Services.SIMPLE_Result services_SIMPLE_Result4 = Services.testSMTP("", 0);
      assertEquals(0L, services_SIMPLE_Result4.time);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)75;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte) (-17);
      byteArray0[6] = (byte) (-105);
      byteArray0[7] = (byte)13;
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      services_SIMPLE_Result0.reset();
      Services.SIMPLE_Result services_SIMPLE_Result1 = Services.testPOP3("", (-3739));
      services_SIMPLE_Result1.reset();
      services_SIMPLE_Result0.reset();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "s");
      Services services0 = new Services();
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("", 0);
      services_HTTP_Result0.reset();
      services_SIMPLE_Result0.reset();
      services_HTTP_Result0.reset();
      services_SIMPLE_Result0.toString();
      Services.SIMPLE_Result services_SIMPLE_Result2 = Services.testSMTP("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", 0);
      services_SIMPLE_Result2.toString();
      services_SIMPLE_Result1.toString();
      Services.SIMPLE_Result services_SIMPLE_Result3 = Services.testPOP3("0G", 62);
      services_SIMPLE_Result3.toString();
      Services.testHTTPS("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur d'E/S** (java.io.IOException: Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@2b34594c) **.\n****", 0);
      Services.testPOP3("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur d'E/S** (java.io.IOException: Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@2b34648f) **.\n****", 0);
      Services.testSMTP("", 0);
      System.setCurrentTimeMillis((-1865L));
  }
}
