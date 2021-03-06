/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 13:57:17 GMT 2018
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.AllJavadoc;
import weka.core.OptionHandlerJavadoc;
import weka.core.TechnicalInformationHandlerJavadoc;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Javadoc_ESTest extends Javadoc_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TechnicalInformationHandlerJavadoc technicalInformationHandlerJavadoc0 = new TechnicalInformationHandlerJavadoc();
      int int0 = technicalInformationHandlerJavadoc0.getIndentionLength("<!-- technical-bibtex-end -->");
      assertEquals(1, int0);
      assertFalse(technicalInformationHandlerJavadoc0.getSilent());
      assertTrue(technicalInformationHandlerJavadoc0.getUseStars());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TechnicalInformationHandlerJavadoc technicalInformationHandlerJavadoc0 = new TechnicalInformationHandlerJavadoc();
      String string0 = technicalInformationHandlerJavadoc0.getIndentionString("<!-- technical-bibtex-end -->");
      assertTrue(technicalInformationHandlerJavadoc0.getUseStars());
      assertFalse(technicalInformationHandlerJavadoc0.getSilent());
      assertEquals("<!-- technical-bibtex-end -->", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TechnicalInformationHandlerJavadoc technicalInformationHandlerJavadoc0 = new TechnicalInformationHandlerJavadoc();
      String string0 = technicalInformationHandlerJavadoc0.toHTML("<!-- technical-plaintext-end -->");
      assertTrue(technicalInformationHandlerJavadoc0.getUseStars());
      assertFalse(technicalInformationHandlerJavadoc0.getSilent());
      assertEquals("&lt;!-- technical-plaintext-end --&gt;", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.2047854169135204
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TechnicalInformationHandlerJavadoc technicalInformationHandlerJavadoc0 = new TechnicalInformationHandlerJavadoc();
      String string0 = technicalInformationHandlerJavadoc0.generate();
      assertEquals("\n\n", string0);
      
      String string1 = technicalInformationHandlerJavadoc0.updateJavadoc("<!-- technical-bibtex-start -->");
      assertFalse(technicalInformationHandlerJavadoc0.getSilent());
      assertEquals("weka.core.Javadoc", technicalInformationHandlerJavadoc0.getClassname());
      assertEquals("<!-- technical-bibtex-start -->", string1);
      assertTrue(technicalInformationHandlerJavadoc0.getUseStars());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TechnicalInformationHandlerJavadoc technicalInformationHandlerJavadoc0 = new TechnicalInformationHandlerJavadoc();
      technicalInformationHandlerJavadoc0.setClassname("<!-- technical-bibtex-end -->");
      technicalInformationHandlerJavadoc0.generateJavadoc();
      assertEquals("<!-- technical-bibtex-end -->", technicalInformationHandlerJavadoc0.getClassname());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionHandlerJavadoc optionHandlerJavadoc0 = new OptionHandlerJavadoc();
      String[] stringArray0 = optionHandlerJavadoc0.getOptions();
      optionHandlerJavadoc0.setOptions(stringArray0);
      assertEquals("weka.core.Javadoc", optionHandlerJavadoc0.getClassname());
      assertEquals(2, stringArray0.length);
      assertFalse(optionHandlerJavadoc0.getSilent());
      assertTrue(optionHandlerJavadoc0.getUseStars());
      assertEquals("", optionHandlerJavadoc0.getDir());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionHandlerJavadoc optionHandlerJavadoc0 = new OptionHandlerJavadoc();
      assertFalse(optionHandlerJavadoc0.getSilent());
      
      optionHandlerJavadoc0.setSilent(true);
      optionHandlerJavadoc0.updateJavadoc();
      assertTrue(optionHandlerJavadoc0.getSilent());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionHandlerJavadoc optionHandlerJavadoc0 = new OptionHandlerJavadoc();
      optionHandlerJavadoc0.indent("* Valid options are: <p/>\n<!-- techn)cal-plaintext-start -->\"", 2664, "* Valid options are: <p/>\n<!-- techn)cal-plaintext-start -->\"");
      optionHandlerJavadoc0.getInstance();
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionHandlerJavadoc optionHandlerJavadoc0 = new OptionHandlerJavadoc();
      optionHandlerJavadoc0.setDir("* ");
      String[] stringArray0 = optionHandlerJavadoc0.getOptions();
      OptionHandlerJavadoc.main(stringArray0);
      assertEquals("* ", optionHandlerJavadoc0.getDir());
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.599301927099795
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionHandlerJavadoc optionHandlerJavadoc0 = new OptionHandlerJavadoc();
      assertTrue(optionHandlerJavadoc0.getUseStars());
      
      optionHandlerJavadoc0.setUseStars(false);
      String[] stringArray0 = optionHandlerJavadoc0.getOptions();
      OptionHandlerJavadoc.main(stringArray0);
      assertFalse(optionHandlerJavadoc0.getUseStars());
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.553237002993714
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TechnicalInformationHandlerJavadoc.main((String[]) null);
      OptionHandlerJavadoc optionHandlerJavadoc0 = new OptionHandlerJavadoc();
      assertFalse(optionHandlerJavadoc0.getSilent());
      
      optionHandlerJavadoc0.m_Silent = true;
      String[] stringArray0 = optionHandlerJavadoc0.getOptions();
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionHandlerJavadoc optionHandlerJavadoc0 = new OptionHandlerJavadoc();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/weka/core/Javadoc.java");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "<!-- options-end -->");
      optionHandlerJavadoc0.setSilent(false);
      String string0 = optionHandlerJavadoc0.updateJavadoc();
      assertEquals("<!-- options-end -->", string0);
      assertTrue(optionHandlerJavadoc0.getUseStars());
      assertFalse(optionHandlerJavadoc0.getSilent());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.089935099971897
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TechnicalInformationHandlerJavadoc technicalInformationHandlerJavadoc0 = new TechnicalInformationHandlerJavadoc();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "<!-- technical-plaintext-start -->";
      technicalInformationHandlerJavadoc0.m_EndTag = stringArray0;
      technicalInformationHandlerJavadoc0.updateJavadoc("<!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- teNhnical-plaintext-start --><!-- technical-plaintext-start -->* Valid options are: <p/>\n<!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start --><!-- technical-plaintext-start -->* \n");
      assertFalse(technicalInformationHandlerJavadoc0.getSilent());
      assertEquals("weka.core.Javadoc", technicalInformationHandlerJavadoc0.getClassname());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TechnicalInformationHandlerJavadoc technicalInformationHandlerJavadoc0 = new TechnicalInformationHandlerJavadoc();
      String string0 = technicalInformationHandlerJavadoc0.getIndentionString("\t");
      assertEquals("\t", string0);
      
      String string1 = technicalInformationHandlerJavadoc0.updateJavadoc("<!-- technical-bibtex-start -->");
      assertEquals("<!-- technical-bibtex-start -->", string1);
      
      technicalInformationHandlerJavadoc0.getProlog();
      assertFalse(technicalInformationHandlerJavadoc0.getSilent());
      assertTrue(technicalInformationHandlerJavadoc0.getUseStars());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TechnicalInformationHandlerJavadoc technicalInformationHandlerJavadoc0 = new TechnicalInformationHandlerJavadoc();
      technicalInformationHandlerJavadoc0.getIndentionLength("\t");
      AllJavadoc allJavadoc0 = null;
      try {
        allJavadoc0 = new AllJavadoc();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }
}
