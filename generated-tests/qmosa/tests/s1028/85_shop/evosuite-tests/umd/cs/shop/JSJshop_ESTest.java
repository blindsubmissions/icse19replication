/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:41:00 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.PipedReader;
import java.io.StreamTokenizer;
import javax.swing.JApplet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "h^ZdtqBz!,";
      stringArray0[1] = "]8iN2D?_9meO?Eeq";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "{@hq~}/}c!TV`k";
      stringArray0[5] = "\"h;!f]l~";
      stringArray0[6] = "";
      stringArray0[7] = "{UisQDi,7";
      JSJshop.main(stringArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("{UisQDi,7", "]8iN2D?_9meO?Eeq");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.plus = (-1589);
      JSJshopVars.coma = (-1589);
      JSJshopVars.semicolon = (-1589);
      JSJshopVars.slash = (-688);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "Li$*DJGX";
      stringArray0[2] = "make-domain ";
      stringArray0[3] = "defproblem";
      stringArray0[4] = "cGvv)+ ";
      JSJshop.main(stringArray0);
      jSJshop0.dom();
      JSJshopVars.flagExit = false;
      jSJshop0.getDeleteList();
      jSJshop0.getAddList();
      String string0 = "";
      JSJshopVars.leftPar = (-1589);
      JSJshopVars.greaterT = (-688);
      jSJshop0.parserFile("");
      jSJshop0.sol();
      // Undeclared exception!
      try { 
        jSJshop0.testParser();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      jSJshop0.getBufferedReader((String) null, (String) null);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.sol();
      jSJshop0.dom();
      JSJshopVars.flagLevel = (-3);
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader(", ", "C'{^yr]y#nLoHN!p", (JApplet) null);
      jSJshop0.getSolution();
      boolean boolean0 = jSJshop0.parserFile(", ");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      String string0 = "1t9NpUxU0K;G|BTd<q";
      stringArray0[1] = "1t9NpUxU0K;G|BTd<q";
      // Undeclared exception!
      try { 
        JSJshop.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.dot = (-1972);
      jSJshop0.getDeleteList();
      JSJshopVars.plus = (-1972);
      jSJshop0.tree();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      JSJshop.main(stringArray0);
      JSJshopVars.flagExit = false;
      jSJshop0.parserFile("@H+@{^5");
      JApplet jApplet0 = JSJshop.applet;
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("one", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.greaterT = 40;
      JSJshopVars.coma = (-115);
      JSJshopVars.flagExit = false;
      jSJshop0.parserFile("c4T\"");
      jSJshop0.getTree();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "c4T\"";
      stringArray0[1] = "c4T\"";
      stringArray0[2] = "c4T\"";
      stringArray0[3] = "c4T\"";
      stringArray0[4] = "c4T\"";
      stringArray0[5] = "c4T\"";
      stringArray0[6] = "c4T\"";
      JSJshop.main(stringArray0);
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("Expecting list of logical atoms", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "K8D_3a[m.YT{d/";
      stringArray0[1] = "}u]DF9)ni";
      stringArray0[2] = "umd.cs.shop.JSTaskAtom";
      JSJshop.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.sol();
      jSJshop0.dom();
      String string0 = ", ";
      jSJshop0.getDeleteList();
      jSJshop0.dom();
      jSJshop0.prob();
      jSJshop0.getDeleteList();
      String string1 = "MX&Pp";
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
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.sol();
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      jSJshop0.parserFile("9:");
      PipedReader pipedReader0 = new PipedReader(269);
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
  /*Coverage entropy=2.0253262207700673
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.plus = (-1589);
      JSJshopVars.coma = (-1589);
      JSJshopVars.semicolon = (-1589);
      JSJshopVars.slash = (-688);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "Li$*DJGX";
      stringArray0[2] = "make-domain ";
      stringArray0[3] = "defproblem";
      stringArray0[4] = "cGvv)+ ";
      JSJshop.main(stringArray0);
      jSJshop0.dom();
      JSJshopVars.flagExit = false;
      jSJshop0.getDeleteList();
      jSJshop0.getAddList();
      JSJshopVars.leftPar = (-1589);
      JSJshop jSJshop1 = new JSJshop("make-domain ", (String) null);
      jSJshop1.getSolution();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      JApplet jApplet0 = JSJshop.applet;
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("w(\"J\u0002,bZH{$l6\"[m/(", (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Expecting variable name in term");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "all");
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("Expecting variable name in term", jSTaskAtom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Expecting variable name in term");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "all");
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, " ");
      String[] stringArray0 = new String[4];
      stringArray0[0] = " ";
      stringArray0[1] = "all";
      stringArray0[2] = "all";
      stringArray0[3] = "all";
      // Undeclared exception!
      try { 
        JSJshop.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Util.getBufferedReader() error: cannot open URL/9:");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Expecting ')' for PlanningProblem");
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader("Util.getBufferedReader() error: cannot open URL", "9:", (JApplet) null);
      jSJshop0.getAddList();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "}u]df9)ni";
      String string0 = "Plan # ";
      stringArray0[1] = "Plan # ";
      String string1 = "one";
      stringArray0[2] = "one";
      // Undeclared exception!
      try { 
        JSJshop.main(stringArray0);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Expecting variable name in term");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " ;--wtRY#{");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("Expecting variable name in term", " ;--wtRY#{");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Expecting variable name in term");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " ;--wtRY#{");
      JSJshop jSJshop0 = new JSJshop("Expecting variable name in term", "Expecting variable name in term");
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getAddList();
      assertNull(jSListLogicalAtoms0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Expecting variable name in term");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "(rkt<zk e^mgbrzjlr");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("Expecting variable name in term", "Expecting variable name in term");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}