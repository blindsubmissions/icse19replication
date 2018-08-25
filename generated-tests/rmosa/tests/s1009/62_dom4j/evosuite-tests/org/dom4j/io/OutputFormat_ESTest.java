/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 09:10:07 GMT 2018
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
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "kaP$Aii";
      OutputFormat outputFormat0 = new OutputFormat("-xhtml", true, "kaP$Aii");
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setNewLineAfterNTags((-1));
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      assertEquals((-1), outputFormat0.getNewLineAfterNTags());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.8717814824679821
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("c/nP{w;f ", true, "");
      outputFormat0.setIndentSize(1387);
      outputFormat0.setNewlines(false);
      String[] stringArray0 = new String[9];
      outputFormat0.setXHTML(true);
      stringArray0[0] = "kaP\"Aii";
      stringArray0[1] = "";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 389);
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Qp{VKz(%F]WC#~,0Q`", false);
      outputFormat0.setIndent("Qp{VKz(%F]WC#~,0Q`");
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("Qp{VKz(%F]WC#~,0Q`", outputFormat0.getIndent());
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.7201248812718097
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-xpandEmp!yd8>?wmyk@";
      stringArray0[1] = "kaP\"Aii";
      OutputFormat outputFormat0 = new OutputFormat("kaP\"Aii", true, "kaP\"Aii");
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[9];
      outputFormat0.setIndentSize(1);
      stringArray1[0] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[1] = "-xpandEmp!yd8>?wmyk@";
      outputFormat0.setPadText(true);
      stringArray1[2] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[3] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[4] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[5] = "kaP\"Aii";
      stringArray1[6] = "kaP\"Aii";
      stringArray1[7] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[8] = "-xpandEmp!yd8>?wmyk@";
      outputFormat0.parseOptions(stringArray1, 0);
      assertEquals(" ", outputFormat0.getIndent());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("hTvM&}~");
      outputFormat0.setIndentSize(1);
      outputFormat0.setExpandEmptyElements(true);
      assertEquals(" ", outputFormat0.getIndent());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewlines(false);
      outputFormat0.setTrimText(false);
      outputFormat0.isTrimText();
      outputFormat0.setIndent(false);
      outputFormat0.setXHTML(false);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('9');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (9)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.setXHTML(false);
      outputFormat0.setIndent(false);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isPadText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      String string0 = outputFormat1.getIndent();
      assertNull(string0);
      
      boolean boolean0 = outputFormat1.isSuppressDeclaration();
      assertFalse(boolean0);
      
      outputFormat1.setOmitEncoding(false);
      assertFalse(outputFormat1.isExpandEmptyElements());
      assertTrue(outputFormat1.isTrimText());
      assertTrue(outputFormat1.isNewLineAfterDeclaration());
      assertFalse(outputFormat1.isOmitEncoding());
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
      assertFalse(outputFormat1.isXHTML());
      assertEquals(0, outputFormat1.getNewLineAfterNTags());
      assertEquals("\n", outputFormat1.getLineSeparator());
      assertFalse(outputFormat1.isNewlines());
      assertFalse(outputFormat1.isPadText());
      assertEquals("UTF-8", outputFormat1.getEncoding());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.7201248812718097
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "kaPiAii";
      String[] stringArray1 = new String[9];
      stringArray1[0] = "kaPiAii";
      stringArray1[5] = "kaPiAii";
      OutputFormat outputFormat0 = new OutputFormat(stringArray1[1], true, "-omitEncoding");
      outputFormat0.setPadText(false);
      outputFormat0.parseOptions(stringArray1, 0);
      assertFalse(outputFormat0.isOmitEncoding());
      
      String[] stringArray2 = new String[3];
      stringArray2[0] = "-omitEncoding";
      stringArray2[1] = "kaPiAii";
      stringArray2[2] = "-omitEncoding";
      int int0 = outputFormat0.parseOptions(stringArray2, 0);
      assertTrue(outputFormat0.isOmitEncoding());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.2337673247041645
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "kaPiAii";
      String[] stringArray1 = new String[9];
      stringArray1[0] = "kaPiAii";
      stringArray1[5] = "kaPiAii";
      OutputFormat outputFormat0 = new OutputFormat(stringArray1[1], true, "-omitEncoding");
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      assertFalse(outputFormat1.isPadText());
      assertTrue(outputFormat1.isNewLineAfterDeclaration());
      assertFalse(outputFormat1.isSuppressDeclaration());
      assertFalse(outputFormat1.isXHTML());
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
      assertEquals("UTF-8", outputFormat1.getEncoding());
      assertEquals(0, outputFormat1.getNewLineAfterNTags());
      assertFalse(outputFormat1.isExpandEmptyElements());
      assertFalse(outputFormat1.isOmitEncoding());
      assertFalse(outputFormat1.isNewlines());
      assertTrue(outputFormat1.isTrimText());
      
      outputFormat0.parseOptions(stringArray1, 0);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("-omitEncoding", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-xpandEmp!yd8>?wmyk@";
      stringArray0[1] = "kaP\"Aii";
      OutputFormat outputFormat0 = new OutputFormat("kaP\"Aii", true, "kaP\"Aii");
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[9];
      stringArray1[0] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[1] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[2] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[3] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[4] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[5] = "kaP\"Aii";
      stringArray1[6] = "kaP\"Aii";
      stringArray1[7] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[8] = "-xpandEmp!yd8>?wmyk@";
      outputFormat0.setIndent(false);
      outputFormat0.parseOptions(stringArray1, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setExpandEmptyElements(false);
      String[] stringArray0 = new String[7];
      stringArray0[0] = " h%Zq?411cF;6";
      stringArray0[1] = "CC:(@}Fg(Mz?{XQ";
      stringArray0[2] = "";
      stringArray0[3] = "CC:(@}Fg(Mz?{XQ";
      stringArray0[4] = " h%Zq?411cF;6";
      stringArray0[6] = "CC:(@}Fg(Mz?{XQ";
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(boolean0);
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.isNewLineAfterDeclaration();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "8W+B69pL>+\"ca&";
      stringArray0[1] = "";
      stringArray0[2] = "\n";
      stringArray0[4] = "";
      stringArray0[0] = "";
      stringArray0[6] = "";
      stringArray0[7] = "-suppressDeclaration";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-940));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -940
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setEncoding("-xhtmlxnwn385dKlIa7]{Bls");
      String[] stringArray0 = new String[7];
      outputFormat0.setNewlines(false);
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "YI(hYLT-Vv4BhR|sXFI";
      stringArray0[4] = "~/UMtNI5_+wB";
      stringArray0[5] = "";
      outputFormat0.parseOptions(stringArray0, 1197);
      outputFormat0.getLineSeparator();
      outputFormat0.setNewLineAfterNTags(2);
      outputFormat0.isPadText();
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.375024252984546
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "kaP$Aii";
      OutputFormat outputFormat0 = new OutputFormat("-xhtml", true, "kaP$Aii");
      outputFormat0.parseOptions(stringArray0, 0);
      OutputFormat.createPrettyPrint();
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1478456134));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1478456134
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-xpandEmp!yd8>?wmyk@";
      stringArray0[1] = "kaP\"Aii";
      OutputFormat outputFormat0 = new OutputFormat("kaP\"Aii", true, "kaP\"Aii");
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setLineSeparator((String) null);
      outputFormat0.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[9];
      stringArray1[0] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[1] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[2] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[3] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[4] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[5] = "kaP\"Aii";
      stringArray1[6] = "kaP\"Aii";
      stringArray1[7] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[8] = "-xpandEmp!yd8>?wmyk@";
      outputFormat0.parseOptions(stringArray1, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, (-1983617128));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1983617128
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false, "");
      outputFormat0.setIndent(true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setNewLineAfterNTags(34);
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.getLineSeparator();
      assertEquals(34, outputFormat0.getNewLineAfterNTags());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      boolean boolean0 = false;
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.getEncoding();
      int int0 = (-1874);
      outputFormat0.setNewLineAfterNTags((-1874));
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('H');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (H)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("M", false, "M");
      outputFormat0.isOmitEncoding();
      outputFormat0.setSuppressDeclaration(false);
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertFalse(boolean0);
      
      outputFormat0.setOmitEncoding(false);
      outputFormat0.isSuppressDeclaration();
      String string0 = outputFormat0.getLineSeparator();
      assertEquals("\n", string0);
      
      outputFormat0.setEncoding("M");
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("M", outputFormat0.getEncoding());
      assertEquals("M", outputFormat0.getIndent());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isXHTML());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isTrimText());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8717814824679821
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("c/nP{w;f ", true, "");
      outputFormat0.setIndent(true);
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator("");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "c/nP{w;f ";
      stringArray0[1] = "kaP\"Aii";
      stringArray0[2] = "";
      stringArray0[3] = "kaP\"Aii";
      outputFormat0.setNewlines(true);
      stringArray0[4] = "A8";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setIndent(false);
      outputFormat0.parseOptions(stringArray0, 18);
      outputFormat0.parseOptions(stringArray0, 0);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[1];
      int int0 = (-553);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('1');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (1)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.5047882836811908
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true);
      outputFormat0.getAttributeQuoteCharacter();
      OutputFormat outputFormat1 = new OutputFormat("c/nP{w;f ", true, "");
      outputFormat1.setEncoding("");
      outputFormat0.setSuppressDeclaration(true);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "c/nP{w;f ";
      stringArray0[1] = "^M!YeiI&qC!~";
      stringArray0[2] = "";
      stringArray0[3] = "";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat1.setIndent((String) null);
      outputFormat1.setNewLineAfterDeclaration(false);
      outputFormat1.setNewLineAfterNTags(0);
      outputFormat1.parseOptions(stringArray0, 0);
      assertFalse(outputFormat1.isNewLineAfterDeclaration());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      boolean boolean0 = outputFormat0.isXHTML();
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("", outputFormat0.getIndent());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(boolean0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("_}.+c^Ncdt %", true, "_}.+c^Ncdt %");
      outputFormat0.setXHTML(true);
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.isExpandEmptyElements();
      outputFormat0.setNewlines(false);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "_}.+c^Ncdt %";
      stringArray0[1] = "h";
      outputFormat0.parseOptions(stringArray0, 2);
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("HosD");
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.isNewlines();
      boolean boolean0 = outputFormat0.isNewlines();
      assertTrue(outputFormat0.isExpandEmptyElements());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 0;
      String[] stringArray0 = new String[9];
      OutputFormat outputFormat0 = new OutputFormat("kaP\"Aii", true, "kaP\"Ai");
      outputFormat0.setIndent("");
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.3750242529845458
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true);
      outputFormat0.getAttributeQuoteCharacter();
      assertFalse(outputFormat0.isSuppressDeclaration());
      
      OutputFormat outputFormat1 = new OutputFormat("c/nP{w;f ", true, "");
      outputFormat1.setEncoding("");
      outputFormat0.setSuppressDeclaration(true);
      outputFormat1.setNewLineAfterDeclaration(true);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "c/nP{w;f ";
      stringArray0[1] = "^M!YeiI&qC!~";
      stringArray0[2] = "";
      stringArray0[3] = "";
      outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isSuppressDeclaration());
      
      outputFormat1.setNewLineAfterNTags(0);
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat1.parseOptions(stringArray0, 3);
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("8^-cx~UH", true, "-lineSeparat");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-omitEncoding";
      stringArray0[1] = "4aP|Aii";
      stringArray0[2] = "-lineSeparat";
      stringArray0[3] = "";
      stringArray0[4] = "8^-cx~UH";
      stringArray0[5] = "-xpandEmp!yd8>?wmyk@";
      stringArray0[6] = "-omitEncoding";
      outputFormat0.parseOptions(stringArray0, 34);
      outputFormat0.setEncoding((String) null);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-682));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -682
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, true, (String) null);
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setAttributeQuoteCharacter('\"');
      outputFormat0.getAttributeQuoteCharacter();
      String[] stringArray0 = new String[16];
      stringArray0[0] = null;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = null;
      stringArray0[3] = null;
      stringArray0[4] = "'R";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1789802116));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1789802116
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("c/nP{w;f ", true, "");
      outputFormat0.setEncoding("");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "c/nP{w;f ";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-262));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -262
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.2711893730418441
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-xpandEmp!yd8>?wmyk@";
      stringArray0[1] = "kaP\"Aii";
      OutputFormat outputFormat0 = new OutputFormat("kaP\"Aii", true, "kaP\"Aii");
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[9];
      stringArray1[0] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[1] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[2] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[3] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[4] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[5] = "kaP\"Aii";
      stringArray1[6] = "kaP\"Aii";
      stringArray1[7] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[8] = "-xpandEmp!yd8>?wmyk@";
      outputFormat0.parseOptions(stringArray1, 0);
      outputFormat0.parseOptions(stringArray1, 1661);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("kaP\"Aii", outputFormat0.getIndent());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("kaP\"Aii", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("c/nP{w", true, "-xpandEmp!yd8>?wmyk@");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "c/nP{w;f ";
      stringArray0[1] = "-xhtmlc/nP{w;f ";
      stringArray0[2] = "-indentSize";
      stringArray0[3] = "2796t";
      stringArray0[4] = "-indentSize";
      stringArray0[5] = "-xhtmlc/nP{w;f ";
      stringArray0[6] = "kaP\"Aii";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 2);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"2796t\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("FgOxD_ZR5C^", true, "-lineSeparator");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "-lineSeparator";
      stringArray0[3] = "-lineSeparator";
      stringArray0[4] = "-lineSeparator";
      stringArray0[5] = "-lineSeparator";
      stringArray0[6] = "-lineSeparator";
      stringArray0[7] = "-lineSeparator";
      stringArray0[8] = "-lineSeparator";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals("-lineSeparator", outputFormat0.getLineSeparator());
      assertEquals(9, int0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = 0;
      String[] stringArray0 = new String[6];
      stringArray0[0] = "kaPiAii";
      OutputFormat outputFormat0 = new OutputFormat("q<!Mt_", true, "q<!Mt_");
      outputFormat0.setAttributeQuoteCharacter('\'');
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1886679662));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1886679662
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertFalse(outputFormat0.isPadText());
      
      OutputFormat outputFormat1 = new OutputFormat("", false);
      outputFormat1.setNewlines(false);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-padText";
      stringArray0[1] = "\n";
      stringArray0[2] = "-padText";
      stringArray0[3] = "gZ E%qCZddxPp";
      stringArray0[1] = "gZ E%qCZddxPp";
      stringArray0[5] = "-padText";
      stringArray0[6] = "gZ E%qCZddxPp";
      stringArray0[7] = "kaP\"Aii";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isPadText());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpty", false);
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-expandEmpty";
      stringArray0[1] = "-expandEmpty";
      stringArray0[2] = "-expandEmpty";
      stringArray0[3] = "-expandEmpty";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isExpandEmptyElements());
      assertEquals(4, int0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-encoding", true, "|{\"k7ZL)q");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-encoding";
      stringArray0[1] = "-xpandEmp!yd8>?wmyk@";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 901);
      assertEquals("-xpandEmp!yd8>?wmyk@", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "kaP\"Aii";
      String[] stringArray1 = new String[9];
      stringArray1[0] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[1] = "kaP\"Aii";
      OutputFormat outputFormat0 = new OutputFormat("-xpandEmp!yd8>?wmyk@", true, "-newlines");
      String[] stringArray2 = new String[2];
      stringArray2[0] = "-newlines";
      stringArray2[1] = "-newlines";
      int int0 = outputFormat0.parseOptions(stringArray2, 0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals(2, int0);
      assertEquals("-xpandEmp!yd8>?wmyk@", outputFormat0.getIndent());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("-newlines", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("c/nP{w;f ", true, "");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "c/nP{w;f ";
      outputFormat0.parseOptions(stringArray0, 2);
      outputFormat0.parseOptions(stringArray0, 0);
      OutputFormat outputFormat1 = new OutputFormat("Invalid attribute quote character (");
      outputFormat1.parseOptions(stringArray0, 2);
      assertFalse(outputFormat1.isTrimText());
      
      String[] stringArray1 = new String[4];
      stringArray1[0] = "Invalid attribute quote character (";
      stringArray1[1] = "";
      stringArray1[2] = "-trimText";
      stringArray1[3] = "Invalid attribute quote character (";
      int int0 = outputFormat1.parseOptions(stringArray1, 2);
      assertTrue(outputFormat1.isTrimText());
      assertEquals(3, int0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0379083330628327
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("c/nP{w;f ", true);
      outputFormat0.setNewlines(true);
      outputFormat0.setLineSeparator("-xhtmlc/nP{w;f ");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "kaP\"Aii";
      outputFormat0.setIndent(true);
      String[] stringArray1 = new String[9];
      stringArray1[0] = "-xpandEmp!yd8>?wmyk@";
      stringArray1[1] = "kaP\"Aii";
      stringArray1[2] = "@~T@vWGjy&`Erd`~t";
      stringArray1[3] = "c/nP{w;f ";
      stringArray1[4] = "c/nP{w;f ";
      stringArray1[6] = "-xhtmlc/nP{w;f ";
      stringArray1[7] = "c/nP{w;f ";
      stringArray1[8] = "-xhtmlc/nP{w;f ";
      outputFormat0.parseOptions(stringArray1, 0);
      outputFormat0.parseOptions(stringArray1, 6);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-535));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -535
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }
}
