/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:50:16 GMT 2018
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("**Erreur d'E/S** (", 2118);
      assertEquals(0, services_HTTP_Result0.page_weight);
      
      services_HTTP_Result0.time = (long) 2118;
      services_HTTP_Result0.page_weight = 2118;
      services_HTTP_Result0.toString();
      services_HTTP_Result0.code = (-1);
      Services.testHTTPS("**Erreur d'E/S** (org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: **Erreur d'E/S** () **", (-2615));
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("Services", 509);
      services_SIMPLE_Result0.Error = "";
      services_SIMPLE_Result0.time = (long) 2118;
      services_SIMPLE_Result0.reset();
      String string0 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3(",gvY", (-363));
      String string0 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur : java.lang.IllegalArgumentException: port out of range:-363**.\n****", string0);
      
      services_SIMPLE_Result0.works = false;
      services_SIMPLE_Result0.time = (-1801L);
      services_SIMPLE_Result0.reset();
      services_SIMPLE_Result0.Error = ",gvY";
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://8E47!PUq:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ",gvY");
      Services.testSMTP(",gvY", 976);
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", 1417);
      services_HTTP_Result0.reset();
      Services services0 = new Services();
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTPS("", 0);
      assertFalse(services_HTTP_Result1.works);
      assertEquals(0, services_HTTP_Result1.page_weight);
      assertEquals(0, services_HTTP_Result1.code);
      assertEquals(0L, services_HTTP_Result1.time);
      
      Services.testPOP3(",gvY", 0);
      Services.testPOP3("**Erreur d'E/S** (java.io.IOException: Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@5e690cf5) **", (-1));
      services_SIMPLE_Result0.reset();
      Services.testSMTP(",gvY", 0);
      Services.HTTP_Result services_HTTP_Result2 = Services.testHTTP("8E47!PUq", 0);
      assertTrue(services_HTTP_Result2.works);
      assertEquals(5, services_HTTP_Result2.page_weight);
      
      Services.testPOP3((String) null, (-1));
      Services.SIMPLE_Result services_SIMPLE_Result1 = new Services.SIMPLE_Result();
      assertEquals(0L, services_SIMPLE_Result1.time);
      assertFalse(services_SIMPLE_Result1.works);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", (-363));
      services_SIMPLE_Result0.toString();
      services_SIMPLE_Result0.works = false;
      services_SIMPLE_Result0.time = (-1801L);
      services_SIMPLE_Result0.reset();
      services_SIMPLE_Result0.Error = "";
      services_SIMPLE_Result0.reset();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://:1417");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      Services.testSMTP("", 976);
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", 1417);
      assertEquals((-1), services_HTTP_Result0.code);
      
      services_HTTP_Result0.reset();
      Services services0 = new Services();
      Services.testHTTP("o?pIKNVW5:X;ao[h", 0);
      Services.testPOP3("", 0);
      Services.testPOP3("**Erreur d'E/S** (java.io.IOException: Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@3a490e3e) **", (-1));
      Services.testSMTP("", 0);
      Services.testHTTP("8E47!PUq", 0);
      Services.testHTTP("'egaIn5FyrO4x8-'", (-1170));
      Services.testPOP3("**Erreur : java.lang.IllegalArgumentException: port out of range:-1**", 0);
      System.setCurrentTimeMillis(0L);
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTP(".(|y2f", 0);
      assertEquals(0L, services_HTTP_Result1.time);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", (-363));
      services_SIMPLE_Result0.works = services_SIMPLE_Result0.works;
      services_SIMPLE_Result0.time = (-1801L);
      services_SIMPLE_Result0.reset();
      services_SIMPLE_Result0.Error = "";
      services_SIMPLE_Result0.reset();
      services_SIMPLE_Result0.Error = "dpM'Ysw%-";
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://:1417");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "dpM'Ysw%-");
      Services.testSMTP("dpM'Ysw%-", 976);
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", 1417);
      assertEquals((-1), services_HTTP_Result0.code);
      
      services_HTTP_Result0.reset();
      Services services0 = new Services();
      Services.testHTTP("o?pIKNVW5:X;ao[h", 0);
      Services.testPOP3("", 0);
      Services.testPOP3("**Erreur d'E/S** (java.io.IOException: Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@5e690cf5) **", (-1));
      Services.testSMTP("", 0);
      Services.testHTTP("8E47!PUq", 0);
      Services.testPOP3("(u}O", 3105);
      Services.SIMPLE_Result services_SIMPLE_Result1 = Services.testSMTP("**Erreur d'E/S** (org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: 8E47!PUq) **", 407);
      assertFalse(services_SIMPLE_Result1.works);
  }
}