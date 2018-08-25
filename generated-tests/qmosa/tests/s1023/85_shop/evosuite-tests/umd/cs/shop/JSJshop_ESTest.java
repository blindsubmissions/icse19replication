/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:04:19 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.io.BufferedReader;
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
import umd.cs.shop.JSMethod;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Ld";
      stringArray0[1] = "";
      stringArray0[2] = "Qe+j#8YU_>)V?";
      stringArray0[3] = "";
      stringArray0[4] = ">/?a`DFOPxT!T^";
      stringArray0[5] = "parserOpsMethsAxs: expected ( or )";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "V";
      JSJshop.main(stringArray0);
      JSJshopNode jSJshopNode0 = jSJshop0.getTree();
      assertNull(jSJshopNode0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      jSJshop0.sol();
      JSJshopVars.dot = (-3);
      // Undeclared exception!
      jSJshop0.getBufferedReader("Reading file ", "Reading file ");
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getAddList();
      JSJshopVars.exclamation = 0;
      JSJshopVars.dot = 0;
      jSJshop0.tree();
      jSJshop0.sol();
      JSJshopVars.apostrophe = 0;
      jSJshop0.dom();
      String string0 = "\"_'G~B@&ipodv(+d<>&";
      // Undeclared exception!
      jSJshop0.getBufferedReader("\"_'G~B@&ipodv(+d<>&", "\"_'G~B@&ipodv(+d<>&");
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      jSJshop0.getSolution();
      jSJshop0.tree();
      jSJshop0.dom();
      jSJshop0.dom();
      StringReader stringReader0 = new StringReader(";[a-$^Pg5lN");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChar(0);
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
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "<";
      JSJshop.main(stringArray0);
      int int0 = (-212);
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
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getAddList();
      JSJshopVars.greaterT = (-2721);
      JSJshopVars.minus = (-2721);
      JSJshopVars.astherisk = 1367;
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSJshop0.getTree();
      jSJshop0.getDeleteList();
      jSJshop0.getAddList();
      JApplet jApplet0 = JSJshop.applet;
      JSJshopVars.leftBrac = 0;
      jSJshop0.getBufferedReader((String) null, "B_", (JApplet) null);
      jSJshop0.tree();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSJshop.main(stringArray0);
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
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String string0 = ".";
      int int0 = 0;
      JSJshopVars.greaterT = 0;
      JApplet jApplet0 = null;
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL(".", (JApplet) null);
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
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "all";
      stringArray0[1] = "0^(fgU~}J|f$V54;XRb";
      stringArray0[2] = "Qe+j#8!U_>)V?";
      StringReader stringReader0 = new StringReader("0^(fgU~}J|f$V54;XRb");
      jSJshop0.getDeleteList();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader("all", "m", (JApplet) null);
      jSJshop0.tree();
      jSJshop0.prob();
      jSJshop0.getBufferedReader("0^(fgU~}J|f$V54;XRb", (String) null, (JApplet) null);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Expecting list of tasks");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "one");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, (String) null);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("Expecting list of tasks", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)31;
      byteArray0[2] = (byte)4;
      byteArray0[3] = (byte)85;
      byteArray0[4] = (byte)9;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      String[] stringArray0 = new String[2];
      stringArray0[1] = stringArray0[0];
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
  //Test case number: 11
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Expecting list of tasks");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, (String) null);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("Expecting list of tasks", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.253857589601352
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.flagExit = false;
      jSJshop0.getAddList();
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSJshop0.getTree();
      jSJshop0.getDeleteList();
      jSJshop0.getAddList();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader((String) null, "9CW\"^+!#2ceft2=!e", (JApplet) null);
      jSJshop0.tree();
      JSJshop jSJshop1 = new JSJshop("B_", "9CW\"^+!#2ceft2=!e");
      JSJshopVars.whiteSpace = 6;
      JSJshop jSJshop2 = null;
      try {
        jSJshop2 = new JSJshop((String) null, (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "IN";
      stringArray0[1] = "IN";
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
  //Test case number: 14
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Expecting list of tasks/Expecting list of tasks");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "S[juCekj@");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("Expecting list of tasks/Expecting list of tasks");
      JSJshopVars.plus = (-2561);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("Expecting list of tasks", "Expecting list of tasks", (JApplet) null);
      assertNotNull(bufferedReader0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Expecting list of tasks");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("Expecting list of tasks");
      FileSystemHandling.createFolder(evoSuiteFile1);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("Expecting list of tasks", ",PYe");
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Expecting list of tasks");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      boolean boolean0 = JSJshop.corbaToHicap;
      FileSystemHandling.createFolder(evoSuiteFile0);
      JSJshop jSJshop0 = new JSJshop("Expecting list of tasks", "Expecting list of tasks");
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("#ztsq}@vca+#kj", "#ztsq}@vca+#kj");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}