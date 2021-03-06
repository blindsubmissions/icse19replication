/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:55:19 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTEventMulticaster;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.color.ICC_Profile;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.HierarchyBoundsListener;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StreamTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.plaf.basic.BasicTableUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSOperator;
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
      int int0 = (-1322);
      JSJshopVars.rightBrac = (-1322);
      JSJshopVars.rightBrac = 0;
      int int1 = 309;
      JSJshopVars.exclamation = 309;
      jSJshop0.getTree();
      jSJshop0.dom();
      String string0 = "* ";
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
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.rightBrac = (-1744);
      JSJshopVars.coma = (-6379);
      jSJshop0.getSolution();
      JSJshopVars.slash = 0;
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "Expecting method's IfThenElse list";
      stringArray0[3] = "";
      stringArray0[4] = "";
      JSJshop.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      jSJshop0.getBufferedReader("L*0=|X&", "L*0=|X&");
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      String[] stringArray0 = new String[0];
      JSJshop.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.parserFile("KQeq>");
      JApplet jApplet0 = JSJshop.applet;
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("fgl/aeSttR_aY_d:", (JApplet) null);
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
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "%Ed?Hk-j!5)BZV";
      stringArray0[1] = "j";
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
  //Test case number: 7
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      jSJshop0.tree();
      jSJshop0.getDeleteList();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "[";
      stringArray0[1] = "j-&e";
      stringArray0[2] = "Oh=/{'~]T";
      JSJshop.main(stringArray0);
      JSTaskAtom jSTaskAtom0 = null;
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("Oh=/{'~]T", (JSTaskAtom) null);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSListLogicalAtoms jSListLogicalAtoms0 = new JSListLogicalAtoms();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = " Expecting ')' for planning domain";
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.parserFile(" Expecting ')' for planning domain");
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader("4h#7i|^t)azdMk:d", (String) null, (JApplet) null);
      JSTaskAtom jSTaskAtom0 = null;
      try {
        jSTaskAtom0 = new JSTaskAtom("c8#o1?:s t~}4%e[");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("G0:[;");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "> ");
      String string0 = "G0:[;";
      String string1 = " Expecting ')' for planning domain";
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("G0:[;", " Expecting ')' for planning domain");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("> ");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)40;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String string0 = "> ";
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      jSTaskAtom0.parallelStream();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("> ", jSTaskAtom0);
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
  /*Coverage entropy=1.539654447440098
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" Expecting defdomain or defproblem/defproblem");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, false);
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.lessT = (-224);
      JSJshopVars.leftPar = 0;
      jSJshop0.getDeleteList();
      JSJshopVars.apostrophe = 554;
      jSJshop0.parserFile("f`h");
      jSJshop0.getBufferedReader("f`h", "f`h", (JApplet) null);
      String[] stringArray0 = new String[4];
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "f`h");
      stringArray0[0] = "f`h";
      stringArray0[1] = "f`h";
      stringArray0[2] = "f`h";
      stringArray0[3] = "f`h";
      jSJshop0.getAddList();
      JSJshop.main(stringArray0);
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader(" Expecting defdomain or defproblem", "defproblem", (JApplet) null);
      assertNotNull(bufferedReader0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("> ");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      jSTaskAtom0.add((Object) "> ");
      jSTaskAtom0.parallelStream();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("> ", jSTaskAtom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("> ");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("> ", "a?d");
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
  /*Coverage entropy=1.6762349391347309
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("> ");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)9;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop("> ", "> ");
      jSJshop0.getBufferedReader("> ", "> ", (JApplet) null);
      jSJshop0.getAddList();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "> ";
      stringArray0[1] = "> ";
      stringArray0[2] = "> ";
      JSJshopVars.flagExit = false;
      stringArray0[4] = "> ";
      jSJshop0.getAddList();
      JSJshop jSJshop1 = new JSJshop("> ", "J#yn");
      JSJshop.main(stringArray0);
      jSJshop0.getBufferedReader("fh", "> ", (JApplet) null);
      jSJshop1.getDeleteList();
      JSJshop jSJshop2 = new JSJshop("> ", "'5`4");
      assertFalse(jSJshop2.equals((Object)jSJshop0));
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.flagExit = false;
      String string0 = "LUn^|`&";
      JSJshop jSJshop1 = new JSJshop("LUn^|`&", "LUn^|`&");
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
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("> ");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)40;
      byteArray0[1] = (byte) (-102);
      byteArray0[2] = (byte)40;
      byteArray0[3] = (byte)40;
      byteArray0[4] = (byte)40;
      byteArray0[5] = (byte)40;
      byteArray0[6] = (byte)40;
      byteArray0[7] = (byte)40;
      byteArray0[8] = (byte)40;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("> ", "> ");
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
  /*Coverage entropy=0.6816102690529532
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-39);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte) (-103);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.astherisk = (int) (byte)4;
      JSJshopVars.verticalL = (-269);
      JSJshopVars.semicolon = (-1);
      JSJshopVars.verticalL = 39;
      JSJshopVars.greaterT = (-269);
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      jSJshop0.tree();
      jSJshop0.testParser();
      String string0 = "+ ";
      String string1 = "+ ";
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader("+ ", "+ ", (JApplet) null);
      JApplet jApplet1 = null;
      try {
        jApplet1 = new JApplet();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.applet.Applet", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.2852930241200995
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-39);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte) (-103);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.astherisk = (int) (byte)4;
      JSJshopVars.verticalL = (-269);
      JSJshopVars.semicolon = (-3);
      JSJshopVars.verticalL = 39;
      JSJshopVars.greaterT = (-269);
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      jSJshop0.tree();
      jSJshop0.testParser();
      JApplet jApplet0 = JSJshop.applet;
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("OSjXH", "Searching a plan for");
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
  /*Coverage entropy=0.6081583698769648
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-39);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte) (-2);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.astherisk = (int) (byte)4;
      JSJshopVars.verticalL = (-269);
      JSJshopVars.semicolon = (-1);
      JSJshopVars.verticalL = (int) (byte)4;
      JSJshopVars.greaterT = (-269);
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      jSJshop0.tree();
      jSJshop0.testParser();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      jSJshop0.testParser();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.4787515246479541
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-39);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte) (-103);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.astherisk = (int) (byte)4;
      JSJshopVars.exclamation = (int) (byte)4;
      JSJshopVars.verticalL = (-269);
      JSJshopVars.semicolon = (-8);
      JSJshopVars.verticalL = 39;
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("}ejH5pZnDf)1");
      FileSystemHandling.appendDataToFile(evoSuiteFile1, byteArray0);
      JSJshopVars.greaterT = (-269);
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      jSJshop0.tree();
      jSJshop0.testParser();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      String string0 = "}ejH5pZnDf)1";
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("}ejH5pZnDf)1", "}ejH5pZnDf)1");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0789922078775833
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte byte0 = (byte)40;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("> ");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)40;
      byte byte1 = (byte) (-102);
      byteArray0[1] = (byte) (-102);
      byteArray0[2] = (byte)40;
      byteArray0[5] = (byte)40;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String string0 = "> ";
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "> ");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("> ", "> ");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.5670609309552819
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-39);
      byteArray0[1] = (byte)4;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      JSJshop jSJshop1 = new JSJshop();
      JSJshopVars.slash = (int) (byte)4;
      jSJshop1.testParser();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop1.getAddList();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop1.getAddList();
      assertNull(jSListLogicalAtoms0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.349792396172401
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-39);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte) (-39);
      byteArray0[3] = (byte) (-103);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.astherisk = (int) (byte)4;
      JSJshopVars.exclamation = (int) (byte)4;
      JSJshopVars.verticalL = (int) (byte) (-103);
      JSJshopVars.semicolon = (-8);
      JSJshopVars.verticalL = 39;
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("}ejH5pZnDf)1");
      FileSystemHandling.appendDataToFile(evoSuiteFile1, byteArray0);
      JSJshopVars.greaterT = (int) (byte) (-39);
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "found an applicable method : ");
      jSJshop0.tree();
      jSJshop0.testParser();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      jSJshop0.parserFile("found an applicable method : ");
      String string0 = "f";
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(pipedReader0);
      JSTaskAtom jSTaskAtom0 = null;
      try {
        jSTaskAtom0 = new JSTaskAtom(streamTokenizer1);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.7776612957621659
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-39);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("}ejH5pZnDf)1");
      FileSystemHandling.appendDataToFile(evoSuiteFile1, byteArray0);
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      JSJshopVars.backquote = (int) (byte)4;
      FileSystemHandling.appendStringToFile(evoSuiteFile1, "01\"");
      jSJshop0.tree();
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "gkHUbO+");
      jSJshop0.tree();
      jSJshop0.testParser();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.testParser();
      JApplet jApplet1 = JSJshop.applet;
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      jSJshop0.testParser();
      jSJshop0.getDeleteList();
      jSJshop0.getAddList();
      System.setCurrentTimeMillis(11L);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "01\"");
      jSJshop0.tree();
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "01\"");
      jSJshop0.tree();
      jSJshop0.testParser();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.testParser();
      JApplet jApplet1 = JSJshop.applet;
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      jSJshop0.testParser();
      JSJshopVars.leftBrac = 3;
      jSJshop0.getDeleteList();
      jSJshop0.getAddList();
      jSJshop0.getDeleteList();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.2275294114572126
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-39);
      byteArray0[0] = (byte) (-39);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("}ejH5pZnDf)1");
      FileSystemHandling.appendDataToFile(evoSuiteFile1, byteArray0);
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      FileSystemHandling.appendStringToFile(evoSuiteFile1, "one");
      jSJshop0.getTree();
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      String string0 = "^i}7%%}ea8wu(";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "^i}7%%}ea8wu(");
      jSJshop0.tree();
      JSJshop jSJshop1 = new JSJshop();
      jSJshop1.testParser();
      JApplet jApplet0 = JSJshop.applet;
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      // Undeclared exception!
      try { 
        jSTaskAtom0.standarizerTA();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.5924028775138872
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)4;
      byteArray0[3] = (byte) (-103);
      String string0 = " [";
      FileSystemHandling.appendLineToFile(evoSuiteFile0, " [");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.astherisk = (int) (byte)4;
      JSJshopVars.exclamation = (int) (byte)4;
      JSJshop.corbaToHicap = true;
      JSJshopVars.verticalL = (int) (byte) (-103);
      JSJshopVars.semicolon = (-8);
      JSJshopVars.verticalL = (int) (byte)0;
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("}ejH5pZnDf)1");
      FileSystemHandling.appendDataToFile(evoSuiteFile1, byteArray0);
      jSJshop0.getDeleteList();
      jSJshop0.getDeleteList();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "found an applicable method : ");
      jSJshop0.getTree();
      jSJshop0.testParser();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      jSJshop0.getDeleteList();
      jSJshop0.getAddList();
      System.setCurrentTimeMillis(0L);
      PipedReader pipedReader0 = new PipedReader(62);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      JSOperator jSOperator0 = null;
      try {
        jSOperator0 = new JSOperator(streamTokenizer0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}
