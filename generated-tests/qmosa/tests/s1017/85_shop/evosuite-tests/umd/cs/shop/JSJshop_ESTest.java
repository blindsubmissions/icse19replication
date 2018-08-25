/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:27:56 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.Vector;
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
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      String string0 = "d";
      stringArray0[1] = "d";
      stringArray0[2] = "";
      String string1 = "iKl9jbd9dj";
      stringArray0[3] = "iKl9jbd9dj";
      stringArray0[4] = "7\"iv=&#H:^Pm";
      stringArray0[5] = "";
      stringArray0[6] = "@pjK_8<-0f{43ZL*";
      stringArray0[7] = "]Uyr%T@SYzg1oEP QnV";
      stringArray0[8] = "]";
      JSJshop.main(stringArray0);
      JSTaskAtom jSTaskAtom0 = null;
      try {
        jSTaskAtom0 = new JSTaskAtom("SsyVhBE\"7}ex:9vZj=");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Error reading control parameters: ";
      String string0 = "` ";
      stringArray0[1] = "` ";
      stringArray0[2] = "L::)2AYSF OBb%";
      JSJshop.main(stringArray0);
      String string1 = "";
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
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlan jSPlan0 = jSJshop0.sol();
      assertNull(jSPlan0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.tree();
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      int int0 = 2131;
      PipedReader pipedReader1 = null;
      try {
        pipedReader1 = new PipedReader(pipedWriter0, 2131);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.dom();
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader("*og6}FyS9g%_", "umd.cs.shop.JSTasks", (JApplet) null);
      JSJshopNode jSJshopNode0 = jSJshop0.getTree();
      assertNull(jSJshopNode0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshop.applet = null;
      JSJshopVars.plus = 1120;
      jSJshop0.parserFile("");
      JSJshop.corbaToHicap = true;
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      jSJshop0.getSolution();
      // Undeclared exception!
      try { 
        jSJshop0.processToken((StreamTokenizer) null);
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
      JSJshop.applet = null;
      JSJshopVars.plus = 1120;
      jSJshop0.parserFile("");
      JSJshop.corbaToHicap = true;
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      jSJshop0.getSolution();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String[] stringArray0 = new String[1];
      JSJshop.main(stringArray0);
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
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.dom();
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      jSJshop0.getSolution();
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
  //Test case number: 9
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getAddList();
      JSJshopVars.rightPar = (-1);
      JSJshop.corbaToHicap = false;
      JSJshop.corbaToHicap = false;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      jSJshop0.getAddList();
      jSJshop0.parserFile("expected '('");
      String[] stringArray0 = new String[2];
      JSJshopVars.exclamation = (-1688);
      stringArray0[0] = "expected '('";
      stringArray0[1] = "expected '('";
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
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.lessT = 0;
      JSJshopVars.exclamation = 452;
      jSJshop0.getDeleteList();
      String string0 = "`w<5V7!l'!)@ZZA;!u";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("`w<5V7!l'!)@ZZA;!u");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Error in readFile() : ");
      jSJshop0.getDeleteList();
      JSOperator jSOperator0 = new JSOperator();
      jSOperator0.head();
      // Undeclared exception!
      try { 
        jSJshop0.setFile("`w<5V7!l'!)@ZZA;!u", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getAddList();
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL(";<x}gkm", (JApplet) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String string0 = "umd.csl.shop.JSTasks";
      JApplet jApplet0 = JSJshop.applet;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "umd.csl.shop.JSTasks");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      jSJshop0.parserFile("umd.csl.shop.JSTasks");
      JSJshop jSJshop1 = new JSJshop();
      String string1 = "^pc7y0(p[J&kQT";
      String string2 = "$pMla SSl2}K";
      // Undeclared exception!
      jSJshop1.getBufferedReader("^pc7y0(p[J&kQT", "$pMla SSl2}K");
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshop.applet = null;
      JSJshopVars.coma = 668;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "6]2-yoW/");
      JSJshopVars.plus = 1120;
      JSJshopVars.slash = (-2);
      jSJshop0.parserFile("");
      JSJshop.corbaToHicap = true;
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      jSJshop0.getDeleteList();
      jSJshop0.getBufferedReader("$PyGg", "$PyGg", (JApplet) null);
      jSJshop0.testParser();
      assertTrue(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshop.applet = null;
      JSJshopVars.coma = 668;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("$PyGg/$PyGg");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "6]2-yoW/");
      JSJshopVars.plus = 1120;
      JSJshopVars.slash = (-2);
      jSJshop0.parserFile("umd.cs.shop.JSJshop");
      JSJshop.corbaToHicap = true;
      jSJshop0.getAddList();
      jSJshop0.getAddList();
      jSJshop0.getDeleteList();
      jSJshop0.getBufferedReader("$PyGg", "$PyGg", (JApplet) null);
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
  //Test case number: 15
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshop.applet = null;
      jSJshop0.getDeleteList();
      String string0 = "`w<5V7!l'!)@ZZA;!u";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("`w<5V7!l'!)@ZZA;!u");
      String string1 = "Error inreadFle() : ";
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      JSOperator jSOperator0 = new JSOperator();
      jSOperator0.head();
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("`w<5V7!l'!)@ZZA;!u", (JSTaskAtom) null);
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
  /*Coverage entropy=0.994353691762369
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "M2@Ap1GF'Y{2Mq?F+");
      jSJshop0.dom();
      JSJshop jSJshop1 = new JSJshop();
      JSJshop jSJshop2 = new JSJshop();
      jSJshop2.getDeleteList();
      jSJshop0.getBufferedReader("l::)2aysf obb%", "l::)2aysf obb%", (JApplet) null);
      jSJshop0.testParser();
      assertFalse(jSJshop0.equals((Object)jSJshop1));
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.7772096817864422
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "d>-|");
      jSJshop0.parserFile("sqVN;~");
      jSJshop0.getAddList();
      JSJshop jSJshop1 = new JSJshop();
      jSJshop1.getAddList();
      JSJshop jSJshop2 = new JSJshop();
      JSJshopVars.astherisk = 62;
      JSJshopVars.flagLevel = (-1450);
      jSJshop2.getDeleteList();
      jSJshop1.getBufferedReader("d>-|", "d>-|", (JApplet) null);
      jSJshop0.testParser();
      assertFalse(jSJshop0.equals((Object)jSJshop1));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.806504609875222
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      JSJshopVars.flagLevel = (-1122);
      JSJshopVars.percent = (-1122);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "d>-|");
      jSJshop0.parserFile("sqVN;~");
      jSJshop0.getAddList();
      PipedWriter pipedWriter0 = new PipedWriter();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "b}p^kgq=~{|y");
      jSJshop0.dom();
      JSJshop jSJshop1 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(jSJshop0.equals((Object)jSJshop1));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.9017412329512398
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      JSJshopVars.flagLevel = (-1122);
      JSJshopVars.percent = (-1122);
      jSJshop0.parserFile("sqVN;~");
      jSJshop0.getAddList();
      jSJshop0.parserFile("sqVN;~");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)42;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)96;
      byteArray0[3] = (byte)3;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      PipedWriter pipedWriter0 = new PipedWriter();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "sqVN;~");
      jSJshop0.dom();
      jSJshop0.testParser();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, " Goal matches atom: ");
      jSJshop0.dom();
      JSJshop jSJshop1 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(jSJshop0.equals((Object)jSJshop1));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "M2@Ap1GF'Y{)Mq?F+");
      jSJshop0.dom();
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      jSJshop0.dom();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.5140966973399506
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      JSJshopVars.flagLevel = (-1122);
      JSJshopVars.percent = (-1122);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "d>-|");
      jSJshop0.parserFile("d>-|");
      PipedWriter pipedWriter0 = new PipedWriter();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "U9Bxa.,j6\"X#190nv/");
      jSJshop0.dom();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.14839214282331
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      jSJshop0.getDeleteList();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "' ");
      jSJshop0.parserFile("6]2-yow/");
      jSJshop0.getAddList();
      PipedWriter pipedWriter0 = new PipedWriter();
      jSJshop0.parserFile("Line : ");
      PipedWriter pipedWriter1 = new PipedWriter();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "q p5a<|\":k`v|!");
      jSJshop0.dom();
      jSJshop0.testParser();
      // Undeclared exception!
      try { 
        JSJshop.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      JSJshopVars.flagLevel = (-1122);
      JSJshopVars.percent = (-1122);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "RRh$Ihr8f]3(w");
      jSJshop0.parserFile("di-|");
      PipedWriter pipedWriter0 = new PipedWriter();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "U9Bxa.,j6\"X#190nv/");
      jSJshop0.dom();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0791615912646864
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      JSJshopVars.flagLevel = (-1160);
      String string0 = "' ";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "*D~|<%)l[F$B!5Ybt");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.parserFile("' ");
      jSJshop0.getAddList();
      PipedWriter pipedWriter0 = new PipedWriter();
      String string1 = "Line : ";
      jSJshop0.parserFile("|33qP");
      PipedWriter pipedWriter1 = new PipedWriter();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "*D~|<%)l[F$B!5Ybt");
      jSJshop0.dom();
      jSJshop0.testParser();
      String[] stringArray0 = null;
      // Undeclared exception!
      try { 
        JSJshop.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = "`w<5V7!l'!)@ZZA;!u";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("`w<5V7!l'!)@ZZA;!u");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.createFolder(evoSuiteFile0);
      String string1 = "' ";
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("`w<5V7!l'!)@ZZA;!u", "' ");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "' ";
      stringArray0[1] = "`75~dv?0~]ye}A(-H7";
      stringArray0[2] = "one";
      stringArray0[3] = "one";
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
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("`w<5V7!l'!)@ZZA;!u");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.createFolder(evoSuiteFile0);
      JSJshop jSJshop0 = new JSJshop("`w<5V7!l'!)@ZZA;!u", "`w<5V7!l'!)@ZZA;!u");
      assertFalse(JSJshop.corbaToHicap);
  }
}