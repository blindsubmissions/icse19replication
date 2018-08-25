/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:49:51 GMT 2018
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      services_HTTP_Result0.Error = "";
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
      
      services_HTTP_Result0.page_weight = 0;
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTPS("", 0);
      services_HTTP_Result1.code = 0;
      services_HTTP_Result1.code = (-1837);
      services_HTTP_Result1.reset();
      services_SIMPLE_Result0.toString();
      Services.SIMPLE_Result services_SIMPLE_Result1 = Services.testPOP3("", 3585);
      services_SIMPLE_Result1.works = false;
      Services services0 = new Services();
      Services.HTTP_Result services_HTTP_Result2 = Services.testHTTP("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", 0);
      assertEquals(0L, services_HTTP_Result2.time);
      assertFalse(services_HTTP_Result2.works);
      assertEquals(0, services_HTTP_Result2.code);
      assertEquals(0, services_HTTP_Result2.page_weight);
      
      services_HTTP_Result0.toString();
      services_SIMPLE_Result1.reset();
      services_HTTP_Result0.Error = "v";
      services_SIMPLE_Result0.toString();
      String string1 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string1);
      
      Services.SIMPLE_Result services_SIMPLE_Result2 = Services.testSMTP("", 0);
      String string2 = services_SIMPLE_Result1.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string2);
      
      services_SIMPLE_Result2.reset();
      services_SIMPLE_Result1.reset();
      assertEquals(0L, services_SIMPLE_Result1.time);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://**R\u00E9ponse du serveur incorrect**:3215");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "!}f'['f6zt@#Oap9k");
      Services.testHTTPS("**R\u00E9ponse du serveur incorrect**", 3215);
      System.setCurrentTimeMillis(3215);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("", 0);
      services_SIMPLE_Result0.reset();
      services_SIMPLE_Result0.works = true;
      services_SIMPLE_Result0.works = true;
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://:3000");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "@YW");
      services_SIMPLE_Result0.toString();
      services_SIMPLE_Result0.Error = "";
      services_SIMPLE_Result0.reset();
      assertFalse(services_SIMPLE_Result0.works);
      
      services_SIMPLE_Result0.works = true;
      services_SIMPLE_Result0.toString();
      services_SIMPLE_Result0.toString();
      services_SIMPLE_Result0.time = (long) 0;
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", 3000);
      services_HTTP_Result0.reset();
      services_HTTP_Result0.works = false;
      Services.SIMPLE_Result services_SIMPLE_Result1 = new Services.SIMPLE_Result();
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTPS("**** Resultat : \n** Fonctionnement : true\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", 3000);
      services_HTTP_Result1.reset();
      Services.SIMPLE_Result services_SIMPLE_Result2 = new Services.SIMPLE_Result();
      services_HTTP_Result0.reset();
      Services.testPOP3("", 0);
      services_SIMPLE_Result2.time = (long) 0;
      Services.testPOP3("", 0);
      Services.testHTTP("", 1);
      Services.testHTTP("", 3000);
      Services.SIMPLE_Result services_SIMPLE_Result3 = new Services.SIMPLE_Result();
      assertFalse(services_SIMPLE_Result3.works);
  }
}
