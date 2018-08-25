/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:34:57 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.PipedReader;
import java.io.StreamTokenizer;
import javax.swing.JApplet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSTaskAtom;
import umd.cs.shop.JSTasks;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("aYnk iUn>>>Du-", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[5];
      JSJshop.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[2] = "Ro;";
      JSJshop.main(stringArray0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      System.setCurrentTimeMillis(0L);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("Ro;", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getTree();
      JSPlan jSPlan0 = new JSPlan();
      assertEquals("", jSPlan0.Label());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = jSJshop0.getSolution();
      assertNull(jSPairPlanTSListNodes0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSListLogicalAtoms jSListLogicalAtoms0 = new JSListLogicalAtoms();
      jSJshop0.tree();
      JSTasks jSTasks0 = new JSTasks();
      assertEquals("", jSTasks0.Label());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.prob();
      JSOperator jSOperator0 = new JSOperator();
      // Undeclared exception!
      try { 
        jSOperator0.standarizerOp();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSOperator", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSJshop.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      // Undeclared exception!
      try { 
        jSJshop0.processToken(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      jSJshop0.getBufferedReader("Expecting constnt symbol as term", "Expecting constnt symbol as term");
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        JSJshop.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.dot = (-1428);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("k/rQUW/k/rQUW");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Y(\u0007HsAKN78SO :8");
      jSJshop0.getBufferedReader("k/rQUW", "k/rQUW", (JApplet) null);
      JSJshopVars.interrogation = 2641;
      String string0 = ":UG";
      JApplet jApplet0 = null;
      try {
        jApplet0 = new JApplet();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.applet.Applet", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader((String) null, (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SystemInUtil.addInputLine("*V*h ?;F<Ir");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.flagExit = false;
      jSJshop0.getAddList();
      JSJshopVars.percent = 1504;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSJshopVars.plus = 1504;
      String string0 = "b|>1";
      JSJshop jSJshop1 = new JSJshop("b|>1", "c14p1@");
      JSTaskAtom jSTaskAtom0 = null;
      try {
        jSTaskAtom0 = new JSTaskAtom("*(/MN");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[2] = "Ro;";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Ro;");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("Ro;", "c14p1@");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[2] = "Ro;";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Ro;");
      byte[] byteArray0 = new byte[22];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop("Ro;", "Ro;");
      JSJshopVars.dot = 96;
      System.setCurrentTimeMillis(611L);
      String string0 = "i[+dQ:P:6[Gu:4u/9jT";
      JSOperator jSOperator0 = new JSOperator();
      // Undeclared exception!
      try { 
        jSOperator0.standarizerOp();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSOperator", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[4];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Ro;");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Ro;");
      stringArray0[2] = "Ro;";
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("Ro;");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile1, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("Ro;", "c14p1@");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[2] = "all";
      JSJshop.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }
}
