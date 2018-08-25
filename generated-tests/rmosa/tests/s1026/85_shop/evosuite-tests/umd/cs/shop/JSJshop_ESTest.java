/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 17:40:46 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import javax.swing.JApplet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopNode;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSMethod;
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      jSJshop0.getBufferedReader("!", "!");
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop((String) null, (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.exclamation = 2;
      JSJshopNode jSJshopNode0 = jSJshop0.tree();
      assertNull(jSJshopNode0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String string0 = "u-|";
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      jSTaskAtom0.remove((Object) "u-|");
      int int0 = 0;
      JSJshopVars.coma = 0;
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = new JSPairPlanTSListNodes();
      jSJshop0.sol();
      // Undeclared exception!
      try { 
        jSJshop0.setFile("u-|", jSTaskAtom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = jSJshop0.getSolution();
      assertNull(jSPairPlanTSListNodes0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningDomain jSPlanningDomain0 = jSJshop0.dom();
      assertNull(jSPlanningDomain0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6081583698769648
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      String string0 = " plans found.";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " plans found.");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = new JSJshopNode();
      JSJshopVars.interrogation = (-2);
      JSJshopVars.leftBrac = (-527);
      jSJshop0.testParser();
      JSJshopVars.coma = (-527);
      jSJshop0.getDeleteList();
      jSJshop0.getAddList();
      StreamTokenizer streamTokenizer0 = null;
      JApplet jApplet0 = JSJshop.applet;
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL(" plans found.", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getTree();
      int int0 = (-519);
      JSJshopVars.leftBrac = (-519);
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
  //Test case number: 9
  /*Coverage entropy=0.48439011623800354
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      String string0 = "=;Lw-_EFEY[K72P{}";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "=;Lw-_EFEY[K72P{}");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = new JSJshopNode();
      jSJshop0.getDeleteList();
      jSJshop0.testParser();
      JSMethod jSMethod0 = new JSMethod();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader("Planning Problem", "Planning Problem", (JApplet) null);
      // Undeclared exception!
      try { 
        jSMethod0.standarizerMet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSMethod", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[1] = "";
      stringArray0[2] = "";
      JSJshop.main(stringArray0);
      PipedReader pipedReader0 = new PipedReader();
      try { 
        pipedReader0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // reset() not supported
         //
         verifyException("java.io.Reader", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[3];
      JSJshop.main(stringArray0);
      PipedReader pipedReader0 = new PipedReader();
      String string0 = "all";
      JSMethod jSMethod0 = new JSMethod();
      // Undeclared exception!
      try { 
        jSMethod0.standarizerMet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSMethod", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("o#4 eWq@sX|>]");
      String string0 = "";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("m02>=Zk2<H9A(", "m02>=Zk2<H9A(");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSJshop.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader((String) null, (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String[] stringArray0 = new String[4];
      stringArray0[0] = ".~ TT";
      stringArray0[1] = ".~ TT";
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[2] = "one";
      stringArray0[3] = "al*";
      JSJshop.main(stringArray0);
      String string0 = null;
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
  //Test case number: 18
  /*Coverage entropy=0.936888307539016
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("o#4 eWq@sX|>]");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      JSJshop jSJshop0 = new JSJshop("o#4 eWq@sX|>]", "o#4 eWq@sX|>]");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "********* PLANS *******");
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("o#4 eWq@sX|>]", "Wfz):{5u+2VqQfEY");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("o#4 eWq@sX|>]");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("o#4 eWq@sX|>]", "x");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshop.applet = null;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("}z6w>.g];Q)7/Line : ");
      JSJshopVars.slash = (-21);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "}z6w>.g];Q)7");
      jSJshop0.getBufferedReader("}z6w>.g];Q)7", "Line : ", (JApplet) null);
      System.setCurrentTimeMillis((-21));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "`:`IV@g'`ZlLZm");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      JSTaskAtom jSTaskAtom0 = null;
      try {
        jSTaskAtom0 = new JSTaskAtom((String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      String string0 = "5o2>$0!^F+>V\"";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "5o2>$0!^F+>V\"");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      JSTaskAtom jSTaskAtom0 = null;
      try {
        jSTaskAtom0 = new JSTaskAtom("5o2>$0!^F+>V\"");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      String string0 = "4j?#v]:bFZG:nQ|ad";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "4j?#v]:bFZG:nQ|ad");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      JSTaskAtom jSTaskAtom0 = null;
      try {
        jSTaskAtom0 = new JSTaskAtom("4j?#v]:bFZG:nQ|ad");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "``%IV@g'`ZlLZm");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)47;
      byteArray0[1] = (byte) (-2);
      byteArray0[2] = (byte)39;
      byteArray0[3] = (byte) (-13);
      byteArray0[4] = (byte) (-13);
      byteArray0[5] = (byte)29;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " plans found.");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = new JSJshopNode();
      jSJshop0.getDeleteList();
      jSJshop0.testParser();
      jSJshop0.getDeleteList();
      System.setCurrentTimeMillis((byte) (-2));
      jSJshop0.testParser();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ":e3dh@<oZ0@(DGf%#L");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      JSTaskAtom jSTaskAtom0 = null;
      try {
        jSTaskAtom0 = new JSTaskAtom((String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      String string0 = " plans found.";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "7F<dy.ke)O}~:n");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      JSTaskAtom jSTaskAtom0 = null;
      try {
        jSTaskAtom0 = new JSTaskAtom("7F<dy.ke)O}~:n");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      String string0 = "OGMsi-y46?gp[hmh=u";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "OGMsi-y46?gp[hmh=u");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = new JSJshopNode();
      JSListLogicalAtoms jSListLogicalAtoms0 = new JSListLogicalAtoms();
      jSJshop0.testParser();
      JSMethod jSMethod0 = new JSMethod();
      // Undeclared exception!
      try { 
        jSMethod0.standarizerMet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSMethod", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.9950269901795212
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("o#4 eWq@sX|>]");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " ( ");
      String string0 = "o#4 eWq@sX|>]";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "o#4 eWq@sX|>]");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("o#4 eWq@sX|>]", "o#4 eWq@sX|>]");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("o#4 eWq@sX|>]");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " ( ");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("o#4 eWq@sX|>]", "o#4 eWq@sX|>]");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, (byte[]) null);
      String string0 = " plans found.";
      String string1 = ",<";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ",<");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = new JSJshopNode();
      jSJshop0.getDeleteList();
      jSJshop0.testParser();
      jSJshop0.getDeleteList();
      jSJshop0.getAddList();
      jSJshop0.testParser();
      StreamTokenizer streamTokenizer0 = null;
      try {
        streamTokenizer0 = new StreamTokenizer((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StreamTokenizer", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("o#4 eWq@sX|>]");
      String string0 = "(vRQ^_Zpx9";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "(vRQ^_Zpx9");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "/&&");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("o#4 eWq@sX|>]", "(vRQ^_Zpx9");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}
