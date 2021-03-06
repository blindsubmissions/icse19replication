/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:23:34 GMT 2018
 */

package org.dom4j.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.dom4j.io.OutputFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OutputFormat_ESTest extends OutputFormat_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = false;
      OutputFormat outputFormat0 = new OutputFormat("", false);
      boolean boolean1 = true;
      outputFormat0.setSuppressDeclaration(false);
      int int0 = 2;
      outputFormat0.setNewLineAfterNTags(2);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('`');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (`)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setLineSeparator("UTF-8");
      outputFormat0.setLineSeparator("");
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setEncoding("QtS5V=n");
      boolean boolean0 = outputFormat0.isXHTML();
      assertEquals("", outputFormat0.getLineSeparator());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setIndentSize(39);
      outputFormat1.setNewLineAfterNTags((-3960));
      outputFormat1.setIndent((String) null);
      outputFormat0.setPadText(false);
      outputFormat1.setXHTML(false);
      String string0 = null;
      outputFormat0.setLineSeparator((String) null);
      outputFormat0.setEncoding("s.isRpq;;[@c");
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setIndent(true);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('$');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character ($)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setIndentSize((-193));
      outputFormat0.setNewlines(true);
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.isPadText();
      outputFormat0.isNewLineAfterDeclaration();
      assertTrue(outputFormat0.isNewlines());
      
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "E_:@Nklu~oRy";
      stringArray0[1] = "1";
      stringArray0[2] = "";
      stringArray0[3] = ")eAv'\"[ydp@J";
      stringArray0[4] = "";
      outputFormat1.parseOptions(stringArray0, 1);
      outputFormat1.setEncoding("");
      assertEquals("\n", outputFormat1.getLineSeparator());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("J<>^shOK41?fh");
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat1.setIndent("");
      outputFormat2.setExpandEmptyElements(false);
      outputFormat1.setExpandEmptyElements(false);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('h');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (h)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      outputFormat0.setIndentSize(1739);
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setIndent("");
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.isTrimText();
      outputFormat0.setPadText(true);
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertTrue(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isPadText());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true);
      outputFormat0.setPadText(false);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setXHTML(true);
      outputFormat0.setXHTML(true);
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setPadText(true);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setIndent(true);
      outputFormat0.setLineSeparator("");
      outputFormat0.setIndent(true);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setTrimText(true);
      outputFormat0.isNewLineAfterDeclaration();
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat2.setLineSeparator("");
      outputFormat2.setNewLineAfterDeclaration(false);
      outputFormat2.setNewLineAfterNTags(1);
      outputFormat0.isNewlines();
      outputFormat1.setNewLineAfterNTags(606);
      outputFormat1.getEncoding();
      assertEquals(606, outputFormat1.getNewLineAfterNTags());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true);
      outputFormat0.setIndentSize((-844));
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.isOmitEncoding();
      outputFormat0.getIndent();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "$kNO&c~K)Ad";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      int int0 = outputFormat0.parseOptions(stringArray0, 3528);
      assertTrue(outputFormat0.isExpandEmptyElements());
      assertEquals(3528, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("7", false);
      outputFormat0.setPadText(false);
      outputFormat0.setLineSeparator((String) null);
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.setSuppressDeclaration(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setEncoding((String) null);
      outputFormat1.setExpandEmptyElements(false);
      outputFormat1.setLineSeparator((String) null);
      outputFormat0.setTrimText(false);
      outputFormat1.setEncoding((String) null);
      outputFormat1.setNewLineAfterNTags(0);
      outputFormat0.setEncoding((String) null);
      outputFormat1.setTrimText(true);
      outputFormat0.setXHTML(false);
      outputFormat1.isPadText();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setIndent((String) null);
      outputFormat1.setTrimText(false);
      outputFormat0.setEncoding((String) null);
      outputFormat0.isPadText();
      outputFormat0.setTrimText(false);
      outputFormat0.getEncoding();
      assertTrue(outputFormat0.isSuppressDeclaration());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.685945324669788
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setNewlines(false);
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setEncoding("5RTOS`T3305{l7PfYp");
      outputFormat0.setIndentSize((-1));
      outputFormat0.setNewlines(true);
      outputFormat0.setNewlines(true);
      outputFormat0.setTrimText(true);
      outputFormat0.setIndentSize(0);
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setEncoding("5RTOS`T3305{l7PfYp");
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.isOmitEncoding();
      outputFormat0.setIndentSize((-529));
      outputFormat0.isExpandEmptyElements();
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.setIndent("5RTOS`T3305{l7PfYp");
      assertTrue(outputFormat0.isNewlines());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("n|?//9R]", true, "n|?//9R]");
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setIndent(false);
      outputFormat0.setIndentSize(0);
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.isPadText();
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setNewlines(true);
      outputFormat0.getIndent();
      outputFormat0.setPadText(false);
      outputFormat0.setPadText(false);
      outputFormat1.setPadText(false);
      outputFormat0.setNewlines(true);
      OutputFormat.createPrettyPrint();
      outputFormat0.isNewlines();
      outputFormat0.getLineSeparator();
      assertEquals("", outputFormat0.getIndent());
      
      outputFormat1.setIndent(true);
      outputFormat1.isTrimText();
      outputFormat0.setIndent(false);
      assertTrue(outputFormat0.isNewlines());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.140089674945963
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setIndent(true);
      outputFormat0.setIndentSize(2009);
      String[] stringArray0 = new String[6];
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setXHTML(true);
      outputFormat0.setNewlines(true);
      stringArray0[0] = "y!</}";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "qMbo^W{?p";
      stringArray0[4] = "\u0007Y(Fw";
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      stringArray0[5] = "";
      outputFormat0.setIndentSize((-1221));
      outputFormat0.setIndent(true);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat1.setNewLineAfterNTags(906);
      outputFormat0.getEncoding();
      outputFormat1.setSuppressDeclaration(true);
      outputFormat1.setPadText(true);
      outputFormat1.setAttributeQuoteCharacter('\'');
      assertEquals(906, outputFormat1.getNewLineAfterNTags());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.659322697709517
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, true, (String) null);
      outputFormat0.setIndent(false);
      outputFormat0.setNewLineAfterNTags(2005);
      outputFormat0.setIndent("gs65<OGqFF");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "gs65<OGqFF";
      stringArray0[2] = "";
      stringArray0[3] = "org.dom4j.io.OutputFormat";
      stringArray0[4] = "";
      outputFormat0.parseOptions(stringArray0, 2005);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setIndent(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setAttributeQuoteCharacter('\"');
      outputFormat1.setTrimText(false);
      outputFormat1.isPadText();
      String[] stringArray1 = new String[7];
      stringArray1[0] = "";
      stringArray1[1] = "org.dom4j.io.OutputFormat";
      stringArray1[2] = "org.dom4j.io.OutputFormat";
      stringArray1[3] = "gs65<OGqFF";
      stringArray1[4] = "@PtPXFB4<`";
      stringArray1[5] = "gs65<OGqFF";
      stringArray1[6] = "";
      int int0 = outputFormat1.parseOptions(stringArray1, 2005);
      assertFalse(outputFormat1.isTrimText());
      assertEquals(2005, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.5171515848932915
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      String[] stringArray0 = new String[6];
      stringArray0[0] = "*y%'Y[.;vi8]a";
      stringArray0[1] = "-expandEmpty?[,JWku5(HN<wi=&2`";
      stringArray0[2] = "";
      stringArray0[3] = "org.dom4j.io.OutputFormat";
      stringArray0[4] = "-expandEmptyWg5Rm";
      stringArray0[5] = "-xhtmlqMbo^W{?p";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertTrue(outputFormat0.isExpandEmptyElements());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.922302845401487
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("?[,JWku5(HN<wi=&2`", true, "-xhtml>93OH");
      outputFormat0.setNewlines(true);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent(false);
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-xhtml>93OH";
      stringArray0[1] = "qMbo^W{?p";
      stringArray0[2] = "-xhtml>93OH";
      stringArray0[3] = null;
      stringArray0[4] = "F1K1k";
      stringArray0[5] = "qMbo^W{?p";
      outputFormat2.parseOptions(stringArray0, 0);
      int int0 = (-470);
      outputFormat1.setNewLineAfterNTags(3927);
      outputFormat0.setSuppressDeclaration(false);
      // Undeclared exception!
      try { 
        outputFormat2.parseOptions(stringArray0, (-470));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -470
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.3393717343898155
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-suppressDeclaration", true, "  ");
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setIndent(true);
      outputFormat0.setIndentSize(0);
      outputFormat1.setIndent(true);
      OutputFormat.createPrettyPrint();
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "  ";
      stringArray0[2] = "  ";
      stringArray0[3] = "-suppressDeclaration";
      stringArray0[4] = "  ";
      stringArray0[5] = "-padText";
      stringArray0[6] = "-suppressDeclaration";
      outputFormat1.parseOptions(stringArray0, 2);
      outputFormat2.setNewLineAfterNTags(2);
      String[] stringArray1 = new String[4];
      stringArray1[0] = "-padText";
      stringArray1[1] = "  ";
      stringArray1[2] = "-suppressDeclaration";
      stringArray1[3] = "-suppressDeclaration";
      outputFormat0.parseOptions(stringArray1, 2);
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray1, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.9223028454014872
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("s6NhW]Z90_kUca5", true, "-padText");
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setIndentSize(34);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setIndent(true);
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat1.setNewLineAfterNTags(0);
      outputFormat2.setNewLineAfterDeclaration(true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-padText";
      stringArray0[1] = "-padText";
      stringArray0[2] = "-padText";
      stringArray0[3] = "-padText";
      stringArray0[4] = "qMbo^W{?p";
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat1.parseOptions(stringArray0, 34);
      assertTrue(outputFormat1.isPadText());
      
      int int0 = outputFormat2.getNewLineAfterNTags();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.9480533458214966
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("  ", true, "  ");
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setTrimText(true);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.setNewLineAfterDeclaration(true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "  ";
      outputFormat0.parseOptions(stringArray0, 1);
      String[] stringArray1 = new String[6];
      stringArray1[0] = "-xhtml ";
      stringArray1[1] = "-newlines";
      stringArray1[2] = "  ";
      stringArray1[3] = "-xhtml ";
      stringArray1[4] = "-xhtml ";
      stringArray1[5] = "  ";
      outputFormat0.parseOptions(stringArray1, 0);
      assertTrue(outputFormat0.isTrimText());
      
      OutputFormat outputFormat1 = new OutputFormat();
      OutputFormat outputFormat2 = new OutputFormat("", true);
      String[] stringArray2 = new String[1];
      stringArray2[0] = "/%g[|)W7e#0";
      outputFormat1.parseOptions(stringArray2, 5);
      OutputFormat.createCompactFormat();
      OutputFormat outputFormat3 = OutputFormat.createCompactFormat();
      assertFalse(outputFormat3.isNewlines());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.877838240407283
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText", false, "fivnfxPQ$HWW");
      OutputFormat.createCompactFormat();
      OutputFormat.createPrettyPrint();
      OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = new OutputFormat("-trimText");
      OutputFormat outputFormat2 = new OutputFormat("GSCQqr.n)", false);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-trimText";
      stringArray0[1] = "s6NhW]Z90_kUca5";
      stringArray0[2] = "-trimText";
      stringArray0[3] = "GSCQqr.n)";
      stringArray0[4] = "fivnfxPQ$HWW";
      stringArray0[5] = "GSCQqr.n)";
      stringArray0[6] = "s6NhW]Z90_kUca5";
      stringArray0[7] = "180E;-SiST {W";
      outputFormat2.parseOptions(stringArray0, 0);
      outputFormat2.parseOptions(stringArray0, 39);
      assertTrue(outputFormat2.isTrimText());
      
      outputFormat0.parseOptions(stringArray0, 2574);
      OutputFormat.createCompactFormat();
      OutputFormat outputFormat3 = OutputFormat.createCompactFormat();
      assertFalse(outputFormat3.isPadText());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.036840744526001
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-encoding", false, "-encoding");
      OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat3 = new OutputFormat("  ");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-encoding";
      stringArray0[1] = "o";
      stringArray0[2] = "  ";
      stringArray0[3] = "  ";
      stringArray0[4] = "-encoding";
      stringArray0[5] = "-encoding";
      stringArray0[6] = "-encoding";
      outputFormat3.parseOptions(stringArray0, 0);
      outputFormat2.parseOptions(stringArray0, 120);
      OutputFormat.createCompactFormat();
      outputFormat1.parseOptions(stringArray0, 0);
      assertEquals("o", outputFormat1.getEncoding());
      
      OutputFormat outputFormat4 = new OutputFormat("-encoding");
      OutputFormat outputFormat5 = OutputFormat.createPrettyPrint();
      outputFormat5.parseOptions(stringArray0, 279);
      outputFormat2.parseOptions(stringArray0, 138);
      assertEquals(0, outputFormat2.getNewLineAfterNTags());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.844439727056968
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setPadText(true);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "z=NhW]i9-_kca5";
      stringArray0[2] = "-xhtml";
      stringArray0[3] = "z=NhW]i9-_kca5";
      stringArray0[4] = "z=NhW]i9-_kca5";
      stringArray0[5] = "z=NhW]i9-_kca5";
      stringArray0[6] = "z=NhW]i9-_kca5";
      stringArray0[7] = "z=NhW]i9-_kca5";
      stringArray0[8] = "z=NhW]i9-_kca5";
      outputFormat0.parseOptions(stringArray0, 0);
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat0.setEncoding("-xhtml");
      OutputFormat outputFormat2 = new OutputFormat("-expandEmpty180k;@SiST {W", true);
      outputFormat2.parseOptions(stringArray0, 3);
      OutputFormat.createCompactFormat();
      OutputFormat.createCompactFormat();
      outputFormat2.parseOptions(stringArray0, 3);
      outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isPadText());
      
      int int0 = outputFormat1.parseOptions(stringArray0, 3);
      assertEquals(3, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.505289990918418
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("  ", true, "  ");
      outputFormat0.setTrimText(true);
      outputFormat0.setPadText(true);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.setLineSeparator("-xhtml ");
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setOmitEncoding(true);
      outputFormat1.setNewLineAfterDeclaration(true);
      outputFormat1.setSuppressDeclaration(true);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-xhtml ";
      stringArray0[1] = "-xhtml ";
      stringArray0[2] = "-omitEncoding";
      stringArray0[3] = "-omitEncoding";
      stringArray0[4] = "/%g[|)W7e#0";
      stringArray0[5] = "/%g[|)W7e#0";
      stringArray0[6] = "/%g[|)W7e#0";
      stringArray0[7] = "/%g[|)W7e#0";
      stringArray0[8] = "/%g[|)W7e#0";
      int int0 = outputFormat1.parseOptions(stringArray0, 0);
      assertTrue(outputFormat1.isSuppressDeclaration());
      assertEquals(4, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.0140355237092673
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("  ", true, "  ");
      outputFormat0.setTrimText(true);
      outputFormat0.setTrimText(true);
      outputFormat0.setIndent("  ");
      outputFormat0.setPadText(true);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.setLineSeparator("  ");
      outputFormat0.setOmitEncoding(false);
      OutputFormat outputFormat1 = new OutputFormat("  ", true, "  ");
      outputFormat1.setNewLineAfterDeclaration(true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-omitEncoding";
      stringArray0[1] = "-indent";
      stringArray0[2] = "-omitEncoding";
      stringArray0[3] = "  ";
      stringArray0[4] = "  ";
      stringArray0[5] = "/%g[|)W7e#0";
      outputFormat0.parseOptions(stringArray0, 0);
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals("-omitEncoding", outputFormat0.getIndent());
      assertEquals(3, int0);
  }
}
