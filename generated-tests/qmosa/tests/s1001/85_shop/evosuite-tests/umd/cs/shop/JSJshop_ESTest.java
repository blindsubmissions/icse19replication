/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:56:04 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
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
import umd.cs.shop.JSMethod;
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;
import umd.cs.shop.JSTasks;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.prob();
      jSJshop0.tree();
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
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.sol();
      PipedReader pipedReader0 = null;
      try {
        pipedReader0 = new PipedReader((-3));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe size <= 0
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
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
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.whiteSpace = (-5157);
      JSJshopVars.leftPar = (-3246);
      jSJshop0.getDeleteList();
      JSJshopVars.greaterT = (-5248);
      jSJshop0.dom();
      JSJshopVars.backquote = (-5157);
      jSJshop0.getAddList();
      jSJshop0.getDeleteList();
      jSJshop0.tree();
      jSJshop0.prob();
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
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      int int0 = 3;
      JSJshopVars.exclamation = 1;
      JSJshopVars.leftPar = 3;
      JSJshopVars.whiteSpace = 5;
      // Undeclared exception!
      jSJshop0.getBufferedReader("List of tasks", "List of tasks");
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "";
      JSTaskAtom jSTaskAtom0 = null;
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("", (JSTaskAtom) null);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("[", (JApplet) null);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.whiteSpace = (-5157);
      JSJshopVars.leftPar = (-3246);
      jSJshop0.getDeleteList();
      JSJshopVars.greaterT = (-5248);
      jSJshop0.dom();
      jSJshop0.getDeleteList();
      jSJshop0.getSolution();
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      JSTaskAtom jSTaskAtom0 = null;
      try {
        jSTaskAtom0 = new JSTaskAtom(streamTokenizer0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[20];
      stringArray0[0] = "";
      stringArray0[0] = "";
      JSJshop.main(stringArray0);
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      String string0 = "";
      StringReader stringReader0 = new StringReader("Mnl4u&jJeQFpI&e%W(");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      char[] charArray0 = new char[8];
      charArray0[0] = '~';
      charArray0[1] = 'Y';
      charArray0[2] = 'B';
      charArray0[3] = 'F';
      charArray0[4] = 'V';
      charArray0[5] = '+';
      charArray0[6] = '&';
      charArray0[7] = '!';
      // Undeclared exception!
      try { 
        stringReader0.read(charArray0, (-4), (-4));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(") ");
      byte[] byteArray0 = new byte[8];
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getTree();
      byteArray0[0] = (byte)38;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte)17;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)40;
      byteArray0[5] = (byte) (-4);
      byteArray0[6] = (byte)77;
      byteArray0[7] = (byte)63;
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "df";
      stringArray0[1] = "";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "df");
      stringArray0[2] = " Expecting defdomain or defproblem";
      JSJshop.main(stringArray0);
      JSJshop jSJshop0 = new JSJshop();
      PipedReader pipedReader0 = new PipedReader();
      StringReader stringReader0 = new StringReader("defproblem");
      StringReader stringReader1 = new StringReader(" Expecting method or operator found text:");
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader(" Expecting method or operator found text:", "Vn2eT\"W.xKlY(", (JApplet) null);
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
  //Test case number: 11
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      String[] stringArray0 = new String[0];
      JSJshop.main(stringArray0);
      JSJshop jSJshop0 = new JSJshop();
      PipedReader pipedReader0 = new PipedReader();
      StringReader stringReader0 = new StringReader("SFbPO2P2?+Zsd/9");
      StringReader stringReader1 = new StringReader("\"");
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader("|FK@N91r,D5", "_`/5O/f", (JApplet) null);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  //Test case number: 12
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" expecting defdomain or defproblem/ expecting defdomain or defproblem");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "umd.cs.shop.JSListPairPlanTStateNodes");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "_uQbPS ![oYyTj%");
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader(" expecting defdomain or defproblem", " expecting defdomain or defproblem", (JApplet) null);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = " expecting defdomain or defproblem";
      JSJshop.main(stringArray0);
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" expecting defdomain or defproblem/ expecting defdomain or defproblem");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "umd.cs.shop.JSListPairPlanTStateNodes");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "_uQbPS ![oYyTj%");
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      JSJshop jSJshop1 = new JSJshop();
      PipedReader pipedReader1 = new PipedReader();
      StringReader stringReader0 = new StringReader(".~Xq~_K\"/r F\u0007o!d");
      StringReader stringReader1 = new StringReader(".~Xq~_K\"/r F\u0007o!d");
      JApplet jApplet1 = JSJshop.applet;
      jSJshop1.getBufferedReader("_uQbPS ![oYyTj%", (String) null, (JApplet) null);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("> ");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("> ", "@GS8{)C");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("0#~_RoUW1.G3+eZ7L");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "}}0qqryH:w,");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.coma = 6;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "0#~_RoUW1.G3+eZ7L";
      String string0 = "<- domain";
      stringArray0[1] = "<- domain";
      String string1 = ",>z$E\\:K]";
      JSJshopVars.allPlans = true;
      stringArray0[2] = ",>z$E:K]";
      JSJshopVars.astherisk = (-1468);
      JSJshopVars.semicolon = 1327;
      JSJshopVars.astherisk = 3659;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      stringArray0[3] = "<- domain";
      JSJshop.main(stringArray0);
      JSTaskAtom jSTaskAtom0 = null;
      // Undeclared exception!
      try { 
        jSJshop0.setFile("0#~_RoUW1.G3+eZ7L", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.329661348854758
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("returning failure from find-plan: can not find an applicable method");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)40;
      byteArray0[1] = (byte)56;
      byteArray0[2] = (byte)20;
      byteArray0[3] = (byte) (-81);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("returning failure from find-plan: can not find an applicable method", "returning failure from find-plan: can not find an applicable method");
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
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("> ");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop1 = new JSJshop("> ", "> ");
      JSTasks jSTasks0 = new JSTasks();
      assertEquals(10, jSTasks0.capacity());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("returning failure from find-plan: can not find an applicable method");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)40;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "umd.cs.shop.jsutil");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "umd.cs.shop.jsutil";
      stringArray0[1] = "umd.cs.shop.jsutil";
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
  //Test case number: 19
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSTasks jSTasks0 = new JSTasks();
      JSJshop jSJshop1 = new JSJshop();
      JSJshopVars.flagExit = false;
      JSTasks jSTasks1 = new JSTasks();
      JSJshop jSJshop2 = new JSJshop("returning failure from find-plan: can not find an applicable method", "Yw,@y;ydfhurBV");
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.320888343149322
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("returning failure from find-plan: can not find an applicable method");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)40;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ju#}4yV");
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("returning failure from find-plan: can not find an applicable method", "returning failure from find-plan: can not find an applicable method");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.320888343149322
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("returning failure from find-plan: can not find an applicable method");
      byte byte0 = (byte)40;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)40;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String string0 = "returning failure from find-plan: can not find an applicable method";
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "returning failure from find-plan: can not find an applicable method");
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("returning failure from find-plan: can not find an applicable method", "returning failure from find-plan: can not find an applicable method");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}