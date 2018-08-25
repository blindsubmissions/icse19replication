/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:59:01 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.PopupMenu;
import java.awt.image.ImageObserver;
import java.awt.image.VolatileImage;
import java.io.BufferedReader;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.nio.CharBuffer;
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
import umd.cs.shop.JSListAxioms;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSState;
import umd.cs.shop.JSSubstitution;
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
      jSJshop0.dom();
      String string0 = null;
      PipedReader pipedReader0 = new PipedReader();
      // Undeclared exception!
      try { 
        CharBuffer.wrap((CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("O^>wyJ", (JApplet) null);
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
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getAddList();
      assertNull(jSListLogicalAtoms0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[7];
      JSJshop.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSTasks jSTasks0 = new JSTasks();
      boolean boolean0 = JSJshop.corbaToHicap;
      jSJshop0.prob();
      JSJshopNode jSJshopNode0 = new JSJshopNode();
      JSListLogicalAtoms jSListLogicalAtoms0 = new JSListLogicalAtoms();
      assertEquals(0, jSListLogicalAtoms0.size());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.whiteSpace = 0;
      JSJshopVars.flagLevel = 0;
      JSJshopVars.astherisk = 0;
      JSJshopVars.whiteSpace = 0;
      JSJshopVars.leftBrac = (-4028);
      JSJshop.corbaToHicap = false;
      jSJshop0.getTree();
      JSJshopVars.colon = (-3264);
      String string0 = "$@";
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
      // Undeclared exception!
      jSJshop0.getBufferedReader("", "");
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      String[] stringArray0 = new String[3];
      stringArray0[0] = ") ";
      stringArray0[1] = ") ";
      stringArray0[2] = ") ";
      JSJshop.main(stringArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("yU:Rkwk-p3}", jSTaskAtom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      System.setCurrentTimeMillis(1L);
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSState jSState0 = new JSState();
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.sol();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      JSListAxioms jSListAxioms0 = jSPlanningDomain0.axioms();
      assertTrue(jSListAxioms0.isEmpty());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = jSJshop0.getSolution();
      assertNull(jSPairPlanTSListNodes0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSJshop.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  //Test case number: 13
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("********* PLANS *******");
      byte[] byteArray0 = new byte[6];
      System.setCurrentTimeMillis(0L);
      byteArray0[1] = (byte)0;
      byteArray0[5] = (byte)6;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String string0 = "********* PLANS *******";
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("********* PLANS *******", "(iNfv5O.(v8D");
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
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("********* PLANS *******");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ") ");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("********* PLANS *******", "(iNfv5O.(v8D");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("C0e<PA>(]F}:8S^z", (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[2] = "one";
      stringArray0[3] = "one";
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
  //Test case number: 17
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("********* PLANS *******");
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)0;
      byteArray0[5] = (byte)0;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSJshop jSJshop0 = new JSJshop("********* PLANS *******", "********* PLANS *******");
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[2] = "all";
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
  //Test case number: 19
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("********* PLANS *******");
      byte[] byteArray0 = new byte[23];
      byteArray0[1] = (byte)0;
      byteArray0[5] = (byte)0;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      jSJshop0.parserFile("********* PLANS *******");
      JSJshopVars.leftPar = 40;
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("********* PLANS *******", "", (JApplet) null);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(bufferedReader0);
      jSJshop0.getDeleteList();
      PipedWriter pipedWriter0 = new PipedWriter();
  }
}
